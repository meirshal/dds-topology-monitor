

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

public class DataReaderCacheStatusStatistics   implements Copyable, Serializable{

    public DDSMonitoring.DataReaderCacheStatus status = (DDSMonitoring.DataReaderCacheStatus)DDSMonitoring.DataReaderCacheStatus.create();

    public DataReaderCacheStatusStatistics() {

    }
    public DataReaderCacheStatusStatistics (DataReaderCacheStatusStatistics other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataReaderCacheStatusStatistics self;
        self = new  DataReaderCacheStatusStatistics();
        self.clear();
        return self;

    }

    public void clear() {

        if (status != null) {
            status.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataReaderCacheStatusStatistics otherObj = (DataReaderCacheStatusStatistics)o;

        if(!status.equals(otherObj.status)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += status.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataReaderCacheStatusStatisticsTypeSupport</code>
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

        DataReaderCacheStatusStatistics typedSrc = (DataReaderCacheStatusStatistics) src;
        DataReaderCacheStatusStatistics typedDst = this;

        typedDst.status = (DDSMonitoring.DataReaderCacheStatus) typedDst.status.copy_from(typedSrc.status);

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

        strBuffer.append(status.toString("status ", indent+1));

        return strBuffer.toString();
    }

}
