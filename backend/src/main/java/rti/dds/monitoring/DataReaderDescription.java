

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rti.dds.monitoring;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class DataReaderDescription   implements Copyable, Serializable{

    public DDSMonitoring.BuiltinTopicKey_t entity_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.BuiltinTopicKey_t subscriber_entity_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.BuiltinTopicKey_t topic_entity_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public boolean is_content_filtered= false;
    public int domain_id= 0;
    public int host_id= 0;
    public int process_id= 0;
    public String type_name=  "" ; /* maximum length = ((rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)) */
    public String topic_name=  "" ; /* maximum length = ((rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)) */
    public int serialized_sample_max_size= 0;
    public int serialized_sample_min_size= 0;
    public int serialized_key_max_size= 0;
    public DDSMonitoring.DataReaderQos qos = (DDSMonitoring.DataReaderQos)DDSMonitoring.DataReaderQos.create();

    public DataReaderDescription() {

    }
    public DataReaderDescription (DataReaderDescription other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataReaderDescription self;
        self = new  DataReaderDescription();
        self.clear();
        return self;

    }

    public void clear() {

        if (entity_key != null) {
            entity_key.clear();
        }
        if (subscriber_entity_key != null) {
            subscriber_entity_key.clear();
        }
        if (topic_entity_key != null) {
            topic_entity_key.clear();
        }
        is_content_filtered= false;
        domain_id= 0;
        host_id= 0;
        process_id= 0;
        type_name=  ""; 
        topic_name=  ""; 
        serialized_sample_max_size= 0;
        serialized_sample_min_size= 0;
        serialized_key_max_size= 0;
        if (qos != null) {
            qos.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataReaderDescription otherObj = (DataReaderDescription)o;

        if(!entity_key.equals(otherObj.entity_key)) {
            return false;
        }
        if(!subscriber_entity_key.equals(otherObj.subscriber_entity_key)) {
            return false;
        }
        if(!topic_entity_key.equals(otherObj.topic_entity_key)) {
            return false;
        }
        if(is_content_filtered != otherObj.is_content_filtered) {
            return false;
        }
        if(domain_id != otherObj.domain_id) {
            return false;
        }
        if(host_id != otherObj.host_id) {
            return false;
        }
        if(process_id != otherObj.process_id) {
            return false;
        }
        if(!type_name.equals(otherObj.type_name)) {
            return false;
        }
        if(!topic_name.equals(otherObj.topic_name)) {
            return false;
        }
        if(serialized_sample_max_size != otherObj.serialized_sample_max_size) {
            return false;
        }
        if(serialized_sample_min_size != otherObj.serialized_sample_min_size) {
            return false;
        }
        if(serialized_key_max_size != otherObj.serialized_key_max_size) {
            return false;
        }
        if(!qos.equals(otherObj.qos)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += entity_key.hashCode(); 
        __result += subscriber_entity_key.hashCode(); 
        __result += topic_entity_key.hashCode(); 
        __result += (is_content_filtered == true)?1:0;
        __result += (int)domain_id;
        __result += (int)host_id;
        __result += (int)process_id;
        __result += type_name.hashCode(); 
        __result += topic_name.hashCode(); 
        __result += (int)serialized_sample_max_size;
        __result += (int)serialized_sample_min_size;
        __result += (int)serialized_key_max_size;
        __result += qos.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataReaderDescriptionTypeSupport</code>
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

        DataReaderDescription typedSrc = (DataReaderDescription) src;
        DataReaderDescription typedDst = this;

        typedDst.entity_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.entity_key.copy_from(typedSrc.entity_key);
        typedDst.subscriber_entity_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.subscriber_entity_key.copy_from(typedSrc.subscriber_entity_key);
        typedDst.topic_entity_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.topic_entity_key.copy_from(typedSrc.topic_entity_key);
        typedDst.is_content_filtered = typedSrc.is_content_filtered;
        typedDst.domain_id = typedSrc.domain_id;
        typedDst.host_id = typedSrc.host_id;
        typedDst.process_id = typedSrc.process_id;
        typedDst.type_name = typedSrc.type_name;
        typedDst.topic_name = typedSrc.topic_name;
        typedDst.serialized_sample_max_size = typedSrc.serialized_sample_max_size;
        typedDst.serialized_sample_min_size = typedSrc.serialized_sample_min_size;
        typedDst.serialized_key_max_size = typedSrc.serialized_key_max_size;
        typedDst.qos = (DDSMonitoring.DataReaderQos) typedDst.qos.copy_from(typedSrc.qos);

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

        strBuffer.append(entity_key.toString("entity_key ", indent+1));
        strBuffer.append(subscriber_entity_key.toString("subscriber_entity_key ", indent+1));
        strBuffer.append(topic_entity_key.toString("topic_entity_key ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("is_content_filtered: ").append(is_content_filtered).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("domain_id: ").append(domain_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("host_id: ").append(host_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("process_id: ").append(process_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("type_name: ").append(type_name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("topic_name: ").append(topic_name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("serialized_sample_max_size: ").append(serialized_sample_max_size).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("serialized_sample_min_size: ").append(serialized_sample_min_size).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("serialized_key_max_size: ").append(serialized_key_max_size).append("\n");  
        strBuffer.append(qos.toString("qos ", indent+1));

        return strBuffer.toString();
    }

}
