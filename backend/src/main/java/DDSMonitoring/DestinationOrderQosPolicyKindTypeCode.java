
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DestinationOrderQosPolicyKindTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int i=0;
        EnumMember em[] = new EnumMember[2];

        int[] ordinals = DestinationOrderQosPolicyKind.getOrdinals();
        for (i=0;i<2;i++) {
            em[i]=new EnumMember(DestinationOrderQosPolicyKind.valueOf(ordinals[i]).toString(),ordinals[i]);
        }

        tc = TypeCodeFactory.TheTypeCodeFactory.create_enum_tc("DDSMonitoring::DestinationOrderQosPolicyKind",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  em);        
        return tc;
    }
}

