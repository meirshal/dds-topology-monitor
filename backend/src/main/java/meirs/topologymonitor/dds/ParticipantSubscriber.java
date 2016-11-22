package meirs.topologymonitor.dds;

import com.rti.dds.domain.DomainParticipantQos;
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

        DomainParticipantWithQos participant = DDSUtils.createParticipant(domainId);
        if (participant == null) {
            return;
        }
        DomainParticipantQos qos1 = new DomainParticipantQos();
        participant.getParticipant().get_qos(qos1);
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
