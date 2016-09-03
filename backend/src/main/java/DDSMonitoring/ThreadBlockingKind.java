

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

public class ThreadBlockingKind  extends Enum {

    public static final ThreadBlockingKind SEMAPHORE_BLOCKING_KIND = new ThreadBlockingKind("SEMAPHORE_BLOCKING_KIND", 0);
    public static final int _SEMAPHORE_BLOCKING_KIND = 0;
    public static final ThreadBlockingKind SPIN_BLOCKING_KIND = new ThreadBlockingKind("SPIN_BLOCKING_KIND", 1);
    public static final int _SPIN_BLOCKING_KIND = 1;
    public static ThreadBlockingKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return ThreadBlockingKind.SEMAPHORE_BLOCKING_KIND;
            case 1: return ThreadBlockingKind.SPIN_BLOCKING_KIND;

        }
        return null;
    }

    public static ThreadBlockingKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[2];

        values[i] = SEMAPHORE_BLOCKING_KIND.ordinal();
        i++;
        values[i] = SPIN_BLOCKING_KIND.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ThreadBlockingKind create() {

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

    private ThreadBlockingKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

