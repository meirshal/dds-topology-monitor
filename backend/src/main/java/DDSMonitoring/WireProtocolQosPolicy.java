

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class WireProtocolQosPolicy   implements Copyable, Serializable{

    public int participant_id= 0;
    public int rtps_host_id= 0;
    public int rtps_app_id= 0;
    public int rtps_instance_id= 0;
    public DDSMonitoring.RtpsWellKnownPorts_t rtps_well_known_ports = (DDSMonitoring.RtpsWellKnownPorts_t)DDSMonitoring.RtpsWellKnownPorts_t.create();
    public int rtps_reserved_port_mask= 0;
    public DDSMonitoring.WireProtocolQosPolicyAutoKind rtps_auto_id_kind = (DDSMonitoring.WireProtocolQosPolicyAutoKind)DDSMonitoring.WireProtocolQosPolicyAutoKind.create();

    public WireProtocolQosPolicy() {

    }
    public WireProtocolQosPolicy (WireProtocolQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        WireProtocolQosPolicy self;
        self = new  WireProtocolQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        participant_id= 0;
        rtps_host_id= 0;
        rtps_app_id= 0;
        rtps_instance_id= 0;
        if (rtps_well_known_ports != null) {
            rtps_well_known_ports.clear();
        }
        rtps_reserved_port_mask= 0;
        rtps_auto_id_kind = DDSMonitoring.WireProtocolQosPolicyAutoKind.create();
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        WireProtocolQosPolicy otherObj = (WireProtocolQosPolicy)o;

        if(participant_id != otherObj.participant_id) {
            return false;
        }
        if(rtps_host_id != otherObj.rtps_host_id) {
            return false;
        }
        if(rtps_app_id != otherObj.rtps_app_id) {
            return false;
        }
        if(rtps_instance_id != otherObj.rtps_instance_id) {
            return false;
        }
        if(!rtps_well_known_ports.equals(otherObj.rtps_well_known_ports)) {
            return false;
        }
        if(rtps_reserved_port_mask != otherObj.rtps_reserved_port_mask) {
            return false;
        }
        if(!rtps_auto_id_kind.equals(otherObj.rtps_auto_id_kind)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)participant_id;
        __result += (int)rtps_host_id;
        __result += (int)rtps_app_id;
        __result += (int)rtps_instance_id;
        __result += rtps_well_known_ports.hashCode(); 
        __result += (int)rtps_reserved_port_mask;
        __result += rtps_auto_id_kind.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>WireProtocolQosPolicyTypeSupport</code>
    * rather than here by using the <code>-noCopyable</code> option
    * to rtiddsgen.
    * 
    * @param src The Object which contains the data to be copied.
    * @return Returns <code>this</code>.
    * @exception NullPointerException If <code>src</code> is null.
    * @exception ClassCastException If <code>src</code> is not the 
    * same type as <code>this</code>.
    * @see com.rti.dds.infrastructure.Copyable#copy_from(java.lang.Object)
    */
    public Object copy_from(Object src) {

        WireProtocolQosPolicy typedSrc = (WireProtocolQosPolicy) src;
        WireProtocolQosPolicy typedDst = this;

        typedDst.participant_id = typedSrc.participant_id;
        typedDst.rtps_host_id = typedSrc.rtps_host_id;
        typedDst.rtps_app_id = typedSrc.rtps_app_id;
        typedDst.rtps_instance_id = typedSrc.rtps_instance_id;
        typedDst.rtps_well_known_ports = (DDSMonitoring.RtpsWellKnownPorts_t) typedDst.rtps_well_known_ports.copy_from(typedSrc.rtps_well_known_ports);
        typedDst.rtps_reserved_port_mask = typedSrc.rtps_reserved_port_mask;
        typedDst.rtps_auto_id_kind = (DDSMonitoring.WireProtocolQosPolicyAutoKind) typedDst.rtps_auto_id_kind.copy_from(typedSrc.rtps_auto_id_kind);

        return this;
    }

    public String toString(){
        return toString("", 0);
    }

    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();        

        if (desc != null) {
            CdrHelper.printIndent(strBuffer, indent);
            strBuffer.append(desc).append(":\n");
        }

        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("participant_id: ").append(participant_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("rtps_host_id: ").append(rtps_host_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("rtps_app_id: ").append(rtps_app_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("rtps_instance_id: ").append(rtps_instance_id).append("\n");  
        strBuffer.append(rtps_well_known_ports.toString("rtps_well_known_ports ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("rtps_reserved_port_mask: ").append(rtps_reserved_port_mask).append("\n");  
        strBuffer.append(rtps_auto_id_kind.toString("rtps_auto_id_kind ", indent+1));

        return strBuffer.toString();
    }

}
