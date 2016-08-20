

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

public class ResourceLimitsQosPolicy   implements Copyable, Serializable{

    public int max_samples= 0;
    public int max_instances= 0;
    public int max_samples_per_instance= 0;
    public int initial_samples= 0;
    public int initial_instances= 0;
    public int instance_hash_buckets= 0;

    public ResourceLimitsQosPolicy() {

    }
    public ResourceLimitsQosPolicy (ResourceLimitsQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ResourceLimitsQosPolicy self;
        self = new  ResourceLimitsQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        max_samples= 0;
        max_instances= 0;
        max_samples_per_instance= 0;
        initial_samples= 0;
        initial_instances= 0;
        instance_hash_buckets= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ResourceLimitsQosPolicy otherObj = (ResourceLimitsQosPolicy)o;

        if(max_samples != otherObj.max_samples) {
            return false;
        }
        if(max_instances != otherObj.max_instances) {
            return false;
        }
        if(max_samples_per_instance != otherObj.max_samples_per_instance) {
            return false;
        }
        if(initial_samples != otherObj.initial_samples) {
            return false;
        }
        if(initial_instances != otherObj.initial_instances) {
            return false;
        }
        if(instance_hash_buckets != otherObj.instance_hash_buckets) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)max_samples;
        __result += (int)max_instances;
        __result += (int)max_samples_per_instance;
        __result += (int)initial_samples;
        __result += (int)initial_instances;
        __result += (int)instance_hash_buckets;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ResourceLimitsQosPolicyTypeSupport</code>
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

        ResourceLimitsQosPolicy typedSrc = (ResourceLimitsQosPolicy) src;
        ResourceLimitsQosPolicy typedDst = this;

        typedDst.max_samples = typedSrc.max_samples;
        typedDst.max_instances = typedSrc.max_instances;
        typedDst.max_samples_per_instance = typedSrc.max_samples_per_instance;
        typedDst.initial_samples = typedSrc.initial_samples;
        typedDst.initial_instances = typedSrc.initial_instances;
        typedDst.instance_hash_buckets = typedSrc.instance_hash_buckets;

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
        strBuffer.append("max_samples: ").append(max_samples).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_instances: ").append(max_instances).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_samples_per_instance: ").append(max_samples_per_instance).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_samples: ").append(initial_samples).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_instances: ").append(initial_instances).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("instance_hash_buckets: ").append(instance_hash_buckets).append("\n");  

        return strBuffer.toString();
    }

}
