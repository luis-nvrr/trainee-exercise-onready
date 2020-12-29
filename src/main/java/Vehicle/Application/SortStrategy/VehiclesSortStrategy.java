package Vehicle.Application.SortStrategy;

import Vehicle.Application.ReportBuilder.VehiclesReportManager;
import java.util.List;

public interface VehiclesSortStrategy {
    List<String> sort(List<String> pricesDetails, VehiclesReportManager manager);
}
