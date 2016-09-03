

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

public class DomainParticipantResourceLimitsIgnoredEntityReplacementKind  extends Enum {

    public static final DomainParticipantResourceLimitsIgnoredEntityReplacementKind NO_REPLACEMENT_IGNORED_ENTITY_REPLACEMENT = new DomainParticipantResourceLimitsIgnoredEntityReplacementKind("NO_REPLACEMENT_IGNORED_ENTITY_REPLACEMENT", 0);
    public static final int _NO_REPLACEMENT_IGNORED_ENTITY_REPLACEMENT = 0;
    public static final DomainParticipantResourceLimitsIgnoredEntityReplacementKind NOT_ALIVE_FIRST_IGNORED_ENTITY_REPLACEMENT = new DomainParticipantResourceLimitsIgnoredEntityReplacementKind("NOT_ALIVE_FIRST_IGNORED_ENTITY_REPLACEMENT", 1);
    public static final int _NOT_ALIVE_FIRST_IGNORED_ENTITY_REPLACEMENT = 1;
    public static DomainParticipantResourceLimitsIgnoredEntityReplacementKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return DomainParticipantResourceLimitsIgnoredEntityReplacementKind.NO_REPLACEMENT_IGNORED_ENTITY_REPLACEMENT;
            case 1: return DomainParticipantResourceLimitsIgnoredEntityReplacementKind.NOT_ALIVE_FIRST_IGNORED_ENTITY_REPLACEMENT;

        }
        return null;
    }

    public static DomainParticipantResourceLimitsIgnoredEntityReplacementKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[2];

        values[i] = NO_REPLACEMENT_IGNORED_ENTITY_REPLACEMENT.ordinal();
        i++;
        values[i] = NOT_ALIVE_FIRST_IGNORED_ENTITY_REPLACEMENT.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static DomainParticipantResourceLimitsIgnoredEntityReplacementKind create() {

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

    private DomainParticipantResourceLimitsIgnoredEntityReplacementKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

