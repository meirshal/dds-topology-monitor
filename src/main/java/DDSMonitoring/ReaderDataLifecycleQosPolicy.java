

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

public class ReaderDataLifecycleQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.Duration_t autopurge_nowriter_samples_delay = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t autopurge_disposed_samples_delay = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t autopurge_disposed_instances_delay = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();

    public ReaderDataLifecycleQosPolicy() {

    }
    public ReaderDataLifecycleQosPolicy (ReaderDataLifecycleQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ReaderDataLifecycleQosPolicy self;
        self = new  ReaderDataLifecycleQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (autopurge_nowriter_samples_delay != null) {
            autopurge_nowriter_samples_delay.clear();
        }
        if (autopurge_disposed_samples_delay != null) {
            autopurge_disposed_samples_delay.clear();
        }
        if (autopurge_disposed_instances_delay != null) {
            autopurge_disposed_instances_delay.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ReaderDataLifecycleQosPolicy otherObj = (ReaderDataLifecycleQosPolicy)o;

        if(!autopurge_nowriter_samples_delay.equals(otherObj.autopurge_nowriter_samples_delay)) {
            return false;
        }
        if(!autopurge_disposed_samples_delay.equals(otherObj.autopurge_disposed_samples_delay)) {
            return false;
        }
        if(!autopurge_disposed_instances_delay.equals(otherObj.autopurge_disposed_instances_delay)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += autopurge_nowriter_samples_delay.hashCode(); 
        __result += autopurge_disposed_samples_delay.hashCode(); 
        __result += autopurge_disposed_instances_delay.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ReaderDataLifecycleQosPolicyTypeSupport</code>
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

        ReaderDataLifecycleQosPolicy typedSrc = (ReaderDataLifecycleQosPolicy) src;
        ReaderDataLifecycleQosPolicy typedDst = this;

        typedDst.autopurge_nowriter_samples_delay = (DDSMonitoring.Duration_t) typedDst.autopurge_nowriter_samples_delay.copy_from(typedSrc.autopurge_nowriter_samples_delay);
        typedDst.autopurge_disposed_samples_delay = (DDSMonitoring.Duration_t) typedDst.autopurge_disposed_samples_delay.copy_from(typedSrc.autopurge_disposed_samples_delay);
        typedDst.autopurge_disposed_instances_delay = (DDSMonitoring.Duration_t) typedDst.autopurge_disposed_instances_delay.copy_from(typedSrc.autopurge_disposed_instances_delay);

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

        strBuffer.append(autopurge_nowriter_samples_delay.toString("autopurge_nowriter_samples_delay ", indent+1));
        strBuffer.append(autopurge_disposed_samples_delay.toString("autopurge_disposed_samples_delay ", indent+1));
        strBuffer.append(autopurge_disposed_instances_delay.toString("autopurge_disposed_instances_delay ", indent+1));

        return strBuffer.toString();
    }

}
