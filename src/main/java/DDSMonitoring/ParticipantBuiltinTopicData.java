

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

public class ParticipantBuiltinTopicData   implements Copyable, Serializable{

    public DDSMonitoring.BuiltinTopicKey_t key = (DDSMonitoring.BuiltinTopicKey_t)DDSMonitoring.BuiltinTopicKey_t.create();
    public DDSMonitoring.UserDataQosPolicy user_data = (DDSMonitoring.UserDataQosPolicy)DDSMonitoring.UserDataQosPolicy.create();

    public ParticipantBuiltinTopicData() {

    }
    public ParticipantBuiltinTopicData (ParticipantBuiltinTopicData other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ParticipantBuiltinTopicData self;
        self = new  ParticipantBuiltinTopicData();
        self.clear();
        return self;

    }

    public void clear() {

        if (key != null) {
            key.clear();
        }
        if (user_data != null) {
            user_data.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ParticipantBuiltinTopicData otherObj = (ParticipantBuiltinTopicData)o;

        if(!key.equals(otherObj.key)) {
            return false;
        }
        if(!user_data.equals(otherObj.user_data)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += key.hashCode(); 
        __result += user_data.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ParticipantBuiltinTopicDataTypeSupport</code>
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

        ParticipantBuiltinTopicData typedSrc = (ParticipantBuiltinTopicData) src;
        ParticipantBuiltinTopicData typedDst = this;

        typedDst.key = (DDSMonitoring.BuiltinTopicKey_t) typedDst.key.copy_from(typedSrc.key);
        typedDst.user_data = (DDSMonitoring.UserDataQosPolicy) typedDst.user_data.copy_from(typedSrc.user_data);

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

        strBuffer.append(key.toString("key ", indent+1));
        strBuffer.append(user_data.toString("user_data ", indent+1));

        return strBuffer.toString();
    }

}
