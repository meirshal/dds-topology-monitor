

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

public class DataReaderProtocolStatus   implements Copyable, Serializable{

    public long received_sample_count= 0;
    public long received_sample_count_change= 0;
    public long received_sample_bytes= 0;
    public long received_sample_bytes_change= 0;
    public long duplicate_sample_count= 0;
    public long duplicate_sample_count_change= 0;
    public long duplicate_sample_bytes= 0;
    public long duplicate_sample_bytes_change= 0;
    public long filtered_sample_count= 0;
    public long filtered_sample_count_change= 0;
    public long filtered_sample_bytes= 0;
    public long filtered_sample_bytes_change= 0;
    public long received_heartbeat_count= 0;
    public long received_heartbeat_count_change= 0;
    public long received_heartbeat_bytes= 0;
    public long received_heartbeat_bytes_change= 0;
    public long sent_ack_count= 0;
    public long sent_ack_count_change= 0;
    public long sent_ack_bytes= 0;
    public long sent_ack_bytes_change= 0;
    public long sent_nack_count= 0;
    public long sent_nack_count_change= 0;
    public long sent_nack_bytes= 0;
    public long sent_nack_bytes_change= 0;
    public long received_gap_count= 0;
    public long received_gap_count_change= 0;
    public long received_gap_bytes= 0;
    public long received_gap_bytes_change= 0;
    public long rejected_sample_count= 0;
    public long rejected_sample_count_change= 0;
    public DDSMonitoring.SequenceNumber_t first_available_sample_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public DDSMonitoring.SequenceNumber_t last_available_sample_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public DDSMonitoring.SequenceNumber_t last_committed_sample_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public int uncommitted_sample_count= 0;

    public DataReaderProtocolStatus() {

    }
    public DataReaderProtocolStatus (DataReaderProtocolStatus other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataReaderProtocolStatus self;
        self = new  DataReaderProtocolStatus();
        self.clear();
        return self;

    }

    public void clear() {

        received_sample_count= 0;
        received_sample_count_change= 0;
        received_sample_bytes= 0;
        received_sample_bytes_change= 0;
        duplicate_sample_count= 0;
        duplicate_sample_count_change= 0;
        duplicate_sample_bytes= 0;
        duplicate_sample_bytes_change= 0;
        filtered_sample_count= 0;
        filtered_sample_count_change= 0;
        filtered_sample_bytes= 0;
        filtered_sample_bytes_change= 0;
        received_heartbeat_count= 0;
        received_heartbeat_count_change= 0;
        received_heartbeat_bytes= 0;
        received_heartbeat_bytes_change= 0;
        sent_ack_count= 0;
        sent_ack_count_change= 0;
        sent_ack_bytes= 0;
        sent_ack_bytes_change= 0;
        sent_nack_count= 0;
        sent_nack_count_change= 0;
        sent_nack_bytes= 0;
        sent_nack_bytes_change= 0;
        received_gap_count= 0;
        received_gap_count_change= 0;
        received_gap_bytes= 0;
        received_gap_bytes_change= 0;
        rejected_sample_count= 0;
        rejected_sample_count_change= 0;
        if (first_available_sample_sequence_number != null) {
            first_available_sample_sequence_number.clear();
        }
        if (last_available_sample_sequence_number != null) {
            last_available_sample_sequence_number.clear();
        }
        if (last_committed_sample_sequence_number != null) {
            last_committed_sample_sequence_number.clear();
        }
        uncommitted_sample_count= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataReaderProtocolStatus otherObj = (DataReaderProtocolStatus)o;

        if(received_sample_count != otherObj.received_sample_count) {
            return false;
        }
        if(received_sample_count_change != otherObj.received_sample_count_change) {
            return false;
        }
        if(received_sample_bytes != otherObj.received_sample_bytes) {
            return false;
        }
        if(received_sample_bytes_change != otherObj.received_sample_bytes_change) {
            return false;
        }
        if(duplicate_sample_count != otherObj.duplicate_sample_count) {
            return false;
        }
        if(duplicate_sample_count_change != otherObj.duplicate_sample_count_change) {
            return false;
        }
        if(duplicate_sample_bytes != otherObj.duplicate_sample_bytes) {
            return false;
        }
        if(duplicate_sample_bytes_change != otherObj.duplicate_sample_bytes_change) {
            return false;
        }
        if(filtered_sample_count != otherObj.filtered_sample_count) {
            return false;
        }
        if(filtered_sample_count_change != otherObj.filtered_sample_count_change) {
            return false;
        }
        if(filtered_sample_bytes != otherObj.filtered_sample_bytes) {
            return false;
        }
        if(filtered_sample_bytes_change != otherObj.filtered_sample_bytes_change) {
            return false;
        }
        if(received_heartbeat_count != otherObj.received_heartbeat_count) {
            return false;
        }
        if(received_heartbeat_count_change != otherObj.received_heartbeat_count_change) {
            return false;
        }
        if(received_heartbeat_bytes != otherObj.received_heartbeat_bytes) {
            return false;
        }
        if(received_heartbeat_bytes_change != otherObj.received_heartbeat_bytes_change) {
            return false;
        }
        if(sent_ack_count != otherObj.sent_ack_count) {
            return false;
        }
        if(sent_ack_count_change != otherObj.sent_ack_count_change) {
            return false;
        }
        if(sent_ack_bytes != otherObj.sent_ack_bytes) {
            return false;
        }
        if(sent_ack_bytes_change != otherObj.sent_ack_bytes_change) {
            return false;
        }
        if(sent_nack_count != otherObj.sent_nack_count) {
            return false;
        }
        if(sent_nack_count_change != otherObj.sent_nack_count_change) {
            return false;
        }
        if(sent_nack_bytes != otherObj.sent_nack_bytes) {
            return false;
        }
        if(sent_nack_bytes_change != otherObj.sent_nack_bytes_change) {
            return false;
        }
        if(received_gap_count != otherObj.received_gap_count) {
            return false;
        }
        if(received_gap_count_change != otherObj.received_gap_count_change) {
            return false;
        }
        if(received_gap_bytes != otherObj.received_gap_bytes) {
            return false;
        }
        if(received_gap_bytes_change != otherObj.received_gap_bytes_change) {
            return false;
        }
        if(rejected_sample_count != otherObj.rejected_sample_count) {
            return false;
        }
        if(rejected_sample_count_change != otherObj.rejected_sample_count_change) {
            return false;
        }
        if(!first_available_sample_sequence_number.equals(otherObj.first_available_sample_sequence_number)) {
            return false;
        }
        if(!last_available_sample_sequence_number.equals(otherObj.last_available_sample_sequence_number)) {
            return false;
        }
        if(!last_committed_sample_sequence_number.equals(otherObj.last_committed_sample_sequence_number)) {
            return false;
        }
        if(uncommitted_sample_count != otherObj.uncommitted_sample_count) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)received_sample_count;
        __result += (int)received_sample_count_change;
        __result += (int)received_sample_bytes;
        __result += (int)received_sample_bytes_change;
        __result += (int)duplicate_sample_count;
        __result += (int)duplicate_sample_count_change;
        __result += (int)duplicate_sample_bytes;
        __result += (int)duplicate_sample_bytes_change;
        __result += (int)filtered_sample_count;
        __result += (int)filtered_sample_count_change;
        __result += (int)filtered_sample_bytes;
        __result += (int)filtered_sample_bytes_change;
        __result += (int)received_heartbeat_count;
        __result += (int)received_heartbeat_count_change;
        __result += (int)received_heartbeat_bytes;
        __result += (int)received_heartbeat_bytes_change;
        __result += (int)sent_ack_count;
        __result += (int)sent_ack_count_change;
        __result += (int)sent_ack_bytes;
        __result += (int)sent_ack_bytes_change;
        __result += (int)sent_nack_count;
        __result += (int)sent_nack_count_change;
        __result += (int)sent_nack_bytes;
        __result += (int)sent_nack_bytes_change;
        __result += (int)received_gap_count;
        __result += (int)received_gap_count_change;
        __result += (int)received_gap_bytes;
        __result += (int)received_gap_bytes_change;
        __result += (int)rejected_sample_count;
        __result += (int)rejected_sample_count_change;
        __result += first_available_sample_sequence_number.hashCode(); 
        __result += last_available_sample_sequence_number.hashCode(); 
        __result += last_committed_sample_sequence_number.hashCode(); 
        __result += (int)uncommitted_sample_count;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataReaderProtocolStatusTypeSupport</code>
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

        DataReaderProtocolStatus typedSrc = (DataReaderProtocolStatus) src;
        DataReaderProtocolStatus typedDst = this;

        typedDst.received_sample_count = typedSrc.received_sample_count;
        typedDst.received_sample_count_change = typedSrc.received_sample_count_change;
        typedDst.received_sample_bytes = typedSrc.received_sample_bytes;
        typedDst.received_sample_bytes_change = typedSrc.received_sample_bytes_change;
        typedDst.duplicate_sample_count = typedSrc.duplicate_sample_count;
        typedDst.duplicate_sample_count_change = typedSrc.duplicate_sample_count_change;
        typedDst.duplicate_sample_bytes = typedSrc.duplicate_sample_bytes;
        typedDst.duplicate_sample_bytes_change = typedSrc.duplicate_sample_bytes_change;
        typedDst.filtered_sample_count = typedSrc.filtered_sample_count;
        typedDst.filtered_sample_count_change = typedSrc.filtered_sample_count_change;
        typedDst.filtered_sample_bytes = typedSrc.filtered_sample_bytes;
        typedDst.filtered_sample_bytes_change = typedSrc.filtered_sample_bytes_change;
        typedDst.received_heartbeat_count = typedSrc.received_heartbeat_count;
        typedDst.received_heartbeat_count_change = typedSrc.received_heartbeat_count_change;
        typedDst.received_heartbeat_bytes = typedSrc.received_heartbeat_bytes;
        typedDst.received_heartbeat_bytes_change = typedSrc.received_heartbeat_bytes_change;
        typedDst.sent_ack_count = typedSrc.sent_ack_count;
        typedDst.sent_ack_count_change = typedSrc.sent_ack_count_change;
        typedDst.sent_ack_bytes = typedSrc.sent_ack_bytes;
        typedDst.sent_ack_bytes_change = typedSrc.sent_ack_bytes_change;
        typedDst.sent_nack_count = typedSrc.sent_nack_count;
        typedDst.sent_nack_count_change = typedSrc.sent_nack_count_change;
        typedDst.sent_nack_bytes = typedSrc.sent_nack_bytes;
        typedDst.sent_nack_bytes_change = typedSrc.sent_nack_bytes_change;
        typedDst.received_gap_count = typedSrc.received_gap_count;
        typedDst.received_gap_count_change = typedSrc.received_gap_count_change;
        typedDst.received_gap_bytes = typedSrc.received_gap_bytes;
        typedDst.received_gap_bytes_change = typedSrc.received_gap_bytes_change;
        typedDst.rejected_sample_count = typedSrc.rejected_sample_count;
        typedDst.rejected_sample_count_change = typedSrc.rejected_sample_count_change;
        typedDst.first_available_sample_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.first_available_sample_sequence_number.copy_from(typedSrc.first_available_sample_sequence_number);
        typedDst.last_available_sample_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.last_available_sample_sequence_number.copy_from(typedSrc.last_available_sample_sequence_number);
        typedDst.last_committed_sample_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.last_committed_sample_sequence_number.copy_from(typedSrc.last_committed_sample_sequence_number);
        typedDst.uncommitted_sample_count = typedSrc.uncommitted_sample_count;

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
        strBuffer.append("received_sample_count: ").append(received_sample_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_sample_count_change: ").append(received_sample_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_sample_bytes: ").append(received_sample_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_sample_bytes_change: ").append(received_sample_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("duplicate_sample_count: ").append(duplicate_sample_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("duplicate_sample_count_change: ").append(duplicate_sample_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("duplicate_sample_bytes: ").append(duplicate_sample_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("duplicate_sample_bytes_change: ").append(duplicate_sample_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("filtered_sample_count: ").append(filtered_sample_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("filtered_sample_count_change: ").append(filtered_sample_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("filtered_sample_bytes: ").append(filtered_sample_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("filtered_sample_bytes_change: ").append(filtered_sample_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_heartbeat_count: ").append(received_heartbeat_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_heartbeat_count_change: ").append(received_heartbeat_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_heartbeat_bytes: ").append(received_heartbeat_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_heartbeat_bytes_change: ").append(received_heartbeat_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_ack_count: ").append(sent_ack_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_ack_count_change: ").append(sent_ack_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_ack_bytes: ").append(sent_ack_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_ack_bytes_change: ").append(sent_ack_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_nack_count: ").append(sent_nack_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_nack_count_change: ").append(sent_nack_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_nack_bytes: ").append(sent_nack_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_nack_bytes_change: ").append(sent_nack_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_gap_count: ").append(received_gap_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_gap_count_change: ").append(received_gap_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_gap_bytes: ").append(received_gap_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_gap_bytes_change: ").append(received_gap_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("rejected_sample_count: ").append(rejected_sample_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("rejected_sample_count_change: ").append(rejected_sample_count_change).append("\n");  
        strBuffer.append(first_available_sample_sequence_number.toString("first_available_sample_sequence_number ", indent+1));
        strBuffer.append(last_available_sample_sequence_number.toString("last_available_sample_sequence_number ", indent+1));
        strBuffer.append(last_committed_sample_sequence_number.toString("last_committed_sample_sequence_number ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("uncommitted_sample_count: ").append(uncommitted_sample_count).append("\n");  

        return strBuffer.toString();
    }

}
