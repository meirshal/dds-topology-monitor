
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  RtpsReliableReaderProtocol_tTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[9];

        sm[__i]=new  StructMember("min_heartbeat_response_delay", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("max_heartbeat_response_delay", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("heartbeat_suppression_duration", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("nack_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("receive_window_size", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,4 , false);__i++;
        sm[__i]=new  StructMember("round_trip_time", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("app_ack_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,6 , false);__i++;
        sm[__i]=new  StructMember("min_app_ack_response_keep_duration", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,7 , false);__i++;
        sm[__i]=new  StructMember("samples_per_app_ack", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,8 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::RtpsReliableReaderProtocol_t",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

