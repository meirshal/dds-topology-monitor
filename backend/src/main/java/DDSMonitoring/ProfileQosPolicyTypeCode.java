
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  ProfileQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[6];

        sm[__i]=new  StructMember("string_profile", false, (short)-1,  false,(TypeCode) new TypeCode(256, new TypeCode(TCKind.TK_STRING,2000)),0 , false);__i++;
        sm[__i]=new  StructMember("url_profile", false, (short)-1,  false,(TypeCode) new TypeCode(256, new TypeCode(TCKind.TK_STRING,255)),1 , false);__i++;
        sm[__i]=new  StructMember("ignore_user_profile", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,2 , false);__i++;
        sm[__i]=new  StructMember("ignore_environment_profile", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,3 , false);__i++;
        sm[__i]=new  StructMember("ignore_resource_profile", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,4 , false);__i++;
        sm[__i]=new  StructMember("string_profile_dtd", false, (short)-1,  false,(TypeCode) new TypeCode(256, new TypeCode(TCKind.TK_STRING,2000)),5 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::ProfileQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

