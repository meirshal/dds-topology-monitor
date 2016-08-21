package meirs.topologyMonitor.adapter;

import meirs.topologyMonitor.dal.Dao;
import meirs.topologyMonitor.domain.NetworkNode;
import meirs.topologyMonitor.domain.Subscription;
import meirs.topologyMonitor.util.Util;
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

    private Dao dao;

    public DDSToTopologyAdapterImpl(Dao dao){
        this.dao = dao;
    }

    @Override
    public void onReaderStatisticsReceived(DataReaderEntityStatistics entity) {

        String guid = Util.builtinTopicKeyToBase64(entity.datareader_key);
        logger.info("Received DataReaderEntityStatistics for reader " + guid);

        try {
            //TODO: convert dds entities to proper json
            String json = entity.toString();
            //objectMapper.writeValueAsString(stats);

            NetworkNode node = new NetworkNode(guid, json);
            dao.saveNode(node);

        } catch (Error e) {
            logger.error("Could not insert DataReaderEntityStatistics to DB", e);
        }
    }

    @Override
    public void onWriterStatisticsReceived(DataWriterEntityStatistics entity) {

        String guid = Util.builtinTopicKeyToBase64(entity.datawriter_key);
        logger.info("Received DataWriterEntityStatistics for reader " + guid);

        try {
            String json = entity.toString(); //objectMapper.writeValueAsString(stats);
            NetworkNode node = new NetworkNode(guid, json);
            dao.saveNode(node);

        } catch (Error e) {
            logger.error("Could not insert DataWriterEntityStatistics to DB", e);
        }

    }

    @Override
    public void onWriterMatchedReceived(DataWriterEntityMatchedSubscriptionStatistics entity) {

        String readerGuid = Util.instanceHandleToBase64(entity.subscription_handle);
        String writerGuid = Util.builtinTopicKeyToBase64(entity.datawriter_key);
        logger.info("Received DataWriterEntityMatchedSubscriptionStatistics for writer " + writerGuid + " and reader " + readerGuid);

        try {
            String json = entity.toString(); //objectMapper.writeValueAsString(stats);

            dao.setPublicationConnection(writerGuid, readerGuid);
        } catch (Error e) {
            logger.error("Could not insert subscription to DB", e);
        }

    }
}
