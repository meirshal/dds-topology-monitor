
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rti.dds.monitoring;

import com.rti.dds.typecode.*;

public class  ProcessStatisticsTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[6];

        sm[__i]=new  StructMember("user_cpu_time", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("user_cpu_time_change", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("kernel_cpu_time", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("kernel_cpu_time_change", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("physical_memory_bytes", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONGLONG,4 , false);__i++;
        sm[__i]=new  StructMember("total_memory_bytes", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONGLONG,5 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("rti::dds::monitoring::ProcessStatistics",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

