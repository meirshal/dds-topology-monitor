
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  ProductVersion_tTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[4];

        sm[__i]=new  StructMember("major", false, (short)-1,  false,(TypeCode) TypeCode.TC_CHAR,0 , false);__i++;
        sm[__i]=new  StructMember("minor", false, (short)-1,  false,(TypeCode) TypeCode.TC_CHAR,1 , false);__i++;
        sm[__i]=new  StructMember("release", false, (short)-1,  false,(TypeCode) TypeCode.TC_CHAR,2 , false);__i++;
        sm[__i]=new  StructMember("revision", false, (short)-1,  false,(TypeCode) TypeCode.TC_CHAR,3 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::ProductVersion_t",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

