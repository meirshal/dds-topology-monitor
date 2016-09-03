

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

public class ProductVersion_t   implements Copyable, Serializable{

    public char major= 0;
    public char minor= 0;
    public char release= 0;
    public char revision= 0;

    public ProductVersion_t() {

    }
    public ProductVersion_t (ProductVersion_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ProductVersion_t self;
        self = new  ProductVersion_t();
        self.clear();
        return self;

    }

    public void clear() {

        major= 0;
        minor= 0;
        release= 0;
        revision= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ProductVersion_t otherObj = (ProductVersion_t)o;

        if(major != otherObj.major) {
            return false;
        }
        if(minor != otherObj.minor) {
            return false;
        }
        if(release != otherObj.release) {
            return false;
        }
        if(revision != otherObj.revision) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)major;
        __result += (int)minor;
        __result += (int)release;
        __result += (int)revision;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ProductVersion_tTypeSupport</code>
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

        ProductVersion_t typedSrc = (ProductVersion_t) src;
        ProductVersion_t typedDst = this;

        typedDst.major = typedSrc.major;
        typedDst.minor = typedSrc.minor;
        typedDst.release = typedSrc.release;
        typedDst.revision = typedSrc.revision;

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
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("release: ").append(release).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("revision: ").append(revision).append("\n");  

        return strBuffer.toString();
    }

}
