
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  DiscoveryQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[6];

        sm[__i]=new  StructMember("enabled_transports", false, (short)-1,  false,(TypeCode) new TypeCode(128, new TypeCode(TCKind.TK_STRING,128)),0 , false);__i++;
        sm[__i]=new  StructMember("initial_peers", false, (short)-1,  false,(TypeCode) new TypeCode(256, new TypeCode(TCKind.TK_STRING,60)),1 , false);__i++;
        sm[__i]=new  StructMember("multicast_receive_addresses", false, (short)-1,  false,(TypeCode) new TypeCode(4, new TypeCode(TCKind.TK_STRING,60)),2 , false);__i++;
        sm[__i]=new  StructMember("metatraffic_transport_priority", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,3 , false);__i++;
        sm[__i]=new  StructMember("accept_unknown_peers", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,4 , false);__i++;
        sm[__i]=new  StructMember("enable_endpoint_discovery", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,5 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::DiscoveryQosPolicy",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

