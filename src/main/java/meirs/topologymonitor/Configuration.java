package meirs.topologymonitor;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by Meir Shalev on 21/08/16.
 */
public class Configuration {

    public static final String NEO4J_URL = System.getProperty("NEO4J_URL","jdbc:neo4j:http://localhost:7474");

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource(NEO4J_URL, "neo4j", "123456");
    }
}
