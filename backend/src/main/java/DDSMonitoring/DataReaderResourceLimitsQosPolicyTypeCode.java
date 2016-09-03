
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DataReaderResourceLimitsQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[25];

        sm[__i]=new  StructMember("max_remote_writers", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,0 , false);__i++;
        sm[__i]=new  StructMember("max_remote_writers_per_instance", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,1 , false);__i++;
        sm[__i]=new  StructMember("max_samples_per_remote_writer", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,2 , false);__i++;
        sm[__i]=new  StructMember("max_infos", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,3 , false);__i++;
        sm[__i]=new  StructMember("initial_remote_writers", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,4 , false);__i++;
        sm[__i]=new  StructMember("initial_remote_writers_per_instance", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,5 , false);__i++;
        sm[__i]=new  StructMember("initial_infos", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,6 , false);__i++;
        sm[__i]=new  StructMember("initial_outstanding_reads", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,7 , false);__i++;
        sm[__i]=new  StructMember("max_outstanding_reads", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,8 , false);__i++;
        sm[__i]=new  StructMember("max_samples_per_read", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,9 , false);__i++;
        sm[__i]=new  StructMember("disable_fragmentation_support", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,10 , false);__i++;
        sm[__i]=new  StructMember("max_fragmented_samples", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,11 , false);__i++;
        sm[__i]=new  StructMember("initial_fragmented_samples", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,12 , false);__i++;
        sm[__i]=new  StructMember("max_fragmented_samples_per_remote_writer", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,13 , false);__i++;
        sm[__i]=new  StructMember("max_fragments_per_sample", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,14 , false);__i++;
        sm[__i]=new  StructMember("dynamically_allocate_fragmented_samples", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,15 , false);__i++;
        sm[__i]=new  StructMember("max_total_instances", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,16 , false);__i++;
        sm[__i]=new  StructMember("max_remote_virtual_writers", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,17 , false);__i++;
        sm[__i]=new  StructMember("intial_remote_virtual_writers", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,18 , false);__i++;
        sm[__i]=new  StructMember("max_remote_virtual_writers_per_instance", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,19 , false);__i++;
        sm[__i]=new  StructMember("initial_remote_virtual_writers_per_instance", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,20 , false);__i++;
        sm[__i]=new  StructMember("max_remote_writers_per_sample", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,21 , false);__i++;
        sm[__i]=new  StructMember("max_query_condition_filters", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,22 , false);__i++;
        sm[__i]=new  StructMember("max_app_ack_response_length", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,23 , false);__i++;
        sm[__i]=new  StructMember("keep_minimum_state_for_instances", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,24 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DataReaderResourceLimitsQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

