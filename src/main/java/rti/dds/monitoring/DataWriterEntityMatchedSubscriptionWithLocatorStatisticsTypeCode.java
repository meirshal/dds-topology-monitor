
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rti.dds.monitoring;

import com.rti.dds.typecode.*;

public class  DataWriterEntityMatchedSubscriptionWithLocatorStatisticsTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[4];

        sm[__i]=new  StructMember("datawriter_key", false, (short)-1, true,(TypeCode) DDSMonitoring.BuiltinTopicKey_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("subscription_locator", false, (short)-1, true,(TypeCode) DDSMonitoring.Locator_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("period", false, (short)-1, true,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("datawriter_protocol_status", false, (short)-1,  false,(TypeCode) rti.dds.monitoring.DataWriterProtocolStatusStatisticsTypeCode.VALUE,3 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("rti::dds::monitoring::DataWriterEntityMatchedSubscriptionWithLocatorStatistics",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

