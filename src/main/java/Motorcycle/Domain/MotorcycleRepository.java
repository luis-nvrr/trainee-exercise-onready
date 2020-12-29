package Motorcycle.Domain;

import Model.Domain.Model;

import java.util.Hashtable;

public interface MotorcycleRepository {

    void insertMotorcycle(Model model, Motorcycle motorcycle);

    Hashtable<Model, Motorcycle> getAllMotorcycles();

    Motorcycle getMotorcycleByModel(Model model);
}
