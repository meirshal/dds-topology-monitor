

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

public class Property_t   implements Copyable, Serializable{

    public String name=  "" ; /* maximum length = (127) */
    public String value=  "" ; /* maximum length = (511) */
    public boolean propagate= false;

    public Property_t() {

    }
    public Property_t (Property_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Property_t self;
        self = new  Property_t();
        return self;

    }

    public void clear() {

        name=  ""; 
        value=  ""; 
        propagate= false;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Property_t otherObj = (Property_t)o;

        if(!name.equals(otherObj.name)) {
            return false;
        }
        if(!value.equals(otherObj.value)) {
            return false;
        }
        if(propagate != otherObj.propagate) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += name.hashCode(); 
        __result += value.hashCode(); 
        __result += (propagate == true)?1:0;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>Property_tTypeSupport</code>
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

        Property_t typedSrc = (Property_t) src;
        Property_t typedDst = this;

        typedDst.name = typedSrc.name;
        typedDst.value = typedSrc.value;
        typedDst.propagate = typedSrc.propagate;

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
        strBuffer.append("name: ").append(name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("value: ").append(value).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("propagate: ").append(propagate).append("\n");  

        return strBuffer.toString();
    }

}
