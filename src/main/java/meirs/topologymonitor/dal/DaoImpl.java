package meirs.topologymonitor.dal;

import meirs.topologymonitor.domain.NetworkNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Meir Shalev on 21/08/16.
 */
public class DaoImpl implements Dao {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final String SAVE_CYPHER_QUERY =
            " MERGE (n: NetworkNode {id: {1}})\n" +
            " ON MATCH SET n.json = {2}\n" +
            " ON CREATE SET n.json = {2}";

    private static final String DELETE_CYPHER_QUERY =
            " OPTIONAL MATCH (n:NetworkNode)\n" +
            " WHERE n.id = {1}\n" +
            " DELETE n";

    private static final String ADD_CONNECTION_CYPHER_QUERY =
            " MERGE (n1:NetworkNode{id: {1}})\n" +
            " MERGE (n2:NetworkNode{id: {2}})\n" +
            " MERGE (n1)-[r:PUBLISHES_TO]->(n2)\n" +
            " ON MATCH SET r.statistics = {3}\n" +
            " ON CREATE SET r.statistics = {3}";

    private JdbcTemplate template;

    public DaoImpl(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void saveNode(NetworkNode node) {
        template.update(SAVE_CYPHER_QUERY, node.getId(), node.getStatistics());
        logger.info("Saved node: " + node);
    }

    @Override
    public void deleteNode(String id) {
        template.update(DELETE_CYPHER_QUERY, id);
        logger.info("Node deleted: " + id);
    }

    @Override
    public void setPublicationConnection(String publisher, String subscriber, String statistics) {
        template.update(ADD_CONNECTION_CYPHER_QUERY, publisher, subscriber, statistics);
        logger.info("Updated publication connection: " + publisher + "->" + subscriber);
    }
}
