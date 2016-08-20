

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

public class TransportMulticastMapping_t   implements Copyable, Serializable{

    public String addresses=  "" ; /* maximum length = ((DDSMonitoring.TRANSPORT_MULICAST_MAPPING_STRING_MAX_LENGTH.VALUE)) */
    public String topic_expression=  "" ; /* maximum length = ((DDSMonitoring.TRANSPORT_MULICAST_MAPPING_STRING_MAX_LENGTH.VALUE)) */
    public DDSMonitoring.TransportMulticastMappingFunction_t mapping_function = (DDSMonitoring.TransportMulticastMappingFunction_t)DDSMonitoring.TransportMulticastMappingFunction_t.create();

    public TransportMulticastMapping_t() {

    }
    public TransportMulticastMapping_t (TransportMulticastMapping_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        TransportMulticastMapping_t self;
        self = new  TransportMulticastMapping_t();
        return self;

    }

    public void clear() {

        addresses=  ""; 
        topic_expression=  ""; 
        if (mapping_function != null) {
            mapping_function.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        TransportMulticastMapping_t otherObj = (TransportMulticastMapping_t)o;

        if(!addresses.equals(otherObj.addresses)) {
            return false;
        }
        if(!topic_expression.equals(otherObj.topic_expression)) {
            return false;
        }
        if(!mapping_function.equals(otherObj.mapping_function)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += addresses.hashCode(); 
        __result += topic_expression.hashCode(); 
        __result += mapping_function.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>TransportMulticastMapping_tTypeSupport</code>
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

        TransportMulticastMapping_t typedSrc = (TransportMulticastMapping_t) src;
        TransportMulticastMapping_t typedDst = this;

        typedDst.addresses = typedSrc.addresses;
        typedDst.topic_expression = typedSrc.topic_expression;
        typedDst.mapping_function = (DDSMonitoring.TransportMulticastMappingFunction_t) typedDst.mapping_function.copy_from(typedSrc.mapping_function);

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
        strBuffer.append("addresses: ").append(addresses).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("topic_expression: ").append(topic_expression).append("\n");  
        strBuffer.append(mapping_function.toString("mapping_function ", indent+1));

        return strBuffer.toString();
    }

}
