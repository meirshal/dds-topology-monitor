

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

public class SampleRejectedStatusKind  extends Enum {

    public static final SampleRejectedStatusKind NOT_REJECTED = new SampleRejectedStatusKind("NOT_REJECTED", 0);
    public static final int _NOT_REJECTED = 0;
    public static final SampleRejectedStatusKind REJECTED_BY_INSTANCES_LIMIT = new SampleRejectedStatusKind("REJECTED_BY_INSTANCES_LIMIT", 1);
    public static final int _REJECTED_BY_INSTANCES_LIMIT = 1;
    public static final SampleRejectedStatusKind REJECTED_BY_SAMPLES_LIMIT = new SampleRejectedStatusKind("REJECTED_BY_SAMPLES_LIMIT", 2);
    public static final int _REJECTED_BY_SAMPLES_LIMIT = 2;
    public static final SampleRejectedStatusKind REJECTED_BY_SAMPLES_PER_INSTANCE_LIMIT = new SampleRejectedStatusKind("REJECTED_BY_SAMPLES_PER_INSTANCE_LIMIT", 3);
    public static final int _REJECTED_BY_SAMPLES_PER_INSTANCE_LIMIT = 3;
    public static final SampleRejectedStatusKind REJECTED_BY_REMOTE_WRITERS_LIMIT = new SampleRejectedStatusKind("REJECTED_BY_REMOTE_WRITERS_LIMIT", 4);
    public static final int _REJECTED_BY_REMOTE_WRITERS_LIMIT = 4;
    public static final SampleRejectedStatusKind REJECTED_BY_REMOTE_WRITERS_PER_INSTANCE_LIMIT = new SampleRejectedStatusKind("REJECTED_BY_REMOTE_WRITERS_PER_INSTANCE_LIMIT", 5);
    public static final int _REJECTED_BY_REMOTE_WRITERS_PER_INSTANCE_LIMIT = 5;
    public static final SampleRejectedStatusKind REJECTED_BY_SAMPLES_PER_REMOTE_WRITER_LIMIT = new SampleRejectedStatusKind("REJECTED_BY_SAMPLES_PER_REMOTE_WRITER_LIMIT", 6);
    public static final int _REJECTED_BY_SAMPLES_PER_REMOTE_WRITER_LIMIT = 6;
    public static final SampleRejectedStatusKind REJECTED_BY_VIRTUAL_WRITERS_LIMIT = new SampleRejectedStatusKind("REJECTED_BY_VIRTUAL_WRITERS_LIMIT", 7);
    public static final int _REJECTED_BY_VIRTUAL_WRITERS_LIMIT = 7;
    public static final SampleRejectedStatusKind REJECTED_BY_REMOTE_WRITERS_PER_SAMPLE_LIMIT = new SampleRejectedStatusKind("REJECTED_BY_REMOTE_WRITERS_PER_SAMPLE_LIMIT", 8);
    public static final int _REJECTED_BY_REMOTE_WRITERS_PER_SAMPLE_LIMIT = 8;
    public static final SampleRejectedStatusKind REJECTED_BY_REMOTE_WRITER_SAMPLES_PER_VIRTUAL_QUEUE_LIMIT = new SampleRejectedStatusKind("REJECTED_BY_REMOTE_WRITER_SAMPLES_PER_VIRTUAL_QUEUE_LIMIT", 9);
    public static final int _REJECTED_BY_REMOTE_WRITER_SAMPLES_PER_VIRTUAL_QUEUE_LIMIT = 9;
    public static SampleRejectedStatusKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return SampleRejectedStatusKind.NOT_REJECTED;
            case 1: return SampleRejectedStatusKind.REJECTED_BY_INSTANCES_LIMIT;
            case 2: return SampleRejectedStatusKind.REJECTED_BY_SAMPLES_LIMIT;
            case 3: return SampleRejectedStatusKind.REJECTED_BY_SAMPLES_PER_INSTANCE_LIMIT;
            case 4: return SampleRejectedStatusKind.REJECTED_BY_REMOTE_WRITERS_LIMIT;
            case 5: return SampleRejectedStatusKind.REJECTED_BY_REMOTE_WRITERS_PER_INSTANCE_LIMIT;
            case 6: return SampleRejectedStatusKind.REJECTED_BY_SAMPLES_PER_REMOTE_WRITER_LIMIT;
            case 7: return SampleRejectedStatusKind.REJECTED_BY_VIRTUAL_WRITERS_LIMIT;
            case 8: return SampleRejectedStatusKind.REJECTED_BY_REMOTE_WRITERS_PER_SAMPLE_LIMIT;
            case 9: return SampleRejectedStatusKind.REJECTED_BY_REMOTE_WRITER_SAMPLES_PER_VIRTUAL_QUEUE_LIMIT;

        }
        return null;
    }

    public static SampleRejectedStatusKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[10];

        values[i] = NOT_REJECTED.ordinal();
        i++;
        values[i] = REJECTED_BY_INSTANCES_LIMIT.ordinal();
        i++;
        values[i] = REJECTED_BY_SAMPLES_LIMIT.ordinal();
        i++;
        values[i] = REJECTED_BY_SAMPLES_PER_INSTANCE_LIMIT.ordinal();
        i++;
        values[i] = REJECTED_BY_REMOTE_WRITERS_LIMIT.ordinal();
        i++;
        values[i] = REJECTED_BY_REMOTE_WRITERS_PER_INSTANCE_LIMIT.ordinal();
        i++;
        values[i] = REJECTED_BY_SAMPLES_PER_REMOTE_WRITER_LIMIT.ordinal();
        i++;
        values[i] = REJECTED_BY_VIRTUAL_WRITERS_LIMIT.ordinal();
        i++;
        values[i] = REJECTED_BY_REMOTE_WRITERS_PER_SAMPLE_LIMIT.ordinal();
        i++;
        values[i] = REJECTED_BY_REMOTE_WRITER_SAMPLES_PER_VIRTUAL_QUEUE_LIMIT.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static SampleRejectedStatusKind create() {

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

    private SampleRejectedStatusKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

