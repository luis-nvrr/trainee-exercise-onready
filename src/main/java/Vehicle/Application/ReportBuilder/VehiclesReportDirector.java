package Vehicle.Application.ReportBuilder;

import java.util.List;

public class VehiclesReportDirector {
    private VehiclesReportBuilder builder;

    public VehiclesReportDirector(VehiclesReportBuilder builder){
        this.builder = builder;
    }

    public void buildReport(List<String> details,
                            String mostExpensiveVehicle,
                            String lessExpensiveVehicle,
                            String hasYInModelVehicle,
                            List<String> vehiclesSortedByPrice){
        builder.buildReport();
        builder.setVehiclesDetails(details);
        builder.setVehiclesComparisons(mostExpensiveVehicle,
                lessExpensiveVehicle, hasYInModelVehicle);
        builder.setPriceSortedList(vehiclesSortedByPrice);
    }
}
