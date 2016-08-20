

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class ReliableWriterCacheChangedStatus   implements Copyable, Serializable{

    public DDSMonitoring.ReliableWriterCacheEventCount empty_reliable_writer_cache = (DDSMonitoring.ReliableWriterCacheEventCount)DDSMonitoring.ReliableWriterCacheEventCount.create();
    public DDSMonitoring.ReliableWriterCacheEventCount full_reliable_writer_cache = (DDSMonitoring.ReliableWriterCacheEventCount)DDSMonitoring.ReliableWriterCacheEventCount.create();
    public DDSMonitoring.ReliableWriterCacheEventCount low_watermark_reliable_writer_cache = (DDSMonitoring.ReliableWriterCacheEventCount)DDSMonitoring.ReliableWriterCacheEventCount.create();
    public DDSMonitoring.ReliableWriterCacheEventCount high_watermark_reliable_writer_cache = (DDSMonitoring.ReliableWriterCacheEventCount)DDSMonitoring.ReliableWriterCacheEventCount.create();
    public int unacknowledged_sample_count= 0;
    public int unacknowledged_sample_count_peak= 0;

    public ReliableWriterCacheChangedStatus() {

    }
    public ReliableWriterCacheChangedStatus (ReliableWriterCacheChangedStatus other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ReliableWriterCacheChangedStatus self;
        self = new  ReliableWriterCacheChangedStatus();
        self.clear();
        return self;

    }

    public void clear() {

        if (empty_reliable_writer_cache != null) {
            empty_reliable_writer_cache.clear();
        }
        if (full_reliable_writer_cache != null) {
            full_reliable_writer_cache.clear();
        }
        if (low_watermark_reliable_writer_cache != null) {
            low_watermark_reliable_writer_cache.clear();
        }
        if (high_watermark_reliable_writer_cache != null) {
            high_watermark_reliable_writer_cache.clear();
        }
        unacknowledged_sample_count= 0;
        unacknowledged_sample_count_peak= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ReliableWriterCacheChangedStatus otherObj = (ReliableWriterCacheChangedStatus)o;

        if(!empty_reliable_writer_cache.equals(otherObj.empty_reliable_writer_cache)) {
            return false;
        }
        if(!full_reliable_writer_cache.equals(otherObj.full_reliable_writer_cache)) {
            return false;
        }
        if(!low_watermark_reliable_writer_cache.equals(otherObj.low_watermark_reliable_writer_cache)) {
            return false;
        }
        if(!high_watermark_reliable_writer_cache.equals(otherObj.high_watermark_reliable_writer_cache)) {
            return false;
        }
        if(unacknowledged_sample_count != otherObj.unacknowledged_sample_count) {
            return false;
        }
        if(unacknowledged_sample_count_peak != otherObj.unacknowledged_sample_count_peak) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += empty_reliable_writer_cache.hashCode(); 
        __result += full_reliable_writer_cache.hashCode(); 
        __result += low_watermark_reliable_writer_cache.hashCode(); 
        __result += high_watermark_reliable_writer_cache.hashCode(); 
        __result += (int)unacknowledged_sample_count;
        __result += (int)unacknowledged_sample_count_peak;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ReliableWriterCacheChangedStatusTypeSupport</code>
    * rather than here by using the <code>-noCopyable</code> option
    * to rtiddsgen.
    * 
    * @param src The Object which contains the data to be copied.
    * @return Returns <code>this</code>.
    * @exception NullPointerException If <code>src</code> is null.
    * @exception ClassCastException If <code>src</code> is not the 
    * same type as <code>this</code>.
    * @see com.rti.dds.infrastructure.Copyable#copy_from(java.lang.Object)
    */
    public Object copy_from(Object src) {

        ReliableWriterCacheChangedStatus typedSrc = (ReliableWriterCacheChangedStatus) src;
        ReliableWriterCacheChangedStatus typedDst = this;

        typedDst.empty_reliable_writer_cache = (DDSMonitoring.ReliableWriterCacheEventCount) typedDst.empty_reliable_writer_cache.copy_from(typedSrc.empty_reliable_writer_cache);
        typedDst.full_reliable_writer_cache = (DDSMonitoring.ReliableWriterCacheEventCount) typedDst.full_reliable_writer_cache.copy_from(typedSrc.full_reliable_writer_cache);
        typedDst.low_watermark_reliable_writer_cache = (DDSMonitoring.ReliableWriterCacheEventCount) typedDst.low_watermark_reliable_writer_cache.copy_from(typedSrc.low_watermark_reliable_writer_cache);
        typedDst.high_watermark_reliable_writer_cache = (DDSMonitoring.ReliableWriterCacheEventCount) typedDst.high_watermark_reliable_writer_cache.copy_from(typedSrc.high_watermark_reliable_writer_cache);
        typedDst.unacknowledged_sample_count = typedSrc.unacknowledged_sample_count;
        typedDst.unacknowledged_sample_count_peak = typedSrc.unacknowledged_sample_count_peak;

        return this;
    }

    public String toString(){
        return toString("", 0);
    }

    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();        

        if (desc != null) {
            CdrHelper.printIndent(strBuffer, indent);
            strBuffer.append(desc).append(":\n");
        }

        strBuffer.append(empty_reliable_writer_cache.toString("empty_reliable_writer_cache ", indent+1));
        strBuffer.append(full_reliable_writer_cache.toString("full_reliable_writer_cache ", indent+1));
        strBuffer.append(low_watermark_reliable_writer_cache.toString("low_watermark_reliable_writer_cache ", indent+1));
        strBuffer.append(high_watermark_reliable_writer_cache.toString("high_watermark_reliable_writer_cache ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("unacknowledged_sample_count: ").append(unacknowledged_sample_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("unacknowledged_sample_count_peak: ").append(unacknowledged_sample_count_peak).append("\n");  

        return strBuffer.toString();
    }

}
