package Motorcycle.Domain;

import EngineCapacity.Domain.EngineCapacity;
import Model.Domain.Model;
import Price.Domain.Price;
import Vehicle.Domain.Vehicle;

public class Motorcycle extends Vehicle {
    private EngineCapacity engineCapacity;

    public Motorcycle(Model model, Price price, EngineCapacity engineCapacity) {
        super(model, price);
        this.engineCapacity = engineCapacity;
    }

    public String showDetails(){
        StringBuilder details = new StringBuilder();
        details.append(super.showDetails());
        details.append("|");
        details.append("Cilindrada: ");
        details.append(engineCapacity.showCapacity());
        return details.toString();
    }
}
