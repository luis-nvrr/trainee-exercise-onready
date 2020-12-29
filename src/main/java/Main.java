import Brand.Domain.BrandRepository;
import Brand.Infrastructure.InMemoryBrandRepository;
import Car.Domain.CarRepository;
import Car.Infrastructure.InMemoryCarRepository;
import EngineCapacity.Domain.EngineCapacityRepository;
import EngineCapacity.Infrastructure.InMemoryEngineCapacityRepository;
import Model.Domain.ModelRepository;
import Model.Infrastructure.InMemoryModelRepository;
import Motorcycle.Domain.MotorcycleRepository;
import Motorcycle.Infrastructure.InMemoryMotorcycleRepository;
import Price.Domain.PriceRepository;
import Price.Infrastructure.InMemoryPriceRepository;
import Vehicle.Application.VehiclesReportManager;
import Vehicle.Domain.VehicleRepository;
import Vehicle.Infrastructure.InMemoryVehiclesRepository;

public class Main {
    public static void main(String[] args) {
        VehicleRepository vehicleRepository = loadData();
        VehiclesReportManager reportManager = new VehiclesReportManager(vehicleRepository);

        reportManager.buildVehiclesReport();
    }

    public static VehicleRepository loadData(){
        BrandRepository brandRepository = new InMemoryBrandRepository();

        ModelRepository modelRepository = new InMemoryModelRepository(brandRepository);

        EngineCapacityRepository engineCapacityRepository = new InMemoryEngineCapacityRepository();

        PriceRepository priceRepository = new InMemoryPriceRepository();

        MotorcycleRepository motorcycleRepository = new InMemoryMotorcycleRepository(modelRepository,
                priceRepository, engineCapacityRepository);

        CarRepository carRepository = new InMemoryCarRepository(modelRepository, priceRepository);

        VehicleRepository vehicleRepository = new InMemoryVehiclesRepository(motorcycleRepository,
                carRepository);

        return vehicleRepository;
    }
}
