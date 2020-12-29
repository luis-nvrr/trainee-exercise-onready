package Car.Domain;

import Vehicle.Domain.Vehicle;
import Model.Domain.Model;
import Price.Domain.Price;

public class Car extends Vehicle {
    private int doors;

    public Car(Model model, Price price, int doors){
        super(model, price);
        this.doors = doors;
    }

    public String showFormattedDetails(){
        StringBuilder details = new StringBuilder();
        details.append(super.showFormattedDetails());
        details.append("|");
        details.append("Puertas: ");
        details.append(this.doors);
        return details.toString();
    }
}
