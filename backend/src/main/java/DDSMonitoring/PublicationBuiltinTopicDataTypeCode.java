
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  PublicationBuiltinTopicDataTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[20];

        sm[__i]=new  StructMember("key", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("participant_key", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("topic_name", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,(DDSMonitoring.BUILTIN_TOPIC_DATA_STRING_MAX_LENGTH.VALUE)),2 , false);__i++;
        sm[__i]=new  StructMember("type_name", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,(DDSMonitoring.BUILTIN_TOPIC_DATA_STRING_MAX_LENGTH.VALUE)),3 , false);__i++;
        sm[__i]=new  StructMember("durability", false, (short)-1,  false,(TypeCode) DDSMonitoring.DurabilityQosPolicyTypeCode.VALUE,4 , false);__i++;
        sm[__i]=new  StructMember("durability_service", false, (short)-1,  false,(TypeCode) DDSMonitoring.DurabilityServiceQosPolicyTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("deadline", false, (short)-1,  false,(TypeCode) DDSMonitoring.DeadlineQosPolicyTypeCode.VALUE,6 , false);__i++;
        sm[__i]=new  StructMember("latency_budget", false, (short)-1,  false,(TypeCode) DDSMonitoring.LatencyBudgetQosPolicyTypeCode.VALUE,7 , false);__i++;
        sm[__i]=new  StructMember("liveliness", false, (short)-1,  false,(TypeCode) DDSMonitoring.LivelinessQosPolicyTypeCode.VALUE,8 , false);__i++;
        sm[__i]=new  StructMember("reliability", false, (short)-1,  false,(TypeCode) DDSMonitoring.ReliabilityQosPolicyTypeCode.VALUE,9 , false);__i++;
        sm[__i]=new  StructMember("lifespan", false, (short)-1,  false,(TypeCode) DDSMonitoring.LifespanQosPolicyTypeCode.VALUE,10 , false);__i++;
        sm[__i]=new  StructMember("user_data", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserDataQosPolicyTypeCode.VALUE,11 , false);__i++;
        sm[__i]=new  StructMember("ownership", false, (short)-1,  false,(TypeCode) DDSMonitoring.OwnershipQosPolicyTypeCode.VALUE,12 , false);__i++;
        sm[__i]=new  StructMember("ownership_strength", false, (short)-1,  false,(TypeCode) DDSMonitoring.OwnershipStrengthQosPolicyTypeCode.VALUE,13 , false);__i++;
        sm[__i]=new  StructMember("destination_order", false, (short)-1,  false,(TypeCode) DDSMonitoring.DestinationOrderQosPolicyTypeCode.VALUE,14 , false);__i++;
        sm[__i]=new  StructMember("presentation", false, (short)-1,  false,(TypeCode) DDSMonitoring.PresentationQosPolicyTypeCode.VALUE,15 , false);__i++;
        sm[__i]=new  StructMember("partition", false, (short)-1,  false,(TypeCode) DDSMonitoring.PartitionQosPolicyTypeCode.VALUE,16 , false);__i++;
        sm[__i]=new  StructMember("topic_data", false, (short)-1,  false,(TypeCode) DDSMonitoring.TopicDataQosPolicyTypeCode.VALUE,17 , false);__i++;
        sm[__i]=new  StructMember("group_data", false, (short)-1,  false,(TypeCode) DDSMonitoring.GroupDataQosPolicyTypeCode.VALUE,18 , false);__i++;
        sm[__i]=new  StructMember("type_consistency", false, (short)-1,  false,(TypeCode) DDSMonitoring.TypeConsistencyEnforcementQosPolicyTypeCode.VALUE,19 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::PublicationBuiltinTopicData",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

