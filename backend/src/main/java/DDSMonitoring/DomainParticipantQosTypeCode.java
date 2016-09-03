
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DomainParticipantQosTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[18];

        sm[__i]=new  StructMember("user_data", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserDataQosPolicyTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("entity_factory", false, (short)-1,  false,(TypeCode) DDSMonitoring.EntityFactoryQosPolicyTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("wire_protocol", false, (short)-1,  false,(TypeCode) DDSMonitoring.WireProtocolQosPolicyTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("transport_builtin", false, (short)-1,  false,(TypeCode) DDSMonitoring.TransportBuiltinQosPolicyTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("default_unicast", false, (short)-1,  false,(TypeCode) DDSMonitoring.TransportUnicastQosPolicyTypeCode.VALUE,4 , false);__i++;
        sm[__i]=new  StructMember("discovery", false, (short)-1,  false,(TypeCode) DDSMonitoring.DiscoveryQosPolicyTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("resource_limits", false, (short)-1,  false,(TypeCode) DDSMonitoring.DomainParticipantResourceLimitsQosPolicyTypeCode.VALUE,6 , false);__i++;
        sm[__i]=new  StructMember("event", false, (short)-1,  false,(TypeCode) DDSMonitoring.EventQosPolicyTypeCode.VALUE,7 , false);__i++;
        sm[__i]=new  StructMember("receiver_pool", false, (short)-1,  false,(TypeCode) DDSMonitoring.ReceiverPoolQosPolicyTypeCode.VALUE,8 , false);__i++;
        sm[__i]=new  StructMember("database", false, (short)-1,  false,(TypeCode) DDSMonitoring.DatabaseQosPolicyTypeCode.VALUE,9 , false);__i++;
        sm[__i]=new  StructMember("discovery_config", false, (short)-1,  false,(TypeCode) DDSMonitoring.DiscoveryConfigQosPolicyTypeCode.VALUE,10 , false);__i++;
        sm[__i]=new  StructMember("exclusive_area", false, (short)-1,  false,(TypeCode) DDSMonitoring.ExclusiveAreaQosPolicyTypeCode.VALUE,11 , false);__i++;
        sm[__i]=new  StructMember("property", false, (short)-1,  false,(TypeCode) DDSMonitoring.PropertyQosPolicyTypeCode.VALUE,12 , false);__i++;
        sm[__i]=new  StructMember("participant_name", false, (short)-1,  false,(TypeCode) DDSMonitoring.EntityNameQosPolicyTypeCode.VALUE,13 , false);__i++;
        sm[__i]=new  StructMember("multicast_mapping", false, (short)-1,  false,(TypeCode) DDSMonitoring.TransportMulticastMappingQosPolicyTypeCode.VALUE,14 , false);__i++;
        sm[__i]=new  StructMember("user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectQosPolicyTypeCode.VALUE,15 , false);__i++;
        sm[__i]=new  StructMember("protocol", false, (short)-1,  false,(TypeCode) DDSMonitoring.DomainParticipantProtocolQosPolicyTypeCode.VALUE,16 , false);__i++;
        sm[__i]=new  StructMember("type_support", false, (short)-1,  false,(TypeCode) DDSMonitoring.TypeSupportQosPolicyTypeCode.VALUE,17 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DomainParticipantQos",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

