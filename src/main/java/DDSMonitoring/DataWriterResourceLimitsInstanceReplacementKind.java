

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

public class DataWriterResourceLimitsInstanceReplacementKind  extends Enum {

    public static final DataWriterResourceLimitsInstanceReplacementKind UNREGISTERED_INSTANCE_REPLACEMENT = new DataWriterResourceLimitsInstanceReplacementKind("UNREGISTERED_INSTANCE_REPLACEMENT", 0);
    public static final int _UNREGISTERED_INSTANCE_REPLACEMENT = 0;
    public static final DataWriterResourceLimitsInstanceReplacementKind ALIVE_INSTANCE_REPLACEMENT = new DataWriterResourceLimitsInstanceReplacementKind("ALIVE_INSTANCE_REPLACEMENT", 1);
    public static final int _ALIVE_INSTANCE_REPLACEMENT = 1;
    public static final DataWriterResourceLimitsInstanceReplacementKind DISPOSED_INSTANCE_REPLACEMENT = new DataWriterResourceLimitsInstanceReplacementKind("DISPOSED_INSTANCE_REPLACEMENT", 2);
    public static final int _DISPOSED_INSTANCE_REPLACEMENT = 2;
    public static final DataWriterResourceLimitsInstanceReplacementKind ALIVE_THEN_DISPOSED_INSTANCE_REPLACEMENT = new DataWriterResourceLimitsInstanceReplacementKind("ALIVE_THEN_DISPOSED_INSTANCE_REPLACEMENT", 3);
    public static final int _ALIVE_THEN_DISPOSED_INSTANCE_REPLACEMENT = 3;
    public static final DataWriterResourceLimitsInstanceReplacementKind DISPOSED_THEN_ALIVE_INSTANCE_REPLACEMENT = new DataWriterResourceLimitsInstanceReplacementKind("DISPOSED_THEN_ALIVE_INSTANCE_REPLACEMENT", 4);
    public static final int _DISPOSED_THEN_ALIVE_INSTANCE_REPLACEMENT = 4;
    public static final DataWriterResourceLimitsInstanceReplacementKind ALIVE_OR_DISPOSED_INSTANCE_REPLACEMENT = new DataWriterResourceLimitsInstanceReplacementKind("ALIVE_OR_DISPOSED_INSTANCE_REPLACEMENT", 5);
    public static final int _ALIVE_OR_DISPOSED_INSTANCE_REPLACEMENT = 5;
    public static DataWriterResourceLimitsInstanceReplacementKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return DataWriterResourceLimitsInstanceReplacementKind.UNREGISTERED_INSTANCE_REPLACEMENT;
            case 1: return DataWriterResourceLimitsInstanceReplacementKind.ALIVE_INSTANCE_REPLACEMENT;
            case 2: return DataWriterResourceLimitsInstanceReplacementKind.DISPOSED_INSTANCE_REPLACEMENT;
            case 3: return DataWriterResourceLimitsInstanceReplacementKind.ALIVE_THEN_DISPOSED_INSTANCE_REPLACEMENT;
            case 4: return DataWriterResourceLimitsInstanceReplacementKind.DISPOSED_THEN_ALIVE_INSTANCE_REPLACEMENT;
            case 5: return DataWriterResourceLimitsInstanceReplacementKind.ALIVE_OR_DISPOSED_INSTANCE_REPLACEMENT;

        }
        return null;
    }

    public static DataWriterResourceLimitsInstanceReplacementKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[6];

        values[i] = UNREGISTERED_INSTANCE_REPLACEMENT.ordinal();
        i++;
        values[i] = ALIVE_INSTANCE_REPLACEMENT.ordinal();
        i++;
        values[i] = DISPOSED_INSTANCE_REPLACEMENT.ordinal();
        i++;
        values[i] = ALIVE_THEN_DISPOSED_INSTANCE_REPLACEMENT.ordinal();
        i++;
        values[i] = DISPOSED_THEN_ALIVE_INSTANCE_REPLACEMENT.ordinal();
        i++;
        values[i] = ALIVE_OR_DISPOSED_INSTANCE_REPLACEMENT.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static DataWriterResourceLimitsInstanceReplacementKind create() {

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

    private DataWriterResourceLimitsInstanceReplacementKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

