package meirs.topologymonitor;

import com.rti.dds.infrastructure.InstanceHandle_t;
import com.rti.dds.type.builtin.StringTypeSupport;
import meirs.topologymonitor.dds.DDSUtils;
import meirs.topologymonitor.dds.DomainParticipantWithQos;
import meirs.topologymonitor.dds.TopicSubscriber;
import meirs.topologymonitor.util.dds.TopicPublisher;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.SpringApplication;

import java.util.function.Consumer;

/**
 * Created by Michael Bespalov on 18/11/16.
 */
public class TestScenario {
    private static Consumer<Object> callback = (sample) -> {
    };
    private static final String DEMO_QOS_WITH_MONITORING = "MonitorDemoLibrary::MonitorDefault";

    @BeforeClass
    public static void init() {
        SpringApplication.run(Application.class);
    }

    /**
     * Scenario:
     * On domain 0 - writer on topic A, 2 subscribers on topic A.
     * 2 writers on topic B, 1 subscriber on topic B
     * subscriber on topic C
     * writer on topic D
     * <p>
     * On domain 1 - writer on topic B, subscriber on topic B
     */
    @Test
    public void runManualScenario() throws InterruptedException {
        DomainParticipantWithQos participant = DDSUtils.createParticipant(0, DEMO_QOS_WITH_MONITORING);
        TopicSubscriber readerA = new TopicSubscriber(String.class, StringTypeSupport.get_instance(), participant, "A", callback);
        TopicPublisher writerA = new TopicPublisher(String.class, StringTypeSupport.get_instance(), participant, "A");
        TopicSubscriber reader2A = new TopicSubscriber(String.class, StringTypeSupport.get_instance(), participant, "A", callback);

        TopicPublisher writerB = new TopicPublisher(String.class, StringTypeSupport.get_instance(), participant, "B");
        TopicPublisher writer2B = new TopicPublisher(String.class, StringTypeSupport.get_instance(), participant, "B");
        TopicSubscriber readerB = new TopicSubscriber(String.class, StringTypeSupport.get_instance(), participant, "B", callback);

        TopicSubscriber readerC = new TopicSubscriber(String.class, StringTypeSupport.get_instance(), participant, "C", callback);
        TopicPublisher writerD = new TopicPublisher(String.class, StringTypeSupport.get_instance(), participant, "D");

        DomainParticipantWithQos participant2 = DDSUtils.createParticipant(1, DEMO_QOS_WITH_MONITORING);
        TopicPublisher writerBpar2 = new TopicPublisher(String.class, StringTypeSupport.get_instance(), participant2, "B");
        TopicSubscriber readerBpar2 = new TopicSubscriber(String.class, StringTypeSupport.get_instance(), participant2, "B", callback);

        while (true) {
            writerA.getDataWriter().write_untyped("Hello", InstanceHandle_t.HANDLE_NIL);
            Thread.sleep(1000);
        }
    }
}
