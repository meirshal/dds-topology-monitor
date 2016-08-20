
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DataWriterProtocolQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[10];

        sm[__i]=new  StructMember("virtual_guid", false, (short)-1,  false,(TypeCode) DDSMonitoring.GUID_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("rtps_object_id", false, (short)-1,  false,(TypeCode) TypeCode.TC_ULONG,1 , false);__i++;
        sm[__i]=new  StructMember("push_on_write", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,2 , false);__i++;
        sm[__i]=new  StructMember("disable_positive_acks", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,3 , false);__i++;
        sm[__i]=new  StructMember("disable_inline_keyhash", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,4 , false);__i++;
        sm[__i]=new  StructMember("serialize_key_with_dispose", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,5 , false);__i++;
        sm[__i]=new  StructMember("propagate_app_ack_with_no_response", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,9 , false);__i++;
        sm[__i]=new  StructMember("rtps_reliable_writer", false, (short)-1,  false,(TypeCode) DDSMonitoring.RtpsReliableWriterProtocol_tTypeCode.VALUE,6 , false);__i++;
        sm[__i]=new  StructMember("initial_virtual_sequence_number", false, (short)-1,  false,(TypeCode) DDSMonitoring.SequenceNumber_tTypeCode.VALUE,7 , false);__i++;
        sm[__i]=new  StructMember("vendor_specific_entity", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,8 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DataWriterProtocolQosPolicy",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

