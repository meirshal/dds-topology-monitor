

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

public class SequenceNumber_t   implements Copyable, Serializable{

    public int high= 0;
    public int low= 0;

    public SequenceNumber_t() {

    }
    public SequenceNumber_t (SequenceNumber_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        SequenceNumber_t self;
        self = new  SequenceNumber_t();
        return self;

    }

    public void clear() {

        high= 0;
        low= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        SequenceNumber_t otherObj = (SequenceNumber_t)o;

        if(high != otherObj.high) {
            return false;
        }
        if(low != otherObj.low) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)high;
        __result += (int)low;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>SequenceNumber_tTypeSupport</code>
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

        SequenceNumber_t typedSrc = (SequenceNumber_t) src;
        SequenceNumber_t typedDst = this;

        typedDst.high = typedSrc.high;
        typedDst.low = typedSrc.low;

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
        strBuffer.append("high: ").append(high).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("low: ").append(low).append("\n");  

        return strBuffer.toString();
    }

}
