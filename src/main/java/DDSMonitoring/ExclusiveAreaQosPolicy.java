

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

public class ExclusiveAreaQosPolicy   implements Copyable, Serializable{

    public boolean use_shared_exclusive_area= false;
    public int level= 0;

    public ExclusiveAreaQosPolicy() {

    }
    public ExclusiveAreaQosPolicy (ExclusiveAreaQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ExclusiveAreaQosPolicy self;
        self = new  ExclusiveAreaQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        use_shared_exclusive_area= false;
        level= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ExclusiveAreaQosPolicy otherObj = (ExclusiveAreaQosPolicy)o;

        if(use_shared_exclusive_area != otherObj.use_shared_exclusive_area) {
            return false;
        }
        if(level != otherObj.level) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (use_shared_exclusive_area == true)?1:0;
        __result += (int)level;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ExclusiveAreaQosPolicyTypeSupport</code>
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

        ExclusiveAreaQosPolicy typedSrc = (ExclusiveAreaQosPolicy) src;
        ExclusiveAreaQosPolicy typedDst = this;

        typedDst.use_shared_exclusive_area = typedSrc.use_shared_exclusive_area;
        typedDst.level = typedSrc.level;

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
        strBuffer.append("use_shared_exclusive_area: ").append(use_shared_exclusive_area).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("level: ").append(level).append("\n");  

        return strBuffer.toString();
    }

}
