

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

public class DataWriterResourceLimitsQosPolicy   implements Copyable, Serializable{

    public int initial_concurrent_blocking_threads= 0;
    public int max_concurrent_blocking_threads= 0;
    public int max_remote_reader_filters= 0;
    public int initial_batches= 0;
    public int max_batches= 0;
    public int cookie_max_length= 0;
    public DDSMonitoring.DataWriterResourceLimitsInstanceReplacementKind instance_replacement = (DDSMonitoring.DataWriterResourceLimitsInstanceReplacementKind)DDSMonitoring.DataWriterResourceLimitsInstanceReplacementKind.create();
    public boolean replace_empty_instances= false;
    public boolean autoregister_instances= false;
    public int initial_virtual_writers= 0;
    public int max_virtual_writers= 0;
    public int max_remote_readers= 0;
    public int max_app_ack_remote_readers= 0;

    public DataWriterResourceLimitsQosPolicy() {

    }
    public DataWriterResourceLimitsQosPolicy (DataWriterResourceLimitsQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataWriterResourceLimitsQosPolicy self;
        self = new  DataWriterResourceLimitsQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        initial_concurrent_blocking_threads= 0;
        max_concurrent_blocking_threads= 0;
        max_remote_reader_filters= 0;
        initial_batches= 0;
        max_batches= 0;
        cookie_max_length= 0;
        instance_replacement = DDSMonitoring.DataWriterResourceLimitsInstanceReplacementKind.create();
        replace_empty_instances= false;
        autoregister_instances= false;
        initial_virtual_writers= 0;
        max_virtual_writers= 0;
        max_remote_readers= 0;
        max_app_ack_remote_readers= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataWriterResourceLimitsQosPolicy otherObj = (DataWriterResourceLimitsQosPolicy)o;

        if(initial_concurrent_blocking_threads != otherObj.initial_concurrent_blocking_threads) {
            return false;
        }
        if(max_concurrent_blocking_threads != otherObj.max_concurrent_blocking_threads) {
            return false;
        }
        if(max_remote_reader_filters != otherObj.max_remote_reader_filters) {
            return false;
        }
        if(initial_batches != otherObj.initial_batches) {
            return false;
        }
        if(max_batches != otherObj.max_batches) {
            return false;
        }
        if(cookie_max_length != otherObj.cookie_max_length) {
            return false;
        }
        if(!instance_replacement.equals(otherObj.instance_replacement)) {
            return false;
        }
        if(replace_empty_instances != otherObj.replace_empty_instances) {
            return false;
        }
        if(autoregister_instances != otherObj.autoregister_instances) {
            return false;
        }
        if(initial_virtual_writers != otherObj.initial_virtual_writers) {
            return false;
        }
        if(max_virtual_writers != otherObj.max_virtual_writers) {
            return false;
        }
        if(max_remote_readers != otherObj.max_remote_readers) {
            return false;
        }
        if(max_app_ack_remote_readers != otherObj.max_app_ack_remote_readers) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)initial_concurrent_blocking_threads;
        __result += (int)max_concurrent_blocking_threads;
        __result += (int)max_remote_reader_filters;
        __result += (int)initial_batches;
        __result += (int)max_batches;
        __result += (int)cookie_max_length;
        __result += instance_replacement.hashCode(); 
        __result += (replace_empty_instances == true)?1:0;
        __result += (autoregister_instances == true)?1:0;
        __result += (int)initial_virtual_writers;
        __result += (int)max_virtual_writers;
        __result += (int)max_remote_readers;
        __result += (int)max_app_ack_remote_readers;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataWriterResourceLimitsQosPolicyTypeSupport</code>
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

        DataWriterResourceLimitsQosPolicy typedSrc = (DataWriterResourceLimitsQosPolicy) src;
        DataWriterResourceLimitsQosPolicy typedDst = this;

        typedDst.initial_concurrent_blocking_threads = typedSrc.initial_concurrent_blocking_threads;
        typedDst.max_concurrent_blocking_threads = typedSrc.max_concurrent_blocking_threads;
        typedDst.max_remote_reader_filters = typedSrc.max_remote_reader_filters;
        typedDst.initial_batches = typedSrc.initial_batches;
        typedDst.max_batches = typedSrc.max_batches;
        typedDst.cookie_max_length = typedSrc.cookie_max_length;
        typedDst.instance_replacement = (DDSMonitoring.DataWriterResourceLimitsInstanceReplacementKind) typedDst.instance_replacement.copy_from(typedSrc.instance_replacement);
        typedDst.replace_empty_instances = typedSrc.replace_empty_instances;
        typedDst.autoregister_instances = typedSrc.autoregister_instances;
        typedDst.initial_virtual_writers = typedSrc.initial_virtual_writers;
        typedDst.max_virtual_writers = typedSrc.max_virtual_writers;
        typedDst.max_remote_readers = typedSrc.max_remote_readers;
        typedDst.max_app_ack_remote_readers = typedSrc.max_app_ack_remote_readers;

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
        strBuffer.append("initial_concurrent_blocking_threads: ").append(initial_concurrent_blocking_threads).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_concurrent_blocking_threads: ").append(max_concurrent_blocking_threads).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_remote_reader_filters: ").append(max_remote_reader_filters).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_batches: ").append(initial_batches).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_batches: ").append(max_batches).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("cookie_max_length: ").append(cookie_max_length).append("\n");  
        strBuffer.append(instance_replacement.toString("instance_replacement ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("replace_empty_instances: ").append(replace_empty_instances).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("autoregister_instances: ").append(autoregister_instances).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_virtual_writers: ").append(initial_virtual_writers).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_virtual_writers: ").append(max_virtual_writers).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_remote_readers: ").append(max_remote_readers).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_app_ack_remote_readers: ").append(max_app_ack_remote_readers).append("\n");  

        return strBuffer.toString();
    }

}
