

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rti.dds.monitoring;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class DataWriterEntityMatchedSubscriptionStatistics   implements Copyable, Serializable{

    public DDSMonitoring.BuiltinTopicKey_t datawriter_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.RTIInstanceHandle subscription_handle = (DDSMonitoring.RTIInstanceHandle)DDSMonitoring.RTIInstanceHandle.create();
    public DDSMonitoring.Duration_t period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public rti.dds.monitoring.DataWriterProtocolStatusStatistics datawriter_protocol_status = (rti.dds.monitoring.DataWriterProtocolStatusStatistics)rti.dds.monitoring.DataWriterProtocolStatusStatistics.create();

    public DataWriterEntityMatchedSubscriptionStatistics() {

    }
    public DataWriterEntityMatchedSubscriptionStatistics (DataWriterEntityMatchedSubscriptionStatistics other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataWriterEntityMatchedSubscriptionStatistics self;
        self = new  DataWriterEntityMatchedSubscriptionStatistics();
        self.clear();
        return self;

    }

    public void clear() {

        if (datawriter_key != null) {
            datawriter_key.clear();
        }
        if (subscription_handle != null) {
            subscription_handle.clear();
        }
        if (period != null) {
            period.clear();
        }
        if (datawriter_protocol_status != null) {
            datawriter_protocol_status.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataWriterEntityMatchedSubscriptionStatistics otherObj = (DataWriterEntityMatchedSubscriptionStatistics)o;

        if(!datawriter_key.equals(otherObj.datawriter_key)) {
            return false;
        }
        if(!subscription_handle.equals(otherObj.subscription_handle)) {
            return false;
        }
        if(!period.equals(otherObj.period)) {
            return false;
        }
        if(!datawriter_protocol_status.equals(otherObj.datawriter_protocol_status)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += datawriter_key.hashCode(); 
        __result += subscription_handle.hashCode(); 
        __result += period.hashCode(); 
        __result += datawriter_protocol_status.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataWriterEntityMatchedSubscriptionStatisticsTypeSupport</code>
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

        DataWriterEntityMatchedSubscriptionStatistics typedSrc = (DataWriterEntityMatchedSubscriptionStatistics) src;
        DataWriterEntityMatchedSubscriptionStatistics typedDst = this;

        typedDst.datawriter_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.datawriter_key.copy_from(typedSrc.datawriter_key);
        typedDst.subscription_handle = (DDSMonitoring.RTIInstanceHandle) typedDst.subscription_handle.copy_from(typedSrc.subscription_handle);
        typedDst.period = (DDSMonitoring.Duration_t) typedDst.period.copy_from(typedSrc.period);
        typedDst.datawriter_protocol_status = (rti.dds.monitoring.DataWriterProtocolStatusStatistics) typedDst.datawriter_protocol_status.copy_from(typedSrc.datawriter_protocol_status);

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

        strBuffer.append(datawriter_key.toString("datawriter_key ", indent+1));
        strBuffer.append(subscription_handle.toString("subscription_handle ", indent+1));
        strBuffer.append(period.toString("period ", indent+1));
        strBuffer.append(datawriter_protocol_status.toString("datawriter_protocol_status ", indent+1));

        return strBuffer.toString();
    }

}
