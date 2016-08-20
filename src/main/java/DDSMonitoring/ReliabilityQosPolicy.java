

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

public class ReliabilityQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.ReliabilityQosPolicyKind kind = (DDSMonitoring.ReliabilityQosPolicyKind)DDSMonitoring.ReliabilityQosPolicyKind.create();
    public DDSMonitoring.Duration_t max_blocking_time = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.ReliabilityQosPolicyAcknowledgementModeKind acknowledgementKind = (DDSMonitoring.ReliabilityQosPolicyAcknowledgementModeKind)DDSMonitoring.ReliabilityQosPolicyAcknowledgementModeKind.create();

    public ReliabilityQosPolicy() {

    }
    public ReliabilityQosPolicy (ReliabilityQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ReliabilityQosPolicy self;
        self = new  ReliabilityQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        kind = DDSMonitoring.ReliabilityQosPolicyKind.create();
        if (max_blocking_time != null) {
            max_blocking_time.clear();
        }
        acknowledgementKind = DDSMonitoring.ReliabilityQosPolicyAcknowledgementModeKind.create();
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ReliabilityQosPolicy otherObj = (ReliabilityQosPolicy)o;

        if(!kind.equals(otherObj.kind)) {
            return false;
        }
        if(!max_blocking_time.equals(otherObj.max_blocking_time)) {
            return false;
        }
        if(!acknowledgementKind.equals(otherObj.acknowledgementKind)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += kind.hashCode(); 
        __result += max_blocking_time.hashCode(); 
        __result += acknowledgementKind.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ReliabilityQosPolicyTypeSupport</code>
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

        ReliabilityQosPolicy typedSrc = (ReliabilityQosPolicy) src;
        ReliabilityQosPolicy typedDst = this;

        typedDst.kind = (DDSMonitoring.ReliabilityQosPolicyKind) typedDst.kind.copy_from(typedSrc.kind);
        typedDst.max_blocking_time = (DDSMonitoring.Duration_t) typedDst.max_blocking_time.copy_from(typedSrc.max_blocking_time);
        typedDst.acknowledgementKind = (DDSMonitoring.ReliabilityQosPolicyAcknowledgementModeKind) typedDst.acknowledgementKind.copy_from(typedSrc.acknowledgementKind);

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

        strBuffer.append(kind.toString("kind ", indent+1));
        strBuffer.append(max_blocking_time.toString("max_blocking_time ", indent+1));
        strBuffer.append(acknowledgementKind.toString("acknowledgementKind ", indent+1));

        return strBuffer.toString();
    }

}
