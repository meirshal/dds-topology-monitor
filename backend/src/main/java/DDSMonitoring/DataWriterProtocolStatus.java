

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

public class DataWriterProtocolStatus   implements Copyable, Serializable{

    public long pushed_sample_count= 0;
    public long pushed_sample_count_change= 0;
    public long pushed_sample_bytes= 0;
    public long pushed_sample_bytes_change= 0;
    public long filtered_sample_count= 0;
    public long filtered_sample_count_change= 0;
    public long filtered_sample_bytes= 0;
    public long filtered_sample_bytes_change= 0;
    public long sent_heartbeat_count= 0;
    public long sent_heartbeat_count_change= 0;
    public long sent_heartbeat_bytes= 0;
    public long sent_heartbeat_bytes_change= 0;
    public long pulled_sample_count= 0;
    public long pulled_sample_count_change= 0;
    public long pulled_sample_bytes= 0;
    public long pulled_sample_bytes_change= 0;
    public long received_ack_count= 0;
    public long received_ack_count_change= 0;
    public long received_ack_bytes= 0;
    public long received_ack_bytes_change= 0;
    public long received_nack_count= 0;
    public long received_nack_count_change= 0;
    public long received_nack_bytes= 0;
    public long received_nack_bytes_change= 0;
    public long sent_gap_count= 0;
    public long sent_gap_count_change= 0;
    public long sent_gap_bytes= 0;
    public long sent_gap_bytes_change= 0;
    public long rejected_sample_count= 0;
    public long rejected_sample_count_change= 0;
    public int send_window_size= 0;
    public DDSMonitoring.SequenceNumber_t first_available_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public DDSMonitoring.SequenceNumber_t last_available_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public DDSMonitoring.SequenceNumber_t first_unacknowledged_sample_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public DDSMonitoring.SequenceNumber_t first_available_sample_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public DDSMonitoring.SequenceNumber_t last_available_sample_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public DDSMonitoring.SequenceNumber_t first_unacknowledged_sample_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public DDSMonitoring.RTIInstanceHandle first_unacknowledged_sample_subscription_handle = (DDSMonitoring.RTIInstanceHandle)DDSMonitoring.RTIInstanceHandle.create();
    public DDSMonitoring.SequenceNumber_t first_unelapsed_keep_duration_sample_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();

    public DataWriterProtocolStatus() {

    }
    public DataWriterProtocolStatus (DataWriterProtocolStatus other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DataWriterProtocolStatus self;
        self = new  DataWriterProtocolStatus();
        self.clear();
        return self;

    }

    public void clear() {

        pushed_sample_count= 0;
        pushed_sample_count_change= 0;
        pushed_sample_bytes= 0;
        pushed_sample_bytes_change= 0;
        filtered_sample_count= 0;
        filtered_sample_count_change= 0;
        filtered_sample_bytes= 0;
        filtered_sample_bytes_change= 0;
        sent_heartbeat_count= 0;
        sent_heartbeat_count_change= 0;
        sent_heartbeat_bytes= 0;
        sent_heartbeat_bytes_change= 0;
        pulled_sample_count= 0;
        pulled_sample_count_change= 0;
        pulled_sample_bytes= 0;
        pulled_sample_bytes_change= 0;
        received_ack_count= 0;
        received_ack_count_change= 0;
        received_ack_bytes= 0;
        received_ack_bytes_change= 0;
        received_nack_count= 0;
        received_nack_count_change= 0;
        received_nack_bytes= 0;
        received_nack_bytes_change= 0;
        sent_gap_count= 0;
        sent_gap_count_change= 0;
        sent_gap_bytes= 0;
        sent_gap_bytes_change= 0;
        rejected_sample_count= 0;
        rejected_sample_count_change= 0;
        send_window_size= 0;
        if (first_available_sequence_number != null) {
            first_available_sequence_number.clear();
        }
        if (last_available_sequence_number != null) {
            last_available_sequence_number.clear();
        }
        if (first_unacknowledged_sample_sequence_number != null) {
            first_unacknowledged_sample_sequence_number.clear();
        }
        if (first_available_sample_virtual_sequence_number != null) {
            first_available_sample_virtual_sequence_number.clear();
        }
        if (last_available_sample_virtual_sequence_number != null) {
            last_available_sample_virtual_sequence_number.clear();
        }
        if (first_unacknowledged_sample_virtual_sequence_number != null) {
            first_unacknowledged_sample_virtual_sequence_number.clear();
        }
        if (first_unacknowledged_sample_subscription_handle != null) {
            first_unacknowledged_sample_subscription_handle.clear();
        }
        if (first_unelapsed_keep_duration_sample_sequence_number != null) {
            first_unelapsed_keep_duration_sample_sequence_number.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DataWriterProtocolStatus otherObj = (DataWriterProtocolStatus)o;

        if(pushed_sample_count != otherObj.pushed_sample_count) {
            return false;
        }
        if(pushed_sample_count_change != otherObj.pushed_sample_count_change) {
            return false;
        }
        if(pushed_sample_bytes != otherObj.pushed_sample_bytes) {
            return false;
        }
        if(pushed_sample_bytes_change != otherObj.pushed_sample_bytes_change) {
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
        if(sent_heartbeat_count != otherObj.sent_heartbeat_count) {
            return false;
        }
        if(sent_heartbeat_count_change != otherObj.sent_heartbeat_count_change) {
            return false;
        }
        if(sent_heartbeat_bytes != otherObj.sent_heartbeat_bytes) {
            return false;
        }
        if(sent_heartbeat_bytes_change != otherObj.sent_heartbeat_bytes_change) {
            return false;
        }
        if(pulled_sample_count != otherObj.pulled_sample_count) {
            return false;
        }
        if(pulled_sample_count_change != otherObj.pulled_sample_count_change) {
            return false;
        }
        if(pulled_sample_bytes != otherObj.pulled_sample_bytes) {
            return false;
        }
        if(pulled_sample_bytes_change != otherObj.pulled_sample_bytes_change) {
            return false;
        }
        if(received_ack_count != otherObj.received_ack_count) {
            return false;
        }
        if(received_ack_count_change != otherObj.received_ack_count_change) {
            return false;
        }
        if(received_ack_bytes != otherObj.received_ack_bytes) {
            return false;
        }
        if(received_ack_bytes_change != otherObj.received_ack_bytes_change) {
            return false;
        }
        if(received_nack_count != otherObj.received_nack_count) {
            return false;
        }
        if(received_nack_count_change != otherObj.received_nack_count_change) {
            return false;
        }
        if(received_nack_bytes != otherObj.received_nack_bytes) {
            return false;
        }
        if(received_nack_bytes_change != otherObj.received_nack_bytes_change) {
            return false;
        }
        if(sent_gap_count != otherObj.sent_gap_count) {
            return false;
        }
        if(sent_gap_count_change != otherObj.sent_gap_count_change) {
            return false;
        }
        if(sent_gap_bytes != otherObj.sent_gap_bytes) {
            return false;
        }
        if(sent_gap_bytes_change != otherObj.sent_gap_bytes_change) {
            return false;
        }
        if(rejected_sample_count != otherObj.rejected_sample_count) {
            return false;
        }
        if(rejected_sample_count_change != otherObj.rejected_sample_count_change) {
            return false;
        }
        if(send_window_size != otherObj.send_window_size) {
            return false;
        }
        if(!first_available_sequence_number.equals(otherObj.first_available_sequence_number)) {
            return false;
        }
        if(!last_available_sequence_number.equals(otherObj.last_available_sequence_number)) {
            return false;
        }
        if(!first_unacknowledged_sample_sequence_number.equals(otherObj.first_unacknowledged_sample_sequence_number)) {
            return false;
        }
        if(!first_available_sample_virtual_sequence_number.equals(otherObj.first_available_sample_virtual_sequence_number)) {
            return false;
        }
        if(!last_available_sample_virtual_sequence_number.equals(otherObj.last_available_sample_virtual_sequence_number)) {
            return false;
        }
        if(!first_unacknowledged_sample_virtual_sequence_number.equals(otherObj.first_unacknowledged_sample_virtual_sequence_number)) {
            return false;
        }
        if(!first_unacknowledged_sample_subscription_handle.equals(otherObj.first_unacknowledged_sample_subscription_handle)) {
            return false;
        }
        if(!first_unelapsed_keep_duration_sample_sequence_number.equals(otherObj.first_unelapsed_keep_duration_sample_sequence_number)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)pushed_sample_count;
        __result += (int)pushed_sample_count_change;
        __result += (int)pushed_sample_bytes;
        __result += (int)pushed_sample_bytes_change;
        __result += (int)filtered_sample_count;
        __result += (int)filtered_sample_count_change;
        __result += (int)filtered_sample_bytes;
        __result += (int)filtered_sample_bytes_change;
        __result += (int)sent_heartbeat_count;
        __result += (int)sent_heartbeat_count_change;
        __result += (int)sent_heartbeat_bytes;
        __result += (int)sent_heartbeat_bytes_change;
        __result += (int)pulled_sample_count;
        __result += (int)pulled_sample_count_change;
        __result += (int)pulled_sample_bytes;
        __result += (int)pulled_sample_bytes_change;
        __result += (int)received_ack_count;
        __result += (int)received_ack_count_change;
        __result += (int)received_ack_bytes;
        __result += (int)received_ack_bytes_change;
        __result += (int)received_nack_count;
        __result += (int)received_nack_count_change;
        __result += (int)received_nack_bytes;
        __result += (int)received_nack_bytes_change;
        __result += (int)sent_gap_count;
        __result += (int)sent_gap_count_change;
        __result += (int)sent_gap_bytes;
        __result += (int)sent_gap_bytes_change;
        __result += (int)rejected_sample_count;
        __result += (int)rejected_sample_count_change;
        __result += (int)send_window_size;
        __result += first_available_sequence_number.hashCode(); 
        __result += last_available_sequence_number.hashCode(); 
        __result += first_unacknowledged_sample_sequence_number.hashCode(); 
        __result += first_available_sample_virtual_sequence_number.hashCode(); 
        __result += last_available_sample_virtual_sequence_number.hashCode(); 
        __result += first_unacknowledged_sample_virtual_sequence_number.hashCode(); 
        __result += first_unacknowledged_sample_subscription_handle.hashCode(); 
        __result += first_unelapsed_keep_duration_sample_sequence_number.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DataWriterProtocolStatusTypeSupport</code>
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

        DataWriterProtocolStatus typedSrc = (DataWriterProtocolStatus) src;
        DataWriterProtocolStatus typedDst = this;

        typedDst.pushed_sample_count = typedSrc.pushed_sample_count;
        typedDst.pushed_sample_count_change = typedSrc.pushed_sample_count_change;
        typedDst.pushed_sample_bytes = typedSrc.pushed_sample_bytes;
        typedDst.pushed_sample_bytes_change = typedSrc.pushed_sample_bytes_change;
        typedDst.filtered_sample_count = typedSrc.filtered_sample_count;
        typedDst.filtered_sample_count_change = typedSrc.filtered_sample_count_change;
        typedDst.filtered_sample_bytes = typedSrc.filtered_sample_bytes;
        typedDst.filtered_sample_bytes_change = typedSrc.filtered_sample_bytes_change;
        typedDst.sent_heartbeat_count = typedSrc.sent_heartbeat_count;
        typedDst.sent_heartbeat_count_change = typedSrc.sent_heartbeat_count_change;
        typedDst.sent_heartbeat_bytes = typedSrc.sent_heartbeat_bytes;
        typedDst.sent_heartbeat_bytes_change = typedSrc.sent_heartbeat_bytes_change;
        typedDst.pulled_sample_count = typedSrc.pulled_sample_count;
        typedDst.pulled_sample_count_change = typedSrc.pulled_sample_count_change;
        typedDst.pulled_sample_bytes = typedSrc.pulled_sample_bytes;
        typedDst.pulled_sample_bytes_change = typedSrc.pulled_sample_bytes_change;
        typedDst.received_ack_count = typedSrc.received_ack_count;
        typedDst.received_ack_count_change = typedSrc.received_ack_count_change;
        typedDst.received_ack_bytes = typedSrc.received_ack_bytes;
        typedDst.received_ack_bytes_change = typedSrc.received_ack_bytes_change;
        typedDst.received_nack_count = typedSrc.received_nack_count;
        typedDst.received_nack_count_change = typedSrc.received_nack_count_change;
        typedDst.received_nack_bytes = typedSrc.received_nack_bytes;
        typedDst.received_nack_bytes_change = typedSrc.received_nack_bytes_change;
        typedDst.sent_gap_count = typedSrc.sent_gap_count;
        typedDst.sent_gap_count_change = typedSrc.sent_gap_count_change;
        typedDst.sent_gap_bytes = typedSrc.sent_gap_bytes;
        typedDst.sent_gap_bytes_change = typedSrc.sent_gap_bytes_change;
        typedDst.rejected_sample_count = typedSrc.rejected_sample_count;
        typedDst.rejected_sample_count_change = typedSrc.rejected_sample_count_change;
        typedDst.send_window_size = typedSrc.send_window_size;
        typedDst.first_available_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.first_available_sequence_number.copy_from(typedSrc.first_available_sequence_number);
        typedDst.last_available_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.last_available_sequence_number.copy_from(typedSrc.last_available_sequence_number);
        typedDst.first_unacknowledged_sample_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.first_unacknowledged_sample_sequence_number.copy_from(typedSrc.first_unacknowledged_sample_sequence_number);
        typedDst.first_available_sample_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.first_available_sample_virtual_sequence_number.copy_from(typedSrc.first_available_sample_virtual_sequence_number);
        typedDst.last_available_sample_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.last_available_sample_virtual_sequence_number.copy_from(typedSrc.last_available_sample_virtual_sequence_number);
        typedDst.first_unacknowledged_sample_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.first_unacknowledged_sample_virtual_sequence_number.copy_from(typedSrc.first_unacknowledged_sample_virtual_sequence_number);
        typedDst.first_unacknowledged_sample_subscription_handle = (DDSMonitoring.RTIInstanceHandle) typedDst.first_unacknowledged_sample_subscription_handle.copy_from(typedSrc.first_unacknowledged_sample_subscription_handle);
        typedDst.first_unelapsed_keep_duration_sample_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.first_unelapsed_keep_duration_sample_sequence_number.copy_from(typedSrc.first_unelapsed_keep_duration_sample_sequence_number);

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
        strBuffer.append("pushed_sample_count: ").append(pushed_sample_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("pushed_sample_count_change: ").append(pushed_sample_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("pushed_sample_bytes: ").append(pushed_sample_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("pushed_sample_bytes_change: ").append(pushed_sample_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("filtered_sample_count: ").append(filtered_sample_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("filtered_sample_count_change: ").append(filtered_sample_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("filtered_sample_bytes: ").append(filtered_sample_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("filtered_sample_bytes_change: ").append(filtered_sample_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_heartbeat_count: ").append(sent_heartbeat_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_heartbeat_count_change: ").append(sent_heartbeat_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_heartbeat_bytes: ").append(sent_heartbeat_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_heartbeat_bytes_change: ").append(sent_heartbeat_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("pulled_sample_count: ").append(pulled_sample_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("pulled_sample_count_change: ").append(pulled_sample_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("pulled_sample_bytes: ").append(pulled_sample_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("pulled_sample_bytes_change: ").append(pulled_sample_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_ack_count: ").append(received_ack_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_ack_count_change: ").append(received_ack_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_ack_bytes: ").append(received_ack_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_ack_bytes_change: ").append(received_ack_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_nack_count: ").append(received_nack_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_nack_count_change: ").append(received_nack_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_nack_bytes: ").append(received_nack_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("received_nack_bytes_change: ").append(received_nack_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_gap_count: ").append(sent_gap_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_gap_count_change: ").append(sent_gap_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_gap_bytes: ").append(sent_gap_bytes).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sent_gap_bytes_change: ").append(sent_gap_bytes_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("rejected_sample_count: ").append(rejected_sample_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("rejected_sample_count_change: ").append(rejected_sample_count_change).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("send_window_size: ").append(send_window_size).append("\n");  
        strBuffer.append(first_available_sequence_number.toString("first_available_sequence_number ", indent+1));
        strBuffer.append(last_available_sequence_number.toString("last_available_sequence_number ", indent+1));
        strBuffer.append(first_unacknowledged_sample_sequence_number.toString("first_unacknowledged_sample_sequence_number ", indent+1));
        strBuffer.append(first_available_sample_virtual_sequence_number.toString("first_available_sample_virtual_sequence_number ", indent+1));
        strBuffer.append(last_available_sample_virtual_sequence_number.toString("last_available_sample_virtual_sequence_number ", indent+1));
        strBuffer.append(first_unacknowledged_sample_virtual_sequence_number.toString("first_unacknowledged_sample_virtual_sequence_number ", indent+1));
        strBuffer.append(first_unacknowledged_sample_subscription_handle.toString("first_unacknowledged_sample_subscription_handle ", indent+1));
        strBuffer.append(first_unelapsed_keep_duration_sample_sequence_number.toString("first_unelapsed_keep_duration_sample_sequence_number ", indent+1));

        return strBuffer.toString();
    }

}
