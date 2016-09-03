

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

public class AvailabilityQosPolicy   implements Copyable, Serializable{

    public boolean enable_required_subscriptions= false;
    public DDSMonitoring.Duration_t max_data_availability_waiting_time = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t max_endpoint_availability_waiting_time = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.EndpointGroup_tSeq required_matched_endpoint_groups =  new DDSMonitoring.EndpointGroup_tSeq(256);

    public AvailabilityQosPolicy() {

    }
    public AvailabilityQosPolicy (AvailabilityQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        AvailabilityQosPolicy self;
        self = new  AvailabilityQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        enable_required_subscriptions= false;
        if (max_data_availability_waiting_time != null) {
            max_data_availability_waiting_time.clear();
        }
        if (max_endpoint_availability_waiting_time != null) {
            max_endpoint_availability_waiting_time.clear();
        }
        if (required_matched_endpoint_groups != null) {
            required_matched_endpoint_groups.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        AvailabilityQosPolicy otherObj = (AvailabilityQosPolicy)o;

        if(enable_required_subscriptions != otherObj.enable_required_subscriptions) {
            return false;
        }
        if(!max_data_availability_waiting_time.equals(otherObj.max_data_availability_waiting_time)) {
            return false;
        }
        if(!max_endpoint_availability_waiting_time.equals(otherObj.max_endpoint_availability_waiting_time)) {
            return false;
        }
        if(!required_matched_endpoint_groups.equals(otherObj.required_matched_endpoint_groups)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (enable_required_subscriptions == true)?1:0;
        __result += max_data_availability_waiting_time.hashCode(); 
        __result += max_endpoint_availability_waiting_time.hashCode(); 
        __result += required_matched_endpoint_groups.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>AvailabilityQosPolicyTypeSupport</code>
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

        AvailabilityQosPolicy typedSrc = (AvailabilityQosPolicy) src;
        AvailabilityQosPolicy typedDst = this;

        typedDst.enable_required_subscriptions = typedSrc.enable_required_subscriptions;
        typedDst.max_data_availability_waiting_time = (DDSMonitoring.Duration_t) typedDst.max_data_availability_waiting_time.copy_from(typedSrc.max_data_availability_waiting_time);
        typedDst.max_endpoint_availability_waiting_time = (DDSMonitoring.Duration_t) typedDst.max_endpoint_availability_waiting_time.copy_from(typedSrc.max_endpoint_availability_waiting_time);
        typedDst.required_matched_endpoint_groups.copy_from(typedSrc.required_matched_endpoint_groups);

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
        strBuffer.append("enable_required_subscriptions: ").append(enable_required_subscriptions).append("\n");  
        strBuffer.append(max_data_availability_waiting_time.toString("max_data_availability_waiting_time ", indent+1));
        strBuffer.append(max_endpoint_availability_waiting_time.toString("max_endpoint_availability_waiting_time ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);
        strBuffer.append("required_matched_endpoint_groups:\n");
        for(int i__ = 0; i__ < required_matched_endpoint_groups.size(); ++i__) {
            strBuffer.append(((DDSMonitoring.EndpointGroup_t)required_matched_endpoint_groups.get(i__)).toString(Integer.toString(i__),indent+2));
        }

        return strBuffer.toString();
    }

}
