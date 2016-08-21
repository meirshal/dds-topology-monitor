package meirs.topologyMonitor.dal;

import meirs.topologyMonitor.domain.NetworkNode;

/**
 * Created by Meir Shalev on 21/08/16.
 */
public interface Dao {

    void saveNode(NetworkNode node);

    void deleteNode(String id);

    void setPublicationConnection(String publisher, String Subscriber);

}
