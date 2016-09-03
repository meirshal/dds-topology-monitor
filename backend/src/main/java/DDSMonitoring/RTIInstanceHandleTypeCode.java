
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  RTIInstanceHandleTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[3];

        sm[__i]=new  StructMember("value", false, (short)-1,  false,(TypeCode) new TypeCode(new int[] {16}, TypeCode.TC_OCTET),0 , false);__i++;
        sm[__i]=new  StructMember("length", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,1 , false);__i++;
        sm[__i]=new  StructMember("isValid", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,2 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::RTIInstanceHandle",ExtensibilityKind.FINAL_EXTENSIBILITY,  sm);        
        return tc;
    }
}

