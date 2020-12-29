package Vehicle.Application;

import java.util.List;

public interface VehiclesReportBuilder {
    void buildReport();
    void setVehiclesDetails(List<String> details);
    void setVehiclesComparisons(List<String> comparisonsResults);
    void setPriceOrderedList(List<String>  vehiclesOrderedByPrice);
    VehiclesReport getReport();

}
