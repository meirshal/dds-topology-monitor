
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  TypeSupportQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[2];

        sm[__i]=new  StructMember("plugin_data", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONGLONG,0 , false);__i++;
        sm[__i]=new  StructMember("cdr_padding_kind", false, (short)-1,  false,(TypeCode) DDSMonitoring.CdrPaddingKindTypeCode.VALUE,1 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::TypeSupportQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

