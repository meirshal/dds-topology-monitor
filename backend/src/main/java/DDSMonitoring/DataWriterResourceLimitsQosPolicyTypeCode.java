
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DataWriterResourceLimitsQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[13];

        sm[__i]=new  StructMember("initial_concurrent_blocking_threads", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,0 , false);__i++;
        sm[__i]=new  StructMember("max_concurrent_blocking_threads", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,1 , false);__i++;
        sm[__i]=new  StructMember("max_remote_reader_filters", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,2 , false);__i++;
        sm[__i]=new  StructMember("initial_batches", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,3 , false);__i++;
        sm[__i]=new  StructMember("max_batches", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,4 , false);__i++;
        sm[__i]=new  StructMember("cookie_max_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,5 , false);__i++;
        sm[__i]=new  StructMember("instance_replacement", false, (short)-1,  false,(TypeCode) DDSMonitoring.DataWriterResourceLimitsInstanceReplacementKindTypeCode.VALUE,6 , false);__i++;
        sm[__i]=new  StructMember("replace_empty_instances", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,7 , false);__i++;
        sm[__i]=new  StructMember("autoregister_instances", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,8 , false);__i++;
        sm[__i]=new  StructMember("initial_virtual_writers", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,9 , false);__i++;
        sm[__i]=new  StructMember("max_virtual_writers", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,10 , false);__i++;
        sm[__i]=new  StructMember("max_remote_readers", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,11 , false);__i++;
        sm[__i]=new  StructMember("max_app_ack_remote_readers", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,12 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DataWriterResourceLimitsQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

