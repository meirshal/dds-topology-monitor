
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DataWriterQosTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[28];

        sm[__i]=new  StructMember("durability", false, (short)-1,  false,(TypeCode) DDSMonitoring.DurabilityQosPolicyTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("durability_service", false, (short)-1,  false,(TypeCode) DDSMonitoring.DurabilityServiceQosPolicyTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("deadline", false, (short)-1,  false,(TypeCode) DDSMonitoring.DeadlineQosPolicyTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("latency_budget", false, (short)-1,  false,(TypeCode) DDSMonitoring.LatencyBudgetQosPolicyTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("liveliness", false, (short)-1,  false,(TypeCode) DDSMonitoring.LivelinessQosPolicyTypeCode.VALUE,4 , false);__i++;
        sm[__i]=new  StructMember("reliability", false, (short)-1,  false,(TypeCode) DDSMonitoring.ReliabilityQosPolicyTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("destination_order", false, (short)-1,  false,(TypeCode) DDSMonitoring.DestinationOrderQosPolicyTypeCode.VALUE,6 , false);__i++;
        sm[__i]=new  StructMember("history", false, (short)-1,  false,(TypeCode) DDSMonitoring.HistoryQosPolicyTypeCode.VALUE,7 , false);__i++;
        sm[__i]=new  StructMember("resource_limits", false, (short)-1,  false,(TypeCode) DDSMonitoring.ResourceLimitsQosPolicyTypeCode.VALUE,8 , false);__i++;
        sm[__i]=new  StructMember("transport_priority", false, (short)-1,  false,(TypeCode) DDSMonitoring.TransportPriorityQosPolicyTypeCode.VALUE,9 , false);__i++;
        sm[__i]=new  StructMember("lifespan", false, (short)-1,  false,(TypeCode) DDSMonitoring.LifespanQosPolicyTypeCode.VALUE,10 , false);__i++;
        sm[__i]=new  StructMember("user_data", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserDataQosPolicyTypeCode.VALUE,11 , false);__i++;
        sm[__i]=new  StructMember("ownership", false, (short)-1,  false,(TypeCode) DDSMonitoring.OwnershipQosPolicyTypeCode.VALUE,12 , false);__i++;
        sm[__i]=new  StructMember("ownership_strength", false, (short)-1,  false,(TypeCode) DDSMonitoring.OwnershipStrengthQosPolicyTypeCode.VALUE,13 , false);__i++;
        sm[__i]=new  StructMember("writer_data_lifecycle", false, (short)-1,  false,(TypeCode) DDSMonitoring.WriterDataLifecycleQosPolicyTypeCode.VALUE,14 , false);__i++;
        sm[__i]=new  StructMember("writer_resource_limits", false, (short)-1,  false,(TypeCode) DDSMonitoring.DataWriterResourceLimitsQosPolicyTypeCode.VALUE,15 , false);__i++;
        sm[__i]=new  StructMember("protocol", false, (short)-1,  false,(TypeCode) DDSMonitoring.DataWriterProtocolQosPolicyTypeCode.VALUE,16 , false);__i++;
        sm[__i]=new  StructMember("transport_selection", false, (short)-1,  false,(TypeCode) DDSMonitoring.TransportSelectionQosPolicyTypeCode.VALUE,17 , false);__i++;
        sm[__i]=new  StructMember("unicast", false, (short)-1,  false,(TypeCode) DDSMonitoring.TransportUnicastQosPolicyTypeCode.VALUE,18 , false);__i++;
        sm[__i]=new  StructMember("encapsulation", false, (short)-1,  false,(TypeCode) DDSMonitoring.TransportEncapsulationQosPolicyTypeCode.VALUE,19 , false);__i++;
        sm[__i]=new  StructMember("publish_mode", false, (short)-1,  false,(TypeCode) DDSMonitoring.PublishModeQosPolicyTypeCode.VALUE,20 , false);__i++;
        sm[__i]=new  StructMember("property", false, (short)-1,  false,(TypeCode) DDSMonitoring.PropertyQosPolicyTypeCode.VALUE,21 , false);__i++;
        sm[__i]=new  StructMember("service", false, (short)-1,  false,(TypeCode) DDSMonitoring.ServiceQosPolicyTypeCode.VALUE,22 , false);__i++;
        sm[__i]=new  StructMember("batch", false, (short)-1,  false,(TypeCode) DDSMonitoring.BatchQosPolicyTypeCode.VALUE,23 , false);__i++;
        sm[__i]=new  StructMember("multi_channel", false, (short)-1,  false,(TypeCode) DDSMonitoring.MultiChannelQosPolicyTypeCode.VALUE,24 , false);__i++;
        sm[__i]=new  StructMember("availability", false, (short)-1,  false,(TypeCode) DDSMonitoring.AvailabilityQosPolicyTypeCode.VALUE,25 , false);__i++;
        sm[__i]=new  StructMember("publication_name", false, (short)-1,  false,(TypeCode) DDSMonitoring.EntityNameQosPolicyTypeCode.VALUE,26 , false);__i++;
        sm[__i]=new  StructMember("type_support", false, (short)-1,  false,(TypeCode) DDSMonitoring.TypeSupportQosPolicyTypeCode.VALUE,27 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DataWriterQos",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

