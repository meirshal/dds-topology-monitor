package meirs.topologymonitor.util.strings;

import DDSMonitoring.BuiltinTopicKey_t;
import DDSMonitoring.RTIInstanceHandle;

import java.nio.ByteBuffer;
import java.util.Base64;

/**
 * Created by Meir Shalev on 20/08/16.
 */
public class Base64Encoder {

    public static String instanceHandleToBase64(RTIInstanceHandle instanceHandle) {
        return Base64.getEncoder().encodeToString(instanceHandle.value);
    }

    public static String builtinTopicKeyToBase64(BuiltinTopicKey_t key) {
        ByteBuffer buffer = ByteBuffer.allocate(16);

        for (int i=0; i<key.value.length; i++) {
            buffer.putInt(key.value[i]);
        }

        return Base64.getEncoder().encodeToString(buffer.array());
    }
}
