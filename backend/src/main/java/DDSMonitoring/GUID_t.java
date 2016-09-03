

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

public class GUID_t   implements Copyable, Serializable{

    public byte [] value=  new byte [16];

    public GUID_t() {

    }
    public GUID_t (GUID_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        GUID_t self;
        self = new  GUID_t();
        return self;

    }

    public void clear() {

        for(int i1__ = 0; i1__< 16; ++i1__){

            value[i1__] =  0;
        }

    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        GUID_t otherObj = (GUID_t)o;

        for(int i1__ = 0; i1__< 16; ++i1__){

            if(value[i1__] != otherObj.value[i1__]) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        for(int i1__ = 0; i1__< 16; ++i1__){

            __result += (int)value[i1__];
        }

        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>GUID_tTypeSupport</code>
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

        GUID_t typedSrc = (GUID_t) src;
        GUID_t typedDst = this;

        System.arraycopy(typedSrc.value,0,
        typedDst.value,0,
        typedSrc.value.length); 

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
        for(int i1__ = 0; i1__< 16; ++i1__){

            strBuffer.append(value[i1__]).append(", ");
        }

        strBuffer.append("\n");

        return strBuffer.toString();
    }

}
