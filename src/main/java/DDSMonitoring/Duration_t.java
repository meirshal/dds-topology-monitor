

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

public class Duration_t   implements Copyable, Serializable{

    public int sec= 0;
    public int nanosec= 0;

    public Duration_t() {

    }
    public Duration_t (Duration_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Duration_t self;
        self = new  Duration_t();
        return self;

    }

    public void clear() {

        sec= 0;
        nanosec= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Duration_t otherObj = (Duration_t)o;

        if(sec != otherObj.sec) {
            return false;
        }
        if(nanosec != otherObj.nanosec) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)sec;
        __result += (int)nanosec;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>Duration_tTypeSupport</code>
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

        Duration_t typedSrc = (Duration_t) src;
        Duration_t typedDst = this;

        typedDst.sec = typedSrc.sec;
        typedDst.nanosec = typedSrc.nanosec;

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
        strBuffer.append("sec: ").append(sec).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("nanosec: ").append(nanosec).append("\n");  

        return strBuffer.toString();
    }

}
