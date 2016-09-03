

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

public class ServiceQosPolicyKind  extends Enum {

    public static final ServiceQosPolicyKind NO_SERVICE_QOS = new ServiceQosPolicyKind("NO_SERVICE_QOS", 0);
    public static final int _NO_SERVICE_QOS = 0;
    public static final ServiceQosPolicyKind PERSISTENCE_SERVICE_QOS = new ServiceQosPolicyKind("PERSISTENCE_SERVICE_QOS", 1);
    public static final int _PERSISTENCE_SERVICE_QOS = 1;
    public static final ServiceQosPolicyKind QUEUING_SERVICE_QOS = new ServiceQosPolicyKind("QUEUING_SERVICE_QOS", 2);
    public static final int _QUEUING_SERVICE_QOS = 2;
    public static final ServiceQosPolicyKind ROUTING_SERVICE_QOS = new ServiceQosPolicyKind("ROUTING_SERVICE_QOS", 3);
    public static final int _ROUTING_SERVICE_QOS = 3;
    public static final ServiceQosPolicyKind RECORDING_SERVICE_QOS = new ServiceQosPolicyKind("RECORDING_SERVICE_QOS", 4);
    public static final int _RECORDING_SERVICE_QOS = 4;
    public static final ServiceQosPolicyKind REPLAY_SERVICE_QOS = new ServiceQosPolicyKind("REPLAY_SERVICE_QOS", 5);
    public static final int _REPLAY_SERVICE_QOS = 5;
    public static final ServiceQosPolicyKind DATABASE_INTEGRATION_SERVICE_QOS = new ServiceQosPolicyKind("DATABASE_INTEGRATION_SERVICE_QOS", 6);
    public static final int _DATABASE_INTEGRATION_SERVICE_QOS = 6;
    public static ServiceQosPolicyKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return ServiceQosPolicyKind.NO_SERVICE_QOS;
            case 1: return ServiceQosPolicyKind.PERSISTENCE_SERVICE_QOS;
            case 2: return ServiceQosPolicyKind.QUEUING_SERVICE_QOS;
            case 3: return ServiceQosPolicyKind.ROUTING_SERVICE_QOS;
            case 4: return ServiceQosPolicyKind.RECORDING_SERVICE_QOS;
            case 5: return ServiceQosPolicyKind.REPLAY_SERVICE_QOS;
            case 6: return ServiceQosPolicyKind.DATABASE_INTEGRATION_SERVICE_QOS;

        }
        return null;
    }

    public static ServiceQosPolicyKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[7];

        values[i] = NO_SERVICE_QOS.ordinal();
        i++;
        values[i] = PERSISTENCE_SERVICE_QOS.ordinal();
        i++;
        values[i] = QUEUING_SERVICE_QOS.ordinal();
        i++;
        values[i] = ROUTING_SERVICE_QOS.ordinal();
        i++;
        values[i] = RECORDING_SERVICE_QOS.ordinal();
        i++;
        values[i] = REPLAY_SERVICE_QOS.ordinal();
        i++;
        values[i] = DATABASE_INTEGRATION_SERVICE_QOS.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ServiceQosPolicyKind create() {

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

    private ServiceQosPolicyKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

