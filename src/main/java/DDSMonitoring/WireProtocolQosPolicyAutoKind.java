

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

public class WireProtocolQosPolicyAutoKind  extends Enum {

    public static final WireProtocolQosPolicyAutoKind RTPS_AUTO_ID_FROM_IP = new WireProtocolQosPolicyAutoKind("RTPS_AUTO_ID_FROM_IP", 0);
    public static final int _RTPS_AUTO_ID_FROM_IP = 0;
    public static final WireProtocolQosPolicyAutoKind RTPS_AUTO_ID_FROM_MAC = new WireProtocolQosPolicyAutoKind("RTPS_AUTO_ID_FROM_MAC", 1);
    public static final int _RTPS_AUTO_ID_FROM_MAC = 1;
    public static WireProtocolQosPolicyAutoKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return WireProtocolQosPolicyAutoKind.RTPS_AUTO_ID_FROM_IP;
            case 1: return WireProtocolQosPolicyAutoKind.RTPS_AUTO_ID_FROM_MAC;

        }
        return null;
    }

    public static WireProtocolQosPolicyAutoKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[2];

        values[i] = RTPS_AUTO_ID_FROM_IP.ordinal();
        i++;
        values[i] = RTPS_AUTO_ID_FROM_MAC.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static WireProtocolQosPolicyAutoKind create() {

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

    private WireProtocolQosPolicyAutoKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

