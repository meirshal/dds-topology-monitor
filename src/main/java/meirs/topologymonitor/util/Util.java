package meirs.topologymonitor.util;

import DDSMonitoring.BuiltinTopicKey_t;
import DDSMonitoring.RTIInstanceHandle;

import java.nio.ByteBuffer;
import java.util.Base64;

/**
 * Created by Meir Shalev on 20/08/16.
 */
public class Util {

    public static String instanceHandleToBase64(RTIInstanceHandle instanceHandle) {
        String guidAsBase64 = Base64.getEncoder().encodeToString(instanceHandle.value);

        return guidAsBase64;
    }

    public static String builtinTopicKeyToBase64(BuiltinTopicKey_t key) {
        ByteBuffer buffer = ByteBuffer.allocate(16);

        for (int i=0; i<key.value.length; i++) {
            buffer.putInt(key.value[i]);
        }

        String guidAsBase64 = Base64.getEncoder().encodeToString(buffer.array());
        return guidAsBase64;
    }
}
