
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rti.dds.monitoring;

import com.rti.dds.typecode.*;

public class  DomainParticipantEntityStatisticsTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[9];

        sm[__i]=new  StructMember("participant_key", false, (short)-1, true,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("period", false, (short)-1, true,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("domain_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,2 , false);__i++;
        sm[__i]=new  StructMember("host_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,3 , false);__i++;
        sm[__i]=new  StructMember("process_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,4 , false);__i++;
        sm[__i]=new  StructMember("process", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.ProcessStatisticsTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("remoteParticipantCount", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,6 , false);__i++;
        sm[__i]=new  StructMember("remoteWriterCount", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,7 , false);__i++;
        sm[__i]=new  StructMember("remoteReaderCount", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,8 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("rti::dds::monitoring::DomainParticipantEntityStatistics",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

