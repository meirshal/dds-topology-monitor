

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

public class TopicBuiltinTopicData   implements Copyable, Serializable{

    public DDSMonitoring.BuiltinTopicKey_t key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public String name=  "" ; /* maximum length = ((DDSMonitoring.BUILTIN_TOPIC_DATA_STRING_MAX_LENGTH.VALUE)) */
    public String type_name=  "" ; /* maximum length = ((DDSMonitoring.BUILTIN_TOPIC_DATA_STRING_MAX_LENGTH.VALUE)) */
    public DDSMonitoring.DurabilityQosPolicy durability = (DDSMonitoring.DurabilityQosPolicy)DDSMonitoring.DurabilityQosPolicy.create();
    public DDSMonitoring.DurabilityServiceQosPolicy durability_service = (DDSMonitoring.DurabilityServiceQosPolicy)DDSMonitoring.DurabilityServiceQosPolicy.create();
    public DDSMonitoring.DeadlineQosPolicy deadline = (DDSMonitoring.DeadlineQosPolicy)DDSMonitoring.DeadlineQosPolicy.create();
    public DDSMonitoring.LatencyBudgetQosPolicy latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy)DDSMonitoring.LatencyBudgetQosPolicy.create();
    public DDSMonitoring.LivelinessQosPolicy liveliness = (DDSMonitoring.LivelinessQosPolicy)DDSMonitoring.LivelinessQosPolicy.create();
    public DDSMonitoring.ReliabilityQosPolicy reliability = (DDSMonitoring.ReliabilityQosPolicy)DDSMonitoring.ReliabilityQosPolicy.create();
    public DDSMonitoring.TransportPriorityQosPolicy transport_priority = (DDSMonitoring.TransportPriorityQosPolicy)DDSMonitoring.TransportPriorityQosPolicy.create();
    public DDSMonitoring.LifespanQosPolicy lifespan = (DDSMonitoring.LifespanQosPolicy)DDSMonitoring.LifespanQosPolicy.create();
    public DDSMonitoring.DestinationOrderQosPolicy destination_order = (DDSMonitoring.DestinationOrderQosPolicy)DDSMonitoring.DestinationOrderQosPolicy.create();
    public DDSMonitoring.HistoryQosPolicy history = (DDSMonitoring.HistoryQosPolicy)DDSMonitoring.HistoryQosPolicy.create();
    public DDSMonitoring.ResourceLimitsQosPolicy resource_limits = (DDSMonitoring.ResourceLimitsQosPolicy)DDSMonitoring.ResourceLimitsQosPolicy.create();
    public DDSMonitoring.OwnershipQosPolicy ownership = (DDSMonitoring.OwnershipQosPolicy)DDSMonitoring.OwnershipQosPolicy.create();
    public DDSMonitoring.TopicDataQosPolicy topic_data = (DDSMonitoring.TopicDataQosPolicy)DDSMonitoring.TopicDataQosPolicy.create();
    public DDSMonitoring.TypeConsistencyEnforcementQosPolicy type_consistency = (DDSMonitoring.TypeConsistencyEnforcementQosPolicy)DDSMonitoring.TypeConsistencyEnforcementQosPolicy.create();

    public TopicBuiltinTopicData() {

    }
    public TopicBuiltinTopicData (TopicBuiltinTopicData other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        TopicBuiltinTopicData self;
        self = new  TopicBuiltinTopicData();
        self.clear();
        return self;

    }

    public void clear() {

        if (key != null) {
            key.clear();
        }
        name=  ""; 
        type_name=  ""; 
        if (durability != null) {
            durability.clear();
        }
        if (durability_service != null) {
            durability_service.clear();
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
        if (transport_priority != null) {
            transport_priority.clear();
        }
        if (lifespan != null) {
            lifespan.clear();
        }
        if (destination_order != null) {
            destination_order.clear();
        }
        if (history != null) {
            history.clear();
        }
        if (resource_limits != null) {
            resource_limits.clear();
        }
        if (ownership != null) {
            ownership.clear();
        }
        if (topic_data != null) {
            topic_data.clear();
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

        TopicBuiltinTopicData otherObj = (TopicBuiltinTopicData)o;

        if(!key.equals(otherObj.key)) {
            return false;
        }
        if(!name.equals(otherObj.name)) {
            return false;
        }
        if(!type_name.equals(otherObj.type_name)) {
            return false;
        }
        if(!durability.equals(otherObj.durability)) {
            return false;
        }
        if(!durability_service.equals(otherObj.durability_service)) {
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
        if(!transport_priority.equals(otherObj.transport_priority)) {
            return false;
        }
        if(!lifespan.equals(otherObj.lifespan)) {
            return false;
        }
        if(!destination_order.equals(otherObj.destination_order)) {
            return false;
        }
        if(!history.equals(otherObj.history)) {
            return false;
        }
        if(!resource_limits.equals(otherObj.resource_limits)) {
            return false;
        }
        if(!ownership.equals(otherObj.ownership)) {
            return false;
        }
        if(!topic_data.equals(otherObj.topic_data)) {
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
        __result += name.hashCode(); 
        __result += type_name.hashCode(); 
        __result += durability.hashCode(); 
        __result += durability_service.hashCode(); 
        __result += deadline.hashCode(); 
        __result += latency_budget.hashCode(); 
        __result += liveliness.hashCode(); 
        __result += reliability.hashCode(); 
        __result += transport_priority.hashCode(); 
        __result += lifespan.hashCode(); 
        __result += destination_order.hashCode(); 
        __result += history.hashCode(); 
        __result += resource_limits.hashCode(); 
        __result += ownership.hashCode(); 
        __result += topic_data.hashCode(); 
        __result += type_consistency.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>TopicBuiltinTopicDataTypeSupport</code>
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

        TopicBuiltinTopicData typedSrc = (TopicBuiltinTopicData) src;
        TopicBuiltinTopicData typedDst = this;

        typedDst.key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.key.copy_from(typedSrc.key);
        typedDst.name = typedSrc.name;
        typedDst.type_name = typedSrc.type_name;
        typedDst.durability = (DDSMonitoring.DurabilityQosPolicy) typedDst.durability.copy_from(typedSrc.durability);
        typedDst.durability_service = (DDSMonitoring.DurabilityServiceQosPolicy) typedDst.durability_service.copy_from(typedSrc.durability_service);
        typedDst.deadline = (DDSMonitoring.DeadlineQosPolicy) typedDst.deadline.copy_from(typedSrc.deadline);
        typedDst.latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy) typedDst.latency_budget.copy_from(typedSrc.latency_budget);
        typedDst.liveliness = (DDSMonitoring.LivelinessQosPolicy) typedDst.liveliness.copy_from(typedSrc.liveliness);
        typedDst.reliability = (DDSMonitoring.ReliabilityQosPolicy) typedDst.reliability.copy_from(typedSrc.reliability);
        typedDst.transport_priority = (DDSMonitoring.TransportPriorityQosPolicy) typedDst.transport_priority.copy_from(typedSrc.transport_priority);
        typedDst.lifespan = (DDSMonitoring.LifespanQosPolicy) typedDst.lifespan.copy_from(typedSrc.lifespan);
        typedDst.destination_order = (DDSMonitoring.DestinationOrderQosPolicy) typedDst.destination_order.copy_from(typedSrc.destination_order);
        typedDst.history = (DDSMonitoring.HistoryQosPolicy) typedDst.history.copy_from(typedSrc.history);
        typedDst.resource_limits = (DDSMonitoring.ResourceLimitsQosPolicy) typedDst.resource_limits.copy_from(typedSrc.resource_limits);
        typedDst.ownership = (DDSMonitoring.OwnershipQosPolicy) typedDst.ownership.copy_from(typedSrc.ownership);
        typedDst.topic_data = (DDSMonitoring.TopicDataQosPolicy) typedDst.topic_data.copy_from(typedSrc.topic_data);
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
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("name: ").append(name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("type_name: ").append(type_name).append("\n");  
        strBuffer.append(durability.toString("durability ", indent+1));
        strBuffer.append(durability_service.toString("durability_service ", indent+1));
        strBuffer.append(deadline.toString("deadline ", indent+1));
        strBuffer.append(latency_budget.toString("latency_budget ", indent+1));
        strBuffer.append(liveliness.toString("liveliness ", indent+1));
        strBuffer.append(reliability.toString("reliability ", indent+1));
        strBuffer.append(transport_priority.toString("transport_priority ", indent+1));
        strBuffer.append(lifespan.toString("lifespan ", indent+1));
        strBuffer.append(destination_order.toString("destination_order ", indent+1));
        strBuffer.append(history.toString("history ", indent+1));
        strBuffer.append(resource_limits.toString("resource_limits ", indent+1));
        strBuffer.append(ownership.toString("ownership ", indent+1));
        strBuffer.append(topic_data.toString("topic_data ", indent+1));
        strBuffer.append(type_consistency.toString("type_consistency ", indent+1));

        return strBuffer.toString();
    }

}
