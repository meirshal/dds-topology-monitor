

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

public class LivelinessQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.LivelinessQosPolicyKind kind = (DDSMonitoring.LivelinessQosPolicyKind)DDSMonitoring.LivelinessQosPolicyKind.create();
    public DDSMonitoring.Duration_t lease_duration = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public int assertions_per_lease_duration= 0;

    public LivelinessQosPolicy() {

    }
    public LivelinessQosPolicy (LivelinessQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        LivelinessQosPolicy self;
        self = new  LivelinessQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        kind = DDSMonitoring.LivelinessQosPolicyKind.create();
        if (lease_duration != null) {
            lease_duration.clear();
        }
        assertions_per_lease_duration= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        LivelinessQosPolicy otherObj = (LivelinessQosPolicy)o;

        if(!kind.equals(otherObj.kind)) {
            return false;
        }
        if(!lease_duration.equals(otherObj.lease_duration)) {
            return false;
        }
        if(assertions_per_lease_duration != otherObj.assertions_per_lease_duration) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += kind.hashCode(); 
        __result += lease_duration.hashCode(); 
        __result += (int)assertions_per_lease_duration;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>LivelinessQosPolicyTypeSupport</code>
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

        LivelinessQosPolicy typedSrc = (LivelinessQosPolicy) src;
        LivelinessQosPolicy typedDst = this;

        typedDst.kind = (DDSMonitoring.LivelinessQosPolicyKind) typedDst.kind.copy_from(typedSrc.kind);
        typedDst.lease_duration = (DDSMonitoring.Duration_t) typedDst.lease_duration.copy_from(typedSrc.lease_duration);
        typedDst.assertions_per_lease_duration = typedSrc.assertions_per_lease_duration;

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
        strBuffer.append(lease_duration.toString("lease_duration ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("assertions_per_lease_duration: ").append(assertions_per_lease_duration).append("\n");  

        return strBuffer.toString();
    }

}
