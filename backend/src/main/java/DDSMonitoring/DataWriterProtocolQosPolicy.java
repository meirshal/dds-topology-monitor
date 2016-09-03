

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

public class DataWriterProtocolQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.GUID_t virtual_guid = (DDSMonitoring.GUID_t)DDSMonitoring.GUID_t.create();
    public int rtps_object_id= 0;
    public boolean push_on_write= false;
    public boolean disable_positive_acks= false;
    public boolean disable_inline_keyhash= false;
    public boolean serialize_key_with_dispose= false;
    public boolean propagate_app_ack_with_no_response= false;
    public DDSMonitoring.RtpsReliableWriterProtocol_t rtps_reliable_writer = (DDSMonitoring.RtpsReliableWriterProtocol_t)DDSMonitoring.RtpsReliableWriterProtocol_t.create();
    public DDSMonitoring.SequenceNumber_t initial_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public boolean vendor_specific_entity= false;

    public DataWriterProtocolQosPolicy() {

    }
    public DataWriterProtocolQosPolicy (DataWriterProtocolQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataWriterProtocolQosPolicy self;
        self = new  DataWriterProtocolQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (virtual_guid != null) {
            virtual_guid.clear();
        }
        rtps_object_id= 0;
        push_on_write= false;
        disable_positive_acks= false;
        disable_inline_keyhash= false;
        serialize_key_with_dispose= false;
        propagate_app_ack_with_no_response= false;
        if (rtps_reliable_writer != null) {
            rtps_reliable_writer.clear();
        }
        if (initial_virtual_sequence_number != null) {
            initial_virtual_sequence_number.clear();
        }
        vendor_specific_entity= false;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataWriterProtocolQosPolicy otherObj = (DataWriterProtocolQosPolicy)o;

        if(!virtual_guid.equals(otherObj.virtual_guid)) {
            return false;
        }
        if(rtps_object_id != otherObj.rtps_object_id) {
            return false;
        }
        if(push_on_write != otherObj.push_on_write) {
            return false;
        }
        if(disable_positive_acks != otherObj.disable_positive_acks) {
            return false;
        }
        if(disable_inline_keyhash != otherObj.disable_inline_keyhash) {
            return false;
        }
        if(serialize_key_with_dispose != otherObj.serialize_key_with_dispose) {
            return false;
        }
        if(propagate_app_ack_with_no_response != otherObj.propagate_app_ack_with_no_response) {
            return false;
        }
        if(!rtps_reliable_writer.equals(otherObj.rtps_reliable_writer)) {
            return false;
        }
        if(!initial_virtual_sequence_number.equals(otherObj.initial_virtual_sequence_number)) {
            return false;
        }
        if(vendor_specific_entity != otherObj.vendor_specific_entity) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += virtual_guid.hashCode(); 
        __result += (int)rtps_object_id;
        __result += (push_on_write == true)?1:0;
        __result += (disable_positive_acks == true)?1:0;
        __result += (disable_inline_keyhash == true)?1:0;
        __result += (serialize_key_with_dispose == true)?1:0;
        __result += (propagate_app_ack_with_no_response == true)?1:0;
        __result += rtps_reliable_writer.hashCode(); 
        __result += initial_virtual_sequence_number.hashCode(); 
        __result += (vendor_specific_entity == true)?1:0;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataWriterProtocolQosPolicyTypeSupport</code>
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

        DataWriterProtocolQosPolicy typedSrc = (DataWriterProtocolQosPolicy) src;
        DataWriterProtocolQosPolicy typedDst = this;

        typedDst.virtual_guid = (DDSMonitoring.GUID_t) typedDst.virtual_guid.copy_from(typedSrc.virtual_guid);
        typedDst.rtps_object_id = typedSrc.rtps_object_id;
        typedDst.push_on_write = typedSrc.push_on_write;
        typedDst.disable_positive_acks = typedSrc.disable_positive_acks;
        typedDst.disable_inline_keyhash = typedSrc.disable_inline_keyhash;
        typedDst.serialize_key_with_dispose = typedSrc.serialize_key_with_dispose;
        typedDst.propagate_app_ack_with_no_response = typedSrc.propagate_app_ack_with_no_response;
        typedDst.rtps_reliable_writer = (DDSMonitoring.RtpsReliableWriterProtocol_t) typedDst.rtps_reliable_writer.copy_from(typedSrc.rtps_reliable_writer);
        typedDst.initial_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.initial_virtual_sequence_number.copy_from(typedSrc.initial_virtual_sequence_number);
        typedDst.vendor_specific_entity = typedSrc.vendor_specific_entity;

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

        strBuffer.append(virtual_guid.toString("virtual_guid ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("rtps_object_id: ").append(rtps_object_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("push_on_write: ").append(push_on_write).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("disable_positive_acks: ").append(disable_positive_acks).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("disable_inline_keyhash: ").append(disable_inline_keyhash).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("serialize_key_with_dispose: ").append(serialize_key_with_dispose).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("propagate_app_ack_with_no_response: ").append(propagate_app_ack_with_no_response).append("\n");  
        strBuffer.append(rtps_reliable_writer.toString("rtps_reliable_writer ", indent+1));
        strBuffer.append(initial_virtual_sequence_number.toString("initial_virtual_sequence_number ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("vendor_specific_entity: ").append(vendor_specific_entity).append("\n");  

        return strBuffer.toString();
    }

}
