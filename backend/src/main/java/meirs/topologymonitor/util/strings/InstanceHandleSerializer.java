package meirs.topologymonitor.util.strings;

import DDSMonitoring.RTIInstanceHandle;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by Meir Shalev on 26/08/16.
 */
public class InstanceHandleSerializer extends StdSerializer<RTIInstanceHandle>{

    public InstanceHandleSerializer(Class<RTIInstanceHandle> t) {
        super(t);
    }

    @Override
    public void serialize(RTIInstanceHandle instanceHandle_t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(Base64Encoder.instanceHandleToBase64(instanceHandle_t));
    }
}
