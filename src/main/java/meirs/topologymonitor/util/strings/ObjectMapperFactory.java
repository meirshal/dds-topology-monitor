package meirs.topologymonitor.util.strings;

import DDSMonitoring.BuiltinTopicKey_t;
import DDSMonitoring.RTIInstanceHandle;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.rti.dds.util.Enum;

/**
 * Created by Meir Shalev on 26/08/16.
 */
public class ObjectMapperFactory {

    public ObjectMapper createObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();

        SimpleModule module = new SimpleModule();
        module.addSerializer(Enum.class, new DdsEnumSerializer(Enum.class));
        module.addSerializer(RTIInstanceHandle.class, new InstanceHandleSerializer((RTIInstanceHandle.class)));
        module.addSerializer(BuiltinTopicKey_t.class, new BuiltinTopicKeySerializer(BuiltinTopicKey_t.class));
        objectMapper.registerModule(module);
        return objectMapper;
    }
}
