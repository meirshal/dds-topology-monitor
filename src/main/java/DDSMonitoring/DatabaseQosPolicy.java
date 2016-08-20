

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

public class DatabaseQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.ThreadSettings_t thread = (DDSMonitoring.ThreadSettings_t)DDSMonitoring.ThreadSettings_t.create();
    public DDSMonitoring.Duration_t shutdown_timeout = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t cleanup_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t shutdown_cleanup_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public int initial_records= 0;
    public int max_skiplist_level= 0;
    public int table_allocation_block_size= 0;
    public int max_weak_references= 0;
    public int initial_weak_references= 0;

    public DatabaseQosPolicy() {

    }
    public DatabaseQosPolicy (DatabaseQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DatabaseQosPolicy self;
        self = new  DatabaseQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (thread != null) {
            thread.clear();
        }
        if (shutdown_timeout != null) {
            shutdown_timeout.clear();
        }
        if (cleanup_period != null) {
            cleanup_period.clear();
        }
        if (shutdown_cleanup_period != null) {
            shutdown_cleanup_period.clear();
        }
        initial_records= 0;
        max_skiplist_level= 0;
        table_allocation_block_size= 0;
        max_weak_references= 0;
        initial_weak_references= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DatabaseQosPolicy otherObj = (DatabaseQosPolicy)o;

        if(!thread.equals(otherObj.thread)) {
            return false;
        }
        if(!shutdown_timeout.equals(otherObj.shutdown_timeout)) {
            return false;
        }
        if(!cleanup_period.equals(otherObj.cleanup_period)) {
            return false;
        }
        if(!shutdown_cleanup_period.equals(otherObj.shutdown_cleanup_period)) {
            return false;
        }
        if(initial_records != otherObj.initial_records) {
            return false;
        }
        if(max_skiplist_level != otherObj.max_skiplist_level) {
            return false;
        }
        if(table_allocation_block_size != otherObj.table_allocation_block_size) {
            return false;
        }
        if(max_weak_references != otherObj.max_weak_references) {
            return false;
        }
        if(initial_weak_references != otherObj.initial_weak_references) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += thread.hashCode(); 
        __result += shutdown_timeout.hashCode(); 
        __result += cleanup_period.hashCode(); 
        __result += shutdown_cleanup_period.hashCode(); 
        __result += (int)initial_records;
        __result += (int)max_skiplist_level;
        __result += (int)table_allocation_block_size;
        __result += (int)max_weak_references;
        __result += (int)initial_weak_references;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DatabaseQosPolicyTypeSupport</code>
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

        DatabaseQosPolicy typedSrc = (DatabaseQosPolicy) src;
        DatabaseQosPolicy typedDst = this;

        typedDst.thread = (DDSMonitoring.ThreadSettings_t) typedDst.thread.copy_from(typedSrc.thread);
        typedDst.shutdown_timeout = (DDSMonitoring.Duration_t) typedDst.shutdown_timeout.copy_from(typedSrc.shutdown_timeout);
        typedDst.cleanup_period = (DDSMonitoring.Duration_t) typedDst.cleanup_period.copy_from(typedSrc.cleanup_period);
        typedDst.shutdown_cleanup_period = (DDSMonitoring.Duration_t) typedDst.shutdown_cleanup_period.copy_from(typedSrc.shutdown_cleanup_period);
        typedDst.initial_records = typedSrc.initial_records;
        typedDst.max_skiplist_level = typedSrc.max_skiplist_level;
        typedDst.table_allocation_block_size = typedSrc.table_allocation_block_size;
        typedDst.max_weak_references = typedSrc.max_weak_references;
        typedDst.initial_weak_references = typedSrc.initial_weak_references;

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
        strBuffer.append(shutdown_timeout.toString("shutdown_timeout ", indent+1));
        strBuffer.append(cleanup_period.toString("cleanup_period ", indent+1));
        strBuffer.append(shutdown_cleanup_period.toString("shutdown_cleanup_period ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_records: ").append(initial_records).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_skiplist_level: ").append(max_skiplist_level).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("table_allocation_block_size: ").append(table_allocation_block_size).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_weak_references: ").append(max_weak_references).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("initial_weak_references: ").append(initial_weak_references).append("\n");  

        return strBuffer.toString();
    }

}
