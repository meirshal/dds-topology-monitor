

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

public class Locator_t   implements Copyable, Serializable{

    public int kind= 0;
    public int port= 0;
    public byte [] address=  new byte [(DDSMonitoring.LOCATOR_ADDRESS_LENGTH_MAX.VALUE)];
    public ShortSeq encapsulations =  new ShortSeq(8);

    public Locator_t() {

    }
    public Locator_t (Locator_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Locator_t self;
        self = new  Locator_t();
        self.clear();
        return self;

    }

    public void clear() {

        kind= 0;
        port= 0;
        for(int i1__ = 0; i1__< (DDSMonitoring.LOCATOR_ADDRESS_LENGTH_MAX.VALUE); ++i1__){

            address[i1__] =  0;
        }

        if (encapsulations != null) {
            encapsulations.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Locator_t otherObj = (Locator_t)o;

        if(kind != otherObj.kind) {
            return false;
        }
        if(port != otherObj.port) {
            return false;
        }
        for(int i1__ = 0; i1__< (DDSMonitoring.LOCATOR_ADDRESS_LENGTH_MAX.VALUE); ++i1__){

            if(address[i1__] != otherObj.address[i1__]) {
                return false;
            }
        }

        if(!encapsulations.equals(otherObj.encapsulations)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)kind;
        __result += (int)port;
        for(int i1__ = 0; i1__< (DDSMonitoring.LOCATOR_ADDRESS_LENGTH_MAX.VALUE); ++i1__){

            __result += (int)address[i1__];
        }

        __result += encapsulations.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>Locator_tTypeSupport</code>
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

        Locator_t typedSrc = (Locator_t) src;
        Locator_t typedDst = this;

        typedDst.kind = typedSrc.kind;
        typedDst.port = typedSrc.port;
        System.arraycopy(typedSrc.address,0,
        typedDst.address,0,
        typedSrc.address.length); 

        typedDst.encapsulations.copy_from(typedSrc.encapsulations);

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
        strBuffer.append("kind: ").append(kind).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("port: ").append(port).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);
        strBuffer.append("address: ");
        for(int i1__ = 0; i1__< (DDSMonitoring.LOCATOR_ADDRESS_LENGTH_MAX.VALUE); ++i1__){

            strBuffer.append(address[i1__]).append(", ");
        }

        strBuffer.append("\n");
        CdrHelper.printIndent(strBuffer, indent+1);
        strBuffer.append("encapsulations: ");
        for(int i__ = 0; i__ < encapsulations.size(); ++i__) {
            if (i__!=0) strBuffer.append(", ");
            strBuffer.append(encapsulations.get(i__));
        }
        strBuffer.append("\n"); 

        return strBuffer.toString();
    }

}
