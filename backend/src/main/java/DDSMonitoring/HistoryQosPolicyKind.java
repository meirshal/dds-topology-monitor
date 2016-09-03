

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

public class HistoryQosPolicyKind  extends Enum {

    public static final HistoryQosPolicyKind KEEP_LAST_HISTORY_QOS = new HistoryQosPolicyKind("KEEP_LAST_HISTORY_QOS", 0);
    public static final int _KEEP_LAST_HISTORY_QOS = 0;
    public static final HistoryQosPolicyKind KEEP_ALL_HISTORY_QOS = new HistoryQosPolicyKind("KEEP_ALL_HISTORY_QOS", 1);
    public static final int _KEEP_ALL_HISTORY_QOS = 1;
    public static HistoryQosPolicyKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return HistoryQosPolicyKind.KEEP_LAST_HISTORY_QOS;
            case 1: return HistoryQosPolicyKind.KEEP_ALL_HISTORY_QOS;

        }
        return null;
    }

    public static HistoryQosPolicyKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[2];

        values[i] = KEEP_LAST_HISTORY_QOS.ordinal();
        i++;
        values[i] = KEEP_ALL_HISTORY_QOS.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static HistoryQosPolicyKind create() {

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

    private HistoryQosPolicyKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

