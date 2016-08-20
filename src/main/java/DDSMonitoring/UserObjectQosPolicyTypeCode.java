
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  UserObjectQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[11];

        sm[__i]=new  StructMember("participant_user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectSettings_tTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("topic_user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectSettings_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("content_filtered_topic_user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectSettings_tTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("publisher_user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectSettings_tTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("data_writer_user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectSettings_tTypeCode.VALUE,4 , false);__i++;
        sm[__i]=new  StructMember("subscriber_user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectSettings_tTypeCode.VALUE,5 , false);__i++;
        sm[__i]=new  StructMember("data_reader_user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectSettings_tTypeCode.VALUE,6 , false);__i++;
        sm[__i]=new  StructMember("read_condition_user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectSettings_tTypeCode.VALUE,7 , false);__i++;
        sm[__i]=new  StructMember("query_condition_user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectSettings_tTypeCode.VALUE,8 , false);__i++;
        sm[__i]=new  StructMember("index_condition_user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectSettings_tTypeCode.VALUE,9 , false);__i++;
        sm[__i]=new  StructMember("flow_controller_user_object", false, (short)-1,  false,(TypeCode) DDSMonitoring.UserObjectSettings_tTypeCode.VALUE,10 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::UserObjectQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

