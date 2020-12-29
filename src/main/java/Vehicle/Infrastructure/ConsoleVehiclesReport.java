package Vehicle.Infrastructure;

import Vehicle.Application.VehiclesReport;

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

            report.append(brand).append(" ").append("// ");
            report.append(model).append(" ").append("// ");
            report.append(characteristic).append(" ").append("// ");
            report.append(price).append(" ");
            report.append("\n");
        }
        report.append("=".repeat(30));
    }

    @Override
    public void showReport() {
        System.out.println(report.toString());
    }
}
