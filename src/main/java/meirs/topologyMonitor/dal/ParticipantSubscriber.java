package meirs.topologyMonitor.dal;

import com.rti.dds.domain.DomainParticipant;
import com.rti.dds.domain.DomainParticipantFactory;
import com.rti.dds.domain.DomainParticipantQos;
import com.rti.dds.infrastructure.StatusKind;

import meirs.topologyMonitor.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rti.dds.monitoring.*;

/**
 * Created by Meir Shalev on 19/08/16.
 */
public class ParticipantSubscriber {

    private static Logger logger = LoggerFactory.getLogger(ParticipantSubscriber.class);

    private static final String readerStatisticsTopicName = "rti/dds/monitoring/dataReaderEntityStatistics";
    private static final String writerStatisticsTopicName = "rti/dds/monitoring/dataWriterEntityStatistics";
    private static final String writerMatchedTopicName = "rti/dds/monitoring/dataWriterEntityMatchedSubscriptionStatistics";
    private static final String readerMatchedTopicName = "rti/dds/monitoring/dataReaderEntityMatchedPublicationStatistics ";

    public static void main(String[] args) throws Exception {

        int domainId = Integer.valueOf(args[0]);

        new ParticipantSubscriber(domainId);

        while (true) {
            Thread.sleep(10000);
        }
    }

    public ParticipantSubscriber(int domainId) {
        DomainParticipantQos qos = new DomainParticipantQos();
        DomainParticipantFactory.TheParticipantFactory.get_participant_qos_from_profile(qos, "RtiMonitorQosLibrary", "RtiMonitorQosProfile");

        DomainParticipant participant =
                DomainParticipantFactory.get_instance().create_participant(
                        domainId,
                        qos,
                        null,       // listener
                        StatusKind.STATUS_MASK_NONE);
        if (participant == null) {
            logger.error("Unable to create DDS domain participant");
            return;
        }

        DomainParticipantQos qos1 = new DomainParticipantQos();
        participant.get_qos(qos1);
        System.out.println(qos1.participant_name.name);


        TopicSubscriber readerSubscriber = new TopicSubscriber(DataReaderEntityStatistics.class,
                DataReaderEntityStatisticsTypeSupport.get_instance(),
                participant,
                readerStatisticsTopicName,
                entity -> {
                    //logger.info(entity.toString());
                    DataReaderEntityStatistics stats = (DataReaderEntityStatistics) entity;
                    logger.info("Reader's key: " + Util.builtinTopicKeyToBase64(stats.datareader_key));
                });

        TopicSubscriber writerSubscriber = new TopicSubscriber(DataWriterEntityStatistics.class,
                DataWriterEntityStatisticsTypeSupport.get_instance(),
                participant,
                writerStatisticsTopicName,
                entity -> logger.info(entity.toString()));

        TopicSubscriber writerMatchedSubscriber = new TopicSubscriber(DataWriterEntityMatchedSubscriptionStatistics.class,
                DataWriterEntityMatchedSubscriptionStatisticsTypeSupport.get_instance(),
                participant,
                writerMatchedTopicName,
                entity -> {
                    //logger.info(entity.toString());
                    DataWriterEntityMatchedSubscriptionStatistics stats = (DataWriterEntityMatchedSubscriptionStatistics) entity;

                    logger.info("Subscription handle: " + Util.instanceHandleToBase64(stats.subscription_handle));
                });

//        Subscriber readerMatchedSubscriber = new Subscriber(DataReaderEntityMatchedPublicationStatistics.class,
//                DataReaderEntityMatchedPublicationStatisticsTypeSupport.get_instance(),
//                participant,
//                readerMatchedTopicName,
//                entity -> logger.info(entity.toString()));

    }
}
