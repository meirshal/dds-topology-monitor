

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

public class PublisherQos   implements Copyable, Serializable{

    public DDSMonitoring.PresentationQosPolicy presentation = (DDSMonitoring.PresentationQosPolicy)DDSMonitoring.PresentationQosPolicy.create();
    public DDSMonitoring.PartitionQosPolicy partition = (DDSMonitoring.PartitionQosPolicy)DDSMonitoring.PartitionQosPolicy.create();
    public DDSMonitoring.GroupDataQosPolicy group_data = (DDSMonitoring.GroupDataQosPolicy)DDSMonitoring.GroupDataQosPolicy.create();
    public DDSMonitoring.EntityFactoryQosPolicy entity_factory = (DDSMonitoring.EntityFactoryQosPolicy)DDSMonitoring.EntityFactoryQosPolicy.create();
    public DDSMonitoring.AsynchronousPublisherQosPolicy asynchronous_publisher = (DDSMonitoring.AsynchronousPublisherQosPolicy)DDSMonitoring.AsynchronousPublisherQosPolicy.create();
    public DDSMonitoring.ExclusiveAreaQosPolicy exclusive_area = (DDSMonitoring.ExclusiveAreaQosPolicy)DDSMonitoring.ExclusiveAreaQosPolicy.create();
    public DDSMonitoring.PublisherProtocolQosPolicy protocol = (DDSMonitoring.PublisherProtocolQosPolicy)DDSMonitoring.PublisherProtocolQosPolicy.create();
    public DDSMonitoring.EntityNameQosPolicy publisher_name = (DDSMonitoring.EntityNameQosPolicy)DDSMonitoring.EntityNameQosPolicy.create();

    public PublisherQos() {

    }
    public PublisherQos (PublisherQos other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        PublisherQos self;
        self = new  PublisherQos();
        self.clear();
        return self;

    }

    public void clear() {

        if (presentation != null) {
            presentation.clear();
        }
        if (partition != null) {
            partition.clear();
        }
        if (group_data != null) {
            group_data.clear();
        }
        if (entity_factory != null) {
            entity_factory.clear();
        }
        if (asynchronous_publisher != null) {
            asynchronous_publisher.clear();
        }
        if (exclusive_area != null) {
            exclusive_area.clear();
        }
        if (protocol != null) {
            protocol.clear();
        }
        if (publisher_name != null) {
            publisher_name.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        PublisherQos otherObj = (PublisherQos)o;

        if(!presentation.equals(otherObj.presentation)) {
            return false;
        }
        if(!partition.equals(otherObj.partition)) {
            return false;
        }
        if(!group_data.equals(otherObj.group_data)) {
            return false;
        }
        if(!entity_factory.equals(otherObj.entity_factory)) {
            return false;
        }
        if(!asynchronous_publisher.equals(otherObj.asynchronous_publisher)) {
            return false;
        }
        if(!exclusive_area.equals(otherObj.exclusive_area)) {
            return false;
        }
        if(!protocol.equals(otherObj.protocol)) {
            return false;
        }
        if(!publisher_name.equals(otherObj.publisher_name)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += presentation.hashCode(); 
        __result += partition.hashCode(); 
        __result += group_data.hashCode(); 
        __result += entity_factory.hashCode(); 
        __result += asynchronous_publisher.hashCode(); 
        __result += exclusive_area.hashCode(); 
        __result += protocol.hashCode(); 
        __result += publisher_name.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>PublisherQosTypeSupport</code>
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

        PublisherQos typedSrc = (PublisherQos) src;
        PublisherQos typedDst = this;

        typedDst.presentation = (DDSMonitoring.PresentationQosPolicy) typedDst.presentation.copy_from(typedSrc.presentation);
        typedDst.partition = (DDSMonitoring.PartitionQosPolicy) typedDst.partition.copy_from(typedSrc.partition);
        typedDst.group_data = (DDSMonitoring.GroupDataQosPolicy) typedDst.group_data.copy_from(typedSrc.group_data);
        typedDst.entity_factory = (DDSMonitoring.EntityFactoryQosPolicy) typedDst.entity_factory.copy_from(typedSrc.entity_factory);
        typedDst.asynchronous_publisher = (DDSMonitoring.AsynchronousPublisherQosPolicy) typedDst.asynchronous_publisher.copy_from(typedSrc.asynchronous_publisher);
        typedDst.exclusive_area = (DDSMonitoring.ExclusiveAreaQosPolicy) typedDst.exclusive_area.copy_from(typedSrc.exclusive_area);
        typedDst.protocol = (DDSMonitoring.PublisherProtocolQosPolicy) typedDst.protocol.copy_from(typedSrc.protocol);
        typedDst.publisher_name = (DDSMonitoring.EntityNameQosPolicy) typedDst.publisher_name.copy_from(typedSrc.publisher_name);

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

        strBuffer.append(presentation.toString("presentation ", indent+1));
        strBuffer.append(partition.toString("partition ", indent+1));
        strBuffer.append(group_data.toString("group_data ", indent+1));
        strBuffer.append(entity_factory.toString("entity_factory ", indent+1));
        strBuffer.append(asynchronous_publisher.toString("asynchronous_publisher ", indent+1));
        strBuffer.append(exclusive_area.toString("exclusive_area ", indent+1));
        strBuffer.append(protocol.toString("protocol ", indent+1));
        strBuffer.append(publisher_name.toString("publisher_name ", indent+1));

        return strBuffer.toString();
    }

}
