package Car.Infrastructure;

import Car.Domain.Car;
import Car.Domain.CarRepository;
import Model.Domain.Model;
import Model.Domain.ModelRepository;
import Price.Domain.Price;
import Price.Domain.PriceRepository;

import java.util.Hashtable;

public class InMemoryCarRepository implements CarRepository {

    private Hashtable<Model, Car> cars;

    public InMemoryCarRepository(ModelRepository modelRepository,
                                 PriceRepository priceRepository){
        this.cars = new Hashtable<>();

        Model _206 = modelRepository.getModelByName("206");
        Model _208 = modelRepository.getModelByName("208");

        Price _206Price = priceRepository.getPriceByAmount(200000);
        Price _208Price = priceRepository.getPriceByAmount(250000);

        Car _206Car = new Car(_206, _206Price, 4);
        Car _208Car = new Car(_208, _208Price, 5);

        insertCar(_206, _206Car);
        insertCar(_208, _208Car);
    }

    @Override
    public void insertCar(Model model, Car car) {
        this.cars.put(model, car);
    }

    @Override
    public Hashtable<Model, Car> getAllCars() {
        return this.cars;
    }

    @Override
    public Car getCarByModel(Model model) {
        return cars.get(model);
    }
}
