package Vehicle.Application.ReportBuilder;

import java.util.List;

public class VehiclesReportDirector {
    private VehiclesReportBuilder builder;

    public VehiclesReportDirector(VehiclesReportBuilder builder){
        this.builder = builder;
    }

    public void build(List<String> details,
                      List<String>  comparisonsResults,
                      List<String> vehiclesSortedByPrice){
        builder.buildReport();
        builder.setVehiclesDetails(details);
        builder.setVehiclesComparisons(comparisonsResults);
        builder.setPriceSortedList(vehiclesSortedByPrice);
    }
}
