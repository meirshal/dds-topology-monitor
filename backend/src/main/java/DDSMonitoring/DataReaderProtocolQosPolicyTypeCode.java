
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DataReaderProtocolQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[8];

        sm[__i]=new  StructMember("virtual_guid", false, (short)-1,  false,(TypeCode) DDSMonitoring.GUID_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("rtps_object_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,1 , false);__i++;
        sm[__i]=new  StructMember("expects_inline_qos", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,2 , false);__i++;
        sm[__i]=new  StructMember("disable_positive_acks", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,3 , false);__i++;
        sm[__i]=new  StructMember("propagate_dispose_of_unregistered_instances", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,4 , false);__i++;
        sm[__i]=new  StructMember("rtps_reliable_reader", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsReliableReaderProtocol_tTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("vendor_specific_entity", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,6 , false);__i++;
        sm[__i]=new  StructMember("propagate_unregister_of_disposed_instances", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,7 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DataReaderProtocolQosPolicy",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

