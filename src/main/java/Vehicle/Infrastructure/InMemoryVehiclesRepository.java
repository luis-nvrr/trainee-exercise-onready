package Vehicle.Infrastructure;


import Car.Domain.CarRepository;
import Model.Domain.Model;
import Motorcycle.Domain.MotorcycleRepository;
import Vehicle.Domain.Vehicle;
import Vehicle.Domain.VehicleRepository;

import java.util.Hashtable;

public class InMemoryVehiclesRepository implements VehicleRepository {
    public Hashtable<Model, Vehicle> vehicles;

    public InMemoryVehiclesRepository(MotorcycleRepository motorcycleRepository,
                                      CarRepository carRepository){
        vehicles = new Hashtable<>();
        insertVehicles(motorcycleRepository.getAllMotorcycles());
        insertVehicles(carRepository.getAllCars());
    }

    @Override
    public void insertVehicles(Hashtable<Model, ? extends Vehicle> vehicles) {
        this.vehicles.putAll(vehicles);
    }

    @Override
    public Hashtable<Model, ? extends Vehicle> getAllVehicles() {
        return vehicles;
    }

    @Override
    public Vehicle getVehiclesByModel(Model model) {
        return this.vehicles.get(model);
    }
}
