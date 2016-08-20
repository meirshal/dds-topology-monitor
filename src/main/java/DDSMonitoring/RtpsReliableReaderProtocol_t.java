

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

public class RtpsReliableReaderProtocol_t   implements Copyable, Serializable{

    public DDSMonitoring.Duration_t min_heartbeat_response_delay = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t max_heartbeat_response_delay = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t heartbeat_suppression_duration = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t nack_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public int receive_window_size= 0;
    public DDSMonitoring.Duration_t round_trip_time = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t app_ack_period = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public DDSMonitoring.Duration_t min_app_ack_response_keep_duration = (DDSMonitoring.Duration_t)DDSMonitoring.Duration_t.create();
    public int samples_per_app_ack= 0;

    public RtpsReliableReaderProtocol_t() {

    }
    public RtpsReliableReaderProtocol_t (RtpsReliableReaderProtocol_t other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        RtpsReliableReaderProtocol_t self;
        self = new  RtpsReliableReaderProtocol_t();
        self.clear();
        return self;

    }

    public void clear() {

        if (min_heartbeat_response_delay != null) {
            min_heartbeat_response_delay.clear();
        }
        if (max_heartbeat_response_delay != null) {
            max_heartbeat_response_delay.clear();
        }
        if (heartbeat_suppression_duration != null) {
            heartbeat_suppression_duration.clear();
        }
        if (nack_period != null) {
            nack_period.clear();
        }
        receive_window_size= 0;
        if (round_trip_time != null) {
            round_trip_time.clear();
        }
        if (app_ack_period != null) {
            app_ack_period.clear();
        }
        if (min_app_ack_response_keep_duration != null) {
            min_app_ack_response_keep_duration.clear();
        }
        samples_per_app_ack= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        RtpsReliableReaderProtocol_t otherObj = (RtpsReliableReaderProtocol_t)o;

        if(!min_heartbeat_response_delay.equals(otherObj.min_heartbeat_response_delay)) {
            return false;
        }
        if(!max_heartbeat_response_delay.equals(otherObj.max_heartbeat_response_delay)) {
            return false;
        }
        if(!heartbeat_suppression_duration.equals(otherObj.heartbeat_suppression_duration)) {
            return false;
        }
        if(!nack_period.equals(otherObj.nack_period)) {
            return false;
        }
        if(receive_window_size != otherObj.receive_window_size) {
            return false;
        }
        if(!round_trip_time.equals(otherObj.round_trip_time)) {
            return false;
        }
        if(!app_ack_period.equals(otherObj.app_ack_period)) {
            return false;
        }
        if(!min_app_ack_response_keep_duration.equals(otherObj.min_app_ack_response_keep_duration)) {
            return false;
        }
        if(samples_per_app_ack != otherObj.samples_per_app_ack) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += min_heartbeat_response_delay.hashCode(); 
        __result += max_heartbeat_response_delay.hashCode(); 
        __result += heartbeat_suppression_duration.hashCode(); 
        __result += nack_period.hashCode(); 
        __result += (int)receive_window_size;
        __result += round_trip_time.hashCode(); 
        __result += app_ack_period.hashCode(); 
        __result += min_app_ack_response_keep_duration.hashCode(); 
        __result += (int)samples_per_app_ack;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>RtpsReliableReaderProtocol_tTypeSupport</code>
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

        RtpsReliableReaderProtocol_t typedSrc = (RtpsReliableReaderProtocol_t) src;
        RtpsReliableReaderProtocol_t typedDst = this;

        typedDst.min_heartbeat_response_delay = (DDSMonitoring.Duration_t) typedDst.min_heartbeat_response_delay.copy_from(typedSrc.min_heartbeat_response_delay);
        typedDst.max_heartbeat_response_delay = (DDSMonitoring.Duration_t) typedDst.max_heartbeat_response_delay.copy_from(typedSrc.max_heartbeat_response_delay);
        typedDst.heartbeat_suppression_duration = (DDSMonitoring.Duration_t) typedDst.heartbeat_suppression_duration.copy_from(typedSrc.heartbeat_suppression_duration);
        typedDst.nack_period = (DDSMonitoring.Duration_t) typedDst.nack_period.copy_from(typedSrc.nack_period);
        typedDst.receive_window_size = typedSrc.receive_window_size;
        typedDst.round_trip_time = (DDSMonitoring.Duration_t) typedDst.round_trip_time.copy_from(typedSrc.round_trip_time);
        typedDst.app_ack_period = (DDSMonitoring.Duration_t) typedDst.app_ack_period.copy_from(typedSrc.app_ack_period);
        typedDst.min_app_ack_response_keep_duration = (DDSMonitoring.Duration_t) typedDst.min_app_ack_response_keep_duration.copy_from(typedSrc.min_app_ack_response_keep_duration);
        typedDst.samples_per_app_ack = typedSrc.samples_per_app_ack;

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

        strBuffer.append(min_heartbeat_response_delay.toString("min_heartbeat_response_delay ", indent+1));
        strBuffer.append(max_heartbeat_response_delay.toString("max_heartbeat_response_delay ", indent+1));
        strBuffer.append(heartbeat_suppression_duration.toString("heartbeat_suppression_duration ", indent+1));
        strBuffer.append(nack_period.toString("nack_period ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("receive_window_size: ").append(receive_window_size).append("\n");  
        strBuffer.append(round_trip_time.toString("round_trip_time ", indent+1));
        strBuffer.append(app_ack_period.toString("app_ack_period ", indent+1));
        strBuffer.append(min_app_ack_response_keep_duration.toString("min_app_ack_response_keep_duration ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("samples_per_app_ack: ").append(samples_per_app_ack).append("\n");  

        return strBuffer.toString();
    }

}
