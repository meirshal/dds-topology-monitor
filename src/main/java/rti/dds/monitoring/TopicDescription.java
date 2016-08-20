

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

public class TopicDescription   implements Copyable, Serializable{

    public DDSMonitoring.BuiltinTopicKey_t entity_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.BuiltinTopicKey_t participant_entity_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public int domain_id= 0;
    public int host_id= 0;
    public int process_id= 0;
    public String topic_name=  "" ; /* maximum length = ((rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)) */
    public String type_name=  "" ; /* maximum length = ((rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)) */
    public int tc_serialized_size= 0;
    public DDSMonitoring.TopicQos qos = (DDSMonitoring.TopicQos)DDSMonitoring.TopicQos.create();

    public TopicDescription() {

    }
    public TopicDescription (TopicDescription other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        TopicDescription self;
        self = new  TopicDescription();
        self.clear();
        return self;

    }

    public void clear() {

        if (entity_key != null) {
            entity_key.clear();
        }
        if (participant_entity_key != null) {
            participant_entity_key.clear();
        }
        domain_id= 0;
        host_id= 0;
        process_id= 0;
        topic_name=  ""; 
        type_name=  ""; 
        tc_serialized_size= 0;
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

        TopicDescription otherObj = (TopicDescription)o;

        if(!entity_key.equals(otherObj.entity_key)) {
            return false;
        }
        if(!participant_entity_key.equals(otherObj.participant_entity_key)) {
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
        if(!topic_name.equals(otherObj.topic_name)) {
            return false;
        }
        if(!type_name.equals(otherObj.type_name)) {
            return false;
        }
        if(tc_serialized_size != otherObj.tc_serialized_size) {
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
        __result += participant_entity_key.hashCode(); 
        __result += (int)domain_id;
        __result += (int)host_id;
        __result += (int)process_id;
        __result += topic_name.hashCode(); 
        __result += type_name.hashCode(); 
        __result += (int)tc_serialized_size;
        __result += qos.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>TopicDescriptionTypeSupport</code>
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

        TopicDescription typedSrc = (TopicDescription) src;
        TopicDescription typedDst = this;

        typedDst.entity_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.entity_key.copy_from(typedSrc.entity_key);
        typedDst.participant_entity_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.participant_entity_key.copy_from(typedSrc.participant_entity_key);
        typedDst.domain_id = typedSrc.domain_id;
        typedDst.host_id = typedSrc.host_id;
        typedDst.process_id = typedSrc.process_id;
        typedDst.topic_name = typedSrc.topic_name;
        typedDst.type_name = typedSrc.type_name;
        typedDst.tc_serialized_size = typedSrc.tc_serialized_size;
        typedDst.qos = (DDSMonitoring.TopicQos) typedDst.qos.copy_from(typedSrc.qos);

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
        strBuffer.append(participant_entity_key.toString("participant_entity_key ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("domain_id: ").append(domain_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("host_id: ").append(host_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("process_id: ").append(process_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("topic_name: ").append(topic_name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("type_name: ").append(type_name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("tc_serialized_size: ").append(tc_serialized_size).append("\n");  
        strBuffer.append(qos.toString("qos ", indent+1));

        return strBuffer.toString();
    }

}
