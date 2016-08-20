

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

public class DeadlineQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.Duration_t period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();

    public DeadlineQosPolicy() {

    }
    public DeadlineQosPolicy (DeadlineQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DeadlineQosPolicy self;
        self = new  DeadlineQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (period != null) {
            period.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DeadlineQosPolicy otherObj = (DeadlineQosPolicy)o;

        if(!period.equals(otherObj.period)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += period.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DeadlineQosPolicyTypeSupport</code>
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

        DeadlineQosPolicy typedSrc = (DeadlineQosPolicy) src;
        DeadlineQosPolicy typedDst = this;

        typedDst.period = (DDSMonitoring.Duration_t) typedDst.period.copy_from(typedSrc.period);

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

        strBuffer.append(period.toString("period ", indent+1));

        return strBuffer.toString();
    }

}
