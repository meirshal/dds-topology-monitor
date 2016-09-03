

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

public class DataWriterEntityStatistics   implements Copyable, Serializable{

    public DDSMonitoring.BuiltinTopicKey_t datawriter_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.Duration_t period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.BuiltinTopicKey_t participant_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.BuiltinTopicKey_t publisher_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.BuiltinTopicKey_t topic_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public String topic_name=  "" ; /* maximum length = ((rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)) */
    public int domain_id= 0;
    public int host_id= 0;
    public int process_id= 0;
    public rti.dds.monitoring.LivelinessLostStatusStatistics liveliness_lost_status = (rti.dds.monitoring.LivelinessLostStatusStatistics)rti.dds.monitoring.LivelinessLostStatusStatistics.create();
    public rti.dds.monitoring.OfferedDeadlineMissedStatusStatistics offered_deadline_missed_status = (rti.dds.monitoring.OfferedDeadlineMissedStatusStatistics)rti.dds.monitoring.OfferedDeadlineMissedStatusStatistics.create();
    public rti.dds.monitoring.OfferedIncompatibleQosStatusStatistics offered_incompatible_qos_status = (rti.dds.monitoring.OfferedIncompatibleQosStatusStatistics)rti.dds.monitoring.OfferedIncompatibleQosStatusStatistics.create();
    public rti.dds.monitoring.PublicationMatchedStatusStatistics publication_matched_status = (rti.dds.monitoring.PublicationMatchedStatusStatistics)rti.dds.monitoring.PublicationMatchedStatusStatistics.create();
    public rti.dds.monitoring.ReliableWriterCacheChangedStatusStatistics reliable_writer_cache_changed_status = (rti.dds.monitoring.ReliableWriterCacheChangedStatusStatistics)rti.dds.monitoring.ReliableWriterCacheChangedStatusStatistics.create();
    public rti.dds.monitoring.ReliableReaderActivityChangedStatusStatistics reliable_reader_activity_changed_status = (rti.dds.monitoring.ReliableReaderActivityChangedStatusStatistics)rti.dds.monitoring.ReliableReaderActivityChangedStatusStatistics.create();
    public rti.dds.monitoring.DataWriterCacheStatusStatistics datawriter_cache_status = (rti.dds.monitoring.DataWriterCacheStatusStatistics)rti.dds.monitoring.DataWriterCacheStatusStatistics.create();
    public rti.dds.monitoring.DataWriterProtocolStatusStatistics datawriter_protocol_status = (rti.dds.monitoring.DataWriterProtocolStatusStatistics)rti.dds.monitoring.DataWriterProtocolStatusStatistics.create();

    public DataWriterEntityStatistics() {

    }
    public DataWriterEntityStatistics (DataWriterEntityStatistics other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataWriterEntityStatistics self;
        self = new  DataWriterEntityStatistics();
        self.clear();
        return self;

    }

    public void clear() {

        if (datawriter_key != null) {
            datawriter_key.clear();
        }
        if (period != null) {
            period.clear();
        }
        if (participant_key != null) {
            participant_key.clear();
        }
        if (publisher_key != null) {
            publisher_key.clear();
        }
        if (topic_key != null) {
            topic_key.clear();
        }
        topic_name=  ""; 
        domain_id= 0;
        host_id= 0;
        process_id= 0;
        if (liveliness_lost_status != null) {
            liveliness_lost_status.clear();
        }
        if (offered_deadline_missed_status != null) {
            offered_deadline_missed_status.clear();
        }
        if (offered_incompatible_qos_status != null) {
            offered_incompatible_qos_status.clear();
        }
        if (publication_matched_status != null) {
            publication_matched_status.clear();
        }
        if (reliable_writer_cache_changed_status != null) {
            reliable_writer_cache_changed_status.clear();
        }
        if (reliable_reader_activity_changed_status != null) {
            reliable_reader_activity_changed_status.clear();
        }
        if (datawriter_cache_status != null) {
            datawriter_cache_status.clear();
        }
        if (datawriter_protocol_status != null) {
            datawriter_protocol_status.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataWriterEntityStatistics otherObj = (DataWriterEntityStatistics)o;

        if(!datawriter_key.equals(otherObj.datawriter_key)) {
            return false;
        }
        if(!period.equals(otherObj.period)) {
            return false;
        }
        if(!participant_key.equals(otherObj.participant_key)) {
            return false;
        }
        if(!publisher_key.equals(otherObj.publisher_key)) {
            return false;
        }
        if(!topic_key.equals(otherObj.topic_key)) {
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
        if(!liveliness_lost_status.equals(otherObj.liveliness_lost_status)) {
            return false;
        }
        if(!offered_deadline_missed_status.equals(otherObj.offered_deadline_missed_status)) {
            return false;
        }
        if(!offered_incompatible_qos_status.equals(otherObj.offered_incompatible_qos_status)) {
            return false;
        }
        if(!publication_matched_status.equals(otherObj.publication_matched_status)) {
            return false;
        }
        if(!reliable_writer_cache_changed_status.equals(otherObj.reliable_writer_cache_changed_status)) {
            return false;
        }
        if(!reliable_reader_activity_changed_status.equals(otherObj.reliable_reader_activity_changed_status)) {
            return false;
        }
        if(!datawriter_cache_status.equals(otherObj.datawriter_cache_status)) {
            return false;
        }
        if(!datawriter_protocol_status.equals(otherObj.datawriter_protocol_status)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += datawriter_key.hashCode(); 
        __result += period.hashCode(); 
        __result += participant_key.hashCode(); 
        __result += publisher_key.hashCode(); 
        __result += topic_key.hashCode(); 
        __result += topic_name.hashCode(); 
        __result += (int)domain_id;
        __result += (int)host_id;
        __result += (int)process_id;
        __result += liveliness_lost_status.hashCode(); 
        __result += offered_deadline_missed_status.hashCode(); 
        __result += offered_incompatible_qos_status.hashCode(); 
        __result += publication_matched_status.hashCode(); 
        __result += reliable_writer_cache_changed_status.hashCode(); 
        __result += reliable_reader_activity_changed_status.hashCode(); 
        __result += datawriter_cache_status.hashCode(); 
        __result += datawriter_protocol_status.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataWriterEntityStatisticsTypeSupport</code>
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

        DataWriterEntityStatistics typedSrc = (DataWriterEntityStatistics) src;
        DataWriterEntityStatistics typedDst = this;

        typedDst.datawriter_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.datawriter_key.copy_from(typedSrc.datawriter_key);
        typedDst.period = (DDSMonitoring.Duration_t) typedDst.period.copy_from(typedSrc.period);
        typedDst.participant_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.participant_key.copy_from(typedSrc.participant_key);
        typedDst.publisher_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.publisher_key.copy_from(typedSrc.publisher_key);
        typedDst.topic_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.topic_key.copy_from(typedSrc.topic_key);
        typedDst.topic_name = typedSrc.topic_name;
        typedDst.domain_id = typedSrc.domain_id;
        typedDst.host_id = typedSrc.host_id;
        typedDst.process_id = typedSrc.process_id;
        typedDst.liveliness_lost_status = (rti.dds.monitoring.LivelinessLostStatusStatistics) typedDst.liveliness_lost_status.copy_from(typedSrc.liveliness_lost_status);
        typedDst.offered_deadline_missed_status = (rti.dds.monitoring.OfferedDeadlineMissedStatusStatistics) typedDst.offered_deadline_missed_status.copy_from(typedSrc.offered_deadline_missed_status);
        typedDst.offered_incompatible_qos_status = (rti.dds.monitoring.OfferedIncompatibleQosStatusStatistics) typedDst.offered_incompatible_qos_status.copy_from(typedSrc.offered_incompatible_qos_status);
        typedDst.publication_matched_status = (rti.dds.monitoring.PublicationMatchedStatusStatistics) typedDst.publication_matched_status.copy_from(typedSrc.publication_matched_status);
        typedDst.reliable_writer_cache_changed_status = (rti.dds.monitoring.ReliableWriterCacheChangedStatusStatistics) typedDst.reliable_writer_cache_changed_status.copy_from(typedSrc.reliable_writer_cache_changed_status);
        typedDst.reliable_reader_activity_changed_status = (rti.dds.monitoring.ReliableReaderActivityChangedStatusStatistics) typedDst.reliable_reader_activity_changed_status.copy_from(typedSrc.reliable_reader_activity_changed_status);
        typedDst.datawriter_cache_status = (rti.dds.monitoring.DataWriterCacheStatusStatistics) typedDst.datawriter_cache_status.copy_from(typedSrc.datawriter_cache_status);
        typedDst.datawriter_protocol_status = (rti.dds.monitoring.DataWriterProtocolStatusStatistics) typedDst.datawriter_protocol_status.copy_from(typedSrc.datawriter_protocol_status);

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

        strBuffer.append(datawriter_key.toString("datawriter_key ", indent+1));
        strBuffer.append(period.toString("period ", indent+1));
        strBuffer.append(participant_key.toString("participant_key ", indent+1));
        strBuffer.append(publisher_key.toString("publisher_key ", indent+1));
        strBuffer.append(topic_key.toString("topic_key ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("topic_name: ").append(topic_name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("domain_id: ").append(domain_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("host_id: ").append(host_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("process_id: ").append(process_id).append("\n");  
        strBuffer.append(liveliness_lost_status.toString("liveliness_lost_status ", indent+1));
        strBuffer.append(offered_deadline_missed_status.toString("offered_deadline_missed_status ", indent+1));
        strBuffer.append(offered_incompatible_qos_status.toString("offered_incompatible_qos_status ", indent+1));
        strBuffer.append(publication_matched_status.toString("publication_matched_status ", indent+1));
        strBuffer.append(reliable_writer_cache_changed_status.toString("reliable_writer_cache_changed_status ", indent+1));
        strBuffer.append(reliable_reader_activity_changed_status.toString("reliable_reader_activity_changed_status ", indent+1));
        strBuffer.append(datawriter_cache_status.toString("datawriter_cache_status ", indent+1));
        strBuffer.append(datawriter_protocol_status.toString("datawriter_protocol_status ", indent+1));

        return strBuffer.toString();
    }

}
