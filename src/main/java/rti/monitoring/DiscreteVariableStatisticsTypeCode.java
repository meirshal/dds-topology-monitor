
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rti.monitoring;

import com.rti.dds.typecode.*;

public class  DiscreteVariableStatisticsTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[4];

        sm[__i]=new  StructMember("mean", false, (short)-1,  false,(TypeCode) TypeCode.TC_DOUBLE,0 , false);__i++;
        sm[__i]=new  StructMember("minimum", false, (short)-1,  false,(TypeCode) rti.monitoring.DiscreteVariableTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("maximum", false, (short)-1,  false,(TypeCode) rti.monitoring.DiscreteVariableTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("variance", false, (short)-1,  false,(TypeCode) TypeCode.TC_DOUBLE,3 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("rti::monitoring::DiscreteVariableStatistics",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

