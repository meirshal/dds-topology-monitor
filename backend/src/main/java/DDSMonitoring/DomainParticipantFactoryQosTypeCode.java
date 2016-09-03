
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DomainParticipantFactoryQosTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[3];

        sm[__i]=new  StructMember("entity_factory", false, (short)-1,  false,(TypeCode) DDSMonitoring.EntityFactoryQosPolicyTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("resource_limits", false, (short)-1,  false,(TypeCode) DDSMonitoring.SystemResourceLimitsQosPolicyTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("profile", false, (short)-1,  false,(TypeCode) DDSMonitoring.ProfileQosPolicyTypeCode.VALUE,2 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DomainParticipantFactoryQos",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

