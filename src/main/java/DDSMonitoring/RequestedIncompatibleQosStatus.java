

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

public class RequestedIncompatibleQosStatus   implements Copyable, Serializable{

    public int total_count= 0;
    public int total_count_change= 0;
    public int last_policy_id= 0;
    public DDSMonitoring.QosPolicyCountSeq policies =  new DDSMonitoring.QosPolicyCountSeq(64);

    public RequestedIncompatibleQosStatus() {

    }
    public RequestedIncompatibleQosStatus (RequestedIncompatibleQosStatus other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        RequestedIncompatibleQosStatus self;
        self = new  RequestedIncompatibleQosStatus();
        self.clear();
        return self;

    }

    public void clear() {

        total_count= 0;
        total_count_change= 0;
        last_policy_id= 0;
        if (policies != null) {
            policies.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        RequestedIncompatibleQosStatus otherObj = (RequestedIncompatibleQosStatus)o;

        if(total_count != otherObj.total_count) {
            return false;
        }
        if(total_count_change != otherObj.total_count_change) {
            return false;
        }
        if(last_policy_id != otherObj.last_policy_id) {
            return false;
        }
        if(!policies.equals(otherObj.policies)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)total_count;
        __result += (int)total_count_change;
        __result += (int)last_policy_id;
        __result += policies.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>RequestedIncompatibleQosStatusTypeSupport</code>
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

        RequestedIncompatibleQosStatus typedSrc = (RequestedIncompatibleQosStatus) src;
        RequestedIncompatibleQosStatus typedDst = this;

        typedDst.total_count = typedSrc.total_count;
        typedDst.total_count_change = typedSrc.total_count_change;
        typedDst.last_policy_id = typedSrc.last_policy_id;
        typedDst.policies.copy_from(typedSrc.policies);

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
        strBuffer.append("total_count: ").append(total_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("total_count_change: ").append(total_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("last_policy_id: ").append(last_policy_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);
        strBuffer.append("policies:\n");
        for(int i__ = 0; i__ < policies.size(); ++i__) {
            strBuffer.append(((DDSMonitoring.QosPolicyCount)policies.get(i__)).toString(Integer.toString(i__),indent+2));
        }

        return strBuffer.toString();
    }

}
