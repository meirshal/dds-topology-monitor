

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

public class CdrPaddingKind  extends Enum {

    public static final CdrPaddingKind ZERO_CDR_PADDING = new CdrPaddingKind("ZERO_CDR_PADDING", 0);
    public static final int _ZERO_CDR_PADDING = 0;
    public static final CdrPaddingKind NOT_SET_CDR_PADDING = new CdrPaddingKind("NOT_SET_CDR_PADDING", 1);
    public static final int _NOT_SET_CDR_PADDING = 1;
    public static final CdrPaddingKind AUTO_CDR_PADDING = new CdrPaddingKind("AUTO_CDR_PADDING", 2);
    public static final int _AUTO_CDR_PADDING = 2;
    public static CdrPaddingKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return CdrPaddingKind.ZERO_CDR_PADDING;
            case 1: return CdrPaddingKind.NOT_SET_CDR_PADDING;
            case 2: return CdrPaddingKind.AUTO_CDR_PADDING;

        }
        return null;
    }

    public static CdrPaddingKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[3];

        values[i] = ZERO_CDR_PADDING.ordinal();
        i++;
        values[i] = NOT_SET_CDR_PADDING.ordinal();
        i++;
        values[i] = AUTO_CDR_PADDING.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static CdrPaddingKind create() {

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

    private CdrPaddingKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

