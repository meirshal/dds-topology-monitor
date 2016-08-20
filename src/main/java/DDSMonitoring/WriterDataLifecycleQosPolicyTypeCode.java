
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  WriterDataLifecycleQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[3];

        sm[__i]=new  StructMember("autodispose_unregistered_instances", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,0 , false);__i++;
        sm[__i]=new  StructMember("autopurge_unregistered_instances_delay", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("autopurge_disposed_instances_delay", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,2 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::WriterDataLifecycleQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

