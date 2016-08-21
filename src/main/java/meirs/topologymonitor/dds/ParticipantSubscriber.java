package meirs.topologymonitor.dds;

import com.rti.dds.domain.DomainParticipant;
import com.rti.dds.domain.DomainParticipantFactory;
import com.rti.dds.domain.DomainParticipantQos;
import com.rti.dds.infrastructure.StatusKind;

import meirs.topologymonitor.adapter.DDSToTopologyAdapter;
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

    public ParticipantSubscriber(int domainId, DDSToTopologyAdapter adapter) {

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
                entity -> adapter.onReaderStatisticsReceived((DataReaderEntityStatistics) entity));

        TopicSubscriber writerSubscriber = new TopicSubscriber(DataWriterEntityStatistics.class,
                DataWriterEntityStatisticsTypeSupport.get_instance(),
                participant,
                writerStatisticsTopicName,
                entity -> adapter.onWriterStatisticsReceived((DataWriterEntityStatistics) entity));

        TopicSubscriber writerMatchedSubscriber = new TopicSubscriber(DataWriterEntityMatchedSubscriptionStatistics.class,
                DataWriterEntityMatchedSubscriptionStatisticsTypeSupport.get_instance(),
                participant,
                writerMatchedTopicName,
                entity -> adapter.onWriterMatchedReceived((DataWriterEntityMatchedSubscriptionStatistics) entity));
    }
}
