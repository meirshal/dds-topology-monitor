
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rti.dds.monitoring;

import com.rti.dds.typecode.*;

public class  DataWriterEntityStatisticsTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[17];

        sm[__i]=new  StructMember("datawriter_key", false, (short)-1, true,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("period", false, (short)-1, true,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("participant_key", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("publisher_key", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("topic_key", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,4 , false);__i++;
        sm[__i]=new  StructMember("topic_name", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,(rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)),5 , false);__i++;
        sm[__i]=new  StructMember("domain_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,6 , false);__i++;
        sm[__i]=new  StructMember("host_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,7 , false);__i++;
        sm[__i]=new  StructMember("process_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,8 , false);__i++;
        sm[__i]=new  StructMember("liveliness_lost_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.LivelinessLostStatusStatisticsTypeCode.VALUE,9 , false);__i++;
        sm[__i]=new  StructMember("offered_deadline_missed_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.OfferedDeadlineMissedStatusStatisticsTypeCode.VALUE,10 , false);__i++;
        sm[__i]=new  StructMember("offered_incompatible_qos_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.OfferedIncompatibleQosStatusStatisticsTypeCode.VALUE,11 , false);__i++;
        sm[__i]=new  StructMember("publication_matched_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.PublicationMatchedStatusStatisticsTypeCode.VALUE,12 , false);__i++;
        sm[__i]=new  StructMember("reliable_writer_cache_changed_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.ReliableWriterCacheChangedStatusStatisticsTypeCode.VALUE,13 , false);__i++;
        sm[__i]=new  StructMember("reliable_reader_activity_changed_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.ReliableReaderActivityChangedStatusStatisticsTypeCode.VALUE,14 , false);__i++;
        sm[__i]=new  StructMember("datawriter_cache_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.DataWriterCacheStatusStatisticsTypeCode.VALUE,15 , false);__i++;
        sm[__i]=new  StructMember("datawriter_protocol_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.DataWriterProtocolStatusStatisticsTypeCode.VALUE,16 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("rti::dds::monitoring::DataWriterEntityStatistics",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

