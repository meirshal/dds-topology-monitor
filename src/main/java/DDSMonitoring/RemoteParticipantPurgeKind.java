

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

public class RemoteParticipantPurgeKind  extends Enum {

    public static final RemoteParticipantPurgeKind LIVELINESS_BASED_REMOTE_PARTICIPANT_PURGE = new RemoteParticipantPurgeKind("LIVELINESS_BASED_REMOTE_PARTICIPANT_PURGE", 0);
    public static final int _LIVELINESS_BASED_REMOTE_PARTICIPANT_PURGE = 0;
    public static final RemoteParticipantPurgeKind NO_REMOTE_PARTICIPANT_PURGE = new RemoteParticipantPurgeKind("NO_REMOTE_PARTICIPANT_PURGE", 1);
    public static final int _NO_REMOTE_PARTICIPANT_PURGE = 1;
    public static RemoteParticipantPurgeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return RemoteParticipantPurgeKind.LIVELINESS_BASED_REMOTE_PARTICIPANT_PURGE;
            case 1: return RemoteParticipantPurgeKind.NO_REMOTE_PARTICIPANT_PURGE;

        }
        return null;
    }

    public static RemoteParticipantPurgeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[2];

        values[i] = LIVELINESS_BASED_REMOTE_PARTICIPANT_PURGE.ordinal();
        i++;
        values[i] = NO_REMOTE_PARTICIPANT_PURGE.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static RemoteParticipantPurgeKind create() {

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

    private RemoteParticipantPurgeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

