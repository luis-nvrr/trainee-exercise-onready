package Vehicle.Application.ReportBuilder;

import java.util.Iterator;
import java.util.List;

public class ConsoleVehiclesReport implements VehiclesReport {
    private StringBuilder report;

    public ConsoleVehiclesReport() {
        this.report = new StringBuilder();
    }

    public void setVehiclesDetails(List<String> details){
        Iterator<String> it = details.iterator();

        while(it.hasNext()){
            String detail = it.next();
            var price = detail.split("\\|")[0];
            var model = detail.split("\\|")[1];
            var brand = detail.split("\\|")[2];
            var characteristic = detail.split("\\|")[3];

            var separator = " // ";
            report.append(brand).append(separator);
            report.append(model).append(separator);
            report.append(characteristic).append(separator);
            report.append(price).append(" ");
            report.append("\n");
        }
        report.append("=".repeat(30)).append("\n");
    }

    public void setVehiclesComparisons(String mostExpensiveVehicle,
                                       String lessExpensiveVehicle,
                                       String hasYInModelVehicle){

        report.append("Vehículo más caro: ").append(mostExpensiveVehicle).append("\n");
        report.append("Vehículo más barato: ").append(lessExpensiveVehicle).append("\n");
        report.append("Vehículo que contiene en el modelo la letra ‘Y’: ").append(hasYInModelVehicle);
        report.append("\n");
        report.append("=".repeat(30)).append("\n");
    }

    public void setVehiclesSortedByPrice(List<String> vehiclesSortedByPrice){
        Iterator<String> it = vehiclesSortedByPrice.iterator();

        report.append("Vehículos ordenados por precio de mayor a menor:\n");

        while(it.hasNext()){
            String vehicleDetails = it.next();
            var model = vehicleDetails.split("\\|")[1];
            var brand = vehicleDetails.split("\\|")[2];
            report.append(brand).append(" ").append(model).append("\n");
        }

    }


    @Override
    public void showReport() {
        System.out.println(report.toString());
    }
}
