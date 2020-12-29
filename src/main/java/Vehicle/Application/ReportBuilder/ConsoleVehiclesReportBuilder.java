package Vehicle.Application.ReportBuilder;

import java.util.List;

public class ConsoleVehiclesReportBuilder implements VehiclesReportBuilder {
    private ConsoleVehiclesReport report;

    public ConsoleVehiclesReportBuilder(){ }

    @Override
    public void buildReport() {
        this.report = new ConsoleVehiclesReport();
    }

    @Override
    public void setVehiclesDetails(List<String>  details) {
        this.report.setVehiclesDetails(details);
    }

    @Override
    public void setVehiclesComparisons(List<String>  comparisonsResults) {

    }

    @Override
    public void setPriceSortedList(List<String> vehiclesSortedByPrice) {
        this.report.setVehiclesSortedByPrice(vehiclesSortedByPrice);
    }

    @Override
    public VehiclesReport getReport() {
        return report;
    }
}
