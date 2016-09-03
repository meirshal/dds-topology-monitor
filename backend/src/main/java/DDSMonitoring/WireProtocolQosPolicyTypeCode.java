
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  WireProtocolQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[7];

        sm[__i]=new  StructMember("participant_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,0 , false);__i++;
        sm[__i]=new  StructMember("rtps_host_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,1 , false);__i++;
        sm[__i]=new  StructMember("rtps_app_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,2 , false);__i++;
        sm[__i]=new  StructMember("rtps_instance_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,3 , false);__i++;
        sm[__i]=new  StructMember("rtps_well_known_ports", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsWellKnownPorts_tTypeCode.VALUE,4 , false);__i++;
        sm[__i]=new  StructMember("rtps_reserved_port_mask", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsReservedPortKindMaskTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("rtps_auto_id_kind", false, (short)-1,  false,(TypeCode) DDSMonitoring.WireProtocolQosPolicyAutoKindTypeCode.VALUE,6 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::WireProtocolQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

