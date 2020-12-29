package Vehicle.Application.SortStrategy;

import Vehicle.Application.VehiclesReportManager;
import java.util.List;

public interface VehiclesSortStrategy {
    List<String> sort(List<String> pricesDetails, VehiclesReportManager manager);
}
