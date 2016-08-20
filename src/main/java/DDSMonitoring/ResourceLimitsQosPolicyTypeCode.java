
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  ResourceLimitsQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[6];

        sm[__i]=new  StructMember("max_samples", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,0 , false);__i++;
        sm[__i]=new  StructMember("max_instances", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,1 , false);__i++;
        sm[__i]=new  StructMember("max_samples_per_instance", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,2 , false);__i++;
        sm[__i]=new  StructMember("initial_samples", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,3 , false);__i++;
        sm[__i]=new  StructMember("initial_instances", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,4 , false);__i++;
        sm[__i]=new  StructMember("instance_hash_buckets", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,5 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::ResourceLimitsQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

