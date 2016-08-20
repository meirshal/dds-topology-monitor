
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  SampleInfoTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[19];

        sm[__i]=new  StructMember("sample_state", false, (short)-1,  false,(TypeCode) DDSMonitoring.SampleStateKindTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("view_state", false, (short)-1,  false,(TypeCode) DDSMonitoring.ViewStateKindTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("instance_state", false, (short)-1,  false,(TypeCode) DDSMonitoring.InstanceStateKindTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("source_timestamp", false, (short)-1,  false,(TypeCode) DDSMonitoring.Time_tTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("instance_handle", false, (short)-1,  false,(TypeCode) DDSMonitoring.InstanceHandle_tTypeCode.VALUE,4 , false);__i++;
        sm[__i]=new  StructMember("publication_handle", false, (short)-1,  false,(TypeCode) DDSMonitoring.InstanceHandle_tTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("disposed_generation_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,6 , false);__i++;
        sm[__i]=new  StructMember("no_writers_generation_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,7 , false);__i++;
        sm[__i]=new  StructMember("sample_rank", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,8 , false);__i++;
        sm[__i]=new  StructMember("generation_rank", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,9 , false);__i++;
        sm[__i]=new  StructMember("absolute_generation_rank", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,10 , false);__i++;
        sm[__i]=new  StructMember("valid_data", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,11 , false);__i++;
        sm[__i]=new  StructMember("reception_timestamp", false, (short)-1,  false,(TypeCode) DDSMonitoring.Time_tTypeCode.VALUE,12 , false);__i++;
        sm[__i]=new  StructMember("publication_sequence_number", false, (short)-1,  false,(TypeCode) DDSMonitoring.SequenceNumber_tTypeCode.VALUE,13 , false);__i++;
        sm[__i]=new  StructMember("reception_sequence_number", false, (short)-1,  false,(TypeCode) DDSMonitoring.SequenceNumber_tTypeCode.VALUE,14 , false);__i++;
        sm[__i]=new  StructMember("publication_virtual_guid", false, (short)-1,  false,(TypeCode) DDSMonitoring.GUID_tTypeCode.VALUE,15 , false);__i++;
        sm[__i]=new  StructMember("publication_virtual_sequence_number", false, (short)-1,  false,(TypeCode) DDSMonitoring.SequenceNumber_tTypeCode.VALUE,16 , false);__i++;
        sm[__i]=new  StructMember("original_publication_virtual_guid", false, (short)-1,  false,(TypeCode) DDSMonitoring.GUID_tTypeCode.VALUE,17 , false);__i++;
        sm[__i]=new  StructMember("original_publication_virtual_sequence_number", false, (short)-1,  false,(TypeCode) DDSMonitoring.SequenceNumber_tTypeCode.VALUE,18 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::SampleInfo",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

