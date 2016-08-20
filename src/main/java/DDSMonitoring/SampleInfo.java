

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

public class SampleInfo   implements Copyable, Serializable{

    public int sample_state= 0;
    public int view_state= 0;
    public int instance_state= 0;
    public DDSMonitoring.Time_t source_timestamp = (DDSMonitoring.Time_t)DDSMonitoring.Time_t.create();
    public DDSMonitoring.RTIInstanceHandle instance_handle = (DDSMonitoring.RTIInstanceHandle)DDSMonitoring.RTIInstanceHandle.create();
    public DDSMonitoring.RTIInstanceHandle publication_handle = (DDSMonitoring.RTIInstanceHandle)DDSMonitoring.RTIInstanceHandle.create();
    public int disposed_generation_count= 0;
    public int no_writers_generation_count= 0;
    public int sample_rank= 0;
    public int generation_rank= 0;
    public int absolute_generation_rank= 0;
    public boolean valid_data= false;
    public DDSMonitoring.Time_t reception_timestamp = (DDSMonitoring.Time_t)DDSMonitoring.Time_t.create();
    public DDSMonitoring.SequenceNumber_t publication_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public DDSMonitoring.SequenceNumber_t reception_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public DDSMonitoring.GUID_t publication_virtual_guid = (DDSMonitoring.GUID_t)DDSMonitoring.GUID_t.create();
    public DDSMonitoring.SequenceNumber_t publication_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();
    public DDSMonitoring.GUID_t original_publication_virtual_guid = (DDSMonitoring.GUID_t)DDSMonitoring.GUID_t.create();
    public DDSMonitoring.SequenceNumber_t original_publication_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t)DDSMonitoring.SequenceNumber_t.create();

    public SampleInfo() {

    }
    public SampleInfo (SampleInfo other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        SampleInfo self;
        self = new  SampleInfo();
        self.clear();
        return self;

    }

    public void clear() {

        sample_state= 0;
        view_state= 0;
        instance_state= 0;
        if (source_timestamp != null) {
            source_timestamp.clear();
        }
        if (instance_handle != null) {
            instance_handle.clear();
        }
        if (publication_handle != null) {
            publication_handle.clear();
        }
        disposed_generation_count= 0;
        no_writers_generation_count= 0;
        sample_rank= 0;
        generation_rank= 0;
        absolute_generation_rank= 0;
        valid_data= false;
        if (reception_timestamp != null) {
            reception_timestamp.clear();
        }
        if (publication_sequence_number != null) {
            publication_sequence_number.clear();
        }
        if (reception_sequence_number != null) {
            reception_sequence_number.clear();
        }
        if (publication_virtual_guid != null) {
            publication_virtual_guid.clear();
        }
        if (publication_virtual_sequence_number != null) {
            publication_virtual_sequence_number.clear();
        }
        if (original_publication_virtual_guid != null) {
            original_publication_virtual_guid.clear();
        }
        if (original_publication_virtual_sequence_number != null) {
            original_publication_virtual_sequence_number.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        SampleInfo otherObj = (SampleInfo)o;

        if(sample_state != otherObj.sample_state) {
            return false;
        }
        if(view_state != otherObj.view_state) {
            return false;
        }
        if(instance_state != otherObj.instance_state) {
            return false;
        }
        if(!source_timestamp.equals(otherObj.source_timestamp)) {
            return false;
        }
        if(!instance_handle.equals(otherObj.instance_handle)) {
            return false;
        }
        if(!publication_handle.equals(otherObj.publication_handle)) {
            return false;
        }
        if(disposed_generation_count != otherObj.disposed_generation_count) {
            return false;
        }
        if(no_writers_generation_count != otherObj.no_writers_generation_count) {
            return false;
        }
        if(sample_rank != otherObj.sample_rank) {
            return false;
        }
        if(generation_rank != otherObj.generation_rank) {
            return false;
        }
        if(absolute_generation_rank != otherObj.absolute_generation_rank) {
            return false;
        }
        if(valid_data != otherObj.valid_data) {
            return false;
        }
        if(!reception_timestamp.equals(otherObj.reception_timestamp)) {
            return false;
        }
        if(!publication_sequence_number.equals(otherObj.publication_sequence_number)) {
            return false;
        }
        if(!reception_sequence_number.equals(otherObj.reception_sequence_number)) {
            return false;
        }
        if(!publication_virtual_guid.equals(otherObj.publication_virtual_guid)) {
            return false;
        }
        if(!publication_virtual_sequence_number.equals(otherObj.publication_virtual_sequence_number)) {
            return false;
        }
        if(!original_publication_virtual_guid.equals(otherObj.original_publication_virtual_guid)) {
            return false;
        }
        if(!original_publication_virtual_sequence_number.equals(otherObj.original_publication_virtual_sequence_number)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += (int)sample_state;
        __result += (int)view_state;
        __result += (int)instance_state;
        __result += source_timestamp.hashCode(); 
        __result += instance_handle.hashCode(); 
        __result += publication_handle.hashCode(); 
        __result += (int)disposed_generation_count;
        __result += (int)no_writers_generation_count;
        __result += (int)sample_rank;
        __result += (int)generation_rank;
        __result += (int)absolute_generation_rank;
        __result += (valid_data == true)?1:0;
        __result += reception_timestamp.hashCode(); 
        __result += publication_sequence_number.hashCode(); 
        __result += reception_sequence_number.hashCode(); 
        __result += publication_virtual_guid.hashCode(); 
        __result += publication_virtual_sequence_number.hashCode(); 
        __result += original_publication_virtual_guid.hashCode(); 
        __result += original_publication_virtual_sequence_number.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>SampleInfoTypeSupport</code>
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

        SampleInfo typedSrc = (SampleInfo) src;
        SampleInfo typedDst = this;

        typedDst.sample_state = typedSrc.sample_state;
        typedDst.view_state = typedSrc.view_state;
        typedDst.instance_state = typedSrc.instance_state;
        typedDst.source_timestamp = (DDSMonitoring.Time_t) typedDst.source_timestamp.copy_from(typedSrc.source_timestamp);
        typedDst.instance_handle = (DDSMonitoring.RTIInstanceHandle) typedDst.instance_handle.copy_from(typedSrc.instance_handle);
        typedDst.publication_handle = (DDSMonitoring.RTIInstanceHandle) typedDst.publication_handle.copy_from(typedSrc.publication_handle);
        typedDst.disposed_generation_count = typedSrc.disposed_generation_count;
        typedDst.no_writers_generation_count = typedSrc.no_writers_generation_count;
        typedDst.sample_rank = typedSrc.sample_rank;
        typedDst.generation_rank = typedSrc.generation_rank;
        typedDst.absolute_generation_rank = typedSrc.absolute_generation_rank;
        typedDst.valid_data = typedSrc.valid_data;
        typedDst.reception_timestamp = (DDSMonitoring.Time_t) typedDst.reception_timestamp.copy_from(typedSrc.reception_timestamp);
        typedDst.publication_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.publication_sequence_number.copy_from(typedSrc.publication_sequence_number);
        typedDst.reception_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.reception_sequence_number.copy_from(typedSrc.reception_sequence_number);
        typedDst.publication_virtual_guid = (DDSMonitoring.GUID_t) typedDst.publication_virtual_guid.copy_from(typedSrc.publication_virtual_guid);
        typedDst.publication_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.publication_virtual_sequence_number.copy_from(typedSrc.publication_virtual_sequence_number);
        typedDst.original_publication_virtual_guid = (DDSMonitoring.GUID_t) typedDst.original_publication_virtual_guid.copy_from(typedSrc.original_publication_virtual_guid);
        typedDst.original_publication_virtual_sequence_number = (DDSMonitoring.SequenceNumber_t) typedDst.original_publication_virtual_sequence_number.copy_from(typedSrc.original_publication_virtual_sequence_number);

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
        strBuffer.append("sample_state: ").append(sample_state).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("view_state: ").append(view_state).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("instance_state: ").append(instance_state).append("\n");  
        strBuffer.append(source_timestamp.toString("source_timestamp ", indent+1));
        strBuffer.append(instance_handle.toString("instance_handle ", indent+1));
        strBuffer.append(publication_handle.toString("publication_handle ", indent+1));
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("disposed_generation_count: ").append(disposed_generation_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("no_writers_generation_count: ").append(no_writers_generation_count).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("sample_rank: ").append(sample_rank).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("generation_rank: ").append(generation_rank).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("absolute_generation_rank: ").append(absolute_generation_rank).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("valid_data: ").append(valid_data).append("\n");  
        strBuffer.append(reception_timestamp.toString("reception_timestamp ", indent+1));
        strBuffer.append(publication_sequence_number.toString("publication_sequence_number ", indent+1));
        strBuffer.append(reception_sequence_number.toString("reception_sequence_number ", indent+1));
        strBuffer.append(publication_virtual_guid.toString("publication_virtual_guid ", indent+1));
        strBuffer.append(publication_virtual_sequence_number.toString("publication_virtual_sequence_number ", indent+1));
        strBuffer.append(original_publication_virtual_guid.toString("original_publication_virtual_guid ", indent+1));
        strBuffer.append(original_publication_virtual_sequence_number.toString("original_publication_virtual_sequence_number ", indent+1));

        return strBuffer.toString();
    }

}
