

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

public class DomainParticipantFactoryQos   implements Copyable, Serializable{

    public DDSMonitoring.EntityFactoryQosPolicy entity_factory = (DDSMonitoring.EntityFactoryQosPolicy)DDSMonitoring.EntityFactoryQosPolicy.create();
    public DDSMonitoring.SystemResourceLimitsQosPolicy resource_limits = (DDSMonitoring.SystemResourceLimitsQosPolicy)DDSMonitoring.SystemResourceLimitsQosPolicy.create();
    public DDSMonitoring.ProfileQosPolicy profile = (DDSMonitoring.ProfileQosPolicy)DDSMonitoring.ProfileQosPolicy.create();

    public DomainParticipantFactoryQos() {

    }
    public DomainParticipantFactoryQos (DomainParticipantFactoryQos other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DomainParticipantFactoryQos self;
        self = new  DomainParticipantFactoryQos();
        self.clear();
        return self;

    }

    public void clear() {

        if (entity_factory != null) {
            entity_factory.clear();
        }
        if (resource_limits != null) {
            resource_limits.clear();
        }
        if (profile != null) {
            profile.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DomainParticipantFactoryQos otherObj = (DomainParticipantFactoryQos)o;

        if(!entity_factory.equals(otherObj.entity_factory)) {
            return false;
        }
        if(!resource_limits.equals(otherObj.resource_limits)) {
            return false;
        }
        if(!profile.equals(otherObj.profile)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += entity_factory.hashCode(); 
        __result += resource_limits.hashCode(); 
        __result += profile.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DomainParticipantFactoryQosTypeSupport</code>
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

        DomainParticipantFactoryQos typedSrc = (DomainParticipantFactoryQos) src;
        DomainParticipantFactoryQos typedDst = this;

        typedDst.entity_factory = (DDSMonitoring.EntityFactoryQosPolicy) typedDst.entity_factory.copy_from(typedSrc.entity_factory);
        typedDst.resource_limits = (DDSMonitoring.SystemResourceLimitsQosPolicy) typedDst.resource_limits.copy_from(typedSrc.resource_limits);
        typedDst.profile = (DDSMonitoring.ProfileQosPolicy) typedDst.profile.copy_from(typedSrc.profile);

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

        strBuffer.append(entity_factory.toString("entity_factory ", indent+1));
        strBuffer.append(resource_limits.toString("resource_limits ", indent+1));
        strBuffer.append(profile.toString("profile ", indent+1));

        return strBuffer.toString();
    }

}
