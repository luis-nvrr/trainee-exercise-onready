package Vehicle.Application;

import Vehicle.Application.VehiclesReportBuilder;

import java.util.List;

public class VehiclesReportDirector {
    private VehiclesReportBuilder builder;

    public VehiclesReportDirector(VehiclesReportBuilder builder){
        this.builder = builder;
    }

    public void build(List<String> details, List<String>  comparisonsResults, List<String> vehiclesOrderedByPrice){
        builder.buildReport();
        builder.setVehiclesDetails(details);
        builder.setVehiclesComparisons(comparisonsResults);
        builder.setPriceOrderedList(vehiclesOrderedByPrice);
    }
}
