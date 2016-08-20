

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

public class ReceiverPoolQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.ThreadSettings_t thread = (DDSMonitoring.ThreadSettings_t)DDSMonitoring.ThreadSettings_t.create();
    public int initial_receive_threads= 0;
    public int max_receive_threads= 0;
    public int buffer_size= 0;
    public int buffer_alignment= 0;
    public boolean is_timestamp_enabled= false;

    public ReceiverPoolQosPolicy() {

    }
    public ReceiverPoolQosPolicy (ReceiverPoolQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ReceiverPoolQosPolicy self;
        self = new  ReceiverPoolQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (thread != null) {
            thread.clear();
        }
        initial_receive_threads= 0;
        max_receive_threads= 0;
        buffer_size= 0;
        buffer_alignment= 0;
        is_timestamp_enabled= false;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ReceiverPoolQosPolicy otherObj = (ReceiverPoolQosPolicy)o;

        if(!thread.equals(otherObj.thread)) {
            return false;
        }
        if(initial_receive_threads != otherObj.initial_receive_threads) {
            return false;
        }
        if(max_receive_threads != otherObj.max_receive_threads) {
            return false;
        }
        if(buffer_size != otherObj.buffer_size) {
            return false;
        }
        if(buffer_alignment != otherObj.buffer_alignment) {
            return false;
        }
        if(is_timestamp_enabled != otherObj.is_timestamp_enabled) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += thread.hashCode(); 
        __result += (int)initial_receive_threads;
        __result += (int)max_receive_threads;
        __result += (int)buffer_size;
        __result += (int)buffer_alignment;
        __result += (is_timestamp_enabled == true)?1:0;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ReceiverPoolQosPolicyTypeSupport</code>
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

        ReceiverPoolQosPolicy typedSrc = (ReceiverPoolQosPolicy) src;
        ReceiverPoolQosPolicy typedDst = this;

        typedDst.thread = (DDSMonitoring.ThreadSettings_t) typedDst.thread.copy_from(typedSrc.thread);
        typedDst.initial_receive_threads = typedSrc.initial_receive_threads;
        typedDst.max_receive_threads = typedSrc.max_receive_threads;
        typedDst.buffer_size = typedSrc.buffer_size;
        typedDst.buffer_alignment = typedSrc.buffer_alignment;
        typedDst.is_timestamp_enabled = typedSrc.is_timestamp_enabled;

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

        strBuffer.append(thread.toString("thread ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_receive_threads: ").append(initial_receive_threads).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_receive_threads: ").append(max_receive_threads).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("buffer_size: ").append(buffer_size).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("buffer_alignment: ").append(buffer_alignment).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("is_timestamp_enabled: ").append(is_timestamp_enabled).append("\n");  

        return strBuffer.toString();
    }

}
