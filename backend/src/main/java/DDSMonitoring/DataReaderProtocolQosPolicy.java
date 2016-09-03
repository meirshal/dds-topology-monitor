

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

public class DataReaderProtocolQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.GUID_t virtual_guid = (DDSMonitoring.GUID_t)DDSMonitoring.GUID_t.create();
    public int rtps_object_id= 0;
    public boolean expects_inline_qos= false;
    public boolean disable_positive_acks= false;
    public boolean propagate_dispose_of_unregistered_instances= false;
    public DDSMonitoring.RtpsReliableReaderProtocol_t rtps_reliable_reader = (DDSMonitoring.RtpsReliableReaderProtocol_t)DDSMonitoring.RtpsReliableReaderProtocol_t.create();
    public boolean vendor_specific_entity= false;
    public boolean propagate_unregister_of_disposed_instances= false;

    public DataReaderProtocolQosPolicy() {

    }
    public DataReaderProtocolQosPolicy (DataReaderProtocolQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataReaderProtocolQosPolicy self;
        self = new  DataReaderProtocolQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (virtual_guid != null) {
            virtual_guid.clear();
        }
        rtps_object_id= 0;
        expects_inline_qos= false;
        disable_positive_acks= false;
        propagate_dispose_of_unregistered_instances= false;
        if (rtps_reliable_reader != null) {
            rtps_reliable_reader.clear();
        }
        vendor_specific_entity= false;
        propagate_unregister_of_disposed_instances= false;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataReaderProtocolQosPolicy otherObj = (DataReaderProtocolQosPolicy)o;

        if(!virtual_guid.equals(otherObj.virtual_guid)) {
            return false;
        }
        if(rtps_object_id != otherObj.rtps_object_id) {
            return false;
        }
        if(expects_inline_qos != otherObj.expects_inline_qos) {
            return false;
        }
        if(disable_positive_acks != otherObj.disable_positive_acks) {
            return false;
        }
        if(propagate_dispose_of_unregistered_instances != otherObj.propagate_dispose_of_unregistered_instances) {
            return false;
        }
        if(!rtps_reliable_reader.equals(otherObj.rtps_reliable_reader)) {
            return false;
        }
        if(vendor_specific_entity != otherObj.vendor_specific_entity) {
            return false;
        }
        if(propagate_unregister_of_disposed_instances != otherObj.propagate_unregister_of_disposed_instances) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += virtual_guid.hashCode(); 
        __result += (int)rtps_object_id;
        __result += (expects_inline_qos == true)?1:0;
        __result += (disable_positive_acks == true)?1:0;
        __result += (propagate_dispose_of_unregistered_instances == true)?1:0;
        __result += rtps_reliable_reader.hashCode(); 
        __result += (vendor_specific_entity == true)?1:0;
        __result += (propagate_unregister_of_disposed_instances == true)?1:0;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataReaderProtocolQosPolicyTypeSupport</code>
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

        DataReaderProtocolQosPolicy typedSrc = (DataReaderProtocolQosPolicy) src;
        DataReaderProtocolQosPolicy typedDst = this;

        typedDst.virtual_guid = (DDSMonitoring.GUID_t) typedDst.virtual_guid.copy_from(typedSrc.virtual_guid);
        typedDst.rtps_object_id = typedSrc.rtps_object_id;
        typedDst.expects_inline_qos = typedSrc.expects_inline_qos;
        typedDst.disable_positive_acks = typedSrc.disable_positive_acks;
        typedDst.propagate_dispose_of_unregistered_instances = typedSrc.propagate_dispose_of_unregistered_instances;
        typedDst.rtps_reliable_reader = (DDSMonitoring.RtpsReliableReaderProtocol_t) typedDst.rtps_reliable_reader.copy_from(typedSrc.rtps_reliable_reader);
        typedDst.vendor_specific_entity = typedSrc.vendor_specific_entity;
        typedDst.propagate_unregister_of_disposed_instances = typedSrc.propagate_unregister_of_disposed_instances;

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
        strBuffer.append("expects_inline_qos: ").append(expects_inline_qos).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("disable_positive_acks: ").append(disable_positive_acks).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("propagate_dispose_of_unregistered_instances: ").append(propagate_dispose_of_unregistered_instances).append("\n");  
        strBuffer.append(rtps_reliable_reader.toString("rtps_reliable_reader ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("vendor_specific_entity: ").append(vendor_specific_entity).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("propagate_unregister_of_disposed_instances: ").append(propagate_unregister_of_disposed_instances).append("\n");  

        return strBuffer.toString();
    }

}
