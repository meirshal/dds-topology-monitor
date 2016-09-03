package meirs.topologymonitor.adapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import meirs.topologymonitor.dal.Dao;
import meirs.topologymonitor.domain.NetworkNode;
import meirs.topologymonitor.util.strings.ObjectMapperFactory;
import meirs.topologymonitor.util.strings.Base64Encoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rti.dds.monitoring.DataReaderEntityStatistics;
import rti.dds.monitoring.DataWriterEntityMatchedSubscriptionStatistics;
import rti.dds.monitoring.DataWriterEntityStatistics;

/**
 * Created by Meir Shalev on 21/08/16.
 */
public class DDSToTopologyAdapterImpl implements DDSToTopologyAdapter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private ObjectMapper mapper;

    private Dao dao;


    public DDSToTopologyAdapterImpl(Dao dao){
        this.dao = dao;

        ObjectMapperFactory mapperFactory = new ObjectMapperFactory();
        mapper = mapperFactory.createObjectMapper();
    }

    @Override
    public void onReaderStatisticsReceived(DataReaderEntityStatistics entity) {

        String guid = Base64Encoder.builtinTopicKeyToBase64(entity.datareader_key);
        logger.info("Received DataReaderEntityStatistics for reader " + guid);

        try {
            String json = mapper.writeValueAsString(entity);

            NetworkNode node = new NetworkNode(guid, json);
            dao.saveNode(node);

        } catch (Exception e) {
            logger.error("Could not insert DataReaderEntityStatistics to DB", e);
        }
    }

    @Override
    public void onWriterStatisticsReceived(DataWriterEntityStatistics entity) {

        String guid = Base64Encoder.builtinTopicKeyToBase64(entity.datawriter_key);
        logger.info("Received DataWriterEntityStatistics for reader " + guid);

        try {
            String json = mapper.writeValueAsString(entity);

            NetworkNode node = new NetworkNode(guid, json);
            dao.saveNode(node);

        } catch (Exception e) {
            logger.error("Could not insert DataWriterEntityStatistics to DB", e);
        }

    }

    @Override
    public void onWriterMatchedReceived(DataWriterEntityMatchedSubscriptionStatistics entity) {

        String readerGuid = Base64Encoder.instanceHandleToBase64(entity.subscription_handle);
        String writerGuid = Base64Encoder.builtinTopicKeyToBase64(entity.datawriter_key);
        logger.info("Received DataWriterEntityMatchedSubscriptionStatistics for writer " + writerGuid + " and reader " + readerGuid);

        try {
            String json = mapper.writeValueAsString(entity);

            dao.setPublicationConnection(writerGuid, readerGuid, json);
        } catch (Exception e) {
            logger.error("Could not insert subscription to DB", e);
        }

    }
}
