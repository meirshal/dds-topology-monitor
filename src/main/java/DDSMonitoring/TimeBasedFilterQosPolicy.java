

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

public class TimeBasedFilterQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.Duration_t minimum_separation = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();

    public TimeBasedFilterQosPolicy() {

    }
    public TimeBasedFilterQosPolicy (TimeBasedFilterQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        TimeBasedFilterQosPolicy self;
        self = new  TimeBasedFilterQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (minimum_separation != null) {
            minimum_separation.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        TimeBasedFilterQosPolicy otherObj = (TimeBasedFilterQosPolicy)o;

        if(!minimum_separation.equals(otherObj.minimum_separation)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += minimum_separation.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>TimeBasedFilterQosPolicyTypeSupport</code>
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

        TimeBasedFilterQosPolicy typedSrc = (TimeBasedFilterQosPolicy) src;
        TimeBasedFilterQosPolicy typedDst = this;

        typedDst.minimum_separation = (DDSMonitoring.Duration_t) typedDst.minimum_separation.copy_from(typedSrc.minimum_separation);

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

        strBuffer.append(minimum_separation.toString("minimum_separation ", indent+1));

        return strBuffer.toString();
    }

}
