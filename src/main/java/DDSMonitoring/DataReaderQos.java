

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

public class DataReaderQos   implements Copyable, Serializable{

    public DDSMonitoring.DurabilityQosPolicy durability = (DDSMonitoring.DurabilityQosPolicy)DDSMonitoring.DurabilityQosPolicy.create();
    public DDSMonitoring.DeadlineQosPolicy deadline = (DDSMonitoring.DeadlineQosPolicy)DDSMonitoring.DeadlineQosPolicy.create();
    public DDSMonitoring.LatencyBudgetQosPolicy latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy)DDSMonitoring.LatencyBudgetQosPolicy.create();
    public DDSMonitoring.LivelinessQosPolicy liveliness = (DDSMonitoring.LivelinessQosPolicy)DDSMonitoring.LivelinessQosPolicy.create();
    public DDSMonitoring.ReliabilityQosPolicy reliability = (DDSMonitoring.ReliabilityQosPolicy)DDSMonitoring.ReliabilityQosPolicy.create();
    public DDSMonitoring.DestinationOrderQosPolicy destination_order = (DDSMonitoring.DestinationOrderQosPolicy)DDSMonitoring.DestinationOrderQosPolicy.create();
    public DDSMonitoring.HistoryQosPolicy history = (DDSMonitoring.HistoryQosPolicy)DDSMonitoring.HistoryQosPolicy.create();
    public DDSMonitoring.ResourceLimitsQosPolicy resource_limits = (DDSMonitoring.ResourceLimitsQosPolicy)DDSMonitoring.ResourceLimitsQosPolicy.create();
    public DDSMonitoring.UserDataQosPolicy user_data = (DDSMonitoring.UserDataQosPolicy)DDSMonitoring.UserDataQosPolicy.create();
    public DDSMonitoring.OwnershipQosPolicy ownership = (DDSMonitoring.OwnershipQosPolicy)DDSMonitoring.OwnershipQosPolicy.create();
    public DDSMonitoring.TimeBasedFilterQosPolicy time_based_filter = (DDSMonitoring.TimeBasedFilterQosPolicy)DDSMonitoring.TimeBasedFilterQosPolicy.create();
    public DDSMonitoring.ReaderDataLifecycleQosPolicy reader_data_lifecycle = (DDSMonitoring.ReaderDataLifecycleQosPolicy)DDSMonitoring.ReaderDataLifecycleQosPolicy.create();
    public DDSMonitoring.TypeConsistencyEnforcementQosPolicy type_consistency = (DDSMonitoring.TypeConsistencyEnforcementQosPolicy)DDSMonitoring.TypeConsistencyEnforcementQosPolicy.create();
    public DDSMonitoring.DataReaderResourceLimitsQosPolicy reader_resource_limits = (DDSMonitoring.DataReaderResourceLimitsQosPolicy)DDSMonitoring.DataReaderResourceLimitsQosPolicy.create();
    public DDSMonitoring.DataReaderProtocolQosPolicy protocol = (DDSMonitoring.DataReaderProtocolQosPolicy)DDSMonitoring.DataReaderProtocolQosPolicy.create();
    public DDSMonitoring.TransportSelectionQosPolicy transport_selection = (DDSMonitoring.TransportSelectionQosPolicy)DDSMonitoring.TransportSelectionQosPolicy.create();
    public DDSMonitoring.TransportUnicastQosPolicy unicast = (DDSMonitoring.TransportUnicastQosPolicy)DDSMonitoring.TransportUnicastQosPolicy.create();
    public DDSMonitoring.TransportMulticastQosPolicy multicast = (DDSMonitoring.TransportMulticastQosPolicy)DDSMonitoring.TransportMulticastQosPolicy.create();
    public DDSMonitoring.TransportEncapsulationQosPolicy encapsulation = (DDSMonitoring.TransportEncapsulationQosPolicy)DDSMonitoring.TransportEncapsulationQosPolicy.create();
    public DDSMonitoring.PropertyQosPolicy property = (DDSMonitoring.PropertyQosPolicy)DDSMonitoring.PropertyQosPolicy.create();
    public DDSMonitoring.ServiceQosPolicy service = (DDSMonitoring.ServiceQosPolicy)DDSMonitoring.ServiceQosPolicy.create();
    public DDSMonitoring.AvailabilityQosPolicy availability = (DDSMonitoring.AvailabilityQosPolicy)DDSMonitoring.AvailabilityQosPolicy.create();
    public DDSMonitoring.EntityNameQosPolicy subscription_name = (DDSMonitoring.EntityNameQosPolicy)DDSMonitoring.EntityNameQosPolicy.create();
    public DDSMonitoring.TransportPriorityQosPolicy transport_priority = (DDSMonitoring.TransportPriorityQosPolicy)DDSMonitoring.TransportPriorityQosPolicy.create();
    public DDSMonitoring.TypeSupportQosPolicy type_support = (DDSMonitoring.TypeSupportQosPolicy)DDSMonitoring.TypeSupportQosPolicy.create();

    public DataReaderQos() {

    }
    public DataReaderQos (DataReaderQos other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataReaderQos self;
        self = new  DataReaderQos();
        self.clear();
        return self;

    }

    public void clear() {

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
        if (destination_order != null) {
            destination_order.clear();
        }
        if (history != null) {
            history.clear();
        }
        if (resource_limits != null) {
            resource_limits.clear();
        }
        if (user_data != null) {
            user_data.clear();
        }
        if (ownership != null) {
            ownership.clear();
        }
        if (time_based_filter != null) {
            time_based_filter.clear();
        }
        if (reader_data_lifecycle != null) {
            reader_data_lifecycle.clear();
        }
        if (type_consistency != null) {
            type_consistency.clear();
        }
        if (reader_resource_limits != null) {
            reader_resource_limits.clear();
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
        if (multicast != null) {
            multicast.clear();
        }
        if (encapsulation != null) {
            encapsulation.clear();
        }
        if (property != null) {
            property.clear();
        }
        if (service != null) {
            service.clear();
        }
        if (availability != null) {
            availability.clear();
        }
        if (subscription_name != null) {
            subscription_name.clear();
        }
        if (transport_priority != null) {
            transport_priority.clear();
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

        DataReaderQos otherObj = (DataReaderQos)o;

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
        if(!destination_order.equals(otherObj.destination_order)) {
            return false;
        }
        if(!history.equals(otherObj.history)) {
            return false;
        }
        if(!resource_limits.equals(otherObj.resource_limits)) {
            return false;
        }
        if(!user_data.equals(otherObj.user_data)) {
            return false;
        }
        if(!ownership.equals(otherObj.ownership)) {
            return false;
        }
        if(!time_based_filter.equals(otherObj.time_based_filter)) {
            return false;
        }
        if(!reader_data_lifecycle.equals(otherObj.reader_data_lifecycle)) {
            return false;
        }
        if(!type_consistency.equals(otherObj.type_consistency)) {
            return false;
        }
        if(!reader_resource_limits.equals(otherObj.reader_resource_limits)) {
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
        if(!multicast.equals(otherObj.multicast)) {
            return false;
        }
        if(!encapsulation.equals(otherObj.encapsulation)) {
            return false;
        }
        if(!property.equals(otherObj.property)) {
            return false;
        }
        if(!service.equals(otherObj.service)) {
            return false;
        }
        if(!availability.equals(otherObj.availability)) {
            return false;
        }
        if(!subscription_name.equals(otherObj.subscription_name)) {
            return false;
        }
        if(!transport_priority.equals(otherObj.transport_priority)) {
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
        __result += deadline.hashCode(); 
        __result += latency_budget.hashCode(); 
        __result += liveliness.hashCode(); 
        __result += reliability.hashCode(); 
        __result += destination_order.hashCode(); 
        __result += history.hashCode(); 
        __result += resource_limits.hashCode(); 
        __result += user_data.hashCode(); 
        __result += ownership.hashCode(); 
        __result += time_based_filter.hashCode(); 
        __result += reader_data_lifecycle.hashCode(); 
        __result += type_consistency.hashCode(); 
        __result += reader_resource_limits.hashCode(); 
        __result += protocol.hashCode(); 
        __result += transport_selection.hashCode(); 
        __result += unicast.hashCode(); 
        __result += multicast.hashCode(); 
        __result += encapsulation.hashCode(); 
        __result += property.hashCode(); 
        __result += service.hashCode(); 
        __result += availability.hashCode(); 
        __result += subscription_name.hashCode(); 
        __result += transport_priority.hashCode(); 
        __result += type_support.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataReaderQosTypeSupport</code>
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

        DataReaderQos typedSrc = (DataReaderQos) src;
        DataReaderQos typedDst = this;

        typedDst.durability = (DDSMonitoring.DurabilityQosPolicy) typedDst.durability.copy_from(typedSrc.durability);
        typedDst.deadline = (DDSMonitoring.DeadlineQosPolicy) typedDst.deadline.copy_from(typedSrc.deadline);
        typedDst.latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy) typedDst.latency_budget.copy_from(typedSrc.latency_budget);
        typedDst.liveliness = (DDSMonitoring.LivelinessQosPolicy) typedDst.liveliness.copy_from(typedSrc.liveliness);
        typedDst.reliability = (DDSMonitoring.ReliabilityQosPolicy) typedDst.reliability.copy_from(typedSrc.reliability);
        typedDst.destination_order = (DDSMonitoring.DestinationOrderQosPolicy) typedDst.destination_order.copy_from(typedSrc.destination_order);
        typedDst.history = (DDSMonitoring.HistoryQosPolicy) typedDst.history.copy_from(typedSrc.history);
        typedDst.resource_limits = (DDSMonitoring.ResourceLimitsQosPolicy) typedDst.resource_limits.copy_from(typedSrc.resource_limits);
        typedDst.user_data = (DDSMonitoring.UserDataQosPolicy) typedDst.user_data.copy_from(typedSrc.user_data);
        typedDst.ownership = (DDSMonitoring.OwnershipQosPolicy) typedDst.ownership.copy_from(typedSrc.ownership);
        typedDst.time_based_filter = (DDSMonitoring.TimeBasedFilterQosPolicy) typedDst.time_based_filter.copy_from(typedSrc.time_based_filter);
        typedDst.reader_data_lifecycle = (DDSMonitoring.ReaderDataLifecycleQosPolicy) typedDst.reader_data_lifecycle.copy_from(typedSrc.reader_data_lifecycle);
        typedDst.type_consistency = (DDSMonitoring.TypeConsistencyEnforcementQosPolicy) typedDst.type_consistency.copy_from(typedSrc.type_consistency);
        typedDst.reader_resource_limits = (DDSMonitoring.DataReaderResourceLimitsQosPolicy) typedDst.reader_resource_limits.copy_from(typedSrc.reader_resource_limits);
        typedDst.protocol = (DDSMonitoring.DataReaderProtocolQosPolicy) typedDst.protocol.copy_from(typedSrc.protocol);
        typedDst.transport_selection = (DDSMonitoring.TransportSelectionQosPolicy) typedDst.transport_selection.copy_from(typedSrc.transport_selection);
        typedDst.unicast = (DDSMonitoring.TransportUnicastQosPolicy) typedDst.unicast.copy_from(typedSrc.unicast);
        typedDst.multicast = (DDSMonitoring.TransportMulticastQosPolicy) typedDst.multicast.copy_from(typedSrc.multicast);
        typedDst.encapsulation = (DDSMonitoring.TransportEncapsulationQosPolicy) typedDst.encapsulation.copy_from(typedSrc.encapsulation);
        typedDst.property = (DDSMonitoring.PropertyQosPolicy) typedDst.property.copy_from(typedSrc.property);
        typedDst.service = (DDSMonitoring.ServiceQosPolicy) typedDst.service.copy_from(typedSrc.service);
        typedDst.availability = (DDSMonitoring.AvailabilityQosPolicy) typedDst.availability.copy_from(typedSrc.availability);
        typedDst.subscription_name = (DDSMonitoring.EntityNameQosPolicy) typedDst.subscription_name.copy_from(typedSrc.subscription_name);
        typedDst.transport_priority = (DDSMonitoring.TransportPriorityQosPolicy) typedDst.transport_priority.copy_from(typedSrc.transport_priority);
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
        strBuffer.append(deadline.toString("deadline ", indent+1));
        strBuffer.append(latency_budget.toString("latency_budget ", indent+1));
        strBuffer.append(liveliness.toString("liveliness ", indent+1));
        strBuffer.append(reliability.toString("reliability ", indent+1));
        strBuffer.append(destination_order.toString("destination_order ", indent+1));
        strBuffer.append(history.toString("history ", indent+1));
        strBuffer.append(resource_limits.toString("resource_limits ", indent+1));
        strBuffer.append(user_data.toString("user_data ", indent+1));
        strBuffer.append(ownership.toString("ownership ", indent+1));
        strBuffer.append(time_based_filter.toString("time_based_filter ", indent+1));
        strBuffer.append(reader_data_lifecycle.toString("reader_data_lifecycle ", indent+1));
        strBuffer.append(type_consistency.toString("type_consistency ", indent+1));
        strBuffer.append(reader_resource_limits.toString("reader_resource_limits ", indent+1));
        strBuffer.append(protocol.toString("protocol ", indent+1));
        strBuffer.append(transport_selection.toString("transport_selection ", indent+1));
        strBuffer.append(unicast.toString("unicast ", indent+1));
        strBuffer.append(multicast.toString("multicast ", indent+1));
        strBuffer.append(encapsulation.toString("encapsulation ", indent+1));
        strBuffer.append(property.toString("property ", indent+1));
        strBuffer.append(service.toString("service ", indent+1));
        strBuffer.append(availability.toString("availability ", indent+1));
        strBuffer.append(subscription_name.toString("subscription_name ", indent+1));
        strBuffer.append(transport_priority.toString("transport_priority ", indent+1));
        strBuffer.append(type_support.toString("type_support ", indent+1));

        return strBuffer.toString();
    }

}
