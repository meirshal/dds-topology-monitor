package meirs.topologymonitor.util.strings;

import DDSMonitoring.BuiltinTopicKey_t;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by Meir Shalev on 26/08/16.
 */
public class BuiltinTopicKeySerializer extends StdSerializer<BuiltinTopicKey_t> {

    public BuiltinTopicKeySerializer(Class<BuiltinTopicKey_t> t) {
        super(t);
    }

    @Override
    public void serialize(BuiltinTopicKey_t builtinTopicKey_t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(Base64Encoder.builtinTopicKeyToBase64(builtinTopicKey_t));
    }
}
