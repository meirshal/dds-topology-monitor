

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

public class ChannelSettings_t   implements Copyable, Serializable{

    public DDSMonitoring.TransportMulticastSettings_tSeq multicast_settings =  new DDSMonitoring.TransportMulticastSettings_tSeq(4);
    public String filter_expression=  "" ; /* maximum length = (255) */
    public int priority= 0;

    public ChannelSettings_t() {

    }
    public ChannelSettings_t (ChannelSettings_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ChannelSettings_t self;
        self = new  ChannelSettings_t();
        self.clear();
        return self;

    }

    public void clear() {

        if (multicast_settings != null) {
            multicast_settings.clear();
        }
        filter_expression=  ""; 
        priority= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ChannelSettings_t otherObj = (ChannelSettings_t)o;

        if(!multicast_settings.equals(otherObj.multicast_settings)) {
            return false;
        }
        if(!filter_expression.equals(otherObj.filter_expression)) {
            return false;
        }
        if(priority != otherObj.priority) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += multicast_settings.hashCode(); 
        __result += filter_expression.hashCode(); 
        __result += (int)priority;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ChannelSettings_tTypeSupport</code>
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

        ChannelSettings_t typedSrc = (ChannelSettings_t) src;
        ChannelSettings_t typedDst = this;

        typedDst.multicast_settings.copy_from(typedSrc.multicast_settings);
        typedDst.filter_expression = typedSrc.filter_expression;
        typedDst.priority = typedSrc.priority;

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
        strBuffer.append("multicast_settings:\n");
        for(int i__ = 0; i__ < multicast_settings.size(); ++i__) {
            strBuffer.append(((DDSMonitoring.TransportMulticastSettings_t)multicast_settings.get(i__)).toString(Integer.toString(i__),indent+2));
        }
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("filter_expression: ").append(filter_expression).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("priority: ").append(priority).append("\n");  

        return strBuffer.toString();
    }

}
