

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

public class ReliabilityQosPolicyAcknowledgementModeKind  extends Enum {

    public static final ReliabilityQosPolicyAcknowledgementModeKind PROTOCOL_ACKNOWLEDGEMENT_MODE = new ReliabilityQosPolicyAcknowledgementModeKind("PROTOCOL_ACKNOWLEDGEMENT_MODE", 0);
    public static final int _PROTOCOL_ACKNOWLEDGEMENT_MODE = 0;
    public static final ReliabilityQosPolicyAcknowledgementModeKind APPLICATION_AUTO_ACKNOWLEDGEMENT_MODE = new ReliabilityQosPolicyAcknowledgementModeKind("APPLICATION_AUTO_ACKNOWLEDGEMENT_MODE", 1);
    public static final int _APPLICATION_AUTO_ACKNOWLEDGEMENT_MODE = 1;
    public static final ReliabilityQosPolicyAcknowledgementModeKind APPLICATION_ORDERED_ACKNOWLEDGEMENT_MODE = new ReliabilityQosPolicyAcknowledgementModeKind("APPLICATION_ORDERED_ACKNOWLEDGEMENT_MODE", 2);
    public static final int _APPLICATION_ORDERED_ACKNOWLEDGEMENT_MODE = 2;
    public static final ReliabilityQosPolicyAcknowledgementModeKind APPLICATION_EXPLICIT_ACKNOWLEDGEMENT_MODE = new ReliabilityQosPolicyAcknowledgementModeKind("APPLICATION_EXPLICIT_ACKNOWLEDGEMENT_MODE", 3);
    public static final int _APPLICATION_EXPLICIT_ACKNOWLEDGEMENT_MODE = 3;
    public static ReliabilityQosPolicyAcknowledgementModeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return ReliabilityQosPolicyAcknowledgementModeKind.PROTOCOL_ACKNOWLEDGEMENT_MODE;
            case 1: return ReliabilityQosPolicyAcknowledgementModeKind.APPLICATION_AUTO_ACKNOWLEDGEMENT_MODE;
            case 2: return ReliabilityQosPolicyAcknowledgementModeKind.APPLICATION_ORDERED_ACKNOWLEDGEMENT_MODE;
            case 3: return ReliabilityQosPolicyAcknowledgementModeKind.APPLICATION_EXPLICIT_ACKNOWLEDGEMENT_MODE;

        }
        return null;
    }

    public static ReliabilityQosPolicyAcknowledgementModeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[4];

        values[i] = PROTOCOL_ACKNOWLEDGEMENT_MODE.ordinal();
        i++;
        values[i] = APPLICATION_AUTO_ACKNOWLEDGEMENT_MODE.ordinal();
        i++;
        values[i] = APPLICATION_ORDERED_ACKNOWLEDGEMENT_MODE.ordinal();
        i++;
        values[i] = APPLICATION_EXPLICIT_ACKNOWLEDGEMENT_MODE.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ReliabilityQosPolicyAcknowledgementModeKind create() {

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

    private ReliabilityQosPolicyAcknowledgementModeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

