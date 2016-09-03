

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

public class EventQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.ThreadSettings_t thread = (DDSMonitoring.ThreadSettings_t)DDSMonitoring.ThreadSettings_t.create();
    public int initial_count= 0;
    public int max_count= 0;

    public EventQosPolicy() {

    }
    public EventQosPolicy (EventQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        EventQosPolicy self;
        self = new  EventQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (thread != null) {
            thread.clear();
        }
        initial_count= 0;
        max_count= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        EventQosPolicy otherObj = (EventQosPolicy)o;

        if(!thread.equals(otherObj.thread)) {
            return false;
        }
        if(initial_count != otherObj.initial_count) {
            return false;
        }
        if(max_count != otherObj.max_count) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += thread.hashCode(); 
        __result += (int)initial_count;
        __result += (int)max_count;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>EventQosPolicyTypeSupport</code>
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

        EventQosPolicy typedSrc = (EventQosPolicy) src;
        EventQosPolicy typedDst = this;

        typedDst.thread = (DDSMonitoring.ThreadSettings_t) typedDst.thread.copy_from(typedSrc.thread);
        typedDst.initial_count = typedSrc.initial_count;
        typedDst.max_count = typedSrc.max_count;

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
        strBuffer.append("initial_count: ").append(initial_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_count: ").append(max_count).append("\n");  

        return strBuffer.toString();
    }

}
