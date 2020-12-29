package Vehicle.Application.ReportBuilder;

import java.util.List;

public interface VehiclesReportBuilder {
    void buildReport();
    void setVehiclesDetails(List<String> details);
    void setVehiclesComparisons(List<String> comparisonsResults);
    void setPriceSortedList(List<String>  vehiclesOrderedByPrice);
    VehiclesReport getReport();

}
