
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DestinationOrderQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[3];

        sm[__i]=new  StructMember("kind", false, (short)-1,  false,(TypeCode) DDSMonitoring.DestinationOrderQosPolicyKindTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("scope", false, (short)-1,  false,(TypeCode) DDSMonitoring.DestinationOrderQosPolicyScopeKindTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("source_timestamp_tolerance", false, (short)-1,  false,(TypeCode) DDSMonitoring.Duration_tTypeCode.VALUE,2 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DestinationOrderQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

