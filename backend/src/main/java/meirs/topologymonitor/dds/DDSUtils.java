package meirs.topologymonitor.dds;

import com.rti.dds.domain.DomainParticipant;
import com.rti.dds.domain.DomainParticipantFactory;
import com.rti.dds.domain.DomainParticipantQos;
import com.rti.dds.infrastructure.StatusKind;
import com.rti.dds.topic.Topic;
import com.rti.dds.topic.TopicDescription;
import com.rti.dds.topic.TopicQos;
import com.rti.dds.topic.TypeSupportImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Michael Bespalov on 18/11/16.
 */
public class DDSUtils {
    public static final String QOS_NAME_SEPARATOR = "::";
    public static final String DEFAULT_MONITORING_QOS = "RtiMonitorQosLibrary::RtiMonitorQosProfile";
    private static Logger logger = LoggerFactory.getLogger(DDSUtils.class);

    public static DomainParticipantWithQos createParticipant(int domainId) {
        return createParticipant(domainId, DEFAULT_MONITORING_QOS);
    }

    public static DomainParticipantWithQos createParticipant(int domainId, String qosProfile) {
        DomainParticipantQos qos = new DomainParticipantQos();
        String[] splitQosProfile = qosProfile.split(QOS_NAME_SEPARATOR);
        if (splitQosProfile.length != 2) {
            logger.error("Invalid qosProfile " + qosProfile + " using default QOS " + DEFAULT_MONITORING_QOS);
            splitQosProfile = DEFAULT_MONITORING_QOS.split(QOS_NAME_SEPARATOR);
        }
        DomainParticipantFactory.TheParticipantFactory.get_participant_qos_from_profile(qos, splitQosProfile[0], splitQosProfile[1]);

        DomainParticipant participant =
                DomainParticipantFactory.get_instance().create_participant(
                        domainId,
                        qos,
                        null,       // listener
                        StatusKind.STATUS_MASK_NONE);
        if (participant == null) {
            logger.error("Unable to create DDS domain participant");
        }
        return new DomainParticipantWithQos(participant, splitQosProfile[0], splitQosProfile[1]);
    }

    public static void registerType(TypeSupportImpl typeSupport, DomainParticipant participant) {
        logger.info("Registering the type...");
        typeSupport.register_typeI(participant,
                typeSupport.get_type_nameI());

    }

    public static Topic createTopic(DomainParticipantWithQos participantWithQos, String topicName, String typeName) {
        logger.info("Creating the topic...");
        TopicQos topicQos = new TopicQos();
        DomainParticipantFactory.TheParticipantFactory.get_topic_qos_from_profile(topicQos, participantWithQos.getQosLibrary(), participantWithQos.getQosProfile());
        DomainParticipant participant = participantWithQos.getParticipant();
        TopicDescription topicDescription = participant.lookup_topicdescription(topicName);
        Topic topic;
        if (topicDescription != null) {
            topic = (Topic) topicDescription;
        } else {
            topic = participant.create_topic(
                    topicName,
                    typeName,
                    topicQos,
                    null,   // listener
                    StatusKind.STATUS_MASK_NONE);
        }
        if (topic == null) {
            logger.error("Unable to create topic " + topicName);
            throw new RuntimeException("Topic creation failed, topic: " + topicName);
        }
        return topic;
    }
}
