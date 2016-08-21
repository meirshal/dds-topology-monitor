package meirs.topologyMonitor;

import meirs.topologyMonitor.adapter.DDSToTopologyAdapter;
import meirs.topologyMonitor.adapter.DDSToTopologyAdapterImpl;
import meirs.topologyMonitor.dal.Dao;
import meirs.topologyMonitor.dal.DaoImpl;
import meirs.topologyMonitor.dds.ParticipantSubscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

/**
 * Created by Meir Shalev on 20/08/16.
 */
@SpringBootApplication
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    @Value("${domainId}")
    private String domainIdString;

    private Dao dao = new DaoImpl();

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(Application.class).web(false).run(args);
    }

    @PostConstruct
    private void runApp() throws Exception {

        DDSToTopologyAdapter adapter = new DDSToTopologyAdapterImpl(dao);

        ParticipantSubscriber participantSubscriber = new ParticipantSubscriber(Integer.valueOf(domainIdString),
                adapter);

        while(true) {

            Thread.sleep(10000);
        }
    }
}
