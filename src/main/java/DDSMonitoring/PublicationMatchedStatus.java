

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

public class PublicationMatchedStatus   implements Copyable, Serializable{

    public int total_count= 0;
    public int total_count_change= 0;
    public int current_count= 0;
    public int current_count_peak= 0;
    public int current_count_change= 0;
    public DDSMonitoring.RTIInstanceHandle last_subscription_handle = (DDSMonitoring.RTIInstanceHandle)DDSMonitoring.RTIInstanceHandle.create();

    public PublicationMatchedStatus() {

    }
    public PublicationMatchedStatus (PublicationMatchedStatus other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        PublicationMatchedStatus self;
        self = new  PublicationMatchedStatus();
        self.clear();
        return self;

    }

    public void clear() {

        total_count= 0;
        total_count_change= 0;
        current_count= 0;
        current_count_peak= 0;
        current_count_change= 0;
        if (last_subscription_handle != null) {
            last_subscription_handle.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        PublicationMatchedStatus otherObj = (PublicationMatchedStatus)o;

        if(total_count != otherObj.total_count) {
            return false;
        }
        if(total_count_change != otherObj.total_count_change) {
            return false;
        }
        if(current_count != otherObj.current_count) {
            return false;
        }
        if(current_count_peak != otherObj.current_count_peak) {
            return false;
        }
        if(current_count_change != otherObj.current_count_change) {
            return false;
        }
        if(!last_subscription_handle.equals(otherObj.last_subscription_handle)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)total_count;
        __result += (int)total_count_change;
        __result += (int)current_count;
        __result += (int)current_count_peak;
        __result += (int)current_count_change;
        __result += last_subscription_handle.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>PublicationMatchedStatusTypeSupport</code>
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

        PublicationMatchedStatus typedSrc = (PublicationMatchedStatus) src;
        PublicationMatchedStatus typedDst = this;

        typedDst.total_count = typedSrc.total_count;
        typedDst.total_count_change = typedSrc.total_count_change;
        typedDst.current_count = typedSrc.current_count;
        typedDst.current_count_peak = typedSrc.current_count_peak;
        typedDst.current_count_change = typedSrc.current_count_change;
        typedDst.last_subscription_handle = (DDSMonitoring.RTIInstanceHandle) typedDst.last_subscription_handle.copy_from(typedSrc.last_subscription_handle);

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
        strBuffer.append("total_count: ").append(total_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("total_count_change: ").append(total_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("current_count: ").append(current_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("current_count_peak: ").append(current_count_peak).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("current_count_change: ").append(current_count_change).append("\n");  
        strBuffer.append(last_subscription_handle.toString("last_subscription_handle ", indent+1));

        return strBuffer.toString();
    }

}
