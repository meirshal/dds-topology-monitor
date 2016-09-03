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
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.PostConstruct;

/**
 * Created by Meir Shalev on 20/08/16.
 */
@SpringBootApplication
@EnableAutoConfiguration
@Import(DBConfiguration.class)
public class Application extends WebMvcConfigurerAdapter {

    @Value("${domainId:0}")
    private String domainIdString;

    @Autowired
    private JdbcTemplate template;

    private Dao dao;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    private void runApp() throws Exception {

        dao = new DaoImpl(template);
        DDSToTopologyAdapter adapter = new DDSToTopologyAdapterImpl(dao);

        ParticipantSubscriber participantSubscriber = new ParticipantSubscriber(Integer.valueOf(domainIdString),
                adapter);
    }
}
