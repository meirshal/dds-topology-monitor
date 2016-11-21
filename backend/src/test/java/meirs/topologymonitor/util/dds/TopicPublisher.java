package meirs.topologymonitor.util.dds;

import com.rti.dds.domain.DomainParticipant;
import com.rti.dds.domain.DomainParticipantFactory;
import com.rti.dds.infrastructure.StatusKind;
import com.rti.dds.publication.DataWriter;
import com.rti.dds.publication.DataWriterQos;
import com.rti.dds.publication.PublisherQos;
import com.rti.dds.topic.Topic;
import com.rti.dds.topic.TypeSupportImpl;
import meirs.topologymonitor.dds.DDSUtils;
import meirs.topologymonitor.dds.DomainParticipantWithQos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Michael Bespalov on 18/11/16.
 */
public class TopicPublisher {
    private TypeSupportImpl typeSupport;
    private DomainParticipantWithQos participantWithQos;
    private String topicName;

    private DataWriter dataWriter;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public TopicPublisher(Class<?> typeClass,
                          TypeSupportImpl typeSupport,
                          DomainParticipantWithQos participant,
                          String topicName) {

        this.typeSupport = typeSupport;
        this.participantWithQos = participant;
        this.topicName = topicName;
        openWriter();
    }

    private void openWriter() {

        DomainParticipant participant = participantWithQos.getParticipant();
        DDSUtils.registerType(typeSupport, participant);

        Topic topic = DDSUtils.createTopic(participantWithQos, topicName, typeSupport.get_type_nameI());


        logger.info("Creating publisher...");
        PublisherQos publisherQos = new PublisherQos();
        DomainParticipantFactory.TheParticipantFactory.get_publisher_qos_from_profile(publisherQos, participantWithQos.getQosLibrary(), participantWithQos.getQosProfile());

        com.rti.dds.publication.Publisher publisher = participant.create_publisher(
                publisherQos,
                null,           // listener
                StatusKind.STATUS_MASK_NONE);
        if (publisher == null) {
            logger.error("Unable to create DDS Publisher");
            throw new RuntimeException("Publisher creation failed, topic: " + topicName);
        }

        logger.info("Creating the data writer...");

        DataWriterQos writerQos = new DataWriterQos();
        DomainParticipantFactory.TheParticipantFactory.get_datawriter_qos_from_profile(writerQos, participantWithQos.getQosLibrary(), participantWithQos.getQosProfile());

        dataWriter = publisher.create_datawriter(
                topic,
                writerQos,
                null,
                StatusKind.STATUS_MASK_ALL);
        if (dataWriter == null) {
            System.err.println("! Unable to create DDS Data Writer");
            throw new RuntimeException("HelloPublisher creation failed");
        }

    }

    public DataWriter getDataWriter() {
        return dataWriter;
    }
}
