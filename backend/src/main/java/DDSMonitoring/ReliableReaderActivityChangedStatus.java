

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

public class ReliableReaderActivityChangedStatus   implements Copyable, Serializable{

    public int active_count= 0;
    public int inactive_count= 0;
    public int active_count_change= 0;
    public int inactive_count_change= 0;
    public DDSMonitoring.RTIInstanceHandle last_instance_handle = (DDSMonitoring.RTIInstanceHandle)DDSMonitoring.RTIInstanceHandle.create();

    public ReliableReaderActivityChangedStatus() {

    }
    public ReliableReaderActivityChangedStatus (ReliableReaderActivityChangedStatus other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ReliableReaderActivityChangedStatus self;
        self = new  ReliableReaderActivityChangedStatus();
        self.clear();
        return self;

    }

    public void clear() {

        active_count= 0;
        inactive_count= 0;
        active_count_change= 0;
        inactive_count_change= 0;
        if (last_instance_handle != null) {
            last_instance_handle.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ReliableReaderActivityChangedStatus otherObj = (ReliableReaderActivityChangedStatus)o;

        if(active_count != otherObj.active_count) {
            return false;
        }
        if(inactive_count != otherObj.inactive_count) {
            return false;
        }
        if(active_count_change != otherObj.active_count_change) {
            return false;
        }
        if(inactive_count_change != otherObj.inactive_count_change) {
            return false;
        }
        if(!last_instance_handle.equals(otherObj.last_instance_handle)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)active_count;
        __result += (int)inactive_count;
        __result += (int)active_count_change;
        __result += (int)inactive_count_change;
        __result += last_instance_handle.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ReliableReaderActivityChangedStatusTypeSupport</code>
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

        ReliableReaderActivityChangedStatus typedSrc = (ReliableReaderActivityChangedStatus) src;
        ReliableReaderActivityChangedStatus typedDst = this;

        typedDst.active_count = typedSrc.active_count;
        typedDst.inactive_count = typedSrc.inactive_count;
        typedDst.active_count_change = typedSrc.active_count_change;
        typedDst.inactive_count_change = typedSrc.inactive_count_change;
        typedDst.last_instance_handle = (DDSMonitoring.RTIInstanceHandle) typedDst.last_instance_handle.copy_from(typedSrc.last_instance_handle);

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
        strBuffer.append("active_count: ").append(active_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("inactive_count: ").append(inactive_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("active_count_change: ").append(active_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("inactive_count_change: ").append(inactive_count_change).append("\n");  
        strBuffer.append(last_instance_handle.toString("last_instance_handle ", indent+1));

        return strBuffer.toString();
    }

}
