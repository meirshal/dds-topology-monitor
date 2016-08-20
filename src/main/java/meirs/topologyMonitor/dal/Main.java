package meirs.topologyMonitor.dal;

import com.rti.dds.domain.DomainParticipant;
import com.rti.dds.domain.DomainParticipantFactory;
import com.rti.dds.domain.DomainParticipantQos;
import com.rti.dds.infrastructure.StatusKind;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rti.dds.monitoring.*;

/**
 * Created by Meir Shalev on 19/08/16.
 */
public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        int domainId = Integer.valueOf(args[0]);
        String readerStatisticsTopicName = "rti/dds/monitoring/dataReaderEntityStatistics";
        String writerStatisticsTopicName = "rti/dds/monitoring/dataWriterEntityStatistics";

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


        Subscriber readerSubscriber = new Subscriber(DataReaderEntityStatistics.class,
                DataReaderEntityStatisticsTypeSupport.get_instance(),
                participant,
                readerStatisticsTopicName,
                entity -> logger.info(entity.toString()));

        Subscriber writerSubscriber = new Subscriber(DataWriterEntityStatistics.class,
                DataWriterEntityStatisticsTypeSupport.get_instance(),
                participant,
                writerStatisticsTopicName,
                entity -> logger.info(entity.toString()));

        while (true) {
            Thread.sleep(10000);
        }
    }
}
