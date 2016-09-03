

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

public class UserObjectQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.UserObjectSettings_t participant_user_object = (DDSMonitoring.UserObjectSettings_t)DDSMonitoring.UserObjectSettings_t.create();
    public DDSMonitoring.UserObjectSettings_t topic_user_object = (DDSMonitoring.UserObjectSettings_t)DDSMonitoring.UserObjectSettings_t.create();
    public DDSMonitoring.UserObjectSettings_t content_filtered_topic_user_object = (DDSMonitoring.UserObjectSettings_t)DDSMonitoring.UserObjectSettings_t.create();
    public DDSMonitoring.UserObjectSettings_t publisher_user_object = (DDSMonitoring.UserObjectSettings_t)DDSMonitoring.UserObjectSettings_t.create();
    public DDSMonitoring.UserObjectSettings_t data_writer_user_object = (DDSMonitoring.UserObjectSettings_t)DDSMonitoring.UserObjectSettings_t.create();
    public DDSMonitoring.UserObjectSettings_t subscriber_user_object = (DDSMonitoring.UserObjectSettings_t)DDSMonitoring.UserObjectSettings_t.create();
    public DDSMonitoring.UserObjectSettings_t data_reader_user_object = (DDSMonitoring.UserObjectSettings_t)DDSMonitoring.UserObjectSettings_t.create();
    public DDSMonitoring.UserObjectSettings_t read_condition_user_object = (DDSMonitoring.UserObjectSettings_t)DDSMonitoring.UserObjectSettings_t.create();
    public DDSMonitoring.UserObjectSettings_t query_condition_user_object = (DDSMonitoring.UserObjectSettings_t)DDSMonitoring.UserObjectSettings_t.create();
    public DDSMonitoring.UserObjectSettings_t index_condition_user_object = (DDSMonitoring.UserObjectSettings_t)DDSMonitoring.UserObjectSettings_t.create();
    public DDSMonitoring.UserObjectSettings_t flow_controller_user_object = (DDSMonitoring.UserObjectSettings_t)DDSMonitoring.UserObjectSettings_t.create();

    public UserObjectQosPolicy() {

    }
    public UserObjectQosPolicy (UserObjectQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        UserObjectQosPolicy self;
        self = new  UserObjectQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (participant_user_object != null) {
            participant_user_object.clear();
        }
        if (topic_user_object != null) {
            topic_user_object.clear();
        }
        if (content_filtered_topic_user_object != null) {
            content_filtered_topic_user_object.clear();
        }
        if (publisher_user_object != null) {
            publisher_user_object.clear();
        }
        if (data_writer_user_object != null) {
            data_writer_user_object.clear();
        }
        if (subscriber_user_object != null) {
            subscriber_user_object.clear();
        }
        if (data_reader_user_object != null) {
            data_reader_user_object.clear();
        }
        if (read_condition_user_object != null) {
            read_condition_user_object.clear();
        }
        if (query_condition_user_object != null) {
            query_condition_user_object.clear();
        }
        if (index_condition_user_object != null) {
            index_condition_user_object.clear();
        }
        if (flow_controller_user_object != null) {
            flow_controller_user_object.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        UserObjectQosPolicy otherObj = (UserObjectQosPolicy)o;

        if(!participant_user_object.equals(otherObj.participant_user_object)) {
            return false;
        }
        if(!topic_user_object.equals(otherObj.topic_user_object)) {
            return false;
        }
        if(!content_filtered_topic_user_object.equals(otherObj.content_filtered_topic_user_object)) {
            return false;
        }
        if(!publisher_user_object.equals(otherObj.publisher_user_object)) {
            return false;
        }
        if(!data_writer_user_object.equals(otherObj.data_writer_user_object)) {
            return false;
        }
        if(!subscriber_user_object.equals(otherObj.subscriber_user_object)) {
            return false;
        }
        if(!data_reader_user_object.equals(otherObj.data_reader_user_object)) {
            return false;
        }
        if(!read_condition_user_object.equals(otherObj.read_condition_user_object)) {
            return false;
        }
        if(!query_condition_user_object.equals(otherObj.query_condition_user_object)) {
            return false;
        }
        if(!index_condition_user_object.equals(otherObj.index_condition_user_object)) {
            return false;
        }
        if(!flow_controller_user_object.equals(otherObj.flow_controller_user_object)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += participant_user_object.hashCode(); 
        __result += topic_user_object.hashCode(); 
        __result += content_filtered_topic_user_object.hashCode(); 
        __result += publisher_user_object.hashCode(); 
        __result += data_writer_user_object.hashCode(); 
        __result += subscriber_user_object.hashCode(); 
        __result += data_reader_user_object.hashCode(); 
        __result += read_condition_user_object.hashCode(); 
        __result += query_condition_user_object.hashCode(); 
        __result += index_condition_user_object.hashCode(); 
        __result += flow_controller_user_object.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>UserObjectQosPolicyTypeSupport</code>
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

        UserObjectQosPolicy typedSrc = (UserObjectQosPolicy) src;
        UserObjectQosPolicy typedDst = this;

        typedDst.participant_user_object = (DDSMonitoring.UserObjectSettings_t) typedDst.participant_user_object.copy_from(typedSrc.participant_user_object);
        typedDst.topic_user_object = (DDSMonitoring.UserObjectSettings_t) typedDst.topic_user_object.copy_from(typedSrc.topic_user_object);
        typedDst.content_filtered_topic_user_object = (DDSMonitoring.UserObjectSettings_t) typedDst.content_filtered_topic_user_object.copy_from(typedSrc.content_filtered_topic_user_object);
        typedDst.publisher_user_object = (DDSMonitoring.UserObjectSettings_t) typedDst.publisher_user_object.copy_from(typedSrc.publisher_user_object);
        typedDst.data_writer_user_object = (DDSMonitoring.UserObjectSettings_t) typedDst.data_writer_user_object.copy_from(typedSrc.data_writer_user_object);
        typedDst.subscriber_user_object = (DDSMonitoring.UserObjectSettings_t) typedDst.subscriber_user_object.copy_from(typedSrc.subscriber_user_object);
        typedDst.data_reader_user_object = (DDSMonitoring.UserObjectSettings_t) typedDst.data_reader_user_object.copy_from(typedSrc.data_reader_user_object);
        typedDst.read_condition_user_object = (DDSMonitoring.UserObjectSettings_t) typedDst.read_condition_user_object.copy_from(typedSrc.read_condition_user_object);
        typedDst.query_condition_user_object = (DDSMonitoring.UserObjectSettings_t) typedDst.query_condition_user_object.copy_from(typedSrc.query_condition_user_object);
        typedDst.index_condition_user_object = (DDSMonitoring.UserObjectSettings_t) typedDst.index_condition_user_object.copy_from(typedSrc.index_condition_user_object);
        typedDst.flow_controller_user_object = (DDSMonitoring.UserObjectSettings_t) typedDst.flow_controller_user_object.copy_from(typedSrc.flow_controller_user_object);

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

        strBuffer.append(participant_user_object.toString("participant_user_object ", indent+1));
        strBuffer.append(topic_user_object.toString("topic_user_object ", indent+1));
        strBuffer.append(content_filtered_topic_user_object.toString("content_filtered_topic_user_object ", indent+1));
        strBuffer.append(publisher_user_object.toString("publisher_user_object ", indent+1));
        strBuffer.append(data_writer_user_object.toString("data_writer_user_object ", indent+1));
        strBuffer.append(subscriber_user_object.toString("subscriber_user_object ", indent+1));
        strBuffer.append(data_reader_user_object.toString("data_reader_user_object ", indent+1));
        strBuffer.append(read_condition_user_object.toString("read_condition_user_object ", indent+1));
        strBuffer.append(query_condition_user_object.toString("query_condition_user_object ", indent+1));
        strBuffer.append(index_condition_user_object.toString("index_condition_user_object ", indent+1));
        strBuffer.append(flow_controller_user_object.toString("flow_controller_user_object ", indent+1));

        return strBuffer.toString();
    }

}
