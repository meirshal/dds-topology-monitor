

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

public class TransportEncapsulationSettings_t   implements Copyable, Serializable{

    public StringSeq transports =  new StringSeq(128);
    public ShortSeq encapsulations =  new ShortSeq(8);

    public TransportEncapsulationSettings_t() {

    }
    public TransportEncapsulationSettings_t (TransportEncapsulationSettings_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        TransportEncapsulationSettings_t self;
        self = new  TransportEncapsulationSettings_t();
        return self;

    }

    public void clear() {

        if (transports != null) {
            transports.clear();
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

        TransportEncapsulationSettings_t otherObj = (TransportEncapsulationSettings_t)o;

        if(!transports.equals(otherObj.transports)) {
            return false;
        }
        if(!encapsulations.equals(otherObj.encapsulations)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += transports.hashCode(); 
        __result += encapsulations.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>TransportEncapsulationSettings_tTypeSupport</code>
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

        TransportEncapsulationSettings_t typedSrc = (TransportEncapsulationSettings_t) src;
        TransportEncapsulationSettings_t typedDst = this;

        typedDst.transports.copy_from(typedSrc.transports);
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
        strBuffer.append("transports: ");
        for(int i__ = 0; i__ < transports.size(); ++i__) {
            if (i__!=0) strBuffer.append(", ");
            strBuffer.append(transports.get(i__));
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
