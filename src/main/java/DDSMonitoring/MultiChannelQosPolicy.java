

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

public class MultiChannelQosPolicy   implements Copyable, Serializable{

    public DDSMonitoring.ChannelSettings_tSeq channels =  new DDSMonitoring.ChannelSettings_tSeq(32);
    public String filter_name=  "" ; /* maximum length = (255) */

    public MultiChannelQosPolicy() {

    }
    public MultiChannelQosPolicy (MultiChannelQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        MultiChannelQosPolicy self;
        self = new  MultiChannelQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (channels != null) {
            channels.clear();
        }
        filter_name=  ""; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        MultiChannelQosPolicy otherObj = (MultiChannelQosPolicy)o;

        if(!channels.equals(otherObj.channels)) {
            return false;
        }
        if(!filter_name.equals(otherObj.filter_name)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += channels.hashCode(); 
        __result += filter_name.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>MultiChannelQosPolicyTypeSupport</code>
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

        MultiChannelQosPolicy typedSrc = (MultiChannelQosPolicy) src;
        MultiChannelQosPolicy typedDst = this;

        typedDst.channels.copy_from(typedSrc.channels);
        typedDst.filter_name = typedSrc.filter_name;

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
        strBuffer.append("channels:\n");
        for(int i__ = 0; i__ < channels.size(); ++i__) {
            strBuffer.append(((DDSMonitoring.ChannelSettings_t)channels.get(i__)).toString(Integer.toString(i__),indent+2));
        }
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("filter_name: ").append(filter_name).append("\n");  

        return strBuffer.toString();
    }

}
