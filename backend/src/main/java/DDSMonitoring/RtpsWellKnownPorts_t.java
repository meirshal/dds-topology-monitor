

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

public class RtpsWellKnownPorts_t   implements Copyable, Serializable{

    public int port_base= 0;
    public int domain_id_gain= 0;
    public int participant_id_gain= 0;
    public int builtin_multicast_port_offset= 0;
    public int builtin_unicast_port_offset= 0;
    public int user_multicast_port_offset= 0;
    public int user_unicast_port_offset= 0;

    public RtpsWellKnownPorts_t() {

    }
    public RtpsWellKnownPorts_t (RtpsWellKnownPorts_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        RtpsWellKnownPorts_t self;
        self = new  RtpsWellKnownPorts_t();
        return self;

    }

    public void clear() {

        port_base= 0;
        domain_id_gain= 0;
        participant_id_gain= 0;
        builtin_multicast_port_offset= 0;
        builtin_unicast_port_offset= 0;
        user_multicast_port_offset= 0;
        user_unicast_port_offset= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        RtpsWellKnownPorts_t otherObj = (RtpsWellKnownPorts_t)o;

        if(port_base != otherObj.port_base) {
            return false;
        }
        if(domain_id_gain != otherObj.domain_id_gain) {
            return false;
        }
        if(participant_id_gain != otherObj.participant_id_gain) {
            return false;
        }
        if(builtin_multicast_port_offset != otherObj.builtin_multicast_port_offset) {
            return false;
        }
        if(builtin_unicast_port_offset != otherObj.builtin_unicast_port_offset) {
            return false;
        }
        if(user_multicast_port_offset != otherObj.user_multicast_port_offset) {
            return false;
        }
        if(user_unicast_port_offset != otherObj.user_unicast_port_offset) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)port_base;
        __result += (int)domain_id_gain;
        __result += (int)participant_id_gain;
        __result += (int)builtin_multicast_port_offset;
        __result += (int)builtin_unicast_port_offset;
        __result += (int)user_multicast_port_offset;
        __result += (int)user_unicast_port_offset;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>RtpsWellKnownPorts_tTypeSupport</code>
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

        RtpsWellKnownPorts_t typedSrc = (RtpsWellKnownPorts_t) src;
        RtpsWellKnownPorts_t typedDst = this;

        typedDst.port_base = typedSrc.port_base;
        typedDst.domain_id_gain = typedSrc.domain_id_gain;
        typedDst.participant_id_gain = typedSrc.participant_id_gain;
        typedDst.builtin_multicast_port_offset = typedSrc.builtin_multicast_port_offset;
        typedDst.builtin_unicast_port_offset = typedSrc.builtin_unicast_port_offset;
        typedDst.user_multicast_port_offset = typedSrc.user_multicast_port_offset;
        typedDst.user_unicast_port_offset = typedSrc.user_unicast_port_offset;

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
        strBuffer.append("port_base: ").append(port_base).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("domain_id_gain: ").append(domain_id_gain).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("participant_id_gain: ").append(participant_id_gain).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("builtin_multicast_port_offset: ").append(builtin_multicast_port_offset).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("builtin_unicast_port_offset: ").append(builtin_unicast_port_offset).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("user_multicast_port_offset: ").append(user_multicast_port_offset).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("user_unicast_port_offset: ").append(user_unicast_port_offset).append("\n");  

        return strBuffer.toString();
    }

}
