
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  AsynchronousPublisherQosPolicyTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[5];

        sm[__i]=new  StructMember("disable_asynchronous_write", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,0 , false);__i++;
        sm[__i]=new  StructMember("thread", false, (short)-1,  false,(TypeCode) DDSMonitoring.ThreadSettings_tTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("disable_asynchronous_batch", false, (short)-1,  false,(TypeCode) TypeCode.TC_BOOLEAN,2 , false);__i++;
        sm[__i]=new  StructMember("asynchronous_batch_thread", false, (short)-1,  false,(TypeCode) DDSMonitoring.ThreadSettings_tTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("asynchronous_batch_blocking_kind", false, (short)-1,  false,(TypeCode) DDSMonitoring.ThreadBlockingKindTypeCode.VALUE,4 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::AsynchronousPublisherQosPolicy",ExtensibilityKind.MUTABLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

