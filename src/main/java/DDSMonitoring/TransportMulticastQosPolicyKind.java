

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

public class TransportMulticastQosPolicyKind  extends Enum {

    public static final TransportMulticastQosPolicyKind AUTOMATIC_TRANSPORT_MULTICAST_QOS = new TransportMulticastQosPolicyKind("AUTOMATIC_TRANSPORT_MULTICAST_QOS", 0);
    public static final int _AUTOMATIC_TRANSPORT_MULTICAST_QOS = 0;
    public static final TransportMulticastQosPolicyKind UNICAST_ONLY_TRANSPORT_MULTICAST_QOS = new TransportMulticastQosPolicyKind("UNICAST_ONLY_TRANSPORT_MULTICAST_QOS", 1);
    public static final int _UNICAST_ONLY_TRANSPORT_MULTICAST_QOS = 1;
    public static TransportMulticastQosPolicyKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return TransportMulticastQosPolicyKind.AUTOMATIC_TRANSPORT_MULTICAST_QOS;
            case 1: return TransportMulticastQosPolicyKind.UNICAST_ONLY_TRANSPORT_MULTICAST_QOS;

        }
        return null;
    }

    public static TransportMulticastQosPolicyKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[2];

        values[i] = AUTOMATIC_TRANSPORT_MULTICAST_QOS.ordinal();
        i++;
        values[i] = UNICAST_ONLY_TRANSPORT_MULTICAST_QOS.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static TransportMulticastQosPolicyKind create() {

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

    private TransportMulticastQosPolicyKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

