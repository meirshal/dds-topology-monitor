package meirs.topologyMonitor.dal;

import meirs.topologyMonitor.domain.NetworkNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Meir Shalev on 21/08/16.
 */
public class DaoImpl implements Dao { //TODO: this is just a mock, need to implement this properly

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void saveNode(NetworkNode node) {
        logger.info("Saved node: " + node);
    }

    @Override
    public void deleteNode(String id) {
        logger.info("Node deleted: " + id);
    }

    @Override
    public void setPublicationConnection(String publisher, String Subscriber) {
        logger.info("Updated publication connection: " + publisher + "->" + Subscriber);
    }
}
