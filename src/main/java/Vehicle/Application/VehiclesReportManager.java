package Vehicle.Application;

import Model.Domain.Model;
import Vehicle.Domain.Vehicle;
import Vehicle.Domain.VehicleRepository;

import java.util.*;

public class VehiclesReportManager {

    private VehiclesReportBuilder builder;
    private VehiclesReportDirector director;
    private Hashtable<Model, ? extends Vehicle> vehicles;
    private List<String> vehiclesDetails;
    private List<String> otrodato1;
    private List<String> otrodato2;

    public VehiclesReportManager(VehicleRepository vehicleRepository){
       this.vehicles = vehicleRepository.getAllVehicles();
    }

    public void buildVehiclesReport(){
        obtainVehiclesDetails();

        this.builder = new ConsoleVehiclesReportBuilder();

        this.director = new VehiclesReportDirector(builder);
        director.build(vehiclesDetails, otrodato1, otrodato2);

        var report = builder.getReport();
        report.showReport();
    }

    public void obtainVehiclesDetails(){
        this.vehiclesDetails = new ArrayList<>();

        for (Map.Entry<Model, ? extends Vehicle> modelEntry : vehicles.entrySet()) {
            vehiclesDetails.add(modelEntry.getValue().showDetails());
        }
    }

}
