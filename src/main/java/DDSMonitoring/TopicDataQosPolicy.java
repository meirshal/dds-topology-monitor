

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

public class TopicDataQosPolicy   implements Copyable, Serializable{

    public ByteSeq value =  new ByteSeq(256);

    public TopicDataQosPolicy() {

    }
    public TopicDataQosPolicy (TopicDataQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        TopicDataQosPolicy self;
        self = new  TopicDataQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (value != null) {
            value.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        TopicDataQosPolicy otherObj = (TopicDataQosPolicy)o;

        if(!value.equals(otherObj.value)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += value.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>TopicDataQosPolicyTypeSupport</code>
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

        TopicDataQosPolicy typedSrc = (TopicDataQosPolicy) src;
        TopicDataQosPolicy typedDst = this;

        typedDst.value.copy_from(typedSrc.value);

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
        strBuffer.append("value: ");
        for(int i__ = 0; i__ < value.size(); ++i__) {
            if (i__!=0) strBuffer.append(", ");
            strBuffer.append(value.get(i__));
        }
        strBuffer.append("\n"); 

        return strBuffer.toString();
    }

}
