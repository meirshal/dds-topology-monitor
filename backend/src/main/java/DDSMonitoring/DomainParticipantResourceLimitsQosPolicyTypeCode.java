
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DomainParticipantResourceLimitsQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[62];

        sm[__i]=new  StructMember("local_writer_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("local_reader_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("local_publisher_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("local_subscriber_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("local_topic_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,4 , false);__i++;
        sm[__i]=new  StructMember("remote_writer_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("remote_reader_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,6 , false);__i++;
        sm[__i]=new  StructMember("remote_participant_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,7 , false);__i++;
        sm[__i]=new  StructMember("matching_writer_reader_pair_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,8 , false);__i++;
        sm[__i]=new  StructMember("matching_reader_writer_pair_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,9 , false);__i++;
        sm[__i]=new  StructMember("ignored_entity_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,10 , false);__i++;
        sm[__i]=new  StructMember("content_filtered_topic_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,11 , false);__i++;
        sm[__i]=new  StructMember("content_filter_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,12 , false);__i++;
        sm[__i]=new  StructMember("read_condition_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,13 , false);__i++;
        sm[__i]=new  StructMember("query_condition_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,14 , false);__i++;
        sm[__i]=new  StructMember("outstanding_asynchronous_sample_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,15 , false);__i++;
        sm[__i]=new  StructMember("flow_controller_allocation", false, (short)-1,  false,(TypeCode) DDSMonitoring.AllocationSettings_tTypeCode.VALUE,16 , false);__i++;
        sm[__i]=new  StructMember("local_writer_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,17 , false);__i++;
        sm[__i]=new  StructMember("local_reader_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,18 , false);__i++;
        sm[__i]=new  StructMember("local_publisher_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,19 , false);__i++;
        sm[__i]=new  StructMember("local_subscriber_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,20 , false);__i++;
        sm[__i]=new  StructMember("local_topic_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,21 , false);__i++;
        sm[__i]=new  StructMember("remote_writer_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,22 , false);__i++;
        sm[__i]=new  StructMember("remote_reader_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,23 , false);__i++;
        sm[__i]=new  StructMember("remote_participant_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,24 , false);__i++;
        sm[__i]=new  StructMember("matching_writer_reader_pair_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,25 , false);__i++;
        sm[__i]=new  StructMember("matching_reader_writer_pair_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,26 , false);__i++;
        sm[__i]=new  StructMember("ignored_entity_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,27 , false);__i++;
        sm[__i]=new  StructMember("content_filtered_topic_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,28 , false);__i++;
        sm[__i]=new  StructMember("content_filter_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,29 , false);__i++;
        sm[__i]=new  StructMember("flow_controller_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,30 , false);__i++;
        sm[__i]=new  StructMember("max_gather_destinations", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,31 , false);__i++;
        sm[__i]=new  StructMember("participant_user_data_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,32 , false);__i++;
        sm[__i]=new  StructMember("inter_participant_data_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,33 , false);__i++;
        sm[__i]=new  StructMember("topic_data_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,34 , false);__i++;
        sm[__i]=new  StructMember("publisher_group_data_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,35 , false);__i++;
        sm[__i]=new  StructMember("subscriber_group_data_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,36 , false);__i++;
        sm[__i]=new  StructMember("writer_user_data_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,37 , false);__i++;
        sm[__i]=new  StructMember("reader_user_data_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,38 , false);__i++;
        sm[__i]=new  StructMember("max_partitions", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,39 , false);__i++;
        sm[__i]=new  StructMember("max_partition_cumulative_characters", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,40 , false);__i++;
        sm[__i]=new  StructMember("default_partition_matches_all", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,41 , false);__i++;
        sm[__i]=new  StructMember("allow_no_partitions", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,42 , false);__i++;
        sm[__i]=new  StructMember("type_code_max_serialized_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,43 , false);__i++;
        sm[__i]=new  StructMember("type_object_max_serialized_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,44 , false);__i++;
        sm[__i]=new  StructMember("serialized_type_object_dynamic_allocation_threshold", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,45 , false);__i++;
        sm[__i]=new  StructMember("type_object_max_deserialized_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,46 , false);__i++;
        sm[__i]=new  StructMember("deserialized_type_object_dynamic_allocation_threshold", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,47 , false);__i++;
        sm[__i]=new  StructMember("contentfilter_property_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,48 , false);__i++;
        sm[__i]=new  StructMember("channel_seq_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,49 , false);__i++;
        sm[__i]=new  StructMember("channel_filter_expression_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,50 , false);__i++;
        sm[__i]=new  StructMember("participant_property_list_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,51 , false);__i++;
        sm[__i]=new  StructMember("participant_property_string_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,52 , false);__i++;
        sm[__i]=new  StructMember("writer_property_list_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,53 , false);__i++;
        sm[__i]=new  StructMember("writer_property_string_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,54 , false);__i++;
        sm[__i]=new  StructMember("reader_property_list_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,55 , false);__i++;
        sm[__i]=new  StructMember("reader_property_string_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,56 , false);__i++;
        sm[__i]=new  StructMember("plugin_info_parameter_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,57 , false);__i++;
        sm[__i]=new  StructMember("max_endpoint_groups", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,58 , false);__i++;
        sm[__i]=new  StructMember("max_endpoint_group_cumulative_characters", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,59 , false);__i++;
        sm[__i]=new  StructMember("transport_info_list_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,60 , false);__i++;
        sm[__i]=new  StructMember("ignored_entity_replacement_kind", false, (short)-1,  false,(TypeCode) DDSMonitoring.DomainParticipantResourceLimitsIgnoredEntityReplacementKindTypeCode.VALUE,61 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DomainParticipantResourceLimitsQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

