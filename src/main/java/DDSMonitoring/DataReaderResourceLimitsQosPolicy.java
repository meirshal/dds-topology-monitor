

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

public class DataReaderResourceLimitsQosPolicy   implements Copyable, Serializable{

    public int max_remote_writers= 0;
    public int max_remote_writers_per_instance= 0;
    public int max_samples_per_remote_writer= 0;
    public int max_infos= 0;
    public int initial_remote_writers= 0;
    public int initial_remote_writers_per_instance= 0;
    public int initial_infos= 0;
    public int initial_outstanding_reads= 0;
    public int max_outstanding_reads= 0;
    public int max_samples_per_read= 0;
    public boolean disable_fragmentation_support= false;
    public int max_fragmented_samples= 0;
    public int initial_fragmented_samples= 0;
    public int max_fragmented_samples_per_remote_writer= 0;
    public int max_fragments_per_sample= 0;
    public boolean dynamically_allocate_fragmented_samples= false;
    public int max_total_instances= 0;
    public int max_remote_virtual_writers= 0;
    public int intial_remote_virtual_writers= 0;
    public int max_remote_virtual_writers_per_instance= 0;
    public int initial_remote_virtual_writers_per_instance= 0;
    public int max_remote_writers_per_sample= 0;
    public int max_query_condition_filters= 0;
    public int max_app_ack_response_length= 0;
    public boolean keep_minimum_state_for_instances= false;

    public DataReaderResourceLimitsQosPolicy() {

    }
    public DataReaderResourceLimitsQosPolicy (DataReaderResourceLimitsQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataReaderResourceLimitsQosPolicy self;
        self = new  DataReaderResourceLimitsQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        max_remote_writers= 0;
        max_remote_writers_per_instance= 0;
        max_samples_per_remote_writer= 0;
        max_infos= 0;
        initial_remote_writers= 0;
        initial_remote_writers_per_instance= 0;
        initial_infos= 0;
        initial_outstanding_reads= 0;
        max_outstanding_reads= 0;
        max_samples_per_read= 0;
        disable_fragmentation_support= false;
        max_fragmented_samples= 0;
        initial_fragmented_samples= 0;
        max_fragmented_samples_per_remote_writer= 0;
        max_fragments_per_sample= 0;
        dynamically_allocate_fragmented_samples= false;
        max_total_instances= 0;
        max_remote_virtual_writers= 0;
        intial_remote_virtual_writers= 0;
        max_remote_virtual_writers_per_instance= 0;
        initial_remote_virtual_writers_per_instance= 0;
        max_remote_writers_per_sample= 0;
        max_query_condition_filters= 0;
        max_app_ack_response_length= 0;
        keep_minimum_state_for_instances= false;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataReaderResourceLimitsQosPolicy otherObj = (DataReaderResourceLimitsQosPolicy)o;

        if(max_remote_writers != otherObj.max_remote_writers) {
            return false;
        }
        if(max_remote_writers_per_instance != otherObj.max_remote_writers_per_instance) {
            return false;
        }
        if(max_samples_per_remote_writer != otherObj.max_samples_per_remote_writer) {
            return false;
        }
        if(max_infos != otherObj.max_infos) {
            return false;
        }
        if(initial_remote_writers != otherObj.initial_remote_writers) {
            return false;
        }
        if(initial_remote_writers_per_instance != otherObj.initial_remote_writers_per_instance) {
            return false;
        }
        if(initial_infos != otherObj.initial_infos) {
            return false;
        }
        if(initial_outstanding_reads != otherObj.initial_outstanding_reads) {
            return false;
        }
        if(max_outstanding_reads != otherObj.max_outstanding_reads) {
            return false;
        }
        if(max_samples_per_read != otherObj.max_samples_per_read) {
            return false;
        }
        if(disable_fragmentation_support != otherObj.disable_fragmentation_support) {
            return false;
        }
        if(max_fragmented_samples != otherObj.max_fragmented_samples) {
            return false;
        }
        if(initial_fragmented_samples != otherObj.initial_fragmented_samples) {
            return false;
        }
        if(max_fragmented_samples_per_remote_writer != otherObj.max_fragmented_samples_per_remote_writer) {
            return false;
        }
        if(max_fragments_per_sample != otherObj.max_fragments_per_sample) {
            return false;
        }
        if(dynamically_allocate_fragmented_samples != otherObj.dynamically_allocate_fragmented_samples) {
            return false;
        }
        if(max_total_instances != otherObj.max_total_instances) {
            return false;
        }
        if(max_remote_virtual_writers != otherObj.max_remote_virtual_writers) {
            return false;
        }
        if(intial_remote_virtual_writers != otherObj.intial_remote_virtual_writers) {
            return false;
        }
        if(max_remote_virtual_writers_per_instance != otherObj.max_remote_virtual_writers_per_instance) {
            return false;
        }
        if(initial_remote_virtual_writers_per_instance != otherObj.initial_remote_virtual_writers_per_instance) {
            return false;
        }
        if(max_remote_writers_per_sample != otherObj.max_remote_writers_per_sample) {
            return false;
        }
        if(max_query_condition_filters != otherObj.max_query_condition_filters) {
            return false;
        }
        if(max_app_ack_response_length != otherObj.max_app_ack_response_length) {
            return false;
        }
        if(keep_minimum_state_for_instances != otherObj.keep_minimum_state_for_instances) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)max_remote_writers;
        __result += (int)max_remote_writers_per_instance;
        __result += (int)max_samples_per_remote_writer;
        __result += (int)max_infos;
        __result += (int)initial_remote_writers;
        __result += (int)initial_remote_writers_per_instance;
        __result += (int)initial_infos;
        __result += (int)initial_outstanding_reads;
        __result += (int)max_outstanding_reads;
        __result += (int)max_samples_per_read;
        __result += (disable_fragmentation_support == true)?1:0;
        __result += (int)max_fragmented_samples;
        __result += (int)initial_fragmented_samples;
        __result += (int)max_fragmented_samples_per_remote_writer;
        __result += (int)max_fragments_per_sample;
        __result += (dynamically_allocate_fragmented_samples == true)?1:0;
        __result += (int)max_total_instances;
        __result += (int)max_remote_virtual_writers;
        __result += (int)intial_remote_virtual_writers;
        __result += (int)max_remote_virtual_writers_per_instance;
        __result += (int)initial_remote_virtual_writers_per_instance;
        __result += (int)max_remote_writers_per_sample;
        __result += (int)max_query_condition_filters;
        __result += (int)max_app_ack_response_length;
        __result += (keep_minimum_state_for_instances == true)?1:0;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataReaderResourceLimitsQosPolicyTypeSupport</code>
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

        DataReaderResourceLimitsQosPolicy typedSrc = (DataReaderResourceLimitsQosPolicy) src;
        DataReaderResourceLimitsQosPolicy typedDst = this;

        typedDst.max_remote_writers = typedSrc.max_remote_writers;
        typedDst.max_remote_writers_per_instance = typedSrc.max_remote_writers_per_instance;
        typedDst.max_samples_per_remote_writer = typedSrc.max_samples_per_remote_writer;
        typedDst.max_infos = typedSrc.max_infos;
        typedDst.initial_remote_writers = typedSrc.initial_remote_writers;
        typedDst.initial_remote_writers_per_instance = typedSrc.initial_remote_writers_per_instance;
        typedDst.initial_infos = typedSrc.initial_infos;
        typedDst.initial_outstanding_reads = typedSrc.initial_outstanding_reads;
        typedDst.max_outstanding_reads = typedSrc.max_outstanding_reads;
        typedDst.max_samples_per_read = typedSrc.max_samples_per_read;
        typedDst.disable_fragmentation_support = typedSrc.disable_fragmentation_support;
        typedDst.max_fragmented_samples = typedSrc.max_fragmented_samples;
        typedDst.initial_fragmented_samples = typedSrc.initial_fragmented_samples;
        typedDst.max_fragmented_samples_per_remote_writer = typedSrc.max_fragmented_samples_per_remote_writer;
        typedDst.max_fragments_per_sample = typedSrc.max_fragments_per_sample;
        typedDst.dynamically_allocate_fragmented_samples = typedSrc.dynamically_allocate_fragmented_samples;
        typedDst.max_total_instances = typedSrc.max_total_instances;
        typedDst.max_remote_virtual_writers = typedSrc.max_remote_virtual_writers;
        typedDst.intial_remote_virtual_writers = typedSrc.intial_remote_virtual_writers;
        typedDst.max_remote_virtual_writers_per_instance = typedSrc.max_remote_virtual_writers_per_instance;
        typedDst.initial_remote_virtual_writers_per_instance = typedSrc.initial_remote_virtual_writers_per_instance;
        typedDst.max_remote_writers_per_sample = typedSrc.max_remote_writers_per_sample;
        typedDst.max_query_condition_filters = typedSrc.max_query_condition_filters;
        typedDst.max_app_ack_response_length = typedSrc.max_app_ack_response_length;
        typedDst.keep_minimum_state_for_instances = typedSrc.keep_minimum_state_for_instances;

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
        strBuffer.append("max_remote_writers: ").append(max_remote_writers).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_remote_writers_per_instance: ").append(max_remote_writers_per_instance).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_samples_per_remote_writer: ").append(max_samples_per_remote_writer).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_infos: ").append(max_infos).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_remote_writers: ").append(initial_remote_writers).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_remote_writers_per_instance: ").append(initial_remote_writers_per_instance).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_infos: ").append(initial_infos).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_outstanding_reads: ").append(initial_outstanding_reads).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_outstanding_reads: ").append(max_outstanding_reads).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_samples_per_read: ").append(max_samples_per_read).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("disable_fragmentation_support: ").append(disable_fragmentation_support).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_fragmented_samples: ").append(max_fragmented_samples).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_fragmented_samples: ").append(initial_fragmented_samples).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_fragmented_samples_per_remote_writer: ").append(max_fragmented_samples_per_remote_writer).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_fragments_per_sample: ").append(max_fragments_per_sample).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("dynamically_allocate_fragmented_samples: ").append(dynamically_allocate_fragmented_samples).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_total_instances: ").append(max_total_instances).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_remote_virtual_writers: ").append(max_remote_virtual_writers).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("intial_remote_virtual_writers: ").append(intial_remote_virtual_writers).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_remote_virtual_writers_per_instance: ").append(max_remote_virtual_writers_per_instance).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_remote_virtual_writers_per_instance: ").append(initial_remote_virtual_writers_per_instance).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_remote_writers_per_sample: ").append(max_remote_writers_per_sample).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_query_condition_filters: ").append(max_query_condition_filters).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_app_ack_response_length: ").append(max_app_ack_response_length).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("keep_minimum_state_for_instances: ").append(keep_minimum_state_for_instances).append("\n");  

        return strBuffer.toString();
    }

}
