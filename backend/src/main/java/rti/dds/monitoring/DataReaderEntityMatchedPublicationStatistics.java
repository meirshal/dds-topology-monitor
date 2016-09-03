

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

public class DataReaderEntityMatchedPublicationStatistics   implements Copyable, Serializable{

    public DDSMonitoring.BuiltinTopicKey_t datareader_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.RTIInstanceHandle publication_handle = (DDSMonitoring.RTIInstanceHandle)DDSMonitoring.RTIInstanceHandle.create();
    public DDSMonitoring.Duration_t period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public rti.dds.monitoring.DataReaderProtocolStatusStatistics datareader_protocol_status = (rti.dds.monitoring.DataReaderProtocolStatusStatistics)rti.dds.monitoring.DataReaderProtocolStatusStatistics.create();

    public DataReaderEntityMatchedPublicationStatistics() {

    }
    public DataReaderEntityMatchedPublicationStatistics (DataReaderEntityMatchedPublicationStatistics other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataReaderEntityMatchedPublicationStatistics self;
        self = new  DataReaderEntityMatchedPublicationStatistics();
        self.clear();
        return self;

    }

    public void clear() {

        if (datareader_key != null) {
            datareader_key.clear();
        }
        if (publication_handle != null) {
            publication_handle.clear();
        }
        if (period != null) {
            period.clear();
        }
        if (datareader_protocol_status != null) {
            datareader_protocol_status.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataReaderEntityMatchedPublicationStatistics otherObj = (DataReaderEntityMatchedPublicationStatistics)o;

        if(!datareader_key.equals(otherObj.datareader_key)) {
            return false;
        }
        if(!publication_handle.equals(otherObj.publication_handle)) {
            return false;
        }
        if(!period.equals(otherObj.period)) {
            return false;
        }
        if(!datareader_protocol_status.equals(otherObj.datareader_protocol_status)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += datareader_key.hashCode(); 
        __result += publication_handle.hashCode(); 
        __result += period.hashCode(); 
        __result += datareader_protocol_status.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataReaderEntityMatchedPublicationStatisticsTypeSupport</code>
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

        DataReaderEntityMatchedPublicationStatistics typedSrc = (DataReaderEntityMatchedPublicationStatistics) src;
        DataReaderEntityMatchedPublicationStatistics typedDst = this;

        typedDst.datareader_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.datareader_key.copy_from(typedSrc.datareader_key);
        typedDst.publication_handle = (DDSMonitoring.RTIInstanceHandle) typedDst.publication_handle.copy_from(typedSrc.publication_handle);
        typedDst.period = (DDSMonitoring.Duration_t) typedDst.period.copy_from(typedSrc.period);
        typedDst.datareader_protocol_status = (rti.dds.monitoring.DataReaderProtocolStatusStatistics) typedDst.datareader_protocol_status.copy_from(typedSrc.datareader_protocol_status);

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

        strBuffer.append(datareader_key.toString("datareader_key ", indent+1));
        strBuffer.append(publication_handle.toString("publication_handle ", indent+1));
        strBuffer.append(period.toString("period ", indent+1));
        strBuffer.append(datareader_protocol_status.toString("datareader_protocol_status ", indent+1));

        return strBuffer.toString();
    }

}
