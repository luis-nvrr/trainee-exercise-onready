package EngineCapacity.Domain;

import java.util.Hashtable;

public interface EngineCapacityRepository {

    void insertEngineCapacity(int capacity, EngineCapacity engineCapacity);

    Hashtable<Integer, EngineCapacity> getAllCapacities();

    EngineCapacity getCapacityByName(int capacity);
}
