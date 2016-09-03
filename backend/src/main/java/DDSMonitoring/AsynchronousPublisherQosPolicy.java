

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

public class AsynchronousPublisherQosPolicy   implements Copyable, Serializable{

    public boolean disable_asynchronous_write= false;
    public DDSMonitoring.ThreadSettings_t thread = (DDSMonitoring.ThreadSettings_t)DDSMonitoring.ThreadSettings_t.create();
    public boolean disable_asynchronous_batch= false;
    public DDSMonitoring.ThreadSettings_t asynchronous_batch_thread = (DDSMonitoring.ThreadSettings_t)DDSMonitoring.ThreadSettings_t.create();
    public DDSMonitoring.ThreadBlockingKind asynchronous_batch_blocking_kind = (DDSMonitoring.ThreadBlockingKind)DDSMonitoring.ThreadBlockingKind.create();

    public AsynchronousPublisherQosPolicy() {

    }
    public AsynchronousPublisherQosPolicy (AsynchronousPublisherQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        AsynchronousPublisherQosPolicy self;
        self = new  AsynchronousPublisherQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        disable_asynchronous_write= false;
        if (thread != null) {
            thread.clear();
        }
        disable_asynchronous_batch= false;
        if (asynchronous_batch_thread != null) {
            asynchronous_batch_thread.clear();
        }
        asynchronous_batch_blocking_kind = DDSMonitoring.ThreadBlockingKind.create();
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        AsynchronousPublisherQosPolicy otherObj = (AsynchronousPublisherQosPolicy)o;

        if(disable_asynchronous_write != otherObj.disable_asynchronous_write) {
            return false;
        }
        if(!thread.equals(otherObj.thread)) {
            return false;
        }
        if(disable_asynchronous_batch != otherObj.disable_asynchronous_batch) {
            return false;
        }
        if(!asynchronous_batch_thread.equals(otherObj.asynchronous_batch_thread)) {
            return false;
        }
        if(!asynchronous_batch_blocking_kind.equals(otherObj.asynchronous_batch_blocking_kind)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (disable_asynchronous_write == true)?1:0;
        __result += thread.hashCode(); 
        __result += (disable_asynchronous_batch == true)?1:0;
        __result += asynchronous_batch_thread.hashCode(); 
        __result += asynchronous_batch_blocking_kind.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>AsynchronousPublisherQosPolicyTypeSupport</code>
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

        AsynchronousPublisherQosPolicy typedSrc = (AsynchronousPublisherQosPolicy) src;
        AsynchronousPublisherQosPolicy typedDst = this;

        typedDst.disable_asynchronous_write = typedSrc.disable_asynchronous_write;
        typedDst.thread = (DDSMonitoring.ThreadSettings_t) typedDst.thread.copy_from(typedSrc.thread);
        typedDst.disable_asynchronous_batch = typedSrc.disable_asynchronous_batch;
        typedDst.asynchronous_batch_thread = (DDSMonitoring.ThreadSettings_t) typedDst.asynchronous_batch_thread.copy_from(typedSrc.asynchronous_batch_thread);
        typedDst.asynchronous_batch_blocking_kind = (DDSMonitoring.ThreadBlockingKind) typedDst.asynchronous_batch_blocking_kind.copy_from(typedSrc.asynchronous_batch_blocking_kind);

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
        strBuffer.append("disable_asynchronous_write: ").append(disable_asynchronous_write).append("\n");  
        strBuffer.append(thread.toString("thread ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("disable_asynchronous_batch: ").append(disable_asynchronous_batch).append("\n");  
        strBuffer.append(asynchronous_batch_thread.toString("asynchronous_batch_thread ", indent+1));
        strBuffer.append(asynchronous_batch_blocking_kind.toString("asynchronous_batch_blocking_kind ", indent+1));

        return strBuffer.toString();
    }

}
