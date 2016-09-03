package meirs.topologymonitor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by Meir Shalev on 21/08/16.
 */
public class DBConfiguration {

    public static final String NEO4J_URL = System.getProperty("NEO4J_URL","jdbc:neo4j:http://localhost:7474");

    @Value("${neo4j.username:neo4j}")
    private String username;

    @Value("${neo4j.password:123456}")
    private String password;

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource(NEO4J_URL, username, password);
    }
}
