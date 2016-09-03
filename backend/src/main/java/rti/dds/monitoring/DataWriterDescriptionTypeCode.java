
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rti.dds.monitoring;

import com.rti.dds.typecode.*;

public class  DataWriterDescriptionTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[12];

        sm[__i]=new  StructMember("entity_key", false, (short)-1, true,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("publisher_entity_key", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("topic_entity_key", false, (short)-1,  false,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("domain_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,3 , false);__i++;
        sm[__i]=new  StructMember("host_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,4 , false);__i++;
        sm[__i]=new  StructMember("process_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,5 , false);__i++;
        sm[__i]=new  StructMember("type_name", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,(rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)),6 , false);__i++;
        sm[__i]=new  StructMember("topic_name", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,(rti.dds.monitoring.STRING_MAX_LENGTH.VALUE)),7 , false);__i++;
        sm[__i]=new  StructMember("serialized_sample_max_size", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,8 , false);__i++;
        sm[__i]=new  StructMember("serialized_sample_min_size", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,9 , false);__i++;
        sm[__i]=new  StructMember("serialized_key_max_size", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,10 , false);__i++;
        sm[__i]=new  StructMember("qos", false, (short)-1,  false,(TypeCode) DDSMonitoring.DataWriterQosTypeCode.VALUE,11 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("rti::dds::monitoring::DataWriterDescription",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

