

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

public class EntityFactoryQosPolicy   implements Copyable, Serializable{

    public boolean autoenable_created_entities= false;

    public EntityFactoryQosPolicy() {

    }
    public EntityFactoryQosPolicy (EntityFactoryQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        EntityFactoryQosPolicy self;
        self = new  EntityFactoryQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        autoenable_created_entities= false;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        EntityFactoryQosPolicy otherObj = (EntityFactoryQosPolicy)o;

        if(autoenable_created_entities != otherObj.autoenable_created_entities) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (autoenable_created_entities == true)?1:0;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>EntityFactoryQosPolicyTypeSupport</code>
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

        EntityFactoryQosPolicy typedSrc = (EntityFactoryQosPolicy) src;
        EntityFactoryQosPolicy typedDst = this;

        typedDst.autoenable_created_entities = typedSrc.autoenable_created_entities;

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
        strBuffer.append("autoenable_created_entities: ").append(autoenable_created_entities).append("\n");  

        return strBuffer.toString();
    }

}
