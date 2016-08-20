

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

public class DiscoveryConfigQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.Duration_t participant_liveliness_lease_duration = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t participant_liveliness_assert_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.RemoteParticipantPurgeKind remote_participant_purge_kind = (DDSMonitoring.RemoteParticipantPurgeKind)DDSMonitoring.RemoteParticipantPurgeKind.create();
    public DDSMonitoring.Duration_t max_liveliness_loss_detection_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public int initial_participant_announcements= 0;
    public DDSMonitoring.Duration_t min_initial_participant_announcement_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t max_initial_participant_announcement_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.BuiltinTopicReaderResourceLimits_t participant_reader_resource_limits = (DDSMonitoring.BuiltinTopicReaderResourceLimits_t)DDSMonitoring.BuiltinTopicReaderResourceLimits_t.create();
    public DDSMonitoring.RtpsReliableReaderProtocol_t publication_reader = (DDSMonitoring.RtpsReliableReaderProtocol_t)DDSMonitoring.RtpsReliableReaderProtocol_t.create();
    public DDSMonitoring.BuiltinTopicReaderResourceLimits_t publication_reader_resource_limits = (DDSMonitoring.BuiltinTopicReaderResourceLimits_t)DDSMonitoring.BuiltinTopicReaderResourceLimits_t.create();
    public DDSMonitoring.RtpsReliableReaderProtocol_t subscription_reader = (DDSMonitoring.RtpsReliableReaderProtocol_t)DDSMonitoring.RtpsReliableReaderProtocol_t.create();
    public DDSMonitoring.BuiltinTopicReaderResourceLimits_t subscription_reader_resource_limits = (DDSMonitoring.BuiltinTopicReaderResourceLimits_t)DDSMonitoring.BuiltinTopicReaderResourceLimits_t.create();
    public DDSMonitoring.RtpsReliableWriterProtocol_t publication_writer = (DDSMonitoring.RtpsReliableWriterProtocol_t)DDSMonitoring.RtpsReliableWriterProtocol_t.create();
    public DDSMonitoring.WriterDataLifecycleQosPolicy publication_writer_data_lifecycle = (DDSMonitoring.WriterDataLifecycleQosPolicy)DDSMonitoring.WriterDataLifecycleQosPolicy.create();
    public DDSMonitoring.RtpsReliableWriterProtocol_t subscription_writer = (DDSMonitoring.RtpsReliableWriterProtocol_t)DDSMonitoring.RtpsReliableWriterProtocol_t.create();
    public DDSMonitoring.WriterDataLifecycleQosPolicy subscription_writer_data_lifecycle = (DDSMonitoring.WriterDataLifecycleQosPolicy)DDSMonitoring.WriterDataLifecycleQosPolicy.create();
    public int endpoint_plugin_redundancy_level= 0;
    public int builtin_discovery_plugins= 0;
    public DDSMonitoring.ReliabilityQosPolicyKind participant_message_reader_reliability_kind = (DDSMonitoring.ReliabilityQosPolicyKind)DDSMonitoring.ReliabilityQosPolicyKind.create();
    public DDSMonitoring.RtpsReliableReaderProtocol_t participant_message_reader = (DDSMonitoring.RtpsReliableReaderProtocol_t)DDSMonitoring.RtpsReliableReaderProtocol_t.create();
    public DDSMonitoring.RtpsReliableWriterProtocol_t participant_message_writer = (DDSMonitoring.RtpsReliableWriterProtocol_t)DDSMonitoring.RtpsReliableWriterProtocol_t.create();
    public DDSMonitoring.PublishModeQosPolicy publication_writer_publish_mode = (DDSMonitoring.PublishModeQosPolicy)DDSMonitoring.PublishModeQosPolicy.create();
    public DDSMonitoring.PublishModeQosPolicy subscription_writer_publish_mode = (DDSMonitoring.PublishModeQosPolicy)DDSMonitoring.PublishModeQosPolicy.create();
    public DDSMonitoring.AsynchronousPublisherQosPolicy asynchronous_publisher = (DDSMonitoring.AsynchronousPublisherQosPolicy)DDSMonitoring.AsynchronousPublisherQosPolicy.create();
    public DDSMonitoring.Duration_t default_domain_announcement_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public boolean ignore_default_domain_announcements= false;
    public boolean sedp_rely_on_spdp_only= false;
    public DDSMonitoring.LatencyBudgetQosPolicy publication_writer_latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy)DDSMonitoring.LatencyBudgetQosPolicy.create();
    public boolean publication_writer_push_on_write= false;
    public DDSMonitoring.LatencyBudgetQosPolicy subscription_writer_latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy)DDSMonitoring.LatencyBudgetQosPolicy.create();
    public boolean subscription_writer_push_on_write= false;
    public DDSMonitoring.RtpsReliableWriterProtocol_t participant_state_writer = (DDSMonitoring.RtpsReliableWriterProtocol_t)DDSMonitoring.RtpsReliableWriterProtocol_t.create();
    public DDSMonitoring.LatencyBudgetQosPolicy participant_state_writer_latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy)DDSMonitoring.LatencyBudgetQosPolicy.create();
    public boolean participant_state_writer_push_on_write= false;
    public DDSMonitoring.PublishModeQosPolicy participant_state_writer_publish_mode = (DDSMonitoring.PublishModeQosPolicy)DDSMonitoring.PublishModeQosPolicy.create();
    public DDSMonitoring.RtpsReliableReaderProtocol_t participant_proxy_reader = (DDSMonitoring.RtpsReliableReaderProtocol_t)DDSMonitoring.RtpsReliableReaderProtocol_t.create();
    public DDSMonitoring.DiscoveryBuiltinReaderFragmentationResourceLimits_t participant_proxy_reader_fragmentation_resource_limits = (DDSMonitoring.DiscoveryBuiltinReaderFragmentationResourceLimits_t)DDSMonitoring.DiscoveryBuiltinReaderFragmentationResourceLimits_t.create();
    public DDSMonitoring.DiscoveryPluginPromiscuityKind plugin_promiscuity_kind = (DDSMonitoring.DiscoveryPluginPromiscuityKind)DDSMonitoring.DiscoveryPluginPromiscuityKind.create();

    public DiscoveryConfigQosPolicy() {

    }
    public DiscoveryConfigQosPolicy (DiscoveryConfigQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DiscoveryConfigQosPolicy self;
        self = new  DiscoveryConfigQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (participant_liveliness_lease_duration != null) {
            participant_liveliness_lease_duration.clear();
        }
        if (participant_liveliness_assert_period != null) {
            participant_liveliness_assert_period.clear();
        }
        remote_participant_purge_kind = DDSMonitoring.RemoteParticipantPurgeKind.create();
        if (max_liveliness_loss_detection_period != null) {
            max_liveliness_loss_detection_period.clear();
        }
        initial_participant_announcements= 0;
        if (min_initial_participant_announcement_period != null) {
            min_initial_participant_announcement_period.clear();
        }
        if (max_initial_participant_announcement_period != null) {
            max_initial_participant_announcement_period.clear();
        }
        if (participant_reader_resource_limits != null) {
            participant_reader_resource_limits.clear();
        }
        if (publication_reader != null) {
            publication_reader.clear();
        }
        if (publication_reader_resource_limits != null) {
            publication_reader_resource_limits.clear();
        }
        if (subscription_reader != null) {
            subscription_reader.clear();
        }
        if (subscription_reader_resource_limits != null) {
            subscription_reader_resource_limits.clear();
        }
        if (publication_writer != null) {
            publication_writer.clear();
        }
        if (publication_writer_data_lifecycle != null) {
            publication_writer_data_lifecycle.clear();
        }
        if (subscription_writer != null) {
            subscription_writer.clear();
        }
        if (subscription_writer_data_lifecycle != null) {
            subscription_writer_data_lifecycle.clear();
        }
        endpoint_plugin_redundancy_level= 0;
        builtin_discovery_plugins= 0;
        participant_message_reader_reliability_kind = DDSMonitoring.ReliabilityQosPolicyKind.create();
        if (participant_message_reader != null) {
            participant_message_reader.clear();
        }
        if (participant_message_writer != null) {
            participant_message_writer.clear();
        }
        if (publication_writer_publish_mode != null) {
            publication_writer_publish_mode.clear();
        }
        if (subscription_writer_publish_mode != null) {
            subscription_writer_publish_mode.clear();
        }
        if (asynchronous_publisher != null) {
            asynchronous_publisher.clear();
        }
        if (default_domain_announcement_period != null) {
            default_domain_announcement_period.clear();
        }
        ignore_default_domain_announcements= false;
        sedp_rely_on_spdp_only= false;
        if (publication_writer_latency_budget != null) {
            publication_writer_latency_budget.clear();
        }
        publication_writer_push_on_write= false;
        if (subscription_writer_latency_budget != null) {
            subscription_writer_latency_budget.clear();
        }
        subscription_writer_push_on_write= false;
        if (participant_state_writer != null) {
            participant_state_writer.clear();
        }
        if (participant_state_writer_latency_budget != null) {
            participant_state_writer_latency_budget.clear();
        }
        participant_state_writer_push_on_write= false;
        if (participant_state_writer_publish_mode != null) {
            participant_state_writer_publish_mode.clear();
        }
        if (participant_proxy_reader != null) {
            participant_proxy_reader.clear();
        }
        if (participant_proxy_reader_fragmentation_resource_limits != null) {
            participant_proxy_reader_fragmentation_resource_limits.clear();
        }
        plugin_promiscuity_kind = DDSMonitoring.DiscoveryPluginPromiscuityKind.create();
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DiscoveryConfigQosPolicy otherObj = (DiscoveryConfigQosPolicy)o;

        if(!participant_liveliness_lease_duration.equals(otherObj.participant_liveliness_lease_duration)) {
            return false;
        }
        if(!participant_liveliness_assert_period.equals(otherObj.participant_liveliness_assert_period)) {
            return false;
        }
        if(!remote_participant_purge_kind.equals(otherObj.remote_participant_purge_kind)) {
            return false;
        }
        if(!max_liveliness_loss_detection_period.equals(otherObj.max_liveliness_loss_detection_period)) {
            return false;
        }
        if(initial_participant_announcements != otherObj.initial_participant_announcements) {
            return false;
        }
        if(!min_initial_participant_announcement_period.equals(otherObj.min_initial_participant_announcement_period)) {
            return false;
        }
        if(!max_initial_participant_announcement_period.equals(otherObj.max_initial_participant_announcement_period)) {
            return false;
        }
        if(!participant_reader_resource_limits.equals(otherObj.participant_reader_resource_limits)) {
            return false;
        }
        if(!publication_reader.equals(otherObj.publication_reader)) {
            return false;
        }
        if(!publication_reader_resource_limits.equals(otherObj.publication_reader_resource_limits)) {
            return false;
        }
        if(!subscription_reader.equals(otherObj.subscription_reader)) {
            return false;
        }
        if(!subscription_reader_resource_limits.equals(otherObj.subscription_reader_resource_limits)) {
            return false;
        }
        if(!publication_writer.equals(otherObj.publication_writer)) {
            return false;
        }
        if(!publication_writer_data_lifecycle.equals(otherObj.publication_writer_data_lifecycle)) {
            return false;
        }
        if(!subscription_writer.equals(otherObj.subscription_writer)) {
            return false;
        }
        if(!subscription_writer_data_lifecycle.equals(otherObj.subscription_writer_data_lifecycle)) {
            return false;
        }
        if(endpoint_plugin_redundancy_level != otherObj.endpoint_plugin_redundancy_level) {
            return false;
        }
        if(builtin_discovery_plugins != otherObj.builtin_discovery_plugins) {
            return false;
        }
        if(!participant_message_reader_reliability_kind.equals(otherObj.participant_message_reader_reliability_kind)) {
            return false;
        }
        if(!participant_message_reader.equals(otherObj.participant_message_reader)) {
            return false;
        }
        if(!participant_message_writer.equals(otherObj.participant_message_writer)) {
            return false;
        }
        if(!publication_writer_publish_mode.equals(otherObj.publication_writer_publish_mode)) {
            return false;
        }
        if(!subscription_writer_publish_mode.equals(otherObj.subscription_writer_publish_mode)) {
            return false;
        }
        if(!asynchronous_publisher.equals(otherObj.asynchronous_publisher)) {
            return false;
        }
        if(!default_domain_announcement_period.equals(otherObj.default_domain_announcement_period)) {
            return false;
        }
        if(ignore_default_domain_announcements != otherObj.ignore_default_domain_announcements) {
            return false;
        }
        if(sedp_rely_on_spdp_only != otherObj.sedp_rely_on_spdp_only) {
            return false;
        }
        if(!publication_writer_latency_budget.equals(otherObj.publication_writer_latency_budget)) {
            return false;
        }
        if(publication_writer_push_on_write != otherObj.publication_writer_push_on_write) {
            return false;
        }
        if(!subscription_writer_latency_budget.equals(otherObj.subscription_writer_latency_budget)) {
            return false;
        }
        if(subscription_writer_push_on_write != otherObj.subscription_writer_push_on_write) {
            return false;
        }
        if(!participant_state_writer.equals(otherObj.participant_state_writer)) {
            return false;
        }
        if(!participant_state_writer_latency_budget.equals(otherObj.participant_state_writer_latency_budget)) {
            return false;
        }
        if(participant_state_writer_push_on_write != otherObj.participant_state_writer_push_on_write) {
            return false;
        }
        if(!participant_state_writer_publish_mode.equals(otherObj.participant_state_writer_publish_mode)) {
            return false;
        }
        if(!participant_proxy_reader.equals(otherObj.participant_proxy_reader)) {
            return false;
        }
        if(!participant_proxy_reader_fragmentation_resource_limits.equals(otherObj.participant_proxy_reader_fragmentation_resource_limits)) {
            return false;
        }
        if(!plugin_promiscuity_kind.equals(otherObj.plugin_promiscuity_kind)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += participant_liveliness_lease_duration.hashCode(); 
        __result += participant_liveliness_assert_period.hashCode(); 
        __result += remote_participant_purge_kind.hashCode(); 
        __result += max_liveliness_loss_detection_period.hashCode(); 
        __result += (int)initial_participant_announcements;
        __result += min_initial_participant_announcement_period.hashCode(); 
        __result += max_initial_participant_announcement_period.hashCode(); 
        __result += participant_reader_resource_limits.hashCode(); 
        __result += publication_reader.hashCode(); 
        __result += publication_reader_resource_limits.hashCode(); 
        __result += subscription_reader.hashCode(); 
        __result += subscription_reader_resource_limits.hashCode(); 
        __result += publication_writer.hashCode(); 
        __result += publication_writer_data_lifecycle.hashCode(); 
        __result += subscription_writer.hashCode(); 
        __result += subscription_writer_data_lifecycle.hashCode(); 
        __result += (int)endpoint_plugin_redundancy_level;
        __result += (int)builtin_discovery_plugins;
        __result += participant_message_reader_reliability_kind.hashCode(); 
        __result += participant_message_reader.hashCode(); 
        __result += participant_message_writer.hashCode(); 
        __result += publication_writer_publish_mode.hashCode(); 
        __result += subscription_writer_publish_mode.hashCode(); 
        __result += asynchronous_publisher.hashCode(); 
        __result += default_domain_announcement_period.hashCode(); 
        __result += (ignore_default_domain_announcements == true)?1:0;
        __result += (sedp_rely_on_spdp_only == true)?1:0;
        __result += publication_writer_latency_budget.hashCode(); 
        __result += (publication_writer_push_on_write == true)?1:0;
        __result += subscription_writer_latency_budget.hashCode(); 
        __result += (subscription_writer_push_on_write == true)?1:0;
        __result += participant_state_writer.hashCode(); 
        __result += participant_state_writer_latency_budget.hashCode(); 
        __result += (participant_state_writer_push_on_write == true)?1:0;
        __result += participant_state_writer_publish_mode.hashCode(); 
        __result += participant_proxy_reader.hashCode(); 
        __result += participant_proxy_reader_fragmentation_resource_limits.hashCode(); 
        __result += plugin_promiscuity_kind.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DiscoveryConfigQosPolicyTypeSupport</code>
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

        DiscoveryConfigQosPolicy typedSrc = (DiscoveryConfigQosPolicy) src;
        DiscoveryConfigQosPolicy typedDst = this;

        typedDst.participant_liveliness_lease_duration = (DDSMonitoring.Duration_t) typedDst.participant_liveliness_lease_duration.copy_from(typedSrc.participant_liveliness_lease_duration);
        typedDst.participant_liveliness_assert_period = (DDSMonitoring.Duration_t) typedDst.participant_liveliness_assert_period.copy_from(typedSrc.participant_liveliness_assert_period);
        typedDst.remote_participant_purge_kind = (DDSMonitoring.RemoteParticipantPurgeKind) typedDst.remote_participant_purge_kind.copy_from(typedSrc.remote_participant_purge_kind);
        typedDst.max_liveliness_loss_detection_period = (DDSMonitoring.Duration_t) typedDst.max_liveliness_loss_detection_period.copy_from(typedSrc.max_liveliness_loss_detection_period);
        typedDst.initial_participant_announcements = typedSrc.initial_participant_announcements;
        typedDst.min_initial_participant_announcement_period = (DDSMonitoring.Duration_t) typedDst.min_initial_participant_announcement_period.copy_from(typedSrc.min_initial_participant_announcement_period);
        typedDst.max_initial_participant_announcement_period = (DDSMonitoring.Duration_t) typedDst.max_initial_participant_announcement_period.copy_from(typedSrc.max_initial_participant_announcement_period);
        typedDst.participant_reader_resource_limits = (DDSMonitoring.BuiltinTopicReaderResourceLimits_t) typedDst.participant_reader_resource_limits.copy_from(typedSrc.participant_reader_resource_limits);
        typedDst.publication_reader = (DDSMonitoring.RtpsReliableReaderProtocol_t) typedDst.publication_reader.copy_from(typedSrc.publication_reader);
        typedDst.publication_reader_resource_limits = (DDSMonitoring.BuiltinTopicReaderResourceLimits_t) typedDst.publication_reader_resource_limits.copy_from(typedSrc.publication_reader_resource_limits);
        typedDst.subscription_reader = (DDSMonitoring.RtpsReliableReaderProtocol_t) typedDst.subscription_reader.copy_from(typedSrc.subscription_reader);
        typedDst.subscription_reader_resource_limits = (DDSMonitoring.BuiltinTopicReaderResourceLimits_t) typedDst.subscription_reader_resource_limits.copy_from(typedSrc.subscription_reader_resource_limits);
        typedDst.publication_writer = (DDSMonitoring.RtpsReliableWriterProtocol_t) typedDst.publication_writer.copy_from(typedSrc.publication_writer);
        typedDst.publication_writer_data_lifecycle = (DDSMonitoring.WriterDataLifecycleQosPolicy) typedDst.publication_writer_data_lifecycle.copy_from(typedSrc.publication_writer_data_lifecycle);
        typedDst.subscription_writer = (DDSMonitoring.RtpsReliableWriterProtocol_t) typedDst.subscription_writer.copy_from(typedSrc.subscription_writer);
        typedDst.subscription_writer_data_lifecycle = (DDSMonitoring.WriterDataLifecycleQosPolicy) typedDst.subscription_writer_data_lifecycle.copy_from(typedSrc.subscription_writer_data_lifecycle);
        typedDst.endpoint_plugin_redundancy_level = typedSrc.endpoint_plugin_redundancy_level;
        typedDst.builtin_discovery_plugins = typedSrc.builtin_discovery_plugins;
        typedDst.participant_message_reader_reliability_kind = (DDSMonitoring.ReliabilityQosPolicyKind) typedDst.participant_message_reader_reliability_kind.copy_from(typedSrc.participant_message_reader_reliability_kind);
        typedDst.participant_message_reader = (DDSMonitoring.RtpsReliableReaderProtocol_t) typedDst.participant_message_reader.copy_from(typedSrc.participant_message_reader);
        typedDst.participant_message_writer = (DDSMonitoring.RtpsReliableWriterProtocol_t) typedDst.participant_message_writer.copy_from(typedSrc.participant_message_writer);
        typedDst.publication_writer_publish_mode = (DDSMonitoring.PublishModeQosPolicy) typedDst.publication_writer_publish_mode.copy_from(typedSrc.publication_writer_publish_mode);
        typedDst.subscription_writer_publish_mode = (DDSMonitoring.PublishModeQosPolicy) typedDst.subscription_writer_publish_mode.copy_from(typedSrc.subscription_writer_publish_mode);
        typedDst.asynchronous_publisher = (DDSMonitoring.AsynchronousPublisherQosPolicy) typedDst.asynchronous_publisher.copy_from(typedSrc.asynchronous_publisher);
        typedDst.default_domain_announcement_period = (DDSMonitoring.Duration_t) typedDst.default_domain_announcement_period.copy_from(typedSrc.default_domain_announcement_period);
        typedDst.ignore_default_domain_announcements = typedSrc.ignore_default_domain_announcements;
        typedDst.sedp_rely_on_spdp_only = typedSrc.sedp_rely_on_spdp_only;
        typedDst.publication_writer_latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy) typedDst.publication_writer_latency_budget.copy_from(typedSrc.publication_writer_latency_budget);
        typedDst.publication_writer_push_on_write = typedSrc.publication_writer_push_on_write;
        typedDst.subscription_writer_latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy) typedDst.subscription_writer_latency_budget.copy_from(typedSrc.subscription_writer_latency_budget);
        typedDst.subscription_writer_push_on_write = typedSrc.subscription_writer_push_on_write;
        typedDst.participant_state_writer = (DDSMonitoring.RtpsReliableWriterProtocol_t) typedDst.participant_state_writer.copy_from(typedSrc.participant_state_writer);
        typedDst.participant_state_writer_latency_budget = (DDSMonitoring.LatencyBudgetQosPolicy) typedDst.participant_state_writer_latency_budget.copy_from(typedSrc.participant_state_writer_latency_budget);
        typedDst.participant_state_writer_push_on_write = typedSrc.participant_state_writer_push_on_write;
        typedDst.participant_state_writer_publish_mode = (DDSMonitoring.PublishModeQosPolicy) typedDst.participant_state_writer_publish_mode.copy_from(typedSrc.participant_state_writer_publish_mode);
        typedDst.participant_proxy_reader = (DDSMonitoring.RtpsReliableReaderProtocol_t) typedDst.participant_proxy_reader.copy_from(typedSrc.participant_proxy_reader);
        typedDst.participant_proxy_reader_fragmentation_resource_limits = (DDSMonitoring.DiscoveryBuiltinReaderFragmentationResourceLimits_t) typedDst.participant_proxy_reader_fragmentation_resource_limits.copy_from(typedSrc.participant_proxy_reader_fragmentation_resource_limits);
        typedDst.plugin_promiscuity_kind = (DDSMonitoring.DiscoveryPluginPromiscuityKind) typedDst.plugin_promiscuity_kind.copy_from(typedSrc.plugin_promiscuity_kind);

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

        strBuffer.append(participant_liveliness_lease_duration.toString("participant_liveliness_lease_duration ", indent+1));
        strBuffer.append(participant_liveliness_assert_period.toString("participant_liveliness_assert_period ", indent+1));
        strBuffer.append(remote_participant_purge_kind.toString("remote_participant_purge_kind ", indent+1));
        strBuffer.append(max_liveliness_loss_detection_period.toString("max_liveliness_loss_detection_period ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_participant_announcements: ").append(initial_participant_announcements).append("\n");  
        strBuffer.append(min_initial_participant_announcement_period.toString("min_initial_participant_announcement_period ", indent+1));
        strBuffer.append(max_initial_participant_announcement_period.toString("max_initial_participant_announcement_period ", indent+1));
        strBuffer.append(participant_reader_resource_limits.toString("participant_reader_resource_limits ", indent+1));
        strBuffer.append(publication_reader.toString("publication_reader ", indent+1));
        strBuffer.append(publication_reader_resource_limits.toString("publication_reader_resource_limits ", indent+1));
        strBuffer.append(subscription_reader.toString("subscription_reader ", indent+1));
        strBuffer.append(subscription_reader_resource_limits.toString("subscription_reader_resource_limits ", indent+1));
        strBuffer.append(publication_writer.toString("publication_writer ", indent+1));
        strBuffer.append(publication_writer_data_lifecycle.toString("publication_writer_data_lifecycle ", indent+1));
        strBuffer.append(subscription_writer.toString("subscription_writer ", indent+1));
        strBuffer.append(subscription_writer_data_lifecycle.toString("subscription_writer_data_lifecycle ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("endpoint_plugin_redundancy_level: ").append(endpoint_plugin_redundancy_level).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("builtin_discovery_plugins: ").append(builtin_discovery_plugins).append("\n");  
        strBuffer.append(participant_message_reader_reliability_kind.toString("participant_message_reader_reliability_kind ", indent+1));
        strBuffer.append(participant_message_reader.toString("participant_message_reader ", indent+1));
        strBuffer.append(participant_message_writer.toString("participant_message_writer ", indent+1));
        strBuffer.append(publication_writer_publish_mode.toString("publication_writer_publish_mode ", indent+1));
        strBuffer.append(subscription_writer_publish_mode.toString("subscription_writer_publish_mode ", indent+1));
        strBuffer.append(asynchronous_publisher.toString("asynchronous_publisher ", indent+1));
        strBuffer.append(default_domain_announcement_period.toString("default_domain_announcement_period ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("ignore_default_domain_announcements: ").append(ignore_default_domain_announcements).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sedp_rely_on_spdp_only: ").append(sedp_rely_on_spdp_only).append("\n");  
        strBuffer.append(publication_writer_latency_budget.toString("publication_writer_latency_budget ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("publication_writer_push_on_write: ").append(publication_writer_push_on_write).append("\n");  
        strBuffer.append(subscription_writer_latency_budget.toString("subscription_writer_latency_budget ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("subscription_writer_push_on_write: ").append(subscription_writer_push_on_write).append("\n");  
        strBuffer.append(participant_state_writer.toString("participant_state_writer ", indent+1));
        strBuffer.append(participant_state_writer_latency_budget.toString("participant_state_writer_latency_budget ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("participant_state_writer_push_on_write: ").append(participant_state_writer_push_on_write).append("\n");  
        strBuffer.append(participant_state_writer_publish_mode.toString("participant_state_writer_publish_mode ", indent+1));
        strBuffer.append(participant_proxy_reader.toString("participant_proxy_reader ", indent+1));
        strBuffer.append(participant_proxy_reader_fragmentation_resource_limits.toString("participant_proxy_reader_fragmentation_resource_limits ", indent+1));
        strBuffer.append(plugin_promiscuity_kind.toString("plugin_promiscuity_kind ", indent+1));

        return strBuffer.toString();
    }

}
