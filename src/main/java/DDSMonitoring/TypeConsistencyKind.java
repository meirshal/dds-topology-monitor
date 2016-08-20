

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

public class TypeConsistencyKind  extends Enum {

    public static final TypeConsistencyKind DISALLOW_TYPE_COERCION = new TypeConsistencyKind("DISALLOW_TYPE_COERCION", 0);
    public static final int _DISALLOW_TYPE_COERCION = 0;
    public static final TypeConsistencyKind ALLOW_TYPE_COERCION = new TypeConsistencyKind("ALLOW_TYPE_COERCION", 1);
    public static final int _ALLOW_TYPE_COERCION = 1;
    public static TypeConsistencyKind valueOf(int ordinal) {
        switch(ordinal) {

            case 0: return TypeConsistencyKind.DISALLOW_TYPE_COERCION;
            case 1: return TypeConsistencyKind.ALLOW_TYPE_COERCION;

        }
        return null;
    }

    public static TypeConsistencyKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[2];

        values[i] = DISALLOW_TYPE_COERCION.ordinal();
        i++;
        values[i] = ALLOW_TYPE_COERCION.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static TypeConsistencyKind create() {

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

    private TypeConsistencyKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

