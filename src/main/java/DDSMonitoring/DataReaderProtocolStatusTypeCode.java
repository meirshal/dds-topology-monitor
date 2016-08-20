
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DataReaderProtocolStatusTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[34];

        sm[__i]=new  StructMember("received_sample_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,0 , false);__i++;
        sm[__i]=new  StructMember("received_sample_count_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,1 , false);__i++;
        sm[__i]=new  StructMember("received_sample_bytes", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,2 , false);__i++;
        sm[__i]=new  StructMember("received_sample_bytes_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,3 , false);__i++;
        sm[__i]=new  StructMember("duplicate_sample_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,4 , false);__i++;
        sm[__i]=new  StructMember("duplicate_sample_count_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,5 , false);__i++;
        sm[__i]=new  StructMember("duplicate_sample_bytes", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,6 , false);__i++;
        sm[__i]=new  StructMember("duplicate_sample_bytes_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,7 , false);__i++;
        sm[__i]=new  StructMember("filtered_sample_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,8 , false);__i++;
        sm[__i]=new  StructMember("filtered_sample_count_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,9 , false);__i++;
        sm[__i]=new  StructMember("filtered_sample_bytes", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,10 , false);__i++;
        sm[__i]=new  StructMember("filtered_sample_bytes_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,11 , false);__i++;
        sm[__i]=new  StructMember("received_heartbeat_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,12 , false);__i++;
        sm[__i]=new  StructMember("received_heartbeat_count_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,13 , false);__i++;
        sm[__i]=new  StructMember("received_heartbeat_bytes", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,14 , false);__i++;
        sm[__i]=new  StructMember("received_heartbeat_bytes_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,15 , false);__i++;
        sm[__i]=new  StructMember("sent_ack_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,16 , false);__i++;
        sm[__i]=new  StructMember("sent_ack_count_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,17 , false);__i++;
        sm[__i]=new  StructMember("sent_ack_bytes", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,18 , false);__i++;
        sm[__i]=new  StructMember("sent_ack_bytes_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,19 , false);__i++;
        sm[__i]=new  StructMember("sent_nack_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,20 , false);__i++;
        sm[__i]=new  StructMember("sent_nack_count_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,21 , false);__i++;
        sm[__i]=new  StructMember("sent_nack_bytes", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,22 , false);__i++;
        sm[__i]=new  StructMember("sent_nack_bytes_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,23 , false);__i++;
        sm[__i]=new  StructMember("received_gap_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,24 , false);__i++;
        sm[__i]=new  StructMember("received_gap_count_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,25 , false);__i++;
        sm[__i]=new  StructMember("received_gap_bytes", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,26 , false);__i++;
        sm[__i]=new  StructMember("received_gap_bytes_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,27 , false);__i++;
        sm[__i]=new  StructMember("rejected_sample_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,28 , false);__i++;
        sm[__i]=new  StructMember("rejected_sample_count_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,29 , false);__i++;
        sm[__i]=new  StructMember("first_available_sample_sequence_number", false, (short)-1,  false,(TypeCode) DDSMonitoring.SequenceNumber_tTypeCode.VALUE,30 , false);__i++;
        sm[__i]=new  StructMember("last_available_sample_sequence_number", false, (short)-1,  false,(TypeCode) DDSMonitoring.SequenceNumber_tTypeCode.VALUE,31 , false);__i++;
        sm[__i]=new  StructMember("last_committed_sample_sequence_number", false, (short)-1,  false,(TypeCode) DDSMonitoring.SequenceNumber_tTypeCode.VALUE,32 , false);__i++;
        sm[__i]=new  StructMember("uncommitted_sample_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,33 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DataReaderProtocolStatus",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

