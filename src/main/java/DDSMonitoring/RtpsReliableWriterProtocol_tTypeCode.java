
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  RtpsReliableWriterProtocol_tTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[28];

        sm[__i]=new  StructMember("low_watermark", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,0 , false);__i++;
        sm[__i]=new  StructMember("high_watermark", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,1 , false);__i++;
        sm[__i]=new  StructMember("heartbeat_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("fast_heartbeat_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("late_joiner_heartbeat_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,4 , false);__i++;
        sm[__i]=new  StructMember("virtual_heartbeat_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("samples_per_virtual_heartbeat", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,6 , false);__i++;
        sm[__i]=new  StructMember("max_heartbeat_retries", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,7 , false);__i++;
        sm[__i]=new  StructMember("inactivate_nonprogressing_readers", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,8 , false);__i++;
        sm[__i]=new  StructMember("heartbeats_per_max_samples", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,9 , false);__i++;
        sm[__i]=new  StructMember("min_nack_response_delay", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,10 , false);__i++;
        sm[__i]=new  StructMember("max_nack_response_delay", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,11 , false);__i++;
        sm[__i]=new  StructMember("nack_suppression_duration", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,12 , false);__i++;
        sm[__i]=new  StructMember("max_bytes_per_nack_response", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,13 , false);__i++;
        sm[__i]=new  StructMember("disable_positive_acks_min_sample_keep_duration", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,14 , false);__i++;
        sm[__i]=new  StructMember("disable_positive_acks_max_sample_keep_duration", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,15 , false);__i++;
        sm[__i]=new  StructMember("disable_positive_acks_sample_min_separation", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,16 , false);__i++;
        sm[__i]=new  StructMember("disable_positive_acks_enable_adaptive_sample_keep_duration", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,17 , false);__i++;
        sm[__i]=new  StructMember("disable_positive_acks_enable_spin_wait", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,18 , false);__i++;
        sm[__i]=new  StructMember("disable_positive_acks_decrease_sample_keep_duration_factor", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,19 , false);__i++;
        sm[__i]=new  StructMember("disable_positive_acks_increase_sample_keep_duration_factor", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,20 , false);__i++;
        sm[__i]=new  StructMember("min_send_window_size", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,21 , false);__i++;
        sm[__i]=new  StructMember("max_send_window_Size", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,22 , false);__i++;
        sm[__i]=new  StructMember("send_window_update_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,23 , false);__i++;
        sm[__i]=new  StructMember("send_window_increase_factor", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,24 , false);__i++;
        sm[__i]=new  StructMember("send_window_decrease_factor", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,25 , false);__i++;
        sm[__i]=new  StructMember("enable_multicast_periodic_heartbeat", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,26 , false);__i++;
        sm[__i]=new  StructMember("multicast_resend_threshold", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,27 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::RtpsReliableWriterProtocol_t",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

