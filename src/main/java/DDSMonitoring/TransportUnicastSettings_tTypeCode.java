
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  TransportUnicastSettings_tTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[2];

        sm[__i]=new  StructMember("transports", false, (short)-1,  false,(TypeCode) new TypeCode(128, new TypeCode(TCKind.TK_STRING,128)),0 , false);__i++;
        sm[__i]=new  StructMember("receive_port", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,1 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::TransportUnicastSettings_t",ExtensibilityKind.FINAL_EXTENSIBILITY,  sm);        
        return tc;
    }
}

