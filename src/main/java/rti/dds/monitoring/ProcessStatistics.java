

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rti.dds.monitoring;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class ProcessStatistics   implements Copyable, Serializable{

    public DDSMonitoring.Duration_t user_cpu_time = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t user_cpu_time_change = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t kernel_cpu_time = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t kernel_cpu_time_change = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public long physical_memory_bytes= 0;
    public long total_memory_bytes= 0;

    public ProcessStatistics() {

    }
    public ProcessStatistics (ProcessStatistics other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ProcessStatistics self;
        self = new  ProcessStatistics();
        self.clear();
        return self;

    }

    public void clear() {

        if (user_cpu_time != null) {
            user_cpu_time.clear();
        }
        if (user_cpu_time_change != null) {
            user_cpu_time_change.clear();
        }
        if (kernel_cpu_time != null) {
            kernel_cpu_time.clear();
        }
        if (kernel_cpu_time_change != null) {
            kernel_cpu_time_change.clear();
        }
        physical_memory_bytes= 0;
        total_memory_bytes= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ProcessStatistics otherObj = (ProcessStatistics)o;

        if(!user_cpu_time.equals(otherObj.user_cpu_time)) {
            return false;
        }
        if(!user_cpu_time_change.equals(otherObj.user_cpu_time_change)) {
            return false;
        }
        if(!kernel_cpu_time.equals(otherObj.kernel_cpu_time)) {
            return false;
        }
        if(!kernel_cpu_time_change.equals(otherObj.kernel_cpu_time_change)) {
            return false;
        }
        if(physical_memory_bytes != otherObj.physical_memory_bytes) {
            return false;
        }
        if(total_memory_bytes != otherObj.total_memory_bytes) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += user_cpu_time.hashCode(); 
        __result += user_cpu_time_change.hashCode(); 
        __result += kernel_cpu_time.hashCode(); 
        __result += kernel_cpu_time_change.hashCode(); 
        __result += (int)physical_memory_bytes;
        __result += (int)total_memory_bytes;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ProcessStatisticsTypeSupport</code>
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

        ProcessStatistics typedSrc = (ProcessStatistics) src;
        ProcessStatistics typedDst = this;

        typedDst.user_cpu_time = (DDSMonitoring.Duration_t) typedDst.user_cpu_time.copy_from(typedSrc.user_cpu_time);
        typedDst.user_cpu_time_change = (DDSMonitoring.Duration_t) typedDst.user_cpu_time_change.copy_from(typedSrc.user_cpu_time_change);
        typedDst.kernel_cpu_time = (DDSMonitoring.Duration_t) typedDst.kernel_cpu_time.copy_from(typedSrc.kernel_cpu_time);
        typedDst.kernel_cpu_time_change = (DDSMonitoring.Duration_t) typedDst.kernel_cpu_time_change.copy_from(typedSrc.kernel_cpu_time_change);
        typedDst.physical_memory_bytes = typedSrc.physical_memory_bytes;
        typedDst.total_memory_bytes = typedSrc.total_memory_bytes;

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

        strBuffer.append(user_cpu_time.toString("user_cpu_time ", indent+1));
        strBuffer.append(user_cpu_time_change.toString("user_cpu_time_change ", indent+1));
        strBuffer.append(kernel_cpu_time.toString("kernel_cpu_time ", indent+1));
        strBuffer.append(kernel_cpu_time_change.toString("kernel_cpu_time_change ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("physical_memory_bytes: ").append(physical_memory_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("total_memory_bytes: ").append(total_memory_bytes).append("\n");  

        return strBuffer.toString();
    }

}
