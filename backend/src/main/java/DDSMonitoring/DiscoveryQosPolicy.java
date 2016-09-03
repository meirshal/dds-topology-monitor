

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

public class DiscoveryQosPolicy   implements Copyable, Serializable{

    public StringSeq enabled_transports =  new StringSeq(128);
    public StringSeq initial_peers =  new StringSeq(256);
    public StringSeq multicast_receive_addresses =  new StringSeq(4);
    public int metatraffic_transport_priority= 0;
    public boolean accept_unknown_peers= false;
    public boolean enable_endpoint_discovery= false;

    public DiscoveryQosPolicy() {

    }
    public DiscoveryQosPolicy (DiscoveryQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DiscoveryQosPolicy self;
        self = new  DiscoveryQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (enabled_transports != null) {
            enabled_transports.clear();
        }
        if (initial_peers != null) {
            initial_peers.clear();
        }
        if (multicast_receive_addresses != null) {
            multicast_receive_addresses.clear();
        }
        metatraffic_transport_priority= 0;
        accept_unknown_peers= false;
        enable_endpoint_discovery= false;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DiscoveryQosPolicy otherObj = (DiscoveryQosPolicy)o;

        if(!enabled_transports.equals(otherObj.enabled_transports)) {
            return false;
        }
        if(!initial_peers.equals(otherObj.initial_peers)) {
            return false;
        }
        if(!multicast_receive_addresses.equals(otherObj.multicast_receive_addresses)) {
            return false;
        }
        if(metatraffic_transport_priority != otherObj.metatraffic_transport_priority) {
            return false;
        }
        if(accept_unknown_peers != otherObj.accept_unknown_peers) {
            return false;
        }
        if(enable_endpoint_discovery != otherObj.enable_endpoint_discovery) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += enabled_transports.hashCode(); 
        __result += initial_peers.hashCode(); 
        __result += multicast_receive_addresses.hashCode(); 
        __result += (int)metatraffic_transport_priority;
        __result += (accept_unknown_peers == true)?1:0;
        __result += (enable_endpoint_discovery == true)?1:0;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DiscoveryQosPolicyTypeSupport</code>
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

        DiscoveryQosPolicy typedSrc = (DiscoveryQosPolicy) src;
        DiscoveryQosPolicy typedDst = this;

        typedDst.enabled_transports.copy_from(typedSrc.enabled_transports);
        typedDst.initial_peers.copy_from(typedSrc.initial_peers);
        typedDst.multicast_receive_addresses.copy_from(typedSrc.multicast_receive_addresses);
        typedDst.metatraffic_transport_priority = typedSrc.metatraffic_transport_priority;
        typedDst.accept_unknown_peers = typedSrc.accept_unknown_peers;
        typedDst.enable_endpoint_discovery = typedSrc.enable_endpoint_discovery;

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
        strBuffer.append("enabled_transports: ");
        for(int i__ = 0; i__ < enabled_transports.size(); ++i__) {
            if (i__!=0) strBuffer.append(", ");
            strBuffer.append(enabled_transports.get(i__));
        }
        strBuffer.append("\n"); 
        CdrHelper.printIndent(strBuffer, indent+1);
        strBuffer.append("initial_peers: ");
        for(int i__ = 0; i__ < initial_peers.size(); ++i__) {
            if (i__!=0) strBuffer.append(", ");
            strBuffer.append(initial_peers.get(i__));
        }
        strBuffer.append("\n"); 
        CdrHelper.printIndent(strBuffer, indent+1);
        strBuffer.append("multicast_receive_addresses: ");
        for(int i__ = 0; i__ < multicast_receive_addresses.size(); ++i__) {
            if (i__!=0) strBuffer.append(", ");
            strBuffer.append(multicast_receive_addresses.get(i__));
        }
        strBuffer.append("\n"); 
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("metatraffic_transport_priority: ").append(metatraffic_transport_priority).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("accept_unknown_peers: ").append(accept_unknown_peers).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("enable_endpoint_discovery: ").append(enable_endpoint_discovery).append("\n");  

        return strBuffer.toString();
    }

}
