

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

public class DestinationOrderQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.DestinationOrderQosPolicyKind kind = (DDSMonitoring.DestinationOrderQosPolicyKind)DDSMonitoring.DestinationOrderQosPolicyKind.create();
    public DDSMonitoring.DestinationOrderQosPolicyScopeKind scope = (DDSMonitoring.DestinationOrderQosPolicyScopeKind)DDSMonitoring.DestinationOrderQosPolicyScopeKind.create();
    public DDSMonitoring.Duration_t source_timestamp_tolerance = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();

    public DestinationOrderQosPolicy() {

    }
    public DestinationOrderQosPolicy (DestinationOrderQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DestinationOrderQosPolicy self;
        self = new  DestinationOrderQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        kind = DDSMonitoring.DestinationOrderQosPolicyKind.create();
        scope = DDSMonitoring.DestinationOrderQosPolicyScopeKind.create();
        if (source_timestamp_tolerance != null) {
            source_timestamp_tolerance.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DestinationOrderQosPolicy otherObj = (DestinationOrderQosPolicy)o;

        if(!kind.equals(otherObj.kind)) {
            return false;
        }
        if(!scope.equals(otherObj.scope)) {
            return false;
        }
        if(!source_timestamp_tolerance.equals(otherObj.source_timestamp_tolerance)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += kind.hashCode(); 
        __result += scope.hashCode(); 
        __result += source_timestamp_tolerance.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DestinationOrderQosPolicyTypeSupport</code>
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

        DestinationOrderQosPolicy typedSrc = (DestinationOrderQosPolicy) src;
        DestinationOrderQosPolicy typedDst = this;

        typedDst.kind = (DDSMonitoring.DestinationOrderQosPolicyKind) typedDst.kind.copy_from(typedSrc.kind);
        typedDst.scope = (DDSMonitoring.DestinationOrderQosPolicyScopeKind) typedDst.scope.copy_from(typedSrc.scope);
        typedDst.source_timestamp_tolerance = (DDSMonitoring.Duration_t) typedDst.source_timestamp_tolerance.copy_from(typedSrc.source_timestamp_tolerance);

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
        strBuffer.append(scope.toString("scope ", indent+1));
        strBuffer.append(source_timestamp_tolerance.toString("source_timestamp_tolerance ", indent+1));

        return strBuffer.toString();
    }

}
