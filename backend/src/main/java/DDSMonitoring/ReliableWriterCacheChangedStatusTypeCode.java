
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.typecode.*;

public class  ReliableWriterCacheChangedStatusTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[6];

        sm[__i]=new  StructMember("empty_reliable_writer_cache", false, (short)-1,  false,(TypeCode) DDSMonitoring.ReliableWriterCacheEventCountTypeCode.VALUE,0 , false);__i++;
        sm[__i]=new  StructMember("full_reliable_writer_cache", false, (short)-1,  false,(TypeCode) DDSMonitoring.ReliableWriterCacheEventCountTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("low_watermark_reliable_writer_cache", false, (short)-1,  false,(TypeCode) DDSMonitoring.ReliableWriterCacheEventCountTypeCode.VALUE,2 , false);__i++;
        sm[__i]=new  StructMember("high_watermark_reliable_writer_cache", false, (short)-1,  false,(TypeCode) DDSMonitoring.ReliableWriterCacheEventCountTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("unacknowledged_sample_count", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,4 , false);__i++;
        sm[__i]=new  StructMember("unacknowledged_sample_count_peak", false, (short)-1,  false,(TypeCode) TypeCode.TC_LONG,5 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("DDSMonitoring::ReliableWriterCacheChangedStatus",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

