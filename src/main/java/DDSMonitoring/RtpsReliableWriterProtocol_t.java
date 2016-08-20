

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

public class RtpsReliableWriterProtocol_t   implements Copyable, Serializable{

    public int low_watermark= 0;
    public int high_watermark= 0;
    public DDSMonitoring.Duration_t heartbeat_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t fast_heartbeat_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t late_joiner_heartbeat_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t virtual_heartbeat_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public int samples_per_virtual_heartbeat= 0;
    public int max_heartbeat_retries= 0;
    public boolean inactivate_nonprogressing_readers= false;
    public int heartbeats_per_max_samples= 0;
    public DDSMonitoring.Duration_t min_nack_response_delay = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t max_nack_response_delay = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t nack_suppression_duration = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public int max_bytes_per_nack_response= 0;
    public DDSMonitoring.Duration_t disable_positive_acks_min_sample_keep_duration = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t disable_positive_acks_max_sample_keep_duration = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t disable_positive_acks_sample_min_separation = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public boolean disable_positive_acks_enable_adaptive_sample_keep_duration= false;
    public boolean disable_positive_acks_enable_spin_wait= false;
    public int disable_positive_acks_decrease_sample_keep_duration_factor= 0;
    public int disable_positive_acks_increase_sample_keep_duration_factor= 0;
    public int min_send_window_size= 0;
    public int max_send_window_Size= 0;
    public DDSMonitoring.Duration_t send_window_update_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public int send_window_increase_factor= 0;
    public int send_window_decrease_factor= 0;
    public boolean enable_multicast_periodic_heartbeat= false;
    public int multicast_resend_threshold= 0;

    public RtpsReliableWriterProtocol_t() {

    }
    public RtpsReliableWriterProtocol_t (RtpsReliableWriterProtocol_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        RtpsReliableWriterProtocol_t self;
        self = new  RtpsReliableWriterProtocol_t();
        self.clear();
        return self;

    }

    public void clear() {

        low_watermark= 0;
        high_watermark= 0;
        if (heartbeat_period != null) {
            heartbeat_period.clear();
        }
        if (fast_heartbeat_period != null) {
            fast_heartbeat_period.clear();
        }
        if (late_joiner_heartbeat_period != null) {
            late_joiner_heartbeat_period.clear();
        }
        if (virtual_heartbeat_period != null) {
            virtual_heartbeat_period.clear();
        }
        samples_per_virtual_heartbeat= 0;
        max_heartbeat_retries= 0;
        inactivate_nonprogressing_readers= false;
        heartbeats_per_max_samples= 0;
        if (min_nack_response_delay != null) {
            min_nack_response_delay.clear();
        }
        if (max_nack_response_delay != null) {
            max_nack_response_delay.clear();
        }
        if (nack_suppression_duration != null) {
            nack_suppression_duration.clear();
        }
        max_bytes_per_nack_response= 0;
        if (disable_positive_acks_min_sample_keep_duration != null) {
            disable_positive_acks_min_sample_keep_duration.clear();
        }
        if (disable_positive_acks_max_sample_keep_duration != null) {
            disable_positive_acks_max_sample_keep_duration.clear();
        }
        if (disable_positive_acks_sample_min_separation != null) {
            disable_positive_acks_sample_min_separation.clear();
        }
        disable_positive_acks_enable_adaptive_sample_keep_duration= false;
        disable_positive_acks_enable_spin_wait= false;
        disable_positive_acks_decrease_sample_keep_duration_factor= 0;
        disable_positive_acks_increase_sample_keep_duration_factor= 0;
        min_send_window_size= 0;
        max_send_window_Size= 0;
        if (send_window_update_period != null) {
            send_window_update_period.clear();
        }
        send_window_increase_factor= 0;
        send_window_decrease_factor= 0;
        enable_multicast_periodic_heartbeat= false;
        multicast_resend_threshold= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        RtpsReliableWriterProtocol_t otherObj = (RtpsReliableWriterProtocol_t)o;

        if(low_watermark != otherObj.low_watermark) {
            return false;
        }
        if(high_watermark != otherObj.high_watermark) {
            return false;
        }
        if(!heartbeat_period.equals(otherObj.heartbeat_period)) {
            return false;
        }
        if(!fast_heartbeat_period.equals(otherObj.fast_heartbeat_period)) {
            return false;
        }
        if(!late_joiner_heartbeat_period.equals(otherObj.late_joiner_heartbeat_period)) {
            return false;
        }
        if(!virtual_heartbeat_period.equals(otherObj.virtual_heartbeat_period)) {
            return false;
        }
        if(samples_per_virtual_heartbeat != otherObj.samples_per_virtual_heartbeat) {
            return false;
        }
        if(max_heartbeat_retries != otherObj.max_heartbeat_retries) {
            return false;
        }
        if(inactivate_nonprogressing_readers != otherObj.inactivate_nonprogressing_readers) {
            return false;
        }
        if(heartbeats_per_max_samples != otherObj.heartbeats_per_max_samples) {
            return false;
        }
        if(!min_nack_response_delay.equals(otherObj.min_nack_response_delay)) {
            return false;
        }
        if(!max_nack_response_delay.equals(otherObj.max_nack_response_delay)) {
            return false;
        }
        if(!nack_suppression_duration.equals(otherObj.nack_suppression_duration)) {
            return false;
        }
        if(max_bytes_per_nack_response != otherObj.max_bytes_per_nack_response) {
            return false;
        }
        if(!disable_positive_acks_min_sample_keep_duration.equals(otherObj.disable_positive_acks_min_sample_keep_duration)) {
            return false;
        }
        if(!disable_positive_acks_max_sample_keep_duration.equals(otherObj.disable_positive_acks_max_sample_keep_duration)) {
            return false;
        }
        if(!disable_positive_acks_sample_min_separation.equals(otherObj.disable_positive_acks_sample_min_separation)) {
            return false;
        }
        if(disable_positive_acks_enable_adaptive_sample_keep_duration != otherObj.disable_positive_acks_enable_adaptive_sample_keep_duration) {
            return false;
        }
        if(disable_positive_acks_enable_spin_wait != otherObj.disable_positive_acks_enable_spin_wait) {
            return false;
        }
        if(disable_positive_acks_decrease_sample_keep_duration_factor != otherObj.disable_positive_acks_decrease_sample_keep_duration_factor) {
            return false;
        }
        if(disable_positive_acks_increase_sample_keep_duration_factor != otherObj.disable_positive_acks_increase_sample_keep_duration_factor) {
            return false;
        }
        if(min_send_window_size != otherObj.min_send_window_size) {
            return false;
        }
        if(max_send_window_Size != otherObj.max_send_window_Size) {
            return false;
        }
        if(!send_window_update_period.equals(otherObj.send_window_update_period)) {
            return false;
        }
        if(send_window_increase_factor != otherObj.send_window_increase_factor) {
            return false;
        }
        if(send_window_decrease_factor != otherObj.send_window_decrease_factor) {
            return false;
        }
        if(enable_multicast_periodic_heartbeat != otherObj.enable_multicast_periodic_heartbeat) {
            return false;
        }
        if(multicast_resend_threshold != otherObj.multicast_resend_threshold) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)low_watermark;
        __result += (int)high_watermark;
        __result += heartbeat_period.hashCode(); 
        __result += fast_heartbeat_period.hashCode(); 
        __result += late_joiner_heartbeat_period.hashCode(); 
        __result += virtual_heartbeat_period.hashCode(); 
        __result += (int)samples_per_virtual_heartbeat;
        __result += (int)max_heartbeat_retries;
        __result += (inactivate_nonprogressing_readers == true)?1:0;
        __result += (int)heartbeats_per_max_samples;
        __result += min_nack_response_delay.hashCode(); 
        __result += max_nack_response_delay.hashCode(); 
        __result += nack_suppression_duration.hashCode(); 
        __result += (int)max_bytes_per_nack_response;
        __result += disable_positive_acks_min_sample_keep_duration.hashCode(); 
        __result += disable_positive_acks_max_sample_keep_duration.hashCode(); 
        __result += disable_positive_acks_sample_min_separation.hashCode(); 
        __result += (disable_positive_acks_enable_adaptive_sample_keep_duration == true)?1:0;
        __result += (disable_positive_acks_enable_spin_wait == true)?1:0;
        __result += (int)disable_positive_acks_decrease_sample_keep_duration_factor;
        __result += (int)disable_positive_acks_increase_sample_keep_duration_factor;
        __result += (int)min_send_window_size;
        __result += (int)max_send_window_Size;
        __result += send_window_update_period.hashCode(); 
        __result += (int)send_window_increase_factor;
        __result += (int)send_window_decrease_factor;
        __result += (enable_multicast_periodic_heartbeat == true)?1:0;
        __result += (int)multicast_resend_threshold;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>RtpsReliableWriterProtocol_tTypeSupport</code>
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

        RtpsReliableWriterProtocol_t typedSrc = (RtpsReliableWriterProtocol_t) src;
        RtpsReliableWriterProtocol_t typedDst = this;

        typedDst.low_watermark = typedSrc.low_watermark;
        typedDst.high_watermark = typedSrc.high_watermark;
        typedDst.heartbeat_period = (DDSMonitoring.Duration_t) typedDst.heartbeat_period.copy_from(typedSrc.heartbeat_period);
        typedDst.fast_heartbeat_period = (DDSMonitoring.Duration_t) typedDst.fast_heartbeat_period.copy_from(typedSrc.fast_heartbeat_period);
        typedDst.late_joiner_heartbeat_period = (DDSMonitoring.Duration_t) typedDst.late_joiner_heartbeat_period.copy_from(typedSrc.late_joiner_heartbeat_period);
        typedDst.virtual_heartbeat_period = (DDSMonitoring.Duration_t) typedDst.virtual_heartbeat_period.copy_from(typedSrc.virtual_heartbeat_period);
        typedDst.samples_per_virtual_heartbeat = typedSrc.samples_per_virtual_heartbeat;
        typedDst.max_heartbeat_retries = typedSrc.max_heartbeat_retries;
        typedDst.inactivate_nonprogressing_readers = typedSrc.inactivate_nonprogressing_readers;
        typedDst.heartbeats_per_max_samples = typedSrc.heartbeats_per_max_samples;
        typedDst.min_nack_response_delay = (DDSMonitoring.Duration_t) typedDst.min_nack_response_delay.copy_from(typedSrc.min_nack_response_delay);
        typedDst.max_nack_response_delay = (DDSMonitoring.Duration_t) typedDst.max_nack_response_delay.copy_from(typedSrc.max_nack_response_delay);
        typedDst.nack_suppression_duration = (DDSMonitoring.Duration_t) typedDst.nack_suppression_duration.copy_from(typedSrc.nack_suppression_duration);
        typedDst.max_bytes_per_nack_response = typedSrc.max_bytes_per_nack_response;
        typedDst.disable_positive_acks_min_sample_keep_duration = (DDSMonitoring.Duration_t) typedDst.disable_positive_acks_min_sample_keep_duration.copy_from(typedSrc.disable_positive_acks_min_sample_keep_duration);
        typedDst.disable_positive_acks_max_sample_keep_duration = (DDSMonitoring.Duration_t) typedDst.disable_positive_acks_max_sample_keep_duration.copy_from(typedSrc.disable_positive_acks_max_sample_keep_duration);
        typedDst.disable_positive_acks_sample_min_separation = (DDSMonitoring.Duration_t) typedDst.disable_positive_acks_sample_min_separation.copy_from(typedSrc.disable_positive_acks_sample_min_separation);
        typedDst.disable_positive_acks_enable_adaptive_sample_keep_duration = typedSrc.disable_positive_acks_enable_adaptive_sample_keep_duration;
        typedDst.disable_positive_acks_enable_spin_wait = typedSrc.disable_positive_acks_enable_spin_wait;
        typedDst.disable_positive_acks_decrease_sample_keep_duration_factor = typedSrc.disable_positive_acks_decrease_sample_keep_duration_factor;
        typedDst.disable_positive_acks_increase_sample_keep_duration_factor = typedSrc.disable_positive_acks_increase_sample_keep_duration_factor;
        typedDst.min_send_window_size = typedSrc.min_send_window_size;
        typedDst.max_send_window_Size = typedSrc.max_send_window_Size;
        typedDst.send_window_update_period = (DDSMonitoring.Duration_t) typedDst.send_window_update_period.copy_from(typedSrc.send_window_update_period);
        typedDst.send_window_increase_factor = typedSrc.send_window_increase_factor;
        typedDst.send_window_decrease_factor = typedSrc.send_window_decrease_factor;
        typedDst.enable_multicast_periodic_heartbeat = typedSrc.enable_multicast_periodic_heartbeat;
        typedDst.multicast_resend_threshold = typedSrc.multicast_resend_threshold;

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
        strBuffer.append("low_watermark: ").append(low_watermark).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("high_watermark: ").append(high_watermark).append("\n");  
        strBuffer.append(heartbeat_period.toString("heartbeat_period ", indent+1));
        strBuffer.append(fast_heartbeat_period.toString("fast_heartbeat_period ", indent+1));
        strBuffer.append(late_joiner_heartbeat_period.toString("late_joiner_heartbeat_period ", indent+1));
        strBuffer.append(virtual_heartbeat_period.toString("virtual_heartbeat_period ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("samples_per_virtual_heartbeat: ").append(samples_per_virtual_heartbeat).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_heartbeat_retries: ").append(max_heartbeat_retries).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("inactivate_nonprogressing_readers: ").append(inactivate_nonprogressing_readers).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("heartbeats_per_max_samples: ").append(heartbeats_per_max_samples).append("\n");  
        strBuffer.append(min_nack_response_delay.toString("min_nack_response_delay ", indent+1));
        strBuffer.append(max_nack_response_delay.toString("max_nack_response_delay ", indent+1));
        strBuffer.append(nack_suppression_duration.toString("nack_suppression_duration ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_bytes_per_nack_response: ").append(max_bytes_per_nack_response).append("\n");  
        strBuffer.append(disable_positive_acks_min_sample_keep_duration.toString("disable_positive_acks_min_sample_keep_duration ", indent+1));
        strBuffer.append(disable_positive_acks_max_sample_keep_duration.toString("disable_positive_acks_max_sample_keep_duration ", indent+1));
        strBuffer.append(disable_positive_acks_sample_min_separation.toString("disable_positive_acks_sample_min_separation ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("disable_positive_acks_enable_adaptive_sample_keep_duration: ").append(disable_positive_acks_enable_adaptive_sample_keep_duration).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("disable_positive_acks_enable_spin_wait: ").append(disable_positive_acks_enable_spin_wait).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("disable_positive_acks_decrease_sample_keep_duration_factor: ").append(disable_positive_acks_decrease_sample_keep_duration_factor).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("disable_positive_acks_increase_sample_keep_duration_factor: ").append(disable_positive_acks_increase_sample_keep_duration_factor).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("min_send_window_size: ").append(min_send_window_size).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("max_send_window_Size: ").append(max_send_window_Size).append("\n");  
        strBuffer.append(send_window_update_period.toString("send_window_update_period ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("send_window_increase_factor: ").append(send_window_increase_factor).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("send_window_decrease_factor: ").append(send_window_decrease_factor).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("enable_multicast_periodic_heartbeat: ").append(enable_multicast_periodic_heartbeat).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("multicast_resend_threshold: ").append(multicast_resend_threshold).append("\n");  

        return strBuffer.toString();
    }

}
