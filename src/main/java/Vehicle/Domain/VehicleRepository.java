package Vehicle.Domain;

import Model.Domain.Model;

import java.util.Hashtable;

public interface VehicleRepository {

    void insertVehicles(Hashtable<Model,? extends Vehicle> vehicles);

    Hashtable<Model,? extends Vehicle> getAllVehicles();

    Vehicle getVehiclesByModel(Model model);
}
