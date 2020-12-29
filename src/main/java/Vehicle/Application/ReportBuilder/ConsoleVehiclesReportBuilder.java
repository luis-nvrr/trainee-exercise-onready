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
    public void setVehiclesComparisons(String mostExpensiveVehicle,
                                       String lessExpensiveVehicle,
                                       String hasYInModelVehicle) {

        String[] mostExpensiveVehicleDetails = mostExpensiveVehicle.split("\\|");
        String[] lessExpensiveVehicleDetails = lessExpensiveVehicle.split("\\|");
        String[] hasYInModelVehicleDetails = hasYInModelVehicle.split("\\|");

        mostExpensiveVehicle = mostExpensiveVehicleDetails[2] + " " +
                mostExpensiveVehicleDetails[1];

        lessExpensiveVehicle = lessExpensiveVehicleDetails[2] + " " +
                lessExpensiveVehicleDetails[1];

        hasYInModelVehicle = hasYInModelVehicleDetails[2] + " " +
                hasYInModelVehicleDetails[1] + " " +
                hasYInModelVehicleDetails[3];


        this.report.setVehiclesComparisons(mostExpensiveVehicle,
                lessExpensiveVehicle, hasYInModelVehicle);
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
