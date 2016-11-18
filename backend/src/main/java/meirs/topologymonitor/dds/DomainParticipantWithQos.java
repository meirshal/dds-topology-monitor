package meirs.topologymonitor.dds;

import com.rti.dds.domain.DomainParticipant;

/**
 * Created by mich8bsp on 18/11/16.
 */
public class DomainParticipantWithQos {

    private final DomainParticipant participant;
    private final String qosLibrary;

    public DomainParticipant getParticipant() {
        return participant;
    }

    public String getQosLibrary() {
        return qosLibrary;
    }

    public String getQosProfile() {
        return qosProfile;
    }

    private final String qosProfile;

    public DomainParticipantWithQos(DomainParticipant participant, String qosLibrary, String qosProfile) {
        this.participant = participant;
        this.qosLibrary = qosLibrary;
        this.qosProfile = qosProfile;
    }


}
