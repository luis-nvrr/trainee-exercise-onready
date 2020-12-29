package Vehicle.Domain;

import Model.Domain.Model;
import Price.Domain.Price;

public abstract class Vehicle {
    private Model model;
    private Price price;

    public Vehicle(Model model, Price price){
        this.model = model;
        this.price = price;
    }

    public String showDetails(){
        StringBuilder details = new StringBuilder();
        details.append("Precio: ").append(price.showPrice());
        details.append("|");
        details.append(model.showDetails());
        return details.toString();
    }
}
