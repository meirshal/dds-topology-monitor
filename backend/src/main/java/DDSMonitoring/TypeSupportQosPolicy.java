

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

public class TypeSupportQosPolicy   implements Copyable, Serializable{

    public long plugin_data= 0;
    public DDSMonitoring.CdrPaddingKind cdr_padding_kind = (DDSMonitoring.CdrPaddingKind)DDSMonitoring.CdrPaddingKind.create();

    public TypeSupportQosPolicy() {

    }
    public TypeSupportQosPolicy (TypeSupportQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        TypeSupportQosPolicy self;
        self = new  TypeSupportQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        plugin_data= 0;
        cdr_padding_kind = DDSMonitoring.CdrPaddingKind.create();
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        TypeSupportQosPolicy otherObj = (TypeSupportQosPolicy)o;

        if(plugin_data != otherObj.plugin_data) {
            return false;
        }
        if(!cdr_padding_kind.equals(otherObj.cdr_padding_kind)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)plugin_data;
        __result += cdr_padding_kind.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>TypeSupportQosPolicyTypeSupport</code>
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

        TypeSupportQosPolicy typedSrc = (TypeSupportQosPolicy) src;
        TypeSupportQosPolicy typedDst = this;

        typedDst.plugin_data = typedSrc.plugin_data;
        typedDst.cdr_padding_kind = (DDSMonitoring.CdrPaddingKind) typedDst.cdr_padding_kind.copy_from(typedSrc.cdr_padding_kind);

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
        strBuffer.append("plugin_data: ").append(plugin_data).append("\n");  
        strBuffer.append(cdr_padding_kind.toString("cdr_padding_kind ", indent+1));

        return strBuffer.toString();
    }

}
