package meirs.topologymonitor.domain;

import java.util.List;

/**
 * Created by Meir Shalev on 20/08/16.
 */
public class NetworkNode {

    String id;

    private String statistics;

    private List<NetworkNode> publishesTo;

    public NetworkNode(String id, String statistics) {
        this.id = id;
        this.statistics = statistics;
    }

    public NetworkNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }

    public List<NetworkNode> getPublishesTo() {
        return publishesTo;
    }

    public void setPublishesTo(List<NetworkNode> publishesTo) {
        this.publishesTo = publishesTo;
    }

    @Override
    public String toString() {
        return "NetworkNode{" +
                "id='" + id + '\'' +
                ", statistics='" + statistics + '\'' +
                ", publishesTo=" + publishesTo +
                '}';
    }
}
