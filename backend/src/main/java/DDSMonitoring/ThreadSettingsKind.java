

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

public class ThreadSettingsKind  extends Enum {

    public static final ThreadSettingsKind THREAD_SETTINGS_DEFAULT = new ThreadSettingsKind("THREAD_SETTINGS_DEFAULT", 0);
    public static final int _THREAD_SETTINGS_DEFAULT = 0;
    public static final ThreadSettingsKind THREAD_SETTINGS_FLOATING_POINT = new ThreadSettingsKind("THREAD_SETTINGS_FLOATING_POINT", 1);
    public static final int _THREAD_SETTINGS_FLOATING_POINT = 1;
    public static final ThreadSettingsKind THREAD_SETTINGS_STDIO = new ThreadSettingsKind("THREAD_SETTINGS_STDIO", 2);
    public static final int _THREAD_SETTINGS_STDIO = 2;
    public static final ThreadSettingsKind THREAD_SETTINGS_REALTIME_PRIORITY = new ThreadSettingsKind("THREAD_SETTINGS_REALTIME_PRIORITY", 8);
    public static final int _THREAD_SETTINGS_REALTIME_PRIORITY = 8;
    public static final ThreadSettingsKind THREAD_SETTINGS_PRIORITY_ENFORCE = new ThreadSettingsKind("THREAD_SETTINGS_PRIORITY_ENFORCE", 16);
    public static final int _THREAD_SETTINGS_PRIORITY_ENFORCE = 16;
    public static final ThreadSettingsKind THREAD_SETTINGS_CANCEL_ASYNCHRONOUS = new ThreadSettingsKind("THREAD_SETTINGS_CANCEL_ASYNCHRONOUS", 32);
    public static final int _THREAD_SETTINGS_CANCEL_ASYNCHRONOUS = 32;
    public static ThreadSettingsKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return ThreadSettingsKind.THREAD_SETTINGS_DEFAULT;
            case 1: return ThreadSettingsKind.THREAD_SETTINGS_FLOATING_POINT;
            case 2: return ThreadSettingsKind.THREAD_SETTINGS_STDIO;
            case 8: return ThreadSettingsKind.THREAD_SETTINGS_REALTIME_PRIORITY;
            case 16: return ThreadSettingsKind.THREAD_SETTINGS_PRIORITY_ENFORCE;
            case 32: return ThreadSettingsKind.THREAD_SETTINGS_CANCEL_ASYNCHRONOUS;

        }
        return null;
    }

    public static ThreadSettingsKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[6];

        values[i] = THREAD_SETTINGS_DEFAULT.ordinal();
        i++;
        values[i] = THREAD_SETTINGS_FLOATING_POINT.ordinal();
        i++;
        values[i] = THREAD_SETTINGS_STDIO.ordinal();
        i++;
        values[i] = THREAD_SETTINGS_REALTIME_PRIORITY.ordinal();
        i++;
        values[i] = THREAD_SETTINGS_PRIORITY_ENFORCE.ordinal();
        i++;
        values[i] = THREAD_SETTINGS_CANCEL_ASYNCHRONOUS.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ThreadSettingsKind create() {

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

    private ThreadSettingsKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

