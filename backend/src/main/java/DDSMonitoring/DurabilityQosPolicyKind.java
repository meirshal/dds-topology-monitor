

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package DDSMonitoring;

import com.rti.dds.util.Enum;
import com.rti.dds.cdr.CdrHelper;
import java.util.Arrays;
import java.io.ObjectStreamException;

public class DurabilityQosPolicyKind  extends Enum {

    public static final DurabilityQosPolicyKind VOLATILE_DURABILITY_QOS = new DurabilityQosPolicyKind("VOLATILE_DURABILITY_QOS", 0);
    public static final int _VOLATILE_DURABILITY_QOS = 0;
    public static final DurabilityQosPolicyKind TRANSIENT_LOCAL_DURABILITY_QOS = new DurabilityQosPolicyKind("TRANSIENT_LOCAL_DURABILITY_QOS", 1);
    public static final int _TRANSIENT_LOCAL_DURABILITY_QOS = 1;
    public static final DurabilityQosPolicyKind TRANSIENT_DURABILITY_QOS = new DurabilityQosPolicyKind("TRANSIENT_DURABILITY_QOS", 2);
    public static final int _TRANSIENT_DURABILITY_QOS = 2;
    public static final DurabilityQosPolicyKind PERSISTENT_DURABILITY_QOS = new DurabilityQosPolicyKind("PERSISTENT_DURABILITY_QOS", 3);
    public static final int _PERSISTENT_DURABILITY_QOS = 3;
    public static DurabilityQosPolicyKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return DurabilityQosPolicyKind.VOLATILE_DURABILITY_QOS;
            case 1: return DurabilityQosPolicyKind.TRANSIENT_LOCAL_DURABILITY_QOS;
            case 2: return DurabilityQosPolicyKind.TRANSIENT_DURABILITY_QOS;
            case 3: return DurabilityQosPolicyKind.PERSISTENT_DURABILITY_QOS;

        }
        return null;
    }

    public static DurabilityQosPolicyKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[4];

        values[i] = VOLATILE_DURABILITY_QOS.ordinal();
        i++;
        values[i] = TRANSIENT_LOCAL_DURABILITY_QOS.ordinal();
        i++;
        values[i] = TRANSIENT_DURABILITY_QOS.ordinal();
        i++;
        values[i] = PERSISTENT_DURABILITY_QOS.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static DurabilityQosPolicyKind create() {

        return valueOf(0);
    }

    /**
    * Print Method
    */     
    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();

        CdrHelper.printIndent(strBuffer, indent);

        if (desc != null) {
            strBuffer.append(desc).append(": ");
        }

        strBuffer.append(this);
        strBuffer.append("\n");              
        return strBuffer.toString();
    }

    private Object readResolve() throws ObjectStreamException {
        return valueOf(ordinal());
    }

    private DurabilityQosPolicyKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

