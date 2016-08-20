

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

public class LivelinessChangedStatus   implements Copyable, Serializable{

    public int alive_count= 0;
    public int not_alive_count= 0;
    public int alive_count_change= 0;
    public int not_alive_count_change= 0;
    public DDSMonitoring.RTIInstanceHandle last_publication_handle = (DDSMonitoring.RTIInstanceHandle)DDSMonitoring.RTIInstanceHandle.create();

    public LivelinessChangedStatus() {

    }
    public LivelinessChangedStatus (LivelinessChangedStatus other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        LivelinessChangedStatus self;
        self = new  LivelinessChangedStatus();
        self.clear();
        return self;

    }

    public void clear() {

        alive_count= 0;
        not_alive_count= 0;
        alive_count_change= 0;
        not_alive_count_change= 0;
        if (last_publication_handle != null) {
            last_publication_handle.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        LivelinessChangedStatus otherObj = (LivelinessChangedStatus)o;

        if(alive_count != otherObj.alive_count) {
            return false;
        }
        if(not_alive_count != otherObj.not_alive_count) {
            return false;
        }
        if(alive_count_change != otherObj.alive_count_change) {
            return false;
        }
        if(not_alive_count_change != otherObj.not_alive_count_change) {
            return false;
        }
        if(!last_publication_handle.equals(otherObj.last_publication_handle)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)alive_count;
        __result += (int)not_alive_count;
        __result += (int)alive_count_change;
        __result += (int)not_alive_count_change;
        __result += last_publication_handle.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>LivelinessChangedStatusTypeSupport</code>
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

        LivelinessChangedStatus typedSrc = (LivelinessChangedStatus) src;
        LivelinessChangedStatus typedDst = this;

        typedDst.alive_count = typedSrc.alive_count;
        typedDst.not_alive_count = typedSrc.not_alive_count;
        typedDst.alive_count_change = typedSrc.alive_count_change;
        typedDst.not_alive_count_change = typedSrc.not_alive_count_change;
        typedDst.last_publication_handle = (DDSMonitoring.RTIInstanceHandle) typedDst.last_publication_handle.copy_from(typedSrc.last_publication_handle);

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
        strBuffer.append("alive_count: ").append(alive_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("not_alive_count: ").append(not_alive_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("alive_count_change: ").append(alive_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("not_alive_count_change: ").append(not_alive_count_change).append("\n");  
        strBuffer.append(last_publication_handle.toString("last_publication_handle ", indent+1));

        return strBuffer.toString();
    }

}
