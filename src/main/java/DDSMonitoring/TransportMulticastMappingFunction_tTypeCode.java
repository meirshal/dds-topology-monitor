
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  TransportMulticastMappingFunction_tTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[2];

        sm[__i]=new  StructMember("dll", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,(DDSMonitoring.TRANSPORT_MULICAST_MAPPING_STRING_MAX_LENGTH.VALUE)),0 , false);__i++;
        sm[__i]=new  StructMember("function_name", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,(DDSMonitoring.TRANSPORT_MULICAST_MAPPING_STRING_MAX_LENGTH.VALUE)),1 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::TransportMulticastMappingFunction_t",ExtensibilityKind.FINAL_EXTENSIBILITY,  sm);        
        return tc;
    }
}

