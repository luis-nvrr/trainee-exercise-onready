package Motorcycle.Infrastructure;

import EngineCapacity.Domain.EngineCapacity;
import EngineCapacity.Domain.EngineCapacityRepository;
import Model.Domain.Model;
import Model.Domain.ModelRepository;
import Motorcycle.Domain.Motorcycle;
import Motorcycle.Domain.MotorcycleRepository;
import Price.Domain.Price;
import Price.Domain.PriceRepository;

import java.util.Hashtable;

public class InMemoryMotorcycleRepository implements MotorcycleRepository {

    private Hashtable<Model, Motorcycle> motorcycles;

    public InMemoryMotorcycleRepository(ModelRepository modelRepository,
                                        PriceRepository priceRepository,
                                        EngineCapacityRepository engineCapacityRepository) {
        this.motorcycles = new Hashtable<>();

        Model titan = modelRepository.getModelByName("Titan");
        Model ybr = modelRepository.getModelByName("YBR");

        Price titanPrice = priceRepository.getPriceByAmount(60000);
        Price ybrPrice = priceRepository.getPriceByAmount(80500.50);

        EngineCapacity _125 = engineCapacityRepository.getCapacityByName(125);
        EngineCapacity _160 = engineCapacityRepository.getCapacityByName(160);

        Motorcycle titanMotorcycle = new Motorcycle(titan, titanPrice, _125);
        Motorcycle ybrMotorcycle = new Motorcycle(ybr, ybrPrice, _160);

        insertMotorcycle(titan, titanMotorcycle);
        insertMotorcycle(ybr, ybrMotorcycle);


    }

    @Override
    public void insertMotorcycle(Model model, Motorcycle motorcycle) {
        this.motorcycles.put(model, motorcycle);
    }

    @Override
    public Hashtable<Model, Motorcycle> getAllMotorcycles() {
        return this.motorcycles;
    }

    @Override
    public Motorcycle getMotorcycleByModel(Model model) {
        return motorcycles.get(model);
    }
}
