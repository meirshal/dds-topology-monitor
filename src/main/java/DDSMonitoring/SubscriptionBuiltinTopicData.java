

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

public class SubscriptionBuiltinTopicData   implements Copyable, Serializable{

    public DDSMonitoring.BuiltinTopicKey_t key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.BuiltinTopicKey_t participant_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public String topic_name=  "" ; /* maximum length = ((DDSMonitoring.BUILTIN_TOPIC_DATA_STRING_MAX_LENGTH.VALUE)) */
    public String type_name=  "" ; /* maximum length = ((DDSMonitoring.BUILTIN_TOPIC_DATA_STRING_MAX_LENGTH.VALUE)) */
    public DDSMonitoring.DurabilityQosPolicy durability = (DDSMonitoring.DurabilityQosPolicy)DDSMonitoring.DurabilityQosPolicy.create();
    public DDSMonitoring.DeadlineQosPolicy deadline = (DDSMonitoring.DeadlineQosPolicy)DDSMonitoring.DeadlineQosPolicy.create();
    public DDSMonitoring.LatencyBudgetQosPolicy latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy)DDSMonitoring.LatencyBudgetQosPolicy.create();
    public DDSMonitoring.LivelinessQosPolicy liveliness = (DDSMonitoring.LivelinessQosPolicy)DDSMonitoring.LivelinessQosPolicy.create();
    public DDSMonitoring.ReliabilityQosPolicy reliability = (DDSMonitoring.ReliabilityQosPolicy)DDSMonitoring.ReliabilityQosPolicy.create();
    public DDSMonitoring.OwnershipQosPolicy ownership = (DDSMonitoring.OwnershipQosPolicy)DDSMonitoring.OwnershipQosPolicy.create();
    public DDSMonitoring.DestinationOrderQosPolicy destination_order = (DDSMonitoring.DestinationOrderQosPolicy)DDSMonitoring.DestinationOrderQosPolicy.create();
    public DDSMonitoring.UserDataQosPolicy user_data = (DDSMonitoring.UserDataQosPolicy)DDSMonitoring.UserDataQosPolicy.create();
    public DDSMonitoring.TimeBasedFilterQosPolicy time_based_filter = (DDSMonitoring.TimeBasedFilterQosPolicy)DDSMonitoring.TimeBasedFilterQosPolicy.create();
    public DDSMonitoring.PresentationQosPolicy presentation = (DDSMonitoring.PresentationQosPolicy)DDSMonitoring.PresentationQosPolicy.create();
    public DDSMonitoring.PartitionQosPolicy partition = (DDSMonitoring.PartitionQosPolicy)DDSMonitoring.PartitionQosPolicy.create();
    public DDSMonitoring.TopicDataQosPolicy topic_data = (DDSMonitoring.TopicDataQosPolicy)DDSMonitoring.TopicDataQosPolicy.create();
    public DDSMonitoring.GroupDataQosPolicy group_data = (DDSMonitoring.GroupDataQosPolicy)DDSMonitoring.GroupDataQosPolicy.create();
    public DDSMonitoring.TypeConsistencyEnforcementQosPolicy type_consistency = (DDSMonitoring.TypeConsistencyEnforcementQosPolicy)DDSMonitoring.TypeConsistencyEnforcementQosPolicy.create();

    public SubscriptionBuiltinTopicData() {

    }
    public SubscriptionBuiltinTopicData (SubscriptionBuiltinTopicData other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        SubscriptionBuiltinTopicData self;
        self = new  SubscriptionBuiltinTopicData();
        self.clear();
        return self;

    }

    public void clear() {

        if (key != null) {
            key.clear();
        }
        if (participant_key != null) {
            participant_key.clear();
        }
        topic_name=  ""; 
        type_name=  ""; 
        if (durability != null) {
            durability.clear();
        }
        if (deadline != null) {
            deadline.clear();
        }
        if (latency_budget != null) {
            latency_budget.clear();
        }
        if (liveliness != null) {
            liveliness.clear();
        }
        if (reliability != null) {
            reliability.clear();
        }
        if (ownership != null) {
            ownership.clear();
        }
        if (destination_order != null) {
            destination_order.clear();
        }
        if (user_data != null) {
            user_data.clear();
        }
        if (time_based_filter != null) {
            time_based_filter.clear();
        }
        if (presentation != null) {
            presentation.clear();
        }
        if (partition != null) {
            partition.clear();
        }
        if (topic_data != null) {
            topic_data.clear();
        }
        if (group_data != null) {
            group_data.clear();
        }
        if (type_consistency != null) {
            type_consistency.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        SubscriptionBuiltinTopicData otherObj = (SubscriptionBuiltinTopicData)o;

        if(!key.equals(otherObj.key)) {
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
        if(!durability.equals(otherObj.durability)) {
            return false;
        }
        if(!deadline.equals(otherObj.deadline)) {
            return false;
        }
        if(!latency_budget.equals(otherObj.latency_budget)) {
            return false;
        }
        if(!liveliness.equals(otherObj.liveliness)) {
            return false;
        }
        if(!reliability.equals(otherObj.reliability)) {
            return false;
        }
        if(!ownership.equals(otherObj.ownership)) {
            return false;
        }
        if(!destination_order.equals(otherObj.destination_order)) {
            return false;
        }
        if(!user_data.equals(otherObj.user_data)) {
            return false;
        }
        if(!time_based_filter.equals(otherObj.time_based_filter)) {
            return false;
        }
        if(!presentation.equals(otherObj.presentation)) {
            return false;
        }
        if(!partition.equals(otherObj.partition)) {
            return false;
        }
        if(!topic_data.equals(otherObj.topic_data)) {
            return false;
        }
        if(!group_data.equals(otherObj.group_data)) {
            return false;
        }
        if(!type_consistency.equals(otherObj.type_consistency)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += key.hashCode(); 
        __result += participant_key.hashCode(); 
        __result += topic_name.hashCode(); 
        __result += type_name.hashCode(); 
        __result += durability.hashCode(); 
        __result += deadline.hashCode(); 
        __result += latency_budget.hashCode(); 
        __result += liveliness.hashCode(); 
        __result += reliability.hashCode(); 
        __result += ownership.hashCode(); 
        __result += destination_order.hashCode(); 
        __result += user_data.hashCode(); 
        __result += time_based_filter.hashCode(); 
        __result += presentation.hashCode(); 
        __result += partition.hashCode(); 
        __result += topic_data.hashCode(); 
        __result += group_data.hashCode(); 
        __result += type_consistency.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>SubscriptionBuiltinTopicDataTypeSupport</code>
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

        SubscriptionBuiltinTopicData typedSrc = (SubscriptionBuiltinTopicData) src;
        SubscriptionBuiltinTopicData typedDst = this;

        typedDst.key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.key.copy_from(typedSrc.key);
        typedDst.participant_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.participant_key.copy_from(typedSrc.participant_key);
        typedDst.topic_name = typedSrc.topic_name;
        typedDst.type_name = typedSrc.type_name;
        typedDst.durability = (DDSMonitoring.DurabilityQosPolicy) typedDst.durability.copy_from(typedSrc.durability);
        typedDst.deadline = (DDSMonitoring.DeadlineQosPolicy) typedDst.deadline.copy_from(typedSrc.deadline);
        typedDst.latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy) typedDst.latency_budget.copy_from(typedSrc.latency_budget);
        typedDst.liveliness = (DDSMonitoring.LivelinessQosPolicy) typedDst.liveliness.copy_from(typedSrc.liveliness);
        typedDst.reliability = (DDSMonitoring.ReliabilityQosPolicy) typedDst.reliability.copy_from(typedSrc.reliability);
        typedDst.ownership = (DDSMonitoring.OwnershipQosPolicy) typedDst.ownership.copy_from(typedSrc.ownership);
        typedDst.destination_order = (DDSMonitoring.DestinationOrderQosPolicy) typedDst.destination_order.copy_from(typedSrc.destination_order);
        typedDst.user_data = (DDSMonitoring.UserDataQosPolicy) typedDst.user_data.copy_from(typedSrc.user_data);
        typedDst.time_based_filter = (DDSMonitoring.TimeBasedFilterQosPolicy) typedDst.time_based_filter.copy_from(typedSrc.time_based_filter);
        typedDst.presentation = (DDSMonitoring.PresentationQosPolicy) typedDst.presentation.copy_from(typedSrc.presentation);
        typedDst.partition = (DDSMonitoring.PartitionQosPolicy) typedDst.partition.copy_from(typedSrc.partition);
        typedDst.topic_data = (DDSMonitoring.TopicDataQosPolicy) typedDst.topic_data.copy_from(typedSrc.topic_data);
        typedDst.group_data = (DDSMonitoring.GroupDataQosPolicy) typedDst.group_data.copy_from(typedSrc.group_data);
        typedDst.type_consistency = (DDSMonitoring.TypeConsistencyEnforcementQosPolicy) typedDst.type_consistency.copy_from(typedSrc.type_consistency);

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

        strBuffer.append(key.toString("key ", indent+1));
        strBuffer.append(participant_key.toString("participant_key ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("topic_name: ").append(topic_name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("type_name: ").append(type_name).append("\n");  
        strBuffer.append(durability.toString("durability ", indent+1));
        strBuffer.append(deadline.toString("deadline ", indent+1));
        strBuffer.append(latency_budget.toString("latency_budget ", indent+1));
        strBuffer.append(liveliness.toString("liveliness ", indent+1));
        strBuffer.append(reliability.toString("reliability ", indent+1));
        strBuffer.append(ownership.toString("ownership ", indent+1));
        strBuffer.append(destination_order.toString("destination_order ", indent+1));
        strBuffer.append(user_data.toString("user_data ", indent+1));
        strBuffer.append(time_based_filter.toString("time_based_filter ", indent+1));
        strBuffer.append(presentation.toString("presentation ", indent+1));
        strBuffer.append(partition.toString("partition ", indent+1));
        strBuffer.append(topic_data.toString("topic_data ", indent+1));
        strBuffer.append(group_data.toString("group_data ", indent+1));
        strBuffer.append(type_consistency.toString("type_consistency ", indent+1));

        return strBuffer.toString();
    }

}
