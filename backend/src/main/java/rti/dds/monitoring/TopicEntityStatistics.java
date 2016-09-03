

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

public class TopicEntityStatistics   implements Copyable, Serializable{

    public DDSMonitoring.BuiltinTopicKey_t topic_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.Duration_t period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.BuiltinTopicKey_t participant_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public String topic_name=  "" ; /* maximum length = ((rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)) */
    public String type_name=  "" ; /* maximum length = ((rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)) */
    public int domain_id= 0;
    public int host_id= 0;
    public int process_id= 0;
    public rti.dds.monitoring.InconsistentTopicStatusStatistics inconsistent_topic_status = (rti.dds.monitoring.InconsistentTopicStatusStatistics)rti.dds.monitoring.InconsistentTopicStatusStatistics.create();

    public TopicEntityStatistics() {

    }
    public TopicEntityStatistics (TopicEntityStatistics other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        TopicEntityStatistics self;
        self = new  TopicEntityStatistics();
        self.clear();
        return self;

    }

    public void clear() {

        if (topic_key != null) {
            topic_key.clear();
        }
        if (period != null) {
            period.clear();
        }
        if (participant_key != null) {
            participant_key.clear();
        }
        topic_name=  ""; 
        type_name=  ""; 
        domain_id= 0;
        host_id= 0;
        process_id= 0;
        if (inconsistent_topic_status != null) {
            inconsistent_topic_status.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        TopicEntityStatistics otherObj = (TopicEntityStatistics)o;

        if(!topic_key.equals(otherObj.topic_key)) {
            return false;
        }
        if(!period.equals(otherObj.period)) {
            return false;
        }
        if(!participant_key.equals(otherObj.participant_key)) {
            return false;
        }
        if(!topic_name.equals(otherObj.topic_name)) {
            return false;
        }
        if(!type_name.equals(otherObj.type_name)) {
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
        if(!inconsistent_topic_status.equals(otherObj.inconsistent_topic_status)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += topic_key.hashCode(); 
        __result += period.hashCode(); 
        __result += participant_key.hashCode(); 
        __result += topic_name.hashCode(); 
        __result += type_name.hashCode(); 
        __result += (int)domain_id;
        __result += (int)host_id;
        __result += (int)process_id;
        __result += inconsistent_topic_status.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>TopicEntityStatisticsTypeSupport</code>
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

        TopicEntityStatistics typedSrc = (TopicEntityStatistics) src;
        TopicEntityStatistics typedDst = this;

        typedDst.topic_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.topic_key.copy_from(typedSrc.topic_key);
        typedDst.period = (DDSMonitoring.Duration_t) typedDst.period.copy_from(typedSrc.period);
        typedDst.participant_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.participant_key.copy_from(typedSrc.participant_key);
        typedDst.topic_name = typedSrc.topic_name;
        typedDst.type_name = typedSrc.type_name;
        typedDst.domain_id = typedSrc.domain_id;
        typedDst.host_id = typedSrc.host_id;
        typedDst.process_id = typedSrc.process_id;
        typedDst.inconsistent_topic_status = (rti.dds.monitoring.InconsistentTopicStatusStatistics) typedDst.inconsistent_topic_status.copy_from(typedSrc.inconsistent_topic_status);

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

        strBuffer.append(topic_key.toString("topic_key ", indent+1));
        strBuffer.append(period.toString("period ", indent+1));
        strBuffer.append(participant_key.toString("participant_key ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("topic_name: ").append(topic_name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("type_name: ").append(type_name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("domain_id: ").append(domain_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("host_id: ").append(host_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("process_id: ").append(process_id).append("\n");  
        strBuffer.append(inconsistent_topic_status.toString("inconsistent_topic_status ", indent+1));

        return strBuffer.toString();
    }

}
