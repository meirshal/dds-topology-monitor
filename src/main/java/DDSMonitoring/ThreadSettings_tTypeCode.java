
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  ThreadSettings_tTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[5];

        sm[__i]=new  StructMember("mask", false, (short)-1,  false,(TypeCode) DDSMonitoring.ThreadSettingsKindMaskTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("priority", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,1 , false);__i++;
        sm[__i]=new  StructMember("stack_size", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,2 , false);__i++;
        sm[__i]=new  StructMember("cpu_list", false, (short)-1,  false,(TypeCode) new TypeCode(1024, TypeCode.TC_LONG),3 , false);__i++;
        sm[__i]=new  StructMember("cpu_rotation", false, (short)-1,  false,(TypeCode) DDSMonitoring.ThreadSettingsCpuRotationKindTypeCode.VALUE,4 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::ThreadSettings_t",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

