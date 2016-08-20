

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

public class DataWriterQos   implements Copyable, Serializable{

    public DDSMonitoring.DurabilityQosPolicy durability = (DDSMonitoring.DurabilityQosPolicy)DDSMonitoring.DurabilityQosPolicy.create();
    public DDSMonitoring.DurabilityServiceQosPolicy durability_service = (DDSMonitoring.DurabilityServiceQosPolicy)DDSMonitoring.DurabilityServiceQosPolicy.create();
    public DDSMonitoring.DeadlineQosPolicy deadline = (DDSMonitoring.DeadlineQosPolicy)DDSMonitoring.DeadlineQosPolicy.create();
    public DDSMonitoring.LatencyBudgetQosPolicy latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy)DDSMonitoring.LatencyBudgetQosPolicy.create();
    public DDSMonitoring.LivelinessQosPolicy liveliness = (DDSMonitoring.LivelinessQosPolicy)DDSMonitoring.LivelinessQosPolicy.create();
    public DDSMonitoring.ReliabilityQosPolicy reliability = (DDSMonitoring.ReliabilityQosPolicy)DDSMonitoring.ReliabilityQosPolicy.create();
    public DDSMonitoring.DestinationOrderQosPolicy destination_order = (DDSMonitoring.DestinationOrderQosPolicy)DDSMonitoring.DestinationOrderQosPolicy.create();
    public DDSMonitoring.HistoryQosPolicy history = (DDSMonitoring.HistoryQosPolicy)DDSMonitoring.HistoryQosPolicy.create();
    public DDSMonitoring.ResourceLimitsQosPolicy resource_limits = (DDSMonitoring.ResourceLimitsQosPolicy)DDSMonitoring.ResourceLimitsQosPolicy.create();
    public DDSMonitoring.TransportPriorityQosPolicy transport_priority = (DDSMonitoring.TransportPriorityQosPolicy)DDSMonitoring.TransportPriorityQosPolicy.create();
    public DDSMonitoring.LifespanQosPolicy lifespan = (DDSMonitoring.LifespanQosPolicy)DDSMonitoring.LifespanQosPolicy.create();
    public DDSMonitoring.UserDataQosPolicy user_data = (DDSMonitoring.UserDataQosPolicy)DDSMonitoring.UserDataQosPolicy.create();
    public DDSMonitoring.OwnershipQosPolicy ownership = (DDSMonitoring.OwnershipQosPolicy)DDSMonitoring.OwnershipQosPolicy.create();
    public DDSMonitoring.OwnershipStrengthQosPolicy ownership_strength = (DDSMonitoring.OwnershipStrengthQosPolicy)DDSMonitoring.OwnershipStrengthQosPolicy.create();
    public DDSMonitoring.WriterDataLifecycleQosPolicy writer_data_lifecycle = (DDSMonitoring.WriterDataLifecycleQosPolicy)DDSMonitoring.WriterDataLifecycleQosPolicy.create();
    public DDSMonitoring.DataWriterResourceLimitsQosPolicy writer_resource_limits = (DDSMonitoring.DataWriterResourceLimitsQosPolicy)DDSMonitoring.DataWriterResourceLimitsQosPolicy.create();
    public DDSMonitoring.DataWriterProtocolQosPolicy protocol = (DDSMonitoring.DataWriterProtocolQosPolicy)DDSMonitoring.DataWriterProtocolQosPolicy.create();
    public DDSMonitoring.TransportSelectionQosPolicy transport_selection = (DDSMonitoring.TransportSelectionQosPolicy)DDSMonitoring.TransportSelectionQosPolicy.create();
    public DDSMonitoring.TransportUnicastQosPolicy unicast = (DDSMonitoring.TransportUnicastQosPolicy)DDSMonitoring.TransportUnicastQosPolicy.create();
    public DDSMonitoring.TransportEncapsulationQosPolicy encapsulation = (DDSMonitoring.TransportEncapsulationQosPolicy)DDSMonitoring.TransportEncapsulationQosPolicy.create();
    public DDSMonitoring.PublishModeQosPolicy publish_mode = (DDSMonitoring.PublishModeQosPolicy)DDSMonitoring.PublishModeQosPolicy.create();
    public DDSMonitoring.PropertyQosPolicy property = (DDSMonitoring.PropertyQosPolicy)DDSMonitoring.PropertyQosPolicy.create();
    public DDSMonitoring.ServiceQosPolicy service = (DDSMonitoring.ServiceQosPolicy)DDSMonitoring.ServiceQosPolicy.create();
    public DDSMonitoring.BatchQosPolicy batch = (DDSMonitoring.BatchQosPolicy)DDSMonitoring.BatchQosPolicy.create();
    public DDSMonitoring.MultiChannelQosPolicy multi_channel = (DDSMonitoring.MultiChannelQosPolicy)DDSMonitoring.MultiChannelQosPolicy.create();
    public DDSMonitoring.AvailabilityQosPolicy availability = (DDSMonitoring.AvailabilityQosPolicy)DDSMonitoring.AvailabilityQosPolicy.create();
    public DDSMonitoring.EntityNameQosPolicy publication_name = (DDSMonitoring.EntityNameQosPolicy)DDSMonitoring.EntityNameQosPolicy.create();
    public DDSMonitoring.TypeSupportQosPolicy type_support = (DDSMonitoring.TypeSupportQosPolicy)DDSMonitoring.TypeSupportQosPolicy.create();

    public DataWriterQos() {

    }
    public DataWriterQos (DataWriterQos other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataWriterQos self;
        self = new  DataWriterQos();
        self.clear();
        return self;

    }

    public void clear() {

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
        if (destination_order != null) {
            destination_order.clear();
        }
        if (history != null) {
            history.clear();
        }
        if (resource_limits != null) {
            resource_limits.clear();
        }
        if (transport_priority != null) {
            transport_priority.clear();
        }
        if (lifespan != null) {
            lifespan.clear();
        }
        if (user_data != null) {
            user_data.clear();
        }
        if (ownership != null) {
            ownership.clear();
        }
        if (ownership_strength != null) {
            ownership_strength.clear();
        }
        if (writer_data_lifecycle != null) {
            writer_data_lifecycle.clear();
        }
        if (writer_resource_limits != null) {
            writer_resource_limits.clear();
        }
        if (protocol != null) {
            protocol.clear();
        }
        if (transport_selection != null) {
            transport_selection.clear();
        }
        if (unicast != null) {
            unicast.clear();
        }
        if (encapsulation != null) {
            encapsulation.clear();
        }
        if (publish_mode != null) {
            publish_mode.clear();
        }
        if (property != null) {
            property.clear();
        }
        if (service != null) {
            service.clear();
        }
        if (batch != null) {
            batch.clear();
        }
        if (multi_channel != null) {
            multi_channel.clear();
        }
        if (availability != null) {
            availability.clear();
        }
        if (publication_name != null) {
            publication_name.clear();
        }
        if (type_support != null) {
            type_support.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataWriterQos otherObj = (DataWriterQos)o;

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
        if(!destination_order.equals(otherObj.destination_order)) {
            return false;
        }
        if(!history.equals(otherObj.history)) {
            return false;
        }
        if(!resource_limits.equals(otherObj.resource_limits)) {
            return false;
        }
        if(!transport_priority.equals(otherObj.transport_priority)) {
            return false;
        }
        if(!lifespan.equals(otherObj.lifespan)) {
            return false;
        }
        if(!user_data.equals(otherObj.user_data)) {
            return false;
        }
        if(!ownership.equals(otherObj.ownership)) {
            return false;
        }
        if(!ownership_strength.equals(otherObj.ownership_strength)) {
            return false;
        }
        if(!writer_data_lifecycle.equals(otherObj.writer_data_lifecycle)) {
            return false;
        }
        if(!writer_resource_limits.equals(otherObj.writer_resource_limits)) {
            return false;
        }
        if(!protocol.equals(otherObj.protocol)) {
            return false;
        }
        if(!transport_selection.equals(otherObj.transport_selection)) {
            return false;
        }
        if(!unicast.equals(otherObj.unicast)) {
            return false;
        }
        if(!encapsulation.equals(otherObj.encapsulation)) {
            return false;
        }
        if(!publish_mode.equals(otherObj.publish_mode)) {
            return false;
        }
        if(!property.equals(otherObj.property)) {
            return false;
        }
        if(!service.equals(otherObj.service)) {
            return false;
        }
        if(!batch.equals(otherObj.batch)) {
            return false;
        }
        if(!multi_channel.equals(otherObj.multi_channel)) {
            return false;
        }
        if(!availability.equals(otherObj.availability)) {
            return false;
        }
        if(!publication_name.equals(otherObj.publication_name)) {
            return false;
        }
        if(!type_support.equals(otherObj.type_support)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += durability.hashCode(); 
        __result += durability_service.hashCode(); 
        __result += deadline.hashCode(); 
        __result += latency_budget.hashCode(); 
        __result += liveliness.hashCode(); 
        __result += reliability.hashCode(); 
        __result += destination_order.hashCode(); 
        __result += history.hashCode(); 
        __result += resource_limits.hashCode(); 
        __result += transport_priority.hashCode(); 
        __result += lifespan.hashCode(); 
        __result += user_data.hashCode(); 
        __result += ownership.hashCode(); 
        __result += ownership_strength.hashCode(); 
        __result += writer_data_lifecycle.hashCode(); 
        __result += writer_resource_limits.hashCode(); 
        __result += protocol.hashCode(); 
        __result += transport_selection.hashCode(); 
        __result += unicast.hashCode(); 
        __result += encapsulation.hashCode(); 
        __result += publish_mode.hashCode(); 
        __result += property.hashCode(); 
        __result += service.hashCode(); 
        __result += batch.hashCode(); 
        __result += multi_channel.hashCode(); 
        __result += availability.hashCode(); 
        __result += publication_name.hashCode(); 
        __result += type_support.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataWriterQosTypeSupport</code>
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

        DataWriterQos typedSrc = (DataWriterQos) src;
        DataWriterQos typedDst = this;

        typedDst.durability = (DDSMonitoring.DurabilityQosPolicy) typedDst.durability.copy_from(typedSrc.durability);
        typedDst.durability_service = (DDSMonitoring.DurabilityServiceQosPolicy) typedDst.durability_service.copy_from(typedSrc.durability_service);
        typedDst.deadline = (DDSMonitoring.DeadlineQosPolicy) typedDst.deadline.copy_from(typedSrc.deadline);
        typedDst.latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy) typedDst.latency_budget.copy_from(typedSrc.latency_budget);
        typedDst.liveliness = (DDSMonitoring.LivelinessQosPolicy) typedDst.liveliness.copy_from(typedSrc.liveliness);
        typedDst.reliability = (DDSMonitoring.ReliabilityQosPolicy) typedDst.reliability.copy_from(typedSrc.reliability);
        typedDst.destination_order = (DDSMonitoring.DestinationOrderQosPolicy) typedDst.destination_order.copy_from(typedSrc.destination_order);
        typedDst.history = (DDSMonitoring.HistoryQosPolicy) typedDst.history.copy_from(typedSrc.history);
        typedDst.resource_limits = (DDSMonitoring.ResourceLimitsQosPolicy) typedDst.resource_limits.copy_from(typedSrc.resource_limits);
        typedDst.transport_priority = (DDSMonitoring.TransportPriorityQosPolicy) typedDst.transport_priority.copy_from(typedSrc.transport_priority);
        typedDst.lifespan = (DDSMonitoring.LifespanQosPolicy) typedDst.lifespan.copy_from(typedSrc.lifespan);
        typedDst.user_data = (DDSMonitoring.UserDataQosPolicy) typedDst.user_data.copy_from(typedSrc.user_data);
        typedDst.ownership = (DDSMonitoring.OwnershipQosPolicy) typedDst.ownership.copy_from(typedSrc.ownership);
        typedDst.ownership_strength = (DDSMonitoring.OwnershipStrengthQosPolicy) typedDst.ownership_strength.copy_from(typedSrc.ownership_strength);
        typedDst.writer_data_lifecycle = (DDSMonitoring.WriterDataLifecycleQosPolicy) typedDst.writer_data_lifecycle.copy_from(typedSrc.writer_data_lifecycle);
        typedDst.writer_resource_limits = (DDSMonitoring.DataWriterResourceLimitsQosPolicy) typedDst.writer_resource_limits.copy_from(typedSrc.writer_resource_limits);
        typedDst.protocol = (DDSMonitoring.DataWriterProtocolQosPolicy) typedDst.protocol.copy_from(typedSrc.protocol);
        typedDst.transport_selection = (DDSMonitoring.TransportSelectionQosPolicy) typedDst.transport_selection.copy_from(typedSrc.transport_selection);
        typedDst.unicast = (DDSMonitoring.TransportUnicastQosPolicy) typedDst.unicast.copy_from(typedSrc.unicast);
        typedDst.encapsulation = (DDSMonitoring.TransportEncapsulationQosPolicy) typedDst.encapsulation.copy_from(typedSrc.encapsulation);
        typedDst.publish_mode = (DDSMonitoring.PublishModeQosPolicy) typedDst.publish_mode.copy_from(typedSrc.publish_mode);
        typedDst.property = (DDSMonitoring.PropertyQosPolicy) typedDst.property.copy_from(typedSrc.property);
        typedDst.service = (DDSMonitoring.ServiceQosPolicy) typedDst.service.copy_from(typedSrc.service);
        typedDst.batch = (DDSMonitoring.BatchQosPolicy) typedDst.batch.copy_from(typedSrc.batch);
        typedDst.multi_channel = (DDSMonitoring.MultiChannelQosPolicy) typedDst.multi_channel.copy_from(typedSrc.multi_channel);
        typedDst.availability = (DDSMonitoring.AvailabilityQosPolicy) typedDst.availability.copy_from(typedSrc.availability);
        typedDst.publication_name = (DDSMonitoring.EntityNameQosPolicy) typedDst.publication_name.copy_from(typedSrc.publication_name);
        typedDst.type_support = (DDSMonitoring.TypeSupportQosPolicy) typedDst.type_support.copy_from(typedSrc.type_support);

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

        strBuffer.append(durability.toString("durability ", indent+1));
        strBuffer.append(durability_service.toString("durability_service ", indent+1));
        strBuffer.append(deadline.toString("deadline ", indent+1));
        strBuffer.append(latency_budget.toString("latency_budget ", indent+1));
        strBuffer.append(liveliness.toString("liveliness ", indent+1));
        strBuffer.append(reliability.toString("reliability ", indent+1));
        strBuffer.append(destination_order.toString("destination_order ", indent+1));
        strBuffer.append(history.toString("history ", indent+1));
        strBuffer.append(resource_limits.toString("resource_limits ", indent+1));
        strBuffer.append(transport_priority.toString("transport_priority ", indent+1));
        strBuffer.append(lifespan.toString("lifespan ", indent+1));
        strBuffer.append(user_data.toString("user_data ", indent+1));
        strBuffer.append(ownership.toString("ownership ", indent+1));
        strBuffer.append(ownership_strength.toString("ownership_strength ", indent+1));
        strBuffer.append(writer_data_lifecycle.toString("writer_data_lifecycle ", indent+1));
        strBuffer.append(writer_resource_limits.toString("writer_resource_limits ", indent+1));
        strBuffer.append(protocol.toString("protocol ", indent+1));
        strBuffer.append(transport_selection.toString("transport_selection ", indent+1));
        strBuffer.append(unicast.toString("unicast ", indent+1));
        strBuffer.append(encapsulation.toString("encapsulation ", indent+1));
        strBuffer.append(publish_mode.toString("publish_mode ", indent+1));
        strBuffer.append(property.toString("property ", indent+1));
        strBuffer.append(service.toString("service ", indent+1));
        strBuffer.append(batch.toString("batch ", indent+1));
        strBuffer.append(multi_channel.toString("multi_channel ", indent+1));
        strBuffer.append(availability.toString("availability ", indent+1));
        strBuffer.append(publication_name.toString("publication_name ", indent+1));
        strBuffer.append(type_support.toString("type_support ", indent+1));

        return strBuffer.toString();
    }

}
