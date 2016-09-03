

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

public class PublishModeQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.PublishModeQosPolicyKind kind = (DDSMonitoring.PublishModeQosPolicyKind)DDSMonitoring.PublishModeQosPolicyKind.create();
    public String flow_controller_name=  "" ; /* maximum length = (255) */
    public int priority= 0;

    public PublishModeQosPolicy() {

    }
    public PublishModeQosPolicy (PublishModeQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        PublishModeQosPolicy self;
        self = new  PublishModeQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        kind = DDSMonitoring.PublishModeQosPolicyKind.create();
        flow_controller_name=  ""; 
        priority= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        PublishModeQosPolicy otherObj = (PublishModeQosPolicy)o;

        if(!kind.equals(otherObj.kind)) {
            return false;
        }
        if(!flow_controller_name.equals(otherObj.flow_controller_name)) {
            return false;
        }
        if(priority != otherObj.priority) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += kind.hashCode(); 
        __result += flow_controller_name.hashCode(); 
        __result += (int)priority;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>PublishModeQosPolicyTypeSupport</code>
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

        PublishModeQosPolicy typedSrc = (PublishModeQosPolicy) src;
        PublishModeQosPolicy typedDst = this;

        typedDst.kind = (DDSMonitoring.PublishModeQosPolicyKind) typedDst.kind.copy_from(typedSrc.kind);
        typedDst.flow_controller_name = typedSrc.flow_controller_name;
        typedDst.priority = typedSrc.priority;

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
        strBuffer.append("flow_controller_name: ").append(flow_controller_name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("priority: ").append(priority).append("\n");  

        return strBuffer.toString();
    }

}
