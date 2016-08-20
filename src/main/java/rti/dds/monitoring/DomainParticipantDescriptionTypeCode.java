
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rti.dds.monitoring;

import com.rti.dds.typecode.*;

public class  DomainParticipantDescriptionTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[5];

        sm[__i]=new  StructMember("entity_key", false, (short)-1, true,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("domain_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,1 , false);__i++;
        sm[__i]=new  StructMember("host_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,2 , false);__i++;
        sm[__i]=new  StructMember("process_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,3 , false);__i++;
        sm[__i]=new  StructMember("qos", false, (short)-1,  false,(TypeCode) DDSMonitoring.DomainParticipantQosTypeCode.VALUE,4 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("rti::dds::monitoring::DomainParticipantDescription",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

