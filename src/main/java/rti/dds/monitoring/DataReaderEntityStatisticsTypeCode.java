
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rti.dds.monitoring;

import com.rti.dds.typecode.*;

public class  DataReaderEntityStatisticsTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[18];

        sm[__i]=new  StructMember("datareader_key", false, (short)-1, true,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("period", false, (short)-1, true,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("participant_key", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("subscriber_key", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("topic_key", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,4 , false);__i++;
        sm[__i]=new  StructMember("is_content_filtered", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,5 , false);__i++;
        sm[__i]=new  StructMember("topic_name", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,(rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)),6 , false);__i++;
        sm[__i]=new  StructMember("domain_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,7 , false);__i++;
        sm[__i]=new  StructMember("host_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,8 , false);__i++;
        sm[__i]=new  StructMember("process_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,9 , false);__i++;
        sm[__i]=new  StructMember("sample_rejected_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.SampleRejectedStatusStatisticsTypeCode.VALUE,10 , false);__i++;
        sm[__i]=new  StructMember("liveliness_changed_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.LivelinessChangedStatusStatisticsTypeCode.VALUE,11 , false);__i++;
        sm[__i]=new  StructMember("requested_deadline_missed_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.RequestedDeadlineMissedStatusStatisticsTypeCode.VALUE,12 , false);__i++;
        sm[__i]=new  StructMember("requested_incompatible_qos_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.RequestedIncompatibleQosStatusStatisticsTypeCode.VALUE,13 , false);__i++;
        sm[__i]=new  StructMember("sample_lost_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.SampleLostStatusStatisticsTypeCode.VALUE,14 , false);__i++;
        sm[__i]=new  StructMember("subscription_matched_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.SubscriptionMatchedStatusStatisticsTypeCode.VALUE,15 , false);__i++;
        sm[__i]=new  StructMember("datareader_cache_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.DataReaderCacheStatusStatisticsTypeCode.VALUE,16 , false);__i++;
        sm[__i]=new  StructMember("datareader_protocol_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.DataReaderProtocolStatusStatisticsTypeCode.VALUE,17 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("rti::dds::monitoring::DataReaderEntityStatistics",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

