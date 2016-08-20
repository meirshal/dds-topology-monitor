

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

public class DomainParticipantQos   implements Copyable, Serializable{

    public DDSMonitoring.UserDataQosPolicy user_data = (DDSMonitoring.UserDataQosPolicy)DDSMonitoring.UserDataQosPolicy.create();
    public DDSMonitoring.EntityFactoryQosPolicy entity_factory = (DDSMonitoring.EntityFactoryQosPolicy)DDSMonitoring.EntityFactoryQosPolicy.create();
    public DDSMonitoring.WireProtocolQosPolicy wire_protocol = (DDSMonitoring.WireProtocolQosPolicy)DDSMonitoring.WireProtocolQosPolicy.create();
    public DDSMonitoring.TransportBuiltinQosPolicy transport_builtin = (DDSMonitoring.TransportBuiltinQosPolicy)DDSMonitoring.TransportBuiltinQosPolicy.create();
    public DDSMonitoring.TransportUnicastQosPolicy default_unicast = (DDSMonitoring.TransportUnicastQosPolicy)DDSMonitoring.TransportUnicastQosPolicy.create();
    public DDSMonitoring.DiscoveryQosPolicy discovery = (DDSMonitoring.DiscoveryQosPolicy)DDSMonitoring.DiscoveryQosPolicy.create();
    public DDSMonitoring.DomainParticipantResourceLimitsQosPolicy resource_limits = (DDSMonitoring.DomainParticipantResourceLimitsQosPolicy)DDSMonitoring.DomainParticipantResourceLimitsQosPolicy.create();
    public DDSMonitoring.EventQosPolicy event = (DDSMonitoring.EventQosPolicy)DDSMonitoring.EventQosPolicy.create();
    public DDSMonitoring.ReceiverPoolQosPolicy receiver_pool = (DDSMonitoring.ReceiverPoolQosPolicy)DDSMonitoring.ReceiverPoolQosPolicy.create();
    public DDSMonitoring.DatabaseQosPolicy database = (DDSMonitoring.DatabaseQosPolicy)DDSMonitoring.DatabaseQosPolicy.create();
    public DDSMonitoring.DiscoveryConfigQosPolicy discovery_config = (DDSMonitoring.DiscoveryConfigQosPolicy)DDSMonitoring.DiscoveryConfigQosPolicy.create();
    public DDSMonitoring.ExclusiveAreaQosPolicy exclusive_area = (DDSMonitoring.ExclusiveAreaQosPolicy)DDSMonitoring.ExclusiveAreaQosPolicy.create();
    public DDSMonitoring.PropertyQosPolicy property = (DDSMonitoring.PropertyQosPolicy)DDSMonitoring.PropertyQosPolicy.create();
    public DDSMonitoring.EntityNameQosPolicy participant_name = (DDSMonitoring.EntityNameQosPolicy)DDSMonitoring.EntityNameQosPolicy.create();
    public DDSMonitoring.TransportMulticastMappingQosPolicy multicast_mapping = (DDSMonitoring.TransportMulticastMappingQosPolicy)DDSMonitoring.TransportMulticastMappingQosPolicy.create();
    public DDSMonitoring.UserObjectQosPolicy user_object = (DDSMonitoring.UserObjectQosPolicy)DDSMonitoring.UserObjectQosPolicy.create();
    public DDSMonitoring.DomainParticipantProtocolQosPolicy protocol = (DDSMonitoring.DomainParticipantProtocolQosPolicy)DDSMonitoring.DomainParticipantProtocolQosPolicy.create();
    public DDSMonitoring.TypeSupportQosPolicy type_support = (DDSMonitoring.TypeSupportQosPolicy)DDSMonitoring.TypeSupportQosPolicy.create();

    public DomainParticipantQos() {

    }
    public DomainParticipantQos (DomainParticipantQos other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DomainParticipantQos self;
        self = new  DomainParticipantQos();
        self.clear();
        return self;

    }

    public void clear() {

        if (user_data != null) {
            user_data.clear();
        }
        if (entity_factory != null) {
            entity_factory.clear();
        }
        if (wire_protocol != null) {
            wire_protocol.clear();
        }
        if (transport_builtin != null) {
            transport_builtin.clear();
        }
        if (default_unicast != null) {
            default_unicast.clear();
        }
        if (discovery != null) {
            discovery.clear();
        }
        if (resource_limits != null) {
            resource_limits.clear();
        }
        if (event != null) {
            event.clear();
        }
        if (receiver_pool != null) {
            receiver_pool.clear();
        }
        if (database != null) {
            database.clear();
        }
        if (discovery_config != null) {
            discovery_config.clear();
        }
        if (exclusive_area != null) {
            exclusive_area.clear();
        }
        if (property != null) {
            property.clear();
        }
        if (participant_name != null) {
            participant_name.clear();
        }
        if (multicast_mapping != null) {
            multicast_mapping.clear();
        }
        if (user_object != null) {
            user_object.clear();
        }
        if (protocol != null) {
            protocol.clear();
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

        DomainParticipantQos otherObj = (DomainParticipantQos)o;

        if(!user_data.equals(otherObj.user_data)) {
            return false;
        }
        if(!entity_factory.equals(otherObj.entity_factory)) {
            return false;
        }
        if(!wire_protocol.equals(otherObj.wire_protocol)) {
            return false;
        }
        if(!transport_builtin.equals(otherObj.transport_builtin)) {
            return false;
        }
        if(!default_unicast.equals(otherObj.default_unicast)) {
            return false;
        }
        if(!discovery.equals(otherObj.discovery)) {
            return false;
        }
        if(!resource_limits.equals(otherObj.resource_limits)) {
            return false;
        }
        if(!event.equals(otherObj.event)) {
            return false;
        }
        if(!receiver_pool.equals(otherObj.receiver_pool)) {
            return false;
        }
        if(!database.equals(otherObj.database)) {
            return false;
        }
        if(!discovery_config.equals(otherObj.discovery_config)) {
            return false;
        }
        if(!exclusive_area.equals(otherObj.exclusive_area)) {
            return false;
        }
        if(!property.equals(otherObj.property)) {
            return false;
        }
        if(!participant_name.equals(otherObj.participant_name)) {
            return false;
        }
        if(!multicast_mapping.equals(otherObj.multicast_mapping)) {
            return false;
        }
        if(!user_object.equals(otherObj.user_object)) {
            return false;
        }
        if(!protocol.equals(otherObj.protocol)) {
            return false;
        }
        if(!type_support.equals(otherObj.type_support)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += user_data.hashCode(); 
        __result += entity_factory.hashCode(); 
        __result += wire_protocol.hashCode(); 
        __result += transport_builtin.hashCode(); 
        __result += default_unicast.hashCode(); 
        __result += discovery.hashCode(); 
        __result += resource_limits.hashCode(); 
        __result += event.hashCode(); 
        __result += receiver_pool.hashCode(); 
        __result += database.hashCode(); 
        __result += discovery_config.hashCode(); 
        __result += exclusive_area.hashCode(); 
        __result += property.hashCode(); 
        __result += participant_name.hashCode(); 
        __result += multicast_mapping.hashCode(); 
        __result += user_object.hashCode(); 
        __result += protocol.hashCode(); 
        __result += type_support.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DomainParticipantQosTypeSupport</code>
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

        DomainParticipantQos typedSrc = (DomainParticipantQos) src;
        DomainParticipantQos typedDst = this;

        typedDst.user_data = (DDSMonitoring.UserDataQosPolicy) typedDst.user_data.copy_from(typedSrc.user_data);
        typedDst.entity_factory = (DDSMonitoring.EntityFactoryQosPolicy) typedDst.entity_factory.copy_from(typedSrc.entity_factory);
        typedDst.wire_protocol = (DDSMonitoring.WireProtocolQosPolicy) typedDst.wire_protocol.copy_from(typedSrc.wire_protocol);
        typedDst.transport_builtin = (DDSMonitoring.TransportBuiltinQosPolicy) typedDst.transport_builtin.copy_from(typedSrc.transport_builtin);
        typedDst.default_unicast = (DDSMonitoring.TransportUnicastQosPolicy) typedDst.default_unicast.copy_from(typedSrc.default_unicast);
        typedDst.discovery = (DDSMonitoring.DiscoveryQosPolicy) typedDst.discovery.copy_from(typedSrc.discovery);
        typedDst.resource_limits = (DDSMonitoring.DomainParticipantResourceLimitsQosPolicy) typedDst.resource_limits.copy_from(typedSrc.resource_limits);
        typedDst.event = (DDSMonitoring.EventQosPolicy) typedDst.event.copy_from(typedSrc.event);
        typedDst.receiver_pool = (DDSMonitoring.ReceiverPoolQosPolicy) typedDst.receiver_pool.copy_from(typedSrc.receiver_pool);
        typedDst.database = (DDSMonitoring.DatabaseQosPolicy) typedDst.database.copy_from(typedSrc.database);
        typedDst.discovery_config = (DDSMonitoring.DiscoveryConfigQosPolicy) typedDst.discovery_config.copy_from(typedSrc.discovery_config);
        typedDst.exclusive_area = (DDSMonitoring.ExclusiveAreaQosPolicy) typedDst.exclusive_area.copy_from(typedSrc.exclusive_area);
        typedDst.property = (DDSMonitoring.PropertyQosPolicy) typedDst.property.copy_from(typedSrc.property);
        typedDst.participant_name = (DDSMonitoring.EntityNameQosPolicy) typedDst.participant_name.copy_from(typedSrc.participant_name);
        typedDst.multicast_mapping = (DDSMonitoring.TransportMulticastMappingQosPolicy) typedDst.multicast_mapping.copy_from(typedSrc.multicast_mapping);
        typedDst.user_object = (DDSMonitoring.UserObjectQosPolicy) typedDst.user_object.copy_from(typedSrc.user_object);
        typedDst.protocol = (DDSMonitoring.DomainParticipantProtocolQosPolicy) typedDst.protocol.copy_from(typedSrc.protocol);
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

        strBuffer.append(user_data.toString("user_data ", indent+1));
        strBuffer.append(entity_factory.toString("entity_factory ", indent+1));
        strBuffer.append(wire_protocol.toString("wire_protocol ", indent+1));
        strBuffer.append(transport_builtin.toString("transport_builtin ", indent+1));
        strBuffer.append(default_unicast.toString("default_unicast ", indent+1));
        strBuffer.append(discovery.toString("discovery ", indent+1));
        strBuffer.append(resource_limits.toString("resource_limits ", indent+1));
        strBuffer.append(event.toString("event ", indent+1));
        strBuffer.append(receiver_pool.toString("receiver_pool ", indent+1));
        strBuffer.append(database.toString("database ", indent+1));
        strBuffer.append(discovery_config.toString("discovery_config ", indent+1));
        strBuffer.append(exclusive_area.toString("exclusive_area ", indent+1));
        strBuffer.append(property.toString("property ", indent+1));
        strBuffer.append(participant_name.toString("participant_name ", indent+1));
        strBuffer.append(multicast_mapping.toString("multicast_mapping ", indent+1));
        strBuffer.append(user_object.toString("user_object ", indent+1));
        strBuffer.append(protocol.toString("protocol ", indent+1));
        strBuffer.append(type_support.toString("type_support ", indent+1));

        return strBuffer.toString();
    }

}
