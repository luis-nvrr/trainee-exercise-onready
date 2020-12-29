package Vehicle.Application;

import Vehicle.Infrastructure.ConsoleVehiclesReport;
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
    public void setPriceOrderedList(List<String> vehiclesOrderedByPrice) {

    }

    @Override
    public VehiclesReport getReport() {
        return report;
    }
}
