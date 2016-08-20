
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  LivelinessChangedStatusTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[5];

        sm[__i]=new  StructMember("alive_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,0 , false);__i++;
        sm[__i]=new  StructMember("not_alive_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,1 , false);__i++;
        sm[__i]=new  StructMember("alive_count_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,2 , false);__i++;
        sm[__i]=new  StructMember("not_alive_count_change", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,3 , false);__i++;
        sm[__i]=new  StructMember("last_publication_handle", false, (short)-1,  false,(TypeCode) DDSMonitoring.InstanceHandle_tTypeCode.VALUE,4 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::LivelinessChangedStatus",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

