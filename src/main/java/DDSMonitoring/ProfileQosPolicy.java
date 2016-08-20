

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

public class ProfileQosPolicy   implements Copyable, Serializable{

    public StringSeq string_profile =  new StringSeq(256);
    public StringSeq url_profile =  new StringSeq(256);
    public boolean ignore_user_profile= false;
    public boolean ignore_environment_profile= false;
    public boolean ignore_resource_profile= false;
    public StringSeq string_profile_dtd =  new StringSeq(256);

    public ProfileQosPolicy() {

    }
    public ProfileQosPolicy (ProfileQosPolicy other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ProfileQosPolicy self;
        self = new  ProfileQosPolicy();
        self.clear();
        return self;

    }

    public void clear() {

        if (string_profile != null) {
            string_profile.clear();
        }
        if (url_profile != null) {
            url_profile.clear();
        }
        ignore_user_profile= false;
        ignore_environment_profile= false;
        ignore_resource_profile= false;
        if (string_profile_dtd != null) {
            string_profile_dtd.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ProfileQosPolicy otherObj = (ProfileQosPolicy)o;

        if(!string_profile.equals(otherObj.string_profile)) {
            return false;
        }
        if(!url_profile.equals(otherObj.url_profile)) {
            return false;
        }
        if(ignore_user_profile != otherObj.ignore_user_profile) {
            return false;
        }
        if(ignore_environment_profile != otherObj.ignore_environment_profile) {
            return false;
        }
        if(ignore_resource_profile != otherObj.ignore_resource_profile) {
            return false;
        }
        if(!string_profile_dtd.equals(otherObj.string_profile_dtd)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += string_profile.hashCode(); 
        __result += url_profile.hashCode(); 
        __result += (ignore_user_profile == true)?1:0;
        __result += (ignore_environment_profile == true)?1:0;
        __result += (ignore_resource_profile == true)?1:0;
        __result += string_profile_dtd.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ProfileQosPolicyTypeSupport</code>
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

        ProfileQosPolicy typedSrc = (ProfileQosPolicy) src;
        ProfileQosPolicy typedDst = this;

        typedDst.string_profile.copy_from(typedSrc.string_profile);
        typedDst.url_profile.copy_from(typedSrc.url_profile);
        typedDst.ignore_user_profile = typedSrc.ignore_user_profile;
        typedDst.ignore_environment_profile = typedSrc.ignore_environment_profile;
        typedDst.ignore_resource_profile = typedSrc.ignore_resource_profile;
        typedDst.string_profile_dtd.copy_from(typedSrc.string_profile_dtd);

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
        strBuffer.append("string_profile: ");
        for(int i__ = 0; i__ < string_profile.size(); ++i__) {
            if (i__!=0) strBuffer.append(", ");
            strBuffer.append(string_profile.get(i__));
        }
        strBuffer.append("\n"); 
        CdrHelper.printIndent(strBuffer, indent+1);
        strBuffer.append("url_profile: ");
        for(int i__ = 0; i__ < url_profile.size(); ++i__) {
            if (i__!=0) strBuffer.append(", ");
            strBuffer.append(url_profile.get(i__));
        }
        strBuffer.append("\n"); 
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("ignore_user_profile: ").append(ignore_user_profile).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("ignore_environment_profile: ").append(ignore_environment_profile).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("ignore_resource_profile: ").append(ignore_resource_profile).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);
        strBuffer.append("string_profile_dtd: ");
        for(int i__ = 0; i__ < string_profile_dtd.size(); ++i__) {
            if (i__!=0) strBuffer.append(", ");
            strBuffer.append(string_profile_dtd.get(i__));
        }
        strBuffer.append("\n"); 

        return strBuffer.toString();
    }

}
