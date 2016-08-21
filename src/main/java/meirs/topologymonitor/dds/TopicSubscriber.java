package meirs.topologymonitor.dds;

import com.rti.dds.domain.DomainParticipant;
import com.rti.dds.domain.DomainParticipantFactory;
import com.rti.dds.infrastructure.RETCODE_NO_DATA;
import com.rti.dds.infrastructure.ResourceLimitsQosPolicy;
import com.rti.dds.infrastructure.StatusKind;
import com.rti.dds.subscription.*;
import com.rti.dds.topic.Topic;
import com.rti.dds.topic.TopicQos;
import com.rti.dds.topic.TypeSupportImpl;
import com.rti.dds.util.LoanableSequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

/**
 * Created by Meir Shalev on 20/08/16.
 */
public class TopicSubscriber {

    private Class<?> typeClass;
    private TypeSupportImpl typeSupport;
    private DomainParticipant participant;
    private String topicName;
    private Consumer<Object> callback;

    private DataReader dataReader;

    private LoanableSequence _dataSeq;
    private SampleInfoSeq _infoSeq = new SampleInfoSeq();


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public TopicSubscriber(Class<?> typeClass,
                           TypeSupportImpl typeSupport,
                           DomainParticipant participant,
                           String topicName,
                           Consumer<Object> callback) {

        this.typeClass = typeClass;
        this.typeSupport = typeSupport;
        this.participant = participant;
        this.topicName = topicName;
        this.callback = callback;

        _dataSeq = new LoanableSequence(typeClass);

        subscribe();
    }

    private void subscribe() {

        logger.info("Registering the type...");
        typeSupport.register_typeI(participant,
                typeSupport.get_type_nameI());

        logger.info("Creating the topic...");
        TopicQos topicQos = new TopicQos();
        DomainParticipantFactory.TheParticipantFactory.get_topic_qos_from_profile(topicQos, "RtiMonitorQosLibrary", "RtiMonitorQosProfile");
        Topic topic = participant.create_topic(
                topicName,
                typeSupport.get_type_nameI(),
                topicQos,
                null,   // listener
                StatusKind.STATUS_MASK_NONE);
        if (topic == null) {
            logger.error("Unable to create topic " + topicName);
            throw new RuntimeException("Topic creation failed, topic: " + topicName);
        }


        logger.info("Creating subscriber...");
        SubscriberQos subscriberQos = new SubscriberQos();
        DomainParticipantFactory.TheParticipantFactory.get_subscriber_qos_from_profile(subscriberQos, "RtiMonitorQosLibrary", "RtiMonitorQosProfile");

        com.rti.dds.subscription.Subscriber subscriber = participant.create_subscriber(
                subscriberQos,
                null,           // listener
                StatusKind.STATUS_MASK_NONE);
        if (subscriber == null) {
            logger.error("Unable to create DDS Subscriber");
            throw new RuntimeException("Subscriber creation failed, topic: " + topicName);
        }

        logger.info("Creating the data reader...");

        DataReaderQos readerQos = new DataReaderQos();
        DomainParticipantFactory.TheParticipantFactory.get_datareader_qos_from_profile(readerQos, "RtiMonitorQosLibrary", "RtiMonitorQosProfile");

        dataReader = subscriber.create_datareader(
                        topic,
                        readerQos,
                        new GenericAdapter(),
                        StatusKind.STATUS_MASK_ALL);
        if (dataReader == null) {
            System.err.println("! Unable to create DDS Data Reader");
            throw new RuntimeException("HelloSubscriber creation failed");
        }

    }

    private class GenericAdapter extends DataReaderAdapter {
        public void on_data_available(DataReader reader) {
            try {
                reader.take_untyped(
                        _dataSeq,
                        _infoSeq,
                        ResourceLimitsQosPolicy.LENGTH_UNLIMITED,
                        SampleStateKind.ANY_SAMPLE_STATE,
                        ViewStateKind.ANY_VIEW_STATE,
                        InstanceStateKind.ANY_INSTANCE_STATE);

                for (int i = 0; i < _dataSeq.size(); ++i) {
                    SampleInfo info = (SampleInfo)_infoSeq.get(i);

                    if (info.valid_data) {
                        callback.accept(_dataSeq.get(i));
                    }
                }
            } catch (RETCODE_NO_DATA noData) {
                // No data to process
            } finally {
                reader.return_loan_untyped(_dataSeq, _infoSeq);
            }
        }

        public void on_requested_incompatible_qos (DataReader reader,
                                                   RequestedIncompatibleQosStatus status) {
            logger.info("->Callback: requested incompatible QoS.");
        }

        public void on_liveliness_changed (DataReader reader,
                                           LivelinessChangedStatus status) {
            logger.info("->Callback: liveliness changed.");
        }

        public void on_subscription_matched (DataReader reader,
                                             SubscriptionMatchedStatus status) {
            logger.info("->Callback: subscription matched.");
        }
    }
}
