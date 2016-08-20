

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

public class TransportSelectionQosPolicy   implements Copyable, Serializable{

    public StringSeq enabled_transports =  new StringSeq(128);

    public TransportSelectionQosPolicy() {

    }
    public TransportSelectionQosPolicy (TransportSelectionQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        TransportSelectionQosPolicy self;
        self = new  TransportSelectionQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (enabled_transports != null) {
            enabled_transports.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        TransportSelectionQosPolicy otherObj = (TransportSelectionQosPolicy)o;

        if(!enabled_transports.equals(otherObj.enabled_transports)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += enabled_transports.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>TransportSelectionQosPolicyTypeSupport</code>
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

        TransportSelectionQosPolicy typedSrc = (TransportSelectionQosPolicy) src;
        TransportSelectionQosPolicy typedDst = this;

        typedDst.enabled_transports.copy_from(typedSrc.enabled_transports);

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
        strBuffer.append("enabled_transports: ");
        for(int i__ = 0; i__ < enabled_transports.size(); ++i__) {
            if (i__!=0) strBuffer.append(", ");
            strBuffer.append(enabled_transports.get(i__));
        }
        strBuffer.append("\n"); 

        return strBuffer.toString();
    }

}
