package meirs.topologyMonitor.adapter;

import rti.dds.monitoring.DataReaderEntityStatistics;
import rti.dds.monitoring.DataWriterEntityMatchedSubscriptionStatistics;
import rti.dds.monitoring.DataWriterEntityStatistics;

/**
 * Created by Meir Shalev on 21/08/16.
 */
public interface DDSToTopologyAdapter {

    void onReaderStatisticsReceived(DataReaderEntityStatistics entity);

    void onWriterStatisticsReceived(DataWriterEntityStatistics entity);

    void onWriterMatchedReceived(DataWriterEntityMatchedSubscriptionStatistics entity);
}
