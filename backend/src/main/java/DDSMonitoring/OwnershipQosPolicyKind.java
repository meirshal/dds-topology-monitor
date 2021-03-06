

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

public class OwnershipQosPolicyKind  extends Enum {

    public static final OwnershipQosPolicyKind SHARED_OWNERSHIP_QOS = new OwnershipQosPolicyKind("SHARED_OWNERSHIP_QOS", 0);
    public static final int _SHARED_OWNERSHIP_QOS = 0;
    public static final OwnershipQosPolicyKind EXCLUSIVE_OWNERSHIP_QOS = new OwnershipQosPolicyKind("EXCLUSIVE_OWNERSHIP_QOS", 1);
    public static final int _EXCLUSIVE_OWNERSHIP_QOS = 1;
    public static OwnershipQosPolicyKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return OwnershipQosPolicyKind.SHARED_OWNERSHIP_QOS;
            case 1: return OwnershipQosPolicyKind.EXCLUSIVE_OWNERSHIP_QOS;

        }
        return null;
    }

    public static OwnershipQosPolicyKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[2];

        values[i] = SHARED_OWNERSHIP_QOS.ordinal();
        i++;
        values[i] = EXCLUSIVE_OWNERSHIP_QOS.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static OwnershipQosPolicyKind create() {

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

    private OwnershipQosPolicyKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

