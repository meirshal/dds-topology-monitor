
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  QosPolicyCountTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[2];

        sm[__i]=new  StructMember("policy_id", false, (short)-1,  false,(TypeCode) DDSMonitoring.QosPolicyId_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,1 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::QosPolicyCount",ExtensibilityKind.FINAL_EXTENSIBILITY,  sm);        
        return tc;
    }
}

