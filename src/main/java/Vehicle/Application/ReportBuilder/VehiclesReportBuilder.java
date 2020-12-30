package Vehicle.Application.ReportBuilder;

import java.util.List;

public interface VehiclesReportBuilder {
    void buildReport();

    void setVehiclesDetails(List<String> details);

    void setVehiclesComparisons(String mostExpensiveVehicle,
                                String lessExpensiveVehicle,
                                String hasYInModelVehicle);

    void setPriceSortedList(List<String>  vehiclesSortedByPrice);

    VehiclesReport getReport();

}
