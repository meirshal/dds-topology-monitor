

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

public class DomainParticipantResourceLimitsQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.AllocationSettings_t local_writer_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t local_reader_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t local_publisher_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t local_subscriber_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t local_topic_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t remote_writer_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t remote_reader_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t remote_participant_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t matching_writer_reader_pair_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t matching_reader_writer_pair_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t ignored_entity_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t content_filtered_topic_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t content_filter_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t read_condition_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t query_condition_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t outstanding_asynchronous_sample_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public DDSMonitoring.AllocationSettings_t flow_controller_allocation = (DDSMonitoring.AllocationSettings_t)DDSMonitoring.AllocationSettings_t.create();
    public int local_writer_hash_buckets= 0;
    public int local_reader_hash_buckets= 0;
    public int local_publisher_hash_buckets= 0;
    public int local_subscriber_hash_buckets= 0;
    public int local_topic_hash_buckets= 0;
    public int remote_writer_hash_buckets= 0;
    public int remote_reader_hash_buckets= 0;
    public int remote_participant_hash_buckets= 0;
    public int matching_writer_reader_pair_hash_buckets= 0;
    public int matching_reader_writer_pair_hash_buckets= 0;
    public int ignored_entity_hash_buckets= 0;
    public int content_filtered_topic_hash_buckets= 0;
    public int content_filter_hash_buckets= 0;
    public int flow_controller_hash_buckets= 0;
    public int max_gather_destinations= 0;
    public int participant_user_data_max_length= 0;
    public int inter_participant_data_max_length= 0;
    public int topic_data_max_length= 0;
    public int publisher_group_data_max_length= 0;
    public int subscriber_group_data_max_length= 0;
    public int writer_user_data_max_length= 0;
    public int reader_user_data_max_length= 0;
    public int max_partitions= 0;
    public int max_partition_cumulative_characters= 0;
    public boolean default_partition_matches_all= false;
    public boolean allow_no_partitions= false;
    public int type_code_max_serialized_length= 0;
    public int type_object_max_serialized_length= 0;
    public int serialized_type_object_dynamic_allocation_threshold= 0;
    public int type_object_max_deserialized_length= 0;
    public int deserialized_type_object_dynamic_allocation_threshold= 0;
    public int contentfilter_property_max_length= 0;
    public int channel_seq_max_length= 0;
    public int channel_filter_expression_max_length= 0;
    public int participant_property_list_max_length= 0;
    public int participant_property_string_max_length= 0;
    public int writer_property_list_max_length= 0;
    public int writer_property_string_max_length= 0;
    public int reader_property_list_max_length= 0;
    public int reader_property_string_max_length= 0;
    public int plugin_info_parameter_max_length= 0;
    public int max_endpoint_groups= 0;
    public int max_endpoint_group_cumulative_characters= 0;
    public int transport_info_list_max_length= 0;
    public DDSMonitoring.DomainParticipantResourceLimitsIgnoredEntityReplacementKind ignored_entity_replacement_kind = (DDSMonitoring.DomainParticipantResourceLimitsIgnoredEntityReplacementKind)DDSMonitoring.DomainParticipantResourceLimitsIgnoredEntityReplacementKind.create();

    public DomainParticipantResourceLimitsQosPolicy() {

    }
    public DomainParticipantResourceLimitsQosPolicy (DomainParticipantResourceLimitsQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DomainParticipantResourceLimitsQosPolicy self;
        self = new  DomainParticipantResourceLimitsQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (local_writer_allocation != null) {
            local_writer_allocation.clear();
        }
        if (local_reader_allocation != null) {
            local_reader_allocation.clear();
        }
        if (local_publisher_allocation != null) {
            local_publisher_allocation.clear();
        }
        if (local_subscriber_allocation != null) {
            local_subscriber_allocation.clear();
        }
        if (local_topic_allocation != null) {
            local_topic_allocation.clear();
        }
        if (remote_writer_allocation != null) {
            remote_writer_allocation.clear();
        }
        if (remote_reader_allocation != null) {
            remote_reader_allocation.clear();
        }
        if (remote_participant_allocation != null) {
            remote_participant_allocation.clear();
        }
        if (matching_writer_reader_pair_allocation != null) {
            matching_writer_reader_pair_allocation.clear();
        }
        if (matching_reader_writer_pair_allocation != null) {
            matching_reader_writer_pair_allocation.clear();
        }
        if (ignored_entity_allocation != null) {
            ignored_entity_allocation.clear();
        }
        if (content_filtered_topic_allocation != null) {
            content_filtered_topic_allocation.clear();
        }
        if (content_filter_allocation != null) {
            content_filter_allocation.clear();
        }
        if (read_condition_allocation != null) {
            read_condition_allocation.clear();
        }
        if (query_condition_allocation != null) {
            query_condition_allocation.clear();
        }
        if (outstanding_asynchronous_sample_allocation != null) {
            outstanding_asynchronous_sample_allocation.clear();
        }
        if (flow_controller_allocation != null) {
            flow_controller_allocation.clear();
        }
        local_writer_hash_buckets= 0;
        local_reader_hash_buckets= 0;
        local_publisher_hash_buckets= 0;
        local_subscriber_hash_buckets= 0;
        local_topic_hash_buckets= 0;
        remote_writer_hash_buckets= 0;
        remote_reader_hash_buckets= 0;
        remote_participant_hash_buckets= 0;
        matching_writer_reader_pair_hash_buckets= 0;
        matching_reader_writer_pair_hash_buckets= 0;
        ignored_entity_hash_buckets= 0;
        content_filtered_topic_hash_buckets= 0;
        content_filter_hash_buckets= 0;
        flow_controller_hash_buckets= 0;
        max_gather_destinations= 0;
        participant_user_data_max_length= 0;
        inter_participant_data_max_length= 0;
        topic_data_max_length= 0;
        publisher_group_data_max_length= 0;
        subscriber_group_data_max_length= 0;
        writer_user_data_max_length= 0;
        reader_user_data_max_length= 0;
        max_partitions= 0;
        max_partition_cumulative_characters= 0;
        default_partition_matches_all= false;
        allow_no_partitions= false;
        type_code_max_serialized_length= 0;
        type_object_max_serialized_length= 0;
        serialized_type_object_dynamic_allocation_threshold= 0;
        type_object_max_deserialized_length= 0;
        deserialized_type_object_dynamic_allocation_threshold= 0;
        contentfilter_property_max_length= 0;
        channel_seq_max_length= 0;
        channel_filter_expression_max_length= 0;
        participant_property_list_max_length= 0;
        participant_property_string_max_length= 0;
        writer_property_list_max_length= 0;
        writer_property_string_max_length= 0;
        reader_property_list_max_length= 0;
        reader_property_string_max_length= 0;
        plugin_info_parameter_max_length= 0;
        max_endpoint_groups= 0;
        max_endpoint_group_cumulative_characters= 0;
        transport_info_list_max_length= 0;
        ignored_entity_replacement_kind = DDSMonitoring.DomainParticipantResourceLimitsIgnoredEntityReplacementKind.create();
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DomainParticipantResourceLimitsQosPolicy otherObj = (DomainParticipantResourceLimitsQosPolicy)o;

        if(!local_writer_allocation.equals(otherObj.local_writer_allocation)) {
            return false;
        }
        if(!local_reader_allocation.equals(otherObj.local_reader_allocation)) {
            return false;
        }
        if(!local_publisher_allocation.equals(otherObj.local_publisher_allocation)) {
            return false;
        }
        if(!local_subscriber_allocation.equals(otherObj.local_subscriber_allocation)) {
            return false;
        }
        if(!local_topic_allocation.equals(otherObj.local_topic_allocation)) {
            return false;
        }
        if(!remote_writer_allocation.equals(otherObj.remote_writer_allocation)) {
            return false;
        }
        if(!remote_reader_allocation.equals(otherObj.remote_reader_allocation)) {
            return false;
        }
        if(!remote_participant_allocation.equals(otherObj.remote_participant_allocation)) {
            return false;
        }
        if(!matching_writer_reader_pair_allocation.equals(otherObj.matching_writer_reader_pair_allocation)) {
            return false;
        }
        if(!matching_reader_writer_pair_allocation.equals(otherObj.matching_reader_writer_pair_allocation)) {
            return false;
        }
        if(!ignored_entity_allocation.equals(otherObj.ignored_entity_allocation)) {
            return false;
        }
        if(!content_filtered_topic_allocation.equals(otherObj.content_filtered_topic_allocation)) {
            return false;
        }
        if(!content_filter_allocation.equals(otherObj.content_filter_allocation)) {
            return false;
        }
        if(!read_condition_allocation.equals(otherObj.read_condition_allocation)) {
            return false;
        }
        if(!query_condition_allocation.equals(otherObj.query_condition_allocation)) {
            return false;
        }
        if(!outstanding_asynchronous_sample_allocation.equals(otherObj.outstanding_asynchronous_sample_allocation)) {
            return false;
        }
        if(!flow_controller_allocation.equals(otherObj.flow_controller_allocation)) {
            return false;
        }
        if(local_writer_hash_buckets != otherObj.local_writer_hash_buckets) {
            return false;
        }
        if(local_reader_hash_buckets != otherObj.local_reader_hash_buckets) {
            return false;
        }
        if(local_publisher_hash_buckets != otherObj.local_publisher_hash_buckets) {
            return false;
        }
        if(local_subscriber_hash_buckets != otherObj.local_subscriber_hash_buckets) {
            return false;
        }
        if(local_topic_hash_buckets != otherObj.local_topic_hash_buckets) {
            return false;
        }
        if(remote_writer_hash_buckets != otherObj.remote_writer_hash_buckets) {
            return false;
        }
        if(remote_reader_hash_buckets != otherObj.remote_reader_hash_buckets) {
            return false;
        }
        if(remote_participant_hash_buckets != otherObj.remote_participant_hash_buckets) {
            return false;
        }
        if(matching_writer_reader_pair_hash_buckets != otherObj.matching_writer_reader_pair_hash_buckets) {
            return false;
        }
        if(matching_reader_writer_pair_hash_buckets != otherObj.matching_reader_writer_pair_hash_buckets) {
            return false;
        }
        if(ignored_entity_hash_buckets != otherObj.ignored_entity_hash_buckets) {
            return false;
        }
        if(content_filtered_topic_hash_buckets != otherObj.content_filtered_topic_hash_buckets) {
            return false;
        }
        if(content_filter_hash_buckets != otherObj.content_filter_hash_buckets) {
            return false;
        }
        if(flow_controller_hash_buckets != otherObj.flow_controller_hash_buckets) {
            return false;
        }
        if(max_gather_destinations != otherObj.max_gather_destinations) {
            return false;
        }
        if(participant_user_data_max_length != otherObj.participant_user_data_max_length) {
            return false;
        }
        if(inter_participant_data_max_length != otherObj.inter_participant_data_max_length) {
            return false;
        }
        if(topic_data_max_length != otherObj.topic_data_max_length) {
            return false;
        }
        if(publisher_group_data_max_length != otherObj.publisher_group_data_max_length) {
            return false;
        }
        if(subscriber_group_data_max_length != otherObj.subscriber_group_data_max_length) {
            return false;
        }
        if(writer_user_data_max_length != otherObj.writer_user_data_max_length) {
            return false;
        }
        if(reader_user_data_max_length != otherObj.reader_user_data_max_length) {
            return false;
        }
        if(max_partitions != otherObj.max_partitions) {
            return false;
        }
        if(max_partition_cumulative_characters != otherObj.max_partition_cumulative_characters) {
            return false;
        }
        if(default_partition_matches_all != otherObj.default_partition_matches_all) {
            return false;
        }
        if(allow_no_partitions != otherObj.allow_no_partitions) {
            return false;
        }
        if(type_code_max_serialized_length != otherObj.type_code_max_serialized_length) {
            return false;
        }
        if(type_object_max_serialized_length != otherObj.type_object_max_serialized_length) {
            return false;
        }
        if(serialized_type_object_dynamic_allocation_threshold != otherObj.serialized_type_object_dynamic_allocation_threshold) {
            return false;
        }
        if(type_object_max_deserialized_length != otherObj.type_object_max_deserialized_length) {
            return false;
        }
        if(deserialized_type_object_dynamic_allocation_threshold != otherObj.deserialized_type_object_dynamic_allocation_threshold) {
            return false;
        }
        if(contentfilter_property_max_length != otherObj.contentfilter_property_max_length) {
            return false;
        }
        if(channel_seq_max_length != otherObj.channel_seq_max_length) {
            return false;
        }
        if(channel_filter_expression_max_length != otherObj.channel_filter_expression_max_length) {
            return false;
        }
        if(participant_property_list_max_length != otherObj.participant_property_list_max_length) {
            return false;
        }
        if(participant_property_string_max_length != otherObj.participant_property_string_max_length) {
            return false;
        }
        if(writer_property_list_max_length != otherObj.writer_property_list_max_length) {
            return false;
        }
        if(writer_property_string_max_length != otherObj.writer_property_string_max_length) {
            return false;
        }
        if(reader_property_list_max_length != otherObj.reader_property_list_max_length) {
            return false;
        }
        if(reader_property_string_max_length != otherObj.reader_property_string_max_length) {
            return false;
        }
        if(plugin_info_parameter_max_length != otherObj.plugin_info_parameter_max_length) {
            return false;
        }
        if(max_endpoint_groups != otherObj.max_endpoint_groups) {
            return false;
        }
        if(max_endpoint_group_cumulative_characters != otherObj.max_endpoint_group_cumulative_characters) {
            return false;
        }
        if(transport_info_list_max_length != otherObj.transport_info_list_max_length) {
            return false;
        }
        if(!ignored_entity_replacement_kind.equals(otherObj.ignored_entity_replacement_kind)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += local_writer_allocation.hashCode(); 
        __result += local_reader_allocation.hashCode(); 
        __result += local_publisher_allocation.hashCode(); 
        __result += local_subscriber_allocation.hashCode(); 
        __result += local_topic_allocation.hashCode(); 
        __result += remote_writer_allocation.hashCode(); 
        __result += remote_reader_allocation.hashCode(); 
        __result += remote_participant_allocation.hashCode(); 
        __result += matching_writer_reader_pair_allocation.hashCode(); 
        __result += matching_reader_writer_pair_allocation.hashCode(); 
        __result += ignored_entity_allocation.hashCode(); 
        __result += content_filtered_topic_allocation.hashCode(); 
        __result += content_filter_allocation.hashCode(); 
        __result += read_condition_allocation.hashCode(); 
        __result += query_condition_allocation.hashCode(); 
        __result += outstanding_asynchronous_sample_allocation.hashCode(); 
        __result += flow_controller_allocation.hashCode(); 
        __result += (int)local_writer_hash_buckets;
        __result += (int)local_reader_hash_buckets;
        __result += (int)local_publisher_hash_buckets;
        __result += (int)local_subscriber_hash_buckets;
        __result += (int)local_topic_hash_buckets;
        __result += (int)remote_writer_hash_buckets;
        __result += (int)remote_reader_hash_buckets;
        __result += (int)remote_participant_hash_buckets;
        __result += (int)matching_writer_reader_pair_hash_buckets;
        __result += (int)matching_reader_writer_pair_hash_buckets;
        __result += (int)ignored_entity_hash_buckets;
        __result += (int)content_filtered_topic_hash_buckets;
        __result += (int)content_filter_hash_buckets;
        __result += (int)flow_controller_hash_buckets;
        __result += (int)max_gather_destinations;
        __result += (int)participant_user_data_max_length;
        __result += (int)inter_participant_data_max_length;
        __result += (int)topic_data_max_length;
        __result += (int)publisher_group_data_max_length;
        __result += (int)subscriber_group_data_max_length;
        __result += (int)writer_user_data_max_length;
        __result += (int)reader_user_data_max_length;
        __result += (int)max_partitions;
        __result += (int)max_partition_cumulative_characters;
        __result += (default_partition_matches_all == true)?1:0;
        __result += (allow_no_partitions == true)?1:0;
        __result += (int)type_code_max_serialized_length;
        __result += (int)type_object_max_serialized_length;
        __result += (int)serialized_type_object_dynamic_allocation_threshold;
        __result += (int)type_object_max_deserialized_length;
        __result += (int)deserialized_type_object_dynamic_allocation_threshold;
        __result += (int)contentfilter_property_max_length;
        __result += (int)channel_seq_max_length;
        __result += (int)channel_filter_expression_max_length;
        __result += (int)participant_property_list_max_length;
        __result += (int)participant_property_string_max_length;
        __result += (int)writer_property_list_max_length;
        __result += (int)writer_property_string_max_length;
        __result += (int)reader_property_list_max_length;
        __result += (int)reader_property_string_max_length;
        __result += (int)plugin_info_parameter_max_length;
        __result += (int)max_endpoint_groups;
        __result += (int)max_endpoint_group_cumulative_characters;
        __result += (int)transport_info_list_max_length;
        __result += ignored_entity_replacement_kind.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DomainParticipantResourceLimitsQosPolicyTypeSupport</code>
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

        DomainParticipantResourceLimitsQosPolicy typedSrc = (DomainParticipantResourceLimitsQosPolicy) src;
        DomainParticipantResourceLimitsQosPolicy typedDst = this;

        typedDst.local_writer_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.local_writer_allocation.copy_from(typedSrc.local_writer_allocation);
        typedDst.local_reader_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.local_reader_allocation.copy_from(typedSrc.local_reader_allocation);
        typedDst.local_publisher_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.local_publisher_allocation.copy_from(typedSrc.local_publisher_allocation);
        typedDst.local_subscriber_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.local_subscriber_allocation.copy_from(typedSrc.local_subscriber_allocation);
        typedDst.local_topic_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.local_topic_allocation.copy_from(typedSrc.local_topic_allocation);
        typedDst.remote_writer_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.remote_writer_allocation.copy_from(typedSrc.remote_writer_allocation);
        typedDst.remote_reader_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.remote_reader_allocation.copy_from(typedSrc.remote_reader_allocation);
        typedDst.remote_participant_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.remote_participant_allocation.copy_from(typedSrc.remote_participant_allocation);
        typedDst.matching_writer_reader_pair_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.matching_writer_reader_pair_allocation.copy_from(typedSrc.matching_writer_reader_pair_allocation);
        typedDst.matching_reader_writer_pair_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.matching_reader_writer_pair_allocation.copy_from(typedSrc.matching_reader_writer_pair_allocation);
        typedDst.ignored_entity_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.ignored_entity_allocation.copy_from(typedSrc.ignored_entity_allocation);
        typedDst.content_filtered_topic_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.content_filtered_topic_allocation.copy_from(typedSrc.content_filtered_topic_allocation);
        typedDst.content_filter_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.content_filter_allocation.copy_from(typedSrc.content_filter_allocation);
        typedDst.read_condition_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.read_condition_allocation.copy_from(typedSrc.read_condition_allocation);
        typedDst.query_condition_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.query_condition_allocation.copy_from(typedSrc.query_condition_allocation);
        typedDst.outstanding_asynchronous_sample_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.outstanding_asynchronous_sample_allocation.copy_from(typedSrc.outstanding_asynchronous_sample_allocation);
        typedDst.flow_controller_allocation = (DDSMonitoring.AllocationSettings_t) typedDst.flow_controller_allocation.copy_from(typedSrc.flow_controller_allocation);
        typedDst.local_writer_hash_buckets = typedSrc.local_writer_hash_buckets;
        typedDst.local_reader_hash_buckets = typedSrc.local_reader_hash_buckets;
        typedDst.local_publisher_hash_buckets = typedSrc.local_publisher_hash_buckets;
        typedDst.local_subscriber_hash_buckets = typedSrc.local_subscriber_hash_buckets;
        typedDst.local_topic_hash_buckets = typedSrc.local_topic_hash_buckets;
        typedDst.remote_writer_hash_buckets = typedSrc.remote_writer_hash_buckets;
        typedDst.remote_reader_hash_buckets = typedSrc.remote_reader_hash_buckets;
        typedDst.remote_participant_hash_buckets = typedSrc.remote_participant_hash_buckets;
        typedDst.matching_writer_reader_pair_hash_buckets = typedSrc.matching_writer_reader_pair_hash_buckets;
        typedDst.matching_reader_writer_pair_hash_buckets = typedSrc.matching_reader_writer_pair_hash_buckets;
        typedDst.ignored_entity_hash_buckets = typedSrc.ignored_entity_hash_buckets;
        typedDst.content_filtered_topic_hash_buckets = typedSrc.content_filtered_topic_hash_buckets;
        typedDst.content_filter_hash_buckets = typedSrc.content_filter_hash_buckets;
        typedDst.flow_controller_hash_buckets = typedSrc.flow_controller_hash_buckets;
        typedDst.max_gather_destinations = typedSrc.max_gather_destinations;
        typedDst.participant_user_data_max_length = typedSrc.participant_user_data_max_length;
        typedDst.inter_participant_data_max_length = typedSrc.inter_participant_data_max_length;
        typedDst.topic_data_max_length = typedSrc.topic_data_max_length;
        typedDst.publisher_group_data_max_length = typedSrc.publisher_group_data_max_length;
        typedDst.subscriber_group_data_max_length = typedSrc.subscriber_group_data_max_length;
        typedDst.writer_user_data_max_length = typedSrc.writer_user_data_max_length;
        typedDst.reader_user_data_max_length = typedSrc.reader_user_data_max_length;
        typedDst.max_partitions = typedSrc.max_partitions;
        typedDst.max_partition_cumulative_characters = typedSrc.max_partition_cumulative_characters;
        typedDst.default_partition_matches_all = typedSrc.default_partition_matches_all;
        typedDst.allow_no_partitions = typedSrc.allow_no_partitions;
        typedDst.type_code_max_serialized_length = typedSrc.type_code_max_serialized_length;
        typedDst.type_object_max_serialized_length = typedSrc.type_object_max_serialized_length;
        typedDst.serialized_type_object_dynamic_allocation_threshold = typedSrc.serialized_type_object_dynamic_allocation_threshold;
        typedDst.type_object_max_deserialized_length = typedSrc.type_object_max_deserialized_length;
        typedDst.deserialized_type_object_dynamic_allocation_threshold = typedSrc.deserialized_type_object_dynamic_allocation_threshold;
        typedDst.contentfilter_property_max_length = typedSrc.contentfilter_property_max_length;
        typedDst.channel_seq_max_length = typedSrc.channel_seq_max_length;
        typedDst.channel_filter_expression_max_length = typedSrc.channel_filter_expression_max_length;
        typedDst.participant_property_list_max_length = typedSrc.participant_property_list_max_length;
        typedDst.participant_property_string_max_length = typedSrc.participant_property_string_max_length;
        typedDst.writer_property_list_max_length = typedSrc.writer_property_list_max_length;
        typedDst.writer_property_string_max_length = typedSrc.writer_property_string_max_length;
        typedDst.reader_property_list_max_length = typedSrc.reader_property_list_max_length;
        typedDst.reader_property_string_max_length = typedSrc.reader_property_string_max_length;
        typedDst.plugin_info_parameter_max_length = typedSrc.plugin_info_parameter_max_length;
        typedDst.max_endpoint_groups = typedSrc.max_endpoint_groups;
        typedDst.max_endpoint_group_cumulative_characters = typedSrc.max_endpoint_group_cumulative_characters;
        typedDst.transport_info_list_max_length = typedSrc.transport_info_list_max_length;
        typedDst.ignored_entity_replacement_kind = (DDSMonitoring.DomainParticipantResourceLimitsIgnoredEntityReplacementKind) typedDst.ignored_entity_replacement_kind.copy_from(typedSrc.ignored_entity_replacement_kind);

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

        strBuffer.append(local_writer_allocation.toString("local_writer_allocation ", indent+1));
        strBuffer.append(local_reader_allocation.toString("local_reader_allocation ", indent+1));
        strBuffer.append(local_publisher_allocation.toString("local_publisher_allocation ", indent+1));
        strBuffer.append(local_subscriber_allocation.toString("local_subscriber_allocation ", indent+1));
        strBuffer.append(local_topic_allocation.toString("local_topic_allocation ", indent+1));
        strBuffer.append(remote_writer_allocation.toString("remote_writer_allocation ", indent+1));
        strBuffer.append(remote_reader_allocation.toString("remote_reader_allocation ", indent+1));
        strBuffer.append(remote_participant_allocation.toString("remote_participant_allocation ", indent+1));
        strBuffer.append(matching_writer_reader_pair_allocation.toString("matching_writer_reader_pair_allocation ", indent+1));
        strBuffer.append(matching_reader_writer_pair_allocation.toString("matching_reader_writer_pair_allocation ", indent+1));
        strBuffer.append(ignored_entity_allocation.toString("ignored_entity_allocation ", indent+1));
        strBuffer.append(content_filtered_topic_allocation.toString("content_filtered_topic_allocation ", indent+1));
        strBuffer.append(content_filter_allocation.toString("content_filter_allocation ", indent+1));
        strBuffer.append(read_condition_allocation.toString("read_condition_allocation ", indent+1));
        strBuffer.append(query_condition_allocation.toString("query_condition_allocation ", indent+1));
        strBuffer.append(outstanding_asynchronous_sample_allocation.toString("outstanding_asynchronous_sample_allocation ", indent+1));
        strBuffer.append(flow_controller_allocation.toString("flow_controller_allocation ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("local_writer_hash_buckets: ").append(local_writer_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("local_reader_hash_buckets: ").append(local_reader_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("local_publisher_hash_buckets: ").append(local_publisher_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("local_subscriber_hash_buckets: ").append(local_subscriber_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("local_topic_hash_buckets: ").append(local_topic_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("remote_writer_hash_buckets: ").append(remote_writer_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("remote_reader_hash_buckets: ").append(remote_reader_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("remote_participant_hash_buckets: ").append(remote_participant_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("matching_writer_reader_pair_hash_buckets: ").append(matching_writer_reader_pair_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("matching_reader_writer_pair_hash_buckets: ").append(matching_reader_writer_pair_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("ignored_entity_hash_buckets: ").append(ignored_entity_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("content_filtered_topic_hash_buckets: ").append(content_filtered_topic_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("content_filter_hash_buckets: ").append(content_filter_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("flow_controller_hash_buckets: ").append(flow_controller_hash_buckets).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_gather_destinations: ").append(max_gather_destinations).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("participant_user_data_max_length: ").append(participant_user_data_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("inter_participant_data_max_length: ").append(inter_participant_data_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("topic_data_max_length: ").append(topic_data_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("publisher_group_data_max_length: ").append(publisher_group_data_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("subscriber_group_data_max_length: ").append(subscriber_group_data_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("writer_user_data_max_length: ").append(writer_user_data_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("reader_user_data_max_length: ").append(reader_user_data_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_partitions: ").append(max_partitions).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_partition_cumulative_characters: ").append(max_partition_cumulative_characters).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("default_partition_matches_all: ").append(default_partition_matches_all).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("allow_no_partitions: ").append(allow_no_partitions).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("type_code_max_serialized_length: ").append(type_code_max_serialized_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("type_object_max_serialized_length: ").append(type_object_max_serialized_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("serialized_type_object_dynamic_allocation_threshold: ").append(serialized_type_object_dynamic_allocation_threshold).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("type_object_max_deserialized_length: ").append(type_object_max_deserialized_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("deserialized_type_object_dynamic_allocation_threshold: ").append(deserialized_type_object_dynamic_allocation_threshold).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("contentfilter_property_max_length: ").append(contentfilter_property_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("channel_seq_max_length: ").append(channel_seq_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("channel_filter_expression_max_length: ").append(channel_filter_expression_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("participant_property_list_max_length: ").append(participant_property_list_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("participant_property_string_max_length: ").append(participant_property_string_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("writer_property_list_max_length: ").append(writer_property_list_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("writer_property_string_max_length: ").append(writer_property_string_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("reader_property_list_max_length: ").append(reader_property_list_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("reader_property_string_max_length: ").append(reader_property_string_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("plugin_info_parameter_max_length: ").append(plugin_info_parameter_max_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_endpoint_groups: ").append(max_endpoint_groups).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_endpoint_group_cumulative_characters: ").append(max_endpoint_group_cumulative_characters).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("transport_info_list_max_length: ").append(transport_info_list_max_length).append("\n");  
        strBuffer.append(ignored_entity_replacement_kind.toString("ignored_entity_replacement_kind ", indent+1));

        return strBuffer.toString();
    }

}
