

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

public class SampleLostStatus   implements Copyable, Serializable{

    public int total_count= 0;
    public int total_count_change= 0;
    public DDSMonitoring.SampleLostStatusKind last_reason = (DDSMonitoring.SampleLostStatusKind)DDSMonitoring.SampleLostStatusKind.create();

    public SampleLostStatus() {

    }
    public SampleLostStatus (SampleLostStatus other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        SampleLostStatus self;
        self = new  SampleLostStatus();
        self.clear();
        return self;

    }

    public void clear() {

        total_count= 0;
        total_count_change= 0;
        last_reason = DDSMonitoring.SampleLostStatusKind.create();
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        SampleLostStatus otherObj = (SampleLostStatus)o;

        if(total_count != otherObj.total_count) {
            return false;
        }
        if(total_count_change != otherObj.total_count_change) {
            return false;
        }
        if(!last_reason.equals(otherObj.last_reason)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)total_count;
        __result += (int)total_count_change;
        __result += last_reason.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>SampleLostStatusTypeSupport</code>
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

        SampleLostStatus typedSrc = (SampleLostStatus) src;
        SampleLostStatus typedDst = this;

        typedDst.total_count = typedSrc.total_count;
        typedDst.total_count_change = typedSrc.total_count_change;
        typedDst.last_reason = (DDSMonitoring.SampleLostStatusKind) typedDst.last_reason.copy_from(typedSrc.last_reason);

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
        strBuffer.append(last_reason.toString("last_reason ", indent+1));

        return strBuffer.toString();
    }

}
