package meirs.topologyMonitor.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

/**
 * Created by Meir Shalev on 20/08/16.
 */

@JsonIdentityInfo(generator=JSOGGenerator.class)
@NodeEntity
public class NetworkNode {

    @GraphId String id;

    private String statistics;

    @Relationship(type="PUBLISHES_TO", direction = Relationship.OUTGOING)
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
