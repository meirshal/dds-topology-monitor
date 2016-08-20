

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

public class BatchQosPolicy   implements Copyable, Serializable{

    public boolean enable= false;
    public int max_data_bytes= 0;
    public int max_meta_data_bytes= 0;
    public int max_samples= 0;
    public DDSMonitoring.Duration_t max_flush_delay = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t source_timestamp_resolution = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public boolean thread_safe_write= false;

    public BatchQosPolicy() {

    }
    public BatchQosPolicy (BatchQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        BatchQosPolicy self;
        self = new  BatchQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        enable= false;
        max_data_bytes= 0;
        max_meta_data_bytes= 0;
        max_samples= 0;
        if (max_flush_delay != null) {
            max_flush_delay.clear();
        }
        if (source_timestamp_resolution != null) {
            source_timestamp_resolution.clear();
        }
        thread_safe_write= false;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        BatchQosPolicy otherObj = (BatchQosPolicy)o;

        if(enable != otherObj.enable) {
            return false;
        }
        if(max_data_bytes != otherObj.max_data_bytes) {
            return false;
        }
        if(max_meta_data_bytes != otherObj.max_meta_data_bytes) {
            return false;
        }
        if(max_samples != otherObj.max_samples) {
            return false;
        }
        if(!max_flush_delay.equals(otherObj.max_flush_delay)) {
            return false;
        }
        if(!source_timestamp_resolution.equals(otherObj.source_timestamp_resolution)) {
            return false;
        }
        if(thread_safe_write != otherObj.thread_safe_write) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (enable == true)?1:0;
        __result += (int)max_data_bytes;
        __result += (int)max_meta_data_bytes;
        __result += (int)max_samples;
        __result += max_flush_delay.hashCode(); 
        __result += source_timestamp_resolution.hashCode(); 
        __result += (thread_safe_write == true)?1:0;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>BatchQosPolicyTypeSupport</code>
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

        BatchQosPolicy typedSrc = (BatchQosPolicy) src;
        BatchQosPolicy typedDst = this;

        typedDst.enable = typedSrc.enable;
        typedDst.max_data_bytes = typedSrc.max_data_bytes;
        typedDst.max_meta_data_bytes = typedSrc.max_meta_data_bytes;
        typedDst.max_samples = typedSrc.max_samples;
        typedDst.max_flush_delay = (DDSMonitoring.Duration_t) typedDst.max_flush_delay.copy_from(typedSrc.max_flush_delay);
        typedDst.source_timestamp_resolution = (DDSMonitoring.Duration_t) typedDst.source_timestamp_resolution.copy_from(typedSrc.source_timestamp_resolution);
        typedDst.thread_safe_write = typedSrc.thread_safe_write;

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

        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("enable: ").append(enable).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_data_bytes: ").append(max_data_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_meta_data_bytes: ").append(max_meta_data_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_samples: ").append(max_samples).append("\n");  
        strBuffer.append(max_flush_delay.toString("max_flush_delay ", indent+1));
        strBuffer.append(source_timestamp_resolution.toString("source_timestamp_resolution ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("thread_safe_write: ").append(thread_safe_write).append("\n");  

        return strBuffer.toString();
    }

}
