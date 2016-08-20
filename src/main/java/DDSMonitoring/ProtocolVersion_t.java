

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

public class ProtocolVersion_t   implements Copyable, Serializable{

    public byte major= 0;
    public byte minor= 0;

    public ProtocolVersion_t() {

    }
    public ProtocolVersion_t (ProtocolVersion_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ProtocolVersion_t self;
        self = new  ProtocolVersion_t();
        self.clear();
        return self;

    }

    public void clear() {

        major= 0;
        minor= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ProtocolVersion_t otherObj = (ProtocolVersion_t)o;

        if(major != otherObj.major) {
            return false;
        }
        if(minor != otherObj.minor) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)major;
        __result += (int)minor;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ProtocolVersion_tTypeSupport</code>
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

        ProtocolVersion_t typedSrc = (ProtocolVersion_t) src;
        ProtocolVersion_t typedDst = this;

        typedDst.major = typedSrc.major;
        typedDst.minor = typedSrc.minor;

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
        strBuffer.append("major: ").append(major).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("minor: ").append(minor).append("\n");  

        return strBuffer.toString();
    }

}
