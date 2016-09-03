

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

public class ThreadSettings_t   implements Copyable, Serializable{

    public int mask= 0;
    public int priority= 0;
    public int stack_size= 0;
    public IntSeq cpu_list =  new IntSeq(1024);
    public DDSMonitoring.ThreadSettingsCpuRotationKind cpu_rotation = (DDSMonitoring.ThreadSettingsCpuRotationKind)DDSMonitoring.ThreadSettingsCpuRotationKind.create();

    public ThreadSettings_t() {

    }
    public ThreadSettings_t (ThreadSettings_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ThreadSettings_t self;
        self = new  ThreadSettings_t();
        self.clear();
        return self;

    }

    public void clear() {

        mask= 0;
        priority= 0;
        stack_size= 0;
        if (cpu_list != null) {
            cpu_list.clear();
        }
        cpu_rotation = DDSMonitoring.ThreadSettingsCpuRotationKind.create();
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ThreadSettings_t otherObj = (ThreadSettings_t)o;

        if(mask != otherObj.mask) {
            return false;
        }
        if(priority != otherObj.priority) {
            return false;
        }
        if(stack_size != otherObj.stack_size) {
            return false;
        }
        if(!cpu_list.equals(otherObj.cpu_list)) {
            return false;
        }
        if(!cpu_rotation.equals(otherObj.cpu_rotation)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)mask;
        __result += (int)priority;
        __result += (int)stack_size;
        __result += cpu_list.hashCode(); 
        __result += cpu_rotation.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ThreadSettings_tTypeSupport</code>
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

        ThreadSettings_t typedSrc = (ThreadSettings_t) src;
        ThreadSettings_t typedDst = this;

        typedDst.mask = typedSrc.mask;
        typedDst.priority = typedSrc.priority;
        typedDst.stack_size = typedSrc.stack_size;
        typedDst.cpu_list.copy_from(typedSrc.cpu_list);
        typedDst.cpu_rotation = (DDSMonitoring.ThreadSettingsCpuRotationKind) typedDst.cpu_rotation.copy_from(typedSrc.cpu_rotation);

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
        strBuffer.append("mask: ").append(mask).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("priority: ").append(priority).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("stack_size: ").append(stack_size).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);
        strBuffer.append("cpu_list: ");
        for(int i__ = 0; i__ < cpu_list.size(); ++i__) {
            if (i__!=0) strBuffer.append(", ");
            strBuffer.append(cpu_list.get(i__));
        }
        strBuffer.append("\n"); 
        strBuffer.append(cpu_rotation.toString("cpu_rotation ", indent+1));

        return strBuffer.toString();
    }

}
