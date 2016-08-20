
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  ChannelSettings_tTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[3];

        sm[__i]=new  StructMember("multicast_settings", false, (short)-1,  false,(TypeCode) new TypeCode(4, DDSMonitoring.TransportMulticastSettings_tTypeCode.VALUE),0 , false);__i++;
        sm[__i]=new  StructMember("filter_expression", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),1 , false);__i++;
        sm[__i]=new  StructMember("priority", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,2 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::ChannelSettings_t",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

