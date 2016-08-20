

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

public class DiscoveryPluginPromiscuityKind  extends Enum {

    public static final DiscoveryPluginPromiscuityKind DISCOVERYPLUGIN_DISCOVER_MATCHING_REMOTE_ENTITIES_PROMISCUITY = new DiscoveryPluginPromiscuityKind("DISCOVERYPLUGIN_DISCOVER_MATCHING_REMOTE_ENTITIES_PROMISCUITY", 1);
    public static final int _DISCOVERYPLUGIN_DISCOVER_MATCHING_REMOTE_ENTITIES_PROMISCUITY = 1;
    public static final DiscoveryPluginPromiscuityKind DISCOVERYPLUGIN_DISCOVER_ALL_REMOTE_ENTITIES_PROMISCUITY = new DiscoveryPluginPromiscuityKind("DISCOVERYPLUGIN_DISCOVER_ALL_REMOTE_ENTITIES_PROMISCUITY", 65535);
    public static final int _DISCOVERYPLUGIN_DISCOVER_ALL_REMOTE_ENTITIES_PROMISCUITY = 65535;
    public static DiscoveryPluginPromiscuityKind valueOf(int ordinal) {
        switch(ordinal) {

            case 1: return DiscoveryPluginPromiscuityKind.DISCOVERYPLUGIN_DISCOVER_MATCHING_REMOTE_ENTITIES_PROMISCUITY;
            case 65535: return DiscoveryPluginPromiscuityKind.DISCOVERYPLUGIN_DISCOVER_ALL_REMOTE_ENTITIES_PROMISCUITY;

        }
        return null;
    }

    public static DiscoveryPluginPromiscuityKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[2];

        values[i] = DISCOVERYPLUGIN_DISCOVER_MATCHING_REMOTE_ENTITIES_PROMISCUITY.ordinal();
        i++;
        values[i] = DISCOVERYPLUGIN_DISCOVER_ALL_REMOTE_ENTITIES_PROMISCUITY.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static DiscoveryPluginPromiscuityKind create() {

        return valueOf(1);
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

    private DiscoveryPluginPromiscuityKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

