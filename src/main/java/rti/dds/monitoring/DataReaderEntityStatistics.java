

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

public class DataReaderEntityStatistics   implements Copyable, Serializable{

    public DDSMonitoring.BuiltinTopicKey_t datareader_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.Duration_t period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.BuiltinTopicKey_t participant_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.BuiltinTopicKey_t subscriber_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.BuiltinTopicKey_t topic_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public boolean is_content_filtered= false;
    public String topic_name=  "" ; /* maximum length = ((rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)) */
    public int domain_id= 0;
    public int host_id= 0;
    public int process_id= 0;
    public rti.dds.monitoring.SampleRejectedStatusStatistics sample_rejected_status = (rti.dds.monitoring.SampleRejectedStatusStatistics)rti.dds.monitoring.SampleRejectedStatusStatistics.create();
    public rti.dds.monitoring.LivelinessChangedStatusStatistics liveliness_changed_status = (rti.dds.monitoring.LivelinessChangedStatusStatistics)rti.dds.monitoring.LivelinessChangedStatusStatistics.create();
    public rti.dds.monitoring.RequestedDeadlineMissedStatusStatistics requested_deadline_missed_status = (rti.dds.monitoring.RequestedDeadlineMissedStatusStatistics)rti.dds.monitoring.RequestedDeadlineMissedStatusStatistics.create();
    public rti.dds.monitoring.RequestedIncompatibleQosStatusStatistics requested_incompatible_qos_status = (rti.dds.monitoring.RequestedIncompatibleQosStatusStatistics)rti.dds.monitoring.RequestedIncompatibleQosStatusStatistics.create();
    public rti.dds.monitoring.SampleLostStatusStatistics sample_lost_status = (rti.dds.monitoring.SampleLostStatusStatistics)rti.dds.monitoring.SampleLostStatusStatistics.create();
    public rti.dds.monitoring.SubscriptionMatchedStatusStatistics subscription_matched_status = (rti.dds.monitoring.SubscriptionMatchedStatusStatistics)rti.dds.monitoring.SubscriptionMatchedStatusStatistics.create();
    public rti.dds.monitoring.DataReaderCacheStatusStatistics datareader_cache_status = (rti.dds.monitoring.DataReaderCacheStatusStatistics)rti.dds.monitoring.DataReaderCacheStatusStatistics.create();
    public rti.dds.monitoring.DataReaderProtocolStatusStatistics datareader_protocol_status = (rti.dds.monitoring.DataReaderProtocolStatusStatistics)rti.dds.monitoring.DataReaderProtocolStatusStatistics.create();

    public DataReaderEntityStatistics() {

    }
    public DataReaderEntityStatistics (DataReaderEntityStatistics other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataReaderEntityStatistics self;
        self = new  DataReaderEntityStatistics();
        self.clear();
        return self;

    }

    public void clear() {

        if (datareader_key != null) {
            datareader_key.clear();
        }
        if (period != null) {
            period.clear();
        }
        if (participant_key != null) {
            participant_key.clear();
        }
        if (subscriber_key != null) {
            subscriber_key.clear();
        }
        if (topic_key != null) {
            topic_key.clear();
        }
        is_content_filtered= false;
        topic_name=  ""; 
        domain_id= 0;
        host_id= 0;
        process_id= 0;
        if (sample_rejected_status != null) {
            sample_rejected_status.clear();
        }
        if (liveliness_changed_status != null) {
            liveliness_changed_status.clear();
        }
        if (requested_deadline_missed_status != null) {
            requested_deadline_missed_status.clear();
        }
        if (requested_incompatible_qos_status != null) {
            requested_incompatible_qos_status.clear();
        }
        if (sample_lost_status != null) {
            sample_lost_status.clear();
        }
        if (subscription_matched_status != null) {
            subscription_matched_status.clear();
        }
        if (datareader_cache_status != null) {
            datareader_cache_status.clear();
        }
        if (datareader_protocol_status != null) {
            datareader_protocol_status.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataReaderEntityStatistics otherObj = (DataReaderEntityStatistics)o;

        if(!datareader_key.equals(otherObj.datareader_key)) {
            return false;
        }
        if(!period.equals(otherObj.period)) {
            return false;
        }
        if(!participant_key.equals(otherObj.participant_key)) {
            return false;
        }
        if(!subscriber_key.equals(otherObj.subscriber_key)) {
            return false;
        }
        if(!topic_key.equals(otherObj.topic_key)) {
            return false;
        }
        if(is_content_filtered != otherObj.is_content_filtered) {
            return false;
        }
        if(!topic_name.equals(otherObj.topic_name)) {
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
        if(!sample_rejected_status.equals(otherObj.sample_rejected_status)) {
            return false;
        }
        if(!liveliness_changed_status.equals(otherObj.liveliness_changed_status)) {
            return false;
        }
        if(!requested_deadline_missed_status.equals(otherObj.requested_deadline_missed_status)) {
            return false;
        }
        if(!requested_incompatible_qos_status.equals(otherObj.requested_incompatible_qos_status)) {
            return false;
        }
        if(!sample_lost_status.equals(otherObj.sample_lost_status)) {
            return false;
        }
        if(!subscription_matched_status.equals(otherObj.subscription_matched_status)) {
            return false;
        }
        if(!datareader_cache_status.equals(otherObj.datareader_cache_status)) {
            return false;
        }
        if(!datareader_protocol_status.equals(otherObj.datareader_protocol_status)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += datareader_key.hashCode(); 
        __result += period.hashCode(); 
        __result += participant_key.hashCode(); 
        __result += subscriber_key.hashCode(); 
        __result += topic_key.hashCode(); 
        __result += (is_content_filtered == true)?1:0;
        __result += topic_name.hashCode(); 
        __result += (int)domain_id;
        __result += (int)host_id;
        __result += (int)process_id;
        __result += sample_rejected_status.hashCode(); 
        __result += liveliness_changed_status.hashCode(); 
        __result += requested_deadline_missed_status.hashCode(); 
        __result += requested_incompatible_qos_status.hashCode(); 
        __result += sample_lost_status.hashCode(); 
        __result += subscription_matched_status.hashCode(); 
        __result += datareader_cache_status.hashCode(); 
        __result += datareader_protocol_status.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataReaderEntityStatisticsTypeSupport</code>
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

        DataReaderEntityStatistics typedSrc = (DataReaderEntityStatistics) src;
        DataReaderEntityStatistics typedDst = this;

        typedDst.datareader_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.datareader_key.copy_from(typedSrc.datareader_key);
        typedDst.period = (DDSMonitoring.Duration_t) typedDst.period.copy_from(typedSrc.period);
        typedDst.participant_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.participant_key.copy_from(typedSrc.participant_key);
        typedDst.subscriber_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.subscriber_key.copy_from(typedSrc.subscriber_key);
        typedDst.topic_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.topic_key.copy_from(typedSrc.topic_key);
        typedDst.is_content_filtered = typedSrc.is_content_filtered;
        typedDst.topic_name = typedSrc.topic_name;
        typedDst.domain_id = typedSrc.domain_id;
        typedDst.host_id = typedSrc.host_id;
        typedDst.process_id = typedSrc.process_id;
        typedDst.sample_rejected_status = (rti.dds.monitoring.SampleRejectedStatusStatistics) typedDst.sample_rejected_status.copy_from(typedSrc.sample_rejected_status);
        typedDst.liveliness_changed_status = (rti.dds.monitoring.LivelinessChangedStatusStatistics) typedDst.liveliness_changed_status.copy_from(typedSrc.liveliness_changed_status);
        typedDst.requested_deadline_missed_status = (rti.dds.monitoring.RequestedDeadlineMissedStatusStatistics) typedDst.requested_deadline_missed_status.copy_from(typedSrc.requested_deadline_missed_status);
        typedDst.requested_incompatible_qos_status = (rti.dds.monitoring.RequestedIncompatibleQosStatusStatistics) typedDst.requested_incompatible_qos_status.copy_from(typedSrc.requested_incompatible_qos_status);
        typedDst.sample_lost_status = (rti.dds.monitoring.SampleLostStatusStatistics) typedDst.sample_lost_status.copy_from(typedSrc.sample_lost_status);
        typedDst.subscription_matched_status = (rti.dds.monitoring.SubscriptionMatchedStatusStatistics) typedDst.subscription_matched_status.copy_from(typedSrc.subscription_matched_status);
        typedDst.datareader_cache_status = (rti.dds.monitoring.DataReaderCacheStatusStatistics) typedDst.datareader_cache_status.copy_from(typedSrc.datareader_cache_status);
        typedDst.datareader_protocol_status = (rti.dds.monitoring.DataReaderProtocolStatusStatistics) typedDst.datareader_protocol_status.copy_from(typedSrc.datareader_protocol_status);

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

        strBuffer.append(datareader_key.toString("datareader_key ", indent+1));
        strBuffer.append(period.toString("period ", indent+1));
        strBuffer.append(participant_key.toString("participant_key ", indent+1));
        strBuffer.append(subscriber_key.toString("subscriber_key ", indent+1));
        strBuffer.append(topic_key.toString("topic_key ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("is_content_filtered: ").append(is_content_filtered).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("topic_name: ").append(topic_name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("domain_id: ").append(domain_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("host_id: ").append(host_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("process_id: ").append(process_id).append("\n");  
        strBuffer.append(sample_rejected_status.toString("sample_rejected_status ", indent+1));
        strBuffer.append(liveliness_changed_status.toString("liveliness_changed_status ", indent+1));
        strBuffer.append(requested_deadline_missed_status.toString("requested_deadline_missed_status ", indent+1));
        strBuffer.append(requested_incompatible_qos_status.toString("requested_incompatible_qos_status ", indent+1));
        strBuffer.append(sample_lost_status.toString("sample_lost_status ", indent+1));
        strBuffer.append(subscription_matched_status.toString("subscription_matched_status ", indent+1));
        strBuffer.append(datareader_cache_status.toString("datareader_cache_status ", indent+1));
        strBuffer.append(datareader_protocol_status.toString("datareader_protocol_status ", indent+1));

        return strBuffer.toString();
    }

}
