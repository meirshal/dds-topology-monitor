

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

public class DomainParticipantEntityStatistics   implements Copyable, Serializable{

    public DDSMonitoring.BuiltinTopicKey_t participant_key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.Duration_t period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public int domain_id= 0;
    public int host_id= 0;
    public int process_id= 0;
    public rti.dds.monitoring.ProcessStatistics process = (rti.dds.monitoring.ProcessStatistics)rti.dds.monitoring.ProcessStatistics.create();
    public int remoteParticipantCount= 0;
    public int remoteWriterCount= 0;
    public int remoteReaderCount= 0;

    public DomainParticipantEntityStatistics() {

    }
    public DomainParticipantEntityStatistics (DomainParticipantEntityStatistics other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DomainParticipantEntityStatistics self;
        self = new  DomainParticipantEntityStatistics();
        self.clear();
        return self;

    }

    public void clear() {

        if (participant_key != null) {
            participant_key.clear();
        }
        if (period != null) {
            period.clear();
        }
        domain_id= 0;
        host_id= 0;
        process_id= 0;
        if (process != null) {
            process.clear();
        }
        remoteParticipantCount= 0;
        remoteWriterCount= 0;
        remoteReaderCount= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DomainParticipantEntityStatistics otherObj = (DomainParticipantEntityStatistics)o;

        if(!participant_key.equals(otherObj.participant_key)) {
            return false;
        }
        if(!period.equals(otherObj.period)) {
            return false;
        }
        if(domain_id != otherObj.domain_id) {
            return false;
        }
        if(host_id != otherObj.host_id) {
            return false;
        }
        if(process_id != otherObj.process_id) {
            return false;
        }
        if(!process.equals(otherObj.process)) {
            return false;
        }
        if(remoteParticipantCount != otherObj.remoteParticipantCount) {
            return false;
        }
        if(remoteWriterCount != otherObj.remoteWriterCount) {
            return false;
        }
        if(remoteReaderCount != otherObj.remoteReaderCount) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += participant_key.hashCode(); 
        __result += period.hashCode(); 
        __result += (int)domain_id;
        __result += (int)host_id;
        __result += (int)process_id;
        __result += process.hashCode(); 
        __result += (int)remoteParticipantCount;
        __result += (int)remoteWriterCount;
        __result += (int)remoteReaderCount;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DomainParticipantEntityStatisticsTypeSupport</code>
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

        DomainParticipantEntityStatistics typedSrc = (DomainParticipantEntityStatistics) src;
        DomainParticipantEntityStatistics typedDst = this;

        typedDst.participant_key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.participant_key.copy_from(typedSrc.participant_key);
        typedDst.period = (DDSMonitoring.Duration_t) typedDst.period.copy_from(typedSrc.period);
        typedDst.domain_id = typedSrc.domain_id;
        typedDst.host_id = typedSrc.host_id;
        typedDst.process_id = typedSrc.process_id;
        typedDst.process = (rti.dds.monitoring.ProcessStatistics) typedDst.process.copy_from(typedSrc.process);
        typedDst.remoteParticipantCount = typedSrc.remoteParticipantCount;
        typedDst.remoteWriterCount = typedSrc.remoteWriterCount;
        typedDst.remoteReaderCount = typedSrc.remoteReaderCount;

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

        strBuffer.append(participant_key.toString("participant_key ", indent+1));
        strBuffer.append(period.toString("period ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("domain_id: ").append(domain_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("host_id: ").append(host_id).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("process_id: ").append(process_id).append("\n");  
        strBuffer.append(process.toString("process ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("remoteParticipantCount: ").append(remoteParticipantCount).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("remoteWriterCount: ").append(remoteWriterCount).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("remoteReaderCount: ").append(remoteReaderCount).append("\n");  

        return strBuffer.toString();
    }

}
