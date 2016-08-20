

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

public class TransportMulticastQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.TransportMulticastSettings_tSeq value =  new DDSMonitoring.TransportMulticastSettings_tSeq(4);
    public DDSMonitoring.TransportMulticastQosPolicyKind kind = (DDSMonitoring.TransportMulticastQosPolicyKind)DDSMonitoring.TransportMulticastQosPolicyKind.create();

    public TransportMulticastQosPolicy() {

    }
    public TransportMulticastQosPolicy (TransportMulticastQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        TransportMulticastQosPolicy self;
        self = new  TransportMulticastQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (value != null) {
            value.clear();
        }
        kind = DDSMonitoring.TransportMulticastQosPolicyKind.create();
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        TransportMulticastQosPolicy otherObj = (TransportMulticastQosPolicy)o;

        if(!value.equals(otherObj.value)) {
            return false;
        }
        if(!kind.equals(otherObj.kind)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += value.hashCode(); 
        __result += kind.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>TransportMulticastQosPolicyTypeSupport</code>
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

        TransportMulticastQosPolicy typedSrc = (TransportMulticastQosPolicy) src;
        TransportMulticastQosPolicy typedDst = this;

        typedDst.value.copy_from(typedSrc.value);
        typedDst.kind = (DDSMonitoring.TransportMulticastQosPolicyKind) typedDst.kind.copy_from(typedSrc.kind);

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
        strBuffer.append("value:\n");
        for(int i__ = 0; i__ < value.size(); ++i__) {
            strBuffer.append(((DDSMonitoring.TransportMulticastSettings_t)value.get(i__)).toString(Integer.toString(i__),indent+2));
        }
        strBuffer.append(kind.toString("kind ", indent+1));

        return strBuffer.toString();
    }

}
