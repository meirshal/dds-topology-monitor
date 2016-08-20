
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DiscoveryBuiltinReaderFragmentationResourceLimits_tTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[6];

        sm[__i]=new  StructMember("disable_fragmentation_support", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,0 , false);__i++;
        sm[__i]=new  StructMember("max_fragmented_samples", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,1 , false);__i++;
        sm[__i]=new  StructMember("initial_fragmented_samples", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,2 , false);__i++;
        sm[__i]=new  StructMember("max_fragmented_samples_per_remote_writer", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,3 , false);__i++;
        sm[__i]=new  StructMember("max_fragments_per_sample", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,4 , false);__i++;
        sm[__i]=new  StructMember("dynamically_allocate_fragmented_samples", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,5 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DiscoveryBuiltinReaderFragmentationResourceLimits_t",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

