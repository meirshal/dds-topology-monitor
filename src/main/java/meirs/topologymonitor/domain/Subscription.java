package meirs.topologymonitor.domain;

/**
 * Created by Meir Shalev on 20/08/16.
 */

public class Subscription {

    private Long id;

    private NetworkNode publisher;
    private NetworkNode subscriber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NetworkNode getPublisher() {
        return publisher;
    }

    public void setPublisher(NetworkNode publisher) {
        this.publisher = publisher;
    }

    public NetworkNode getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(NetworkNode subscriber) {
        this.subscriber = subscriber;
    }

    public Subscription(NetworkNode publisher, NetworkNode subscriber) {
        this.publisher = publisher;
        this.subscriber = subscriber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscription that = (Subscription) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (publisher != null ? !publisher.equals(that.publisher) : that.publisher != null) return false;
        return subscriber != null ? subscriber.equals(that.subscriber) : that.subscriber == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + (subscriber != null ? subscriber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", publisher=" + publisher +
                ", subscriber=" + subscriber +
                '}';
    }
}
