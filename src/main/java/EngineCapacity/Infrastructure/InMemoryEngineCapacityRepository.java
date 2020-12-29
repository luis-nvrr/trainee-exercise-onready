package EngineCapacity.Infrastructure;

import EngineCapacity.Domain.EngineCapacity;
import EngineCapacity.Domain.EngineCapacityRepository;
import java.util.Hashtable;

public class InMemoryEngineCapacityRepository implements EngineCapacityRepository {

    private Hashtable<Integer, EngineCapacity> engineCapacities;

    public InMemoryEngineCapacityRepository(){
        this.engineCapacities = new Hashtable<>();

        EngineCapacity _125 = new EngineCapacity(125);
        EngineCapacity _160 = new EngineCapacity(160);

        insertEngineCapacity(125, _125);
        insertEngineCapacity(160, _160);
    }

    @Override
    public void insertEngineCapacity(int capacity, EngineCapacity engineCapacity) {
        this.engineCapacities.put(capacity, engineCapacity);
    }

    @Override
    public Hashtable<Integer, EngineCapacity> getAllCapacities() {
        return engineCapacities;
    }

    @Override
    public EngineCapacity getCapacityByName(int capacity) {
        return this.engineCapacities.get(capacity);
    }
}
