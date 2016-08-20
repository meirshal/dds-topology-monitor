
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  PublisherQosTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[8];

        sm[__i]=new  StructMember("presentation", false, (short)-1,  false,(TypeCode) DDSMonitoring.PresentationQosPolicyTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("partition", false, (short)-1,  false,(TypeCode) DDSMonitoring.PartitionQosPolicyTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("group_data", false, (short)-1,  false,(TypeCode) DDSMonitoring.GroupDataQosPolicyTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("entity_factory", false, (short)-1,  false,(TypeCode) DDSMonitoring.EntityFactoryQosPolicyTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("asynchronous_publisher", false, (short)-1,  false,(TypeCode) DDSMonitoring.AsynchronousPublisherQosPolicyTypeCode.VALUE,4 , false);__i++;
        sm[__i]=new  StructMember("exclusive_area", false, (short)-1,  false,(TypeCode) DDSMonitoring.ExclusiveAreaQosPolicyTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("protocol", false, (short)-1,  false,(TypeCode) DDSMonitoring.PublisherProtocolQosPolicyTypeCode.VALUE,6 , false);__i++;
        sm[__i]=new  StructMember("publisher_name", false, (short)-1,  false,(TypeCode) DDSMonitoring.EntityNameQosPolicyTypeCode.VALUE,7 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::PublisherQos",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

