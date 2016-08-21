package meirs.topologymonitor;

import meirs.topologymonitor.adapter.DDSToTopologyAdapter;
import meirs.topologymonitor.adapter.DDSToTopologyAdapterImpl;
import meirs.topologymonitor.dal.Dao;
import meirs.topologymonitor.dal.DaoImpl;
import meirs.topologymonitor.dds.ParticipantSubscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;

/**
 * Created by Meir Shalev on 20/08/16.
 */
@SpringBootApplication
@EnableAutoConfiguration
@Import(Configuration.class)
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    @Value("${domainId}")
    private String domainIdString;

    @Autowired
    private JdbcTemplate template;

    private Dao dao;

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(Application.class).web(false).run(args);
    }

    @PostConstruct
    private void runApp() throws Exception {
        Class.forName("org.neo4j.jdbc.Driver");

        dao = new DaoImpl(template);
        DDSToTopologyAdapter adapter = new DDSToTopologyAdapterImpl(dao);

        ParticipantSubscriber participantSubscriber = new ParticipantSubscriber(Integer.valueOf(domainIdString),
                adapter);

        while(true) {

            Thread.sleep(10000);
        }
    }

}
