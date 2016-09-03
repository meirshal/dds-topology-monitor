
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DiscoveryConfigQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[38];

        sm[__i]=new  StructMember("participant_liveliness_lease_duration", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("participant_liveliness_assert_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("remote_participant_purge_kind", false, (short)-1,  false,(TypeCode) DDSMonitoring.RemoteParticipantPurgeKindTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("max_liveliness_loss_detection_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("initial_participant_announcements", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,4 , false);__i++;
        sm[__i]=new  StructMember("min_initial_participant_announcement_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("max_initial_participant_announcement_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,6 , false);__i++;
        sm[__i]=new  StructMember("participant_reader_resource_limits", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicReaderResourceLimits_tTypeCode.VALUE,7 , false);__i++;
        sm[__i]=new  StructMember("publication_reader", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsReliableReaderProtocol_tTypeCode.VALUE,8 , false);__i++;
        sm[__i]=new  StructMember("publication_reader_resource_limits", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicReaderResourceLimits_tTypeCode.VALUE,9 , false);__i++;
        sm[__i]=new  StructMember("subscription_reader", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsReliableReaderProtocol_tTypeCode.VALUE,10 , false);__i++;
        sm[__i]=new  StructMember("subscription_reader_resource_limits", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicReaderResourceLimits_tTypeCode.VALUE,11 , false);__i++;
        sm[__i]=new  StructMember("publication_writer", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsReliableWriterProtocol_tTypeCode.VALUE,12 , false);__i++;
        sm[__i]=new  StructMember("publication_writer_data_lifecycle", false, (short)-1,  false,(TypeCode) DDSMonitoring.WriterDataLifecycleQosPolicyTypeCode.VALUE,13 , false);__i++;
        sm[__i]=new  StructMember("subscription_writer", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsReliableWriterProtocol_tTypeCode.VALUE,14 , false);__i++;
        sm[__i]=new  StructMember("subscription_writer_data_lifecycle", false, (short)-1,  false,(TypeCode) DDSMonitoring.WriterDataLifecycleQosPolicyTypeCode.VALUE,15 , false);__i++;
        sm[__i]=new  StructMember("endpoint_plugin_redundancy_level", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,16 , false);__i++;
        sm[__i]=new  StructMember("builtin_discovery_plugins", false, (short)-1,  false,(TypeCode) DDSMonitoring.DiscoveryConfigBuiltinPluginKindMaskTypeCode.VALUE,17 , false);__i++;
        sm[__i]=new  StructMember("participant_message_reader_reliability_kind", false, (short)-1,  false,(TypeCode) DDSMonitoring.ReliabilityQosPolicyKindTypeCode.VALUE,37 , false);__i++;
        sm[__i]=new  StructMember("participant_message_reader", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsReliableReaderProtocol_tTypeCode.VALUE,18 , false);__i++;
        sm[__i]=new  StructMember("participant_message_writer", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsReliableWriterProtocol_tTypeCode.VALUE,19 , false);__i++;
        sm[__i]=new  StructMember("publication_writer_publish_mode", false, (short)-1,  false,(TypeCode) DDSMonitoring.PublishModeQosPolicyTypeCode.VALUE,20 , false);__i++;
        sm[__i]=new  StructMember("subscription_writer_publish_mode", false, (short)-1,  false,(TypeCode) DDSMonitoring.PublishModeQosPolicyTypeCode.VALUE,21 , false);__i++;
        sm[__i]=new  StructMember("asynchronous_publisher", false, (short)-1,  false,(TypeCode) DDSMonitoring.AsynchronousPublisherQosPolicyTypeCode.VALUE,22 , false);__i++;
        sm[__i]=new  StructMember("default_domain_announcement_period", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,23 , false);__i++;
        sm[__i]=new  StructMember("ignore_default_domain_announcements", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,24 , false);__i++;
        sm[__i]=new  StructMember("sedp_rely_on_spdp_only", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,25 , false);__i++;
        sm[__i]=new  StructMember("publication_writer_latency_budget", false, (short)-1,  false,(TypeCode) DDSMonitoring.LatencyBudgetQosPolicyTypeCode.VALUE,26 , false);__i++;
        sm[__i]=new  StructMember("publication_writer_push_on_write", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,27 , false);__i++;
        sm[__i]=new  StructMember("subscription_writer_latency_budget", false, (short)-1,  false,(TypeCode) DDSMonitoring.LatencyBudgetQosPolicyTypeCode.VALUE,28 , false);__i++;
        sm[__i]=new  StructMember("subscription_writer_push_on_write", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,29 , false);__i++;
        sm[__i]=new  StructMember("participant_state_writer", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsReliableWriterProtocol_tTypeCode.VALUE,30 , false);__i++;
        sm[__i]=new  StructMember("participant_state_writer_latency_budget", false, (short)-1,  false,(TypeCode) DDSMonitoring.LatencyBudgetQosPolicyTypeCode.VALUE,31 , false);__i++;
        sm[__i]=new  StructMember("participant_state_writer_push_on_write", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,32 , false);__i++;
        sm[__i]=new  StructMember("participant_state_writer_publish_mode", false, (short)-1,  false,(TypeCode) DDSMonitoring.PublishModeQosPolicyTypeCode.VALUE,33 , false);__i++;
        sm[__i]=new  StructMember("participant_proxy_reader", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsReliableReaderProtocol_tTypeCode.VALUE,34 , false);__i++;
        sm[__i]=new  StructMember("participant_proxy_reader_fragmentation_resource_limits", false, (short)-1,  false,(TypeCode) DDSMonitoring.DiscoveryBuiltinReaderFragmentationResourceLimits_tTypeCode.VALUE,35 , false);__i++;
        sm[__i]=new  StructMember("plugin_promiscuity_kind", false, (short)-1,  false,(TypeCode) DDSMonitoring.DiscoveryPluginPromiscuityKindTypeCode.VALUE,36 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DiscoveryConfigQosPolicy",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

