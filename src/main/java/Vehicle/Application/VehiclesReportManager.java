package Vehicle.Application;

import Model.Domain.Model;
import Vehicle.Application.ReportBuilder.ConsoleVehiclesReportBuilder;
import Vehicle.Application.ReportBuilder.VehiclesReport;
import Vehicle.Application.ReportBuilder.VehiclesReportBuilder;
import Vehicle.Application.ReportBuilder.VehiclesReportDirector;
import Vehicle.Application.SortStrategy.ByPriceDownwardsVehiclesSorter;
import Vehicle.Application.SortStrategy.VehiclesSortStrategy;
import Vehicle.Domain.Vehicle;
import Vehicle.Domain.VehicleRepository;

import java.util.*;

public class VehiclesReportManager {

    private VehiclesReportBuilder builder;
    private VehiclesReportDirector director;
    private Hashtable<Model, ? extends Vehicle> vehicles;
    private List<String> vehiclesDetails;
    private List<String> vehiclesPricesDetails;
    private String mostExpensiveVehicle;
    private String lessExpensiveVehicle;
    private String hasYInModelVehicle;
    private List<String> vehiclesSortedByPrice;

    public VehiclesReportManager(VehicleRepository vehicleRepository){
       this.vehicles = vehicleRepository.getAllVehicles();
    }

    public void buildVehiclesReport(){
        obtainVehiclesDetails();
        obtainVehiclesPricesDetails();
        sortVehiclesByPrice();
        obtainVehiclesComparisonsResults();

        this.builder = new ConsoleVehiclesReportBuilder();
        this.director = new VehiclesReportDirector(builder);
        director.build(vehiclesDetails, mostExpensiveVehicle,
                lessExpensiveVehicle, hasYInModelVehicle, vehiclesSortedByPrice);

        VehiclesReport report = builder.getReport();
        report.showReport();
    }

    public void obtainVehiclesDetails(){
        this.vehiclesDetails = new ArrayList<>();

        for (Map.Entry<Model, ? extends Vehicle> modelEntry : vehicles.entrySet()) {
            vehiclesDetails.add(modelEntry.getValue().showFormattedDetails());
        }
    }

    public void sortVehiclesByPrice(){
        VehiclesSortStrategy sorter = new ByPriceDownwardsVehiclesSorter();
        vehiclesSortedByPrice = sorter.sort(vehiclesPricesDetails, this);
    }

    public void obtainVehiclesPricesDetails(){
        this.vehiclesPricesDetails = new ArrayList<>();

        for (Map.Entry<Model, ? extends Vehicle> modelEntry : vehicles.entrySet()) {
            vehiclesPricesDetails.add(modelEntry.getValue().showPriceDetails());
        }
    }

    public void obtainVehiclesComparisonsResults(){
        findMostExpensiveVehicle();
        findLessExpensiveVehicle();
        hasYInModelVehicle = findHasYInModelVehicle();
    }

    public void findMostExpensiveVehicle(){
        mostExpensiveVehicle = this.vehiclesPricesDetails.get(0);
    }

    public void findLessExpensiveVehicle(){
        lessExpensiveVehicle = this.vehiclesPricesDetails.get(vehiclesPricesDetails.size()-1);
    }

    public String findHasYInModelVehicle(){
        for (String vehiclesPricesDetail : vehiclesPricesDetails) {
            String vehicle = vehiclesPricesDetail.split("\\|")[1];
            if (vehicle.contains("Y")) {
                return vehiclesPricesDetail;
            }
        }
        return null;
    }

}
