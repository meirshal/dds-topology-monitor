

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

public class ServiceQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.ServiceQosPolicyKind kind = (DDSMonitoring.ServiceQosPolicyKind)DDSMonitoring.ServiceQosPolicyKind.create();

    public ServiceQosPolicy() {

    }
    public ServiceQosPolicy (ServiceQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ServiceQosPolicy self;
        self = new  ServiceQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        kind = DDSMonitoring.ServiceQosPolicyKind.create();
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ServiceQosPolicy otherObj = (ServiceQosPolicy)o;

        if(!kind.equals(otherObj.kind)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += kind.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ServiceQosPolicyTypeSupport</code>
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

        ServiceQosPolicy typedSrc = (ServiceQosPolicy) src;
        ServiceQosPolicy typedDst = this;

        typedDst.kind = (DDSMonitoring.ServiceQosPolicyKind) typedDst.kind.copy_from(typedSrc.kind);

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

        return strBuffer.toString();
    }

}
