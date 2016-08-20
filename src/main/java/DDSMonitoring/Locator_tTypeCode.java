
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  Locator_tTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[4];

        sm[__i]=new  StructMember("kind", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,0 , false);__i++;
        sm[__i]=new  StructMember("port", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,1 , false);__i++;
        sm[__i]=new  StructMember("address", false, (short)-1,  false,(TypeCode) new TypeCode(new int[] {(DDSMonitoring.LOCATOR_ADDRESS_LENGTH_MAX.VALUE)}, TypeCode.TC_OCTET),2 , false);__i++;
        sm[__i]=new  StructMember("encapsulations", false, (short)-1,  false,(TypeCode) new TypeCode(8, DDSMonitoring.EncapsulationId_tTypeCode.VALUE),3 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::Locator_t",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

