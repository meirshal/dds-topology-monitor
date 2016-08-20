

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

public class EndpointGroup_t   implements Copyable, Serializable{

    public String role_name=  "" ; /* maximum length = (255) */
    public int quorum= 0;

    public EndpointGroup_t() {

    }
    public EndpointGroup_t (EndpointGroup_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        EndpointGroup_t self;
        self = new  EndpointGroup_t();
        return self;

    }

    public void clear() {

        role_name=  ""; 
        quorum= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        EndpointGroup_t otherObj = (EndpointGroup_t)o;

        if(!role_name.equals(otherObj.role_name)) {
            return false;
        }
        if(quorum != otherObj.quorum) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += role_name.hashCode(); 
        __result += (int)quorum;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>EndpointGroup_tTypeSupport</code>
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

        EndpointGroup_t typedSrc = (EndpointGroup_t) src;
        EndpointGroup_t typedDst = this;

        typedDst.role_name = typedSrc.role_name;
        typedDst.quorum = typedSrc.quorum;

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
        strBuffer.append("role_name: ").append(role_name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("quorum: ").append(quorum).append("\n");  

        return strBuffer.toString();
    }

}
