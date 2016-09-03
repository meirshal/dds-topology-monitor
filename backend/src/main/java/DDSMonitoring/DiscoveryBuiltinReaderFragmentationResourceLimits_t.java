

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

public class DiscoveryBuiltinReaderFragmentationResourceLimits_t   implements Copyable, Serializable{

    public boolean disable_fragmentation_support= false;
    public int max_fragmented_samples= 0;
    public int initial_fragmented_samples= 0;
    public int max_fragmented_samples_per_remote_writer= 0;
    public int max_fragments_per_sample= 0;
    public boolean dynamically_allocate_fragmented_samples= false;

    public DiscoveryBuiltinReaderFragmentationResourceLimits_t() {

    }
    public DiscoveryBuiltinReaderFragmentationResourceLimits_t (DiscoveryBuiltinReaderFragmentationResourceLimits_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DiscoveryBuiltinReaderFragmentationResourceLimits_t self;
        self = new  DiscoveryBuiltinReaderFragmentationResourceLimits_t();
        self.clear();
        return self;

    }

    public void clear() {

        disable_fragmentation_support= false;
        max_fragmented_samples= 0;
        initial_fragmented_samples= 0;
        max_fragmented_samples_per_remote_writer= 0;
        max_fragments_per_sample= 0;
        dynamically_allocate_fragmented_samples= false;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DiscoveryBuiltinReaderFragmentationResourceLimits_t otherObj = (DiscoveryBuiltinReaderFragmentationResourceLimits_t)o;

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

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (disable_fragmentation_support == true)?1:0;
        __result += (int)max_fragmented_samples;
        __result += (int)initial_fragmented_samples;
        __result += (int)max_fragmented_samples_per_remote_writer;
        __result += (int)max_fragments_per_sample;
        __result += (dynamically_allocate_fragmented_samples == true)?1:0;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DiscoveryBuiltinReaderFragmentationResourceLimits_tTypeSupport</code>
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

        DiscoveryBuiltinReaderFragmentationResourceLimits_t typedSrc = (DiscoveryBuiltinReaderFragmentationResourceLimits_t) src;
        DiscoveryBuiltinReaderFragmentationResourceLimits_t typedDst = this;

        typedDst.disable_fragmentation_support = typedSrc.disable_fragmentation_support;
        typedDst.max_fragmented_samples = typedSrc.max_fragmented_samples;
        typedDst.initial_fragmented_samples = typedSrc.initial_fragmented_samples;
        typedDst.max_fragmented_samples_per_remote_writer = typedSrc.max_fragmented_samples_per_remote_writer;
        typedDst.max_fragments_per_sample = typedSrc.max_fragments_per_sample;
        typedDst.dynamically_allocate_fragmented_samples = typedSrc.dynamically_allocate_fragmented_samples;

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

        return strBuffer.toString();
    }

}
