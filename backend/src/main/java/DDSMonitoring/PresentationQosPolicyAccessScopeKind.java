

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

public class PresentationQosPolicyAccessScopeKind  extends Enum {

    public static final PresentationQosPolicyAccessScopeKind INSTANCE_PRESENTATION_QOS = new PresentationQosPolicyAccessScopeKind("INSTANCE_PRESENTATION_QOS", 0);
    public static final int _INSTANCE_PRESENTATION_QOS = 0;
    public static final PresentationQosPolicyAccessScopeKind TOPIC_PRESENTATION_QOS = new PresentationQosPolicyAccessScopeKind("TOPIC_PRESENTATION_QOS", 1);
    public static final int _TOPIC_PRESENTATION_QOS = 1;
    public static final PresentationQosPolicyAccessScopeKind GROUP_PRESENTATION_QOS = new PresentationQosPolicyAccessScopeKind("GROUP_PRESENTATION_QOS", 2);
    public static final int _GROUP_PRESENTATION_QOS = 2;
    public static final PresentationQosPolicyAccessScopeKind HIGHEST_OFFERED_PRESENTATION_QOS = new PresentationQosPolicyAccessScopeKind("HIGHEST_OFFERED_PRESENTATION_QOS", 3);
    public static final int _HIGHEST_OFFERED_PRESENTATION_QOS = 3;
    public static PresentationQosPolicyAccessScopeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return PresentationQosPolicyAccessScopeKind.INSTANCE_PRESENTATION_QOS;
            case 1: return PresentationQosPolicyAccessScopeKind.TOPIC_PRESENTATION_QOS;
            case 2: return PresentationQosPolicyAccessScopeKind.GROUP_PRESENTATION_QOS;
            case 3: return PresentationQosPolicyAccessScopeKind.HIGHEST_OFFERED_PRESENTATION_QOS;

        }
        return null;
    }

    public static PresentationQosPolicyAccessScopeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[4];

        values[i] = INSTANCE_PRESENTATION_QOS.ordinal();
        i++;
        values[i] = TOPIC_PRESENTATION_QOS.ordinal();
        i++;
        values[i] = GROUP_PRESENTATION_QOS.ordinal();
        i++;
        values[i] = HIGHEST_OFFERED_PRESENTATION_QOS.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static PresentationQosPolicyAccessScopeKind create() {

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

    private PresentationQosPolicyAccessScopeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

