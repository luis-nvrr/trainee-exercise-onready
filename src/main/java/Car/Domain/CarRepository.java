package Car.Domain;

import Model.Domain.Model;

import java.util.Hashtable;

public interface CarRepository {

    void insertCar(Model model, Car car);

    Hashtable<Model, Car> getAllCars();

    Car getCarByModel(Model model);
}
