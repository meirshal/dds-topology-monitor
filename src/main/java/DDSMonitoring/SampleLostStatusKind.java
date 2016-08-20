

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

public class SampleLostStatusKind  extends Enum {

    public static final SampleLostStatusKind NOT_LOST = new SampleLostStatusKind("NOT_LOST", 0);
    public static final int _NOT_LOST = 0;
    public static final SampleLostStatusKind LOST_BY_WRITER = new SampleLostStatusKind("LOST_BY_WRITER", 1);
    public static final int _LOST_BY_WRITER = 1;
    public static final SampleLostStatusKind LOST_BY_INSTANCES_LIMIT = new SampleLostStatusKind("LOST_BY_INSTANCES_LIMIT", 2);
    public static final int _LOST_BY_INSTANCES_LIMIT = 2;
    public static final SampleLostStatusKind LOST_BY_REMOTE_WRITERS_PER_INSTANCE_LIMIT = new SampleLostStatusKind("LOST_BY_REMOTE_WRITERS_PER_INSTANCE_LIMIT", 3);
    public static final int _LOST_BY_REMOTE_WRITERS_PER_INSTANCE_LIMIT = 3;
    public static final SampleLostStatusKind LOST_BY_INCOMPLETE_COHERENT_SET = new SampleLostStatusKind("LOST_BY_INCOMPLETE_COHERENT_SET", 4);
    public static final int _LOST_BY_INCOMPLETE_COHERENT_SET = 4;
    public static final SampleLostStatusKind LOST_BY_LARGE_COHERENT_SET = new SampleLostStatusKind("LOST_BY_LARGE_COHERENT_SET", 5);
    public static final int _LOST_BY_LARGE_COHERENT_SET = 5;
    public static final SampleLostStatusKind LOST_BY_SAMPLES_PER_REMOTE_WRITER_LIMIT = new SampleLostStatusKind("LOST_BY_SAMPLES_PER_REMOTE_WRITER_LIMIT", 6);
    public static final int _LOST_BY_SAMPLES_PER_REMOTE_WRITER_LIMIT = 6;
    public static final SampleLostStatusKind LOST_BY_VIRTUAL_WRITERS_LIMIT = new SampleLostStatusKind("LOST_BY_VIRTUAL_WRITERS_LIMIT", 7);
    public static final int _LOST_BY_VIRTUAL_WRITERS_LIMIT = 7;
    public static final SampleLostStatusKind LOST_BY_REMOTE_WRITERS_PER_SAMPLE_LIMIT = new SampleLostStatusKind("LOST_BY_REMOTE_WRITERS_PER_SAMPLE_LIMIT", 8);
    public static final int _LOST_BY_REMOTE_WRITERS_PER_SAMPLE_LIMIT = 8;
    public static final SampleLostStatusKind LOST_BY_AVAILABILITY_WAITING_TIME = new SampleLostStatusKind("LOST_BY_AVAILABILITY_WAITING_TIME", 9);
    public static final int _LOST_BY_AVAILABILITY_WAITING_TIME = 9;
    public static final SampleLostStatusKind LOST_BY_REMOTE_WRITER_SAMPLES_PER_VIRTUAL_QUEUE_LIMIT = new SampleLostStatusKind("LOST_BY_REMOTE_WRITER_SAMPLES_PER_VIRTUAL_QUEUE_LIMIT", 10);
    public static final int _LOST_BY_REMOTE_WRITER_SAMPLES_PER_VIRTUAL_QUEUE_LIMIT = 10;
    public static SampleLostStatusKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return SampleLostStatusKind.NOT_LOST;
            case 1: return SampleLostStatusKind.LOST_BY_WRITER;
            case 2: return SampleLostStatusKind.LOST_BY_INSTANCES_LIMIT;
            case 3: return SampleLostStatusKind.LOST_BY_REMOTE_WRITERS_PER_INSTANCE_LIMIT;
            case 4: return SampleLostStatusKind.LOST_BY_INCOMPLETE_COHERENT_SET;
            case 5: return SampleLostStatusKind.LOST_BY_LARGE_COHERENT_SET;
            case 6: return SampleLostStatusKind.LOST_BY_SAMPLES_PER_REMOTE_WRITER_LIMIT;
            case 7: return SampleLostStatusKind.LOST_BY_VIRTUAL_WRITERS_LIMIT;
            case 8: return SampleLostStatusKind.LOST_BY_REMOTE_WRITERS_PER_SAMPLE_LIMIT;
            case 9: return SampleLostStatusKind.LOST_BY_AVAILABILITY_WAITING_TIME;
            case 10: return SampleLostStatusKind.LOST_BY_REMOTE_WRITER_SAMPLES_PER_VIRTUAL_QUEUE_LIMIT;

        }
        return null;
    }

    public static SampleLostStatusKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[11];

        values[i] = NOT_LOST.ordinal();
        i++;
        values[i] = LOST_BY_WRITER.ordinal();
        i++;
        values[i] = LOST_BY_INSTANCES_LIMIT.ordinal();
        i++;
        values[i] = LOST_BY_REMOTE_WRITERS_PER_INSTANCE_LIMIT.ordinal();
        i++;
        values[i] = LOST_BY_INCOMPLETE_COHERENT_SET.ordinal();
        i++;
        values[i] = LOST_BY_LARGE_COHERENT_SET.ordinal();
        i++;
        values[i] = LOST_BY_SAMPLES_PER_REMOTE_WRITER_LIMIT.ordinal();
        i++;
        values[i] = LOST_BY_VIRTUAL_WRITERS_LIMIT.ordinal();
        i++;
        values[i] = LOST_BY_REMOTE_WRITERS_PER_SAMPLE_LIMIT.ordinal();
        i++;
        values[i] = LOST_BY_AVAILABILITY_WAITING_TIME.ordinal();
        i++;
        values[i] = LOST_BY_REMOTE_WRITER_SAMPLES_PER_VIRTUAL_QUEUE_LIMIT.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static SampleLostStatusKind create() {

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

    private SampleLostStatusKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

