package meirs.topologymonitor.util.strings;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.rti.dds.util.Enum;

import java.io.IOException;

/**
 * Created by Meir Shalev on 26/08/16.
 */
public class DdsEnumSerializer extends StdSerializer<Enum> {

    public DdsEnumSerializer(Class<Enum> t) {
        super(t);
    }

    @Override
    public void serialize(Enum anEnum, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(anEnum.name());
    }
}
