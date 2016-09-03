

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

public class QosPolicyCount   implements Copyable, Serializable{

    public int policy_id= 0;
    public int count= 0;

    public QosPolicyCount() {

    }
    public QosPolicyCount (QosPolicyCount other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        QosPolicyCount self;
        self = new  QosPolicyCount();
        return self;

    }

    public void clear() {

        policy_id= 0;
        count= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        QosPolicyCount otherObj = (QosPolicyCount)o;

        if(policy_id != otherObj.policy_id) {
            return false;
        }
        if(count != otherObj.count) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)policy_id;
        __result += (int)count;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>QosPolicyCountTypeSupport</code>
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

        QosPolicyCount typedSrc = (QosPolicyCount) src;
        QosPolicyCount typedDst = this;

        typedDst.policy_id = typedSrc.policy_id;
        typedDst.count = typedSrc.count;

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
        strBuffer.append("policy_id: ").append(policy_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("count: ").append(count).append("\n");  

        return strBuffer.toString();
    }

}
