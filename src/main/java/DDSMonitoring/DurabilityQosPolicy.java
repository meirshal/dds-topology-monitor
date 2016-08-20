

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

public class DurabilityQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.DurabilityQosPolicyKind kind = (DDSMonitoring.DurabilityQosPolicyKind)DDSMonitoring.DurabilityQosPolicyKind.create();
    public boolean direct_communication= false;

    public DurabilityQosPolicy() {

    }
    public DurabilityQosPolicy (DurabilityQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DurabilityQosPolicy self;
        self = new  DurabilityQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        kind = DDSMonitoring.DurabilityQosPolicyKind.create();
        direct_communication= false;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DurabilityQosPolicy otherObj = (DurabilityQosPolicy)o;

        if(!kind.equals(otherObj.kind)) {
            return false;
        }
        if(direct_communication != otherObj.direct_communication) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += kind.hashCode(); 
        __result += (direct_communication == true)?1:0;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DurabilityQosPolicyTypeSupport</code>
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

        DurabilityQosPolicy typedSrc = (DurabilityQosPolicy) src;
        DurabilityQosPolicy typedDst = this;

        typedDst.kind = (DDSMonitoring.DurabilityQosPolicyKind) typedDst.kind.copy_from(typedSrc.kind);
        typedDst.direct_communication = typedSrc.direct_communication;

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
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("direct_communication: ").append(direct_communication).append("\n");  

        return strBuffer.toString();
    }

}
