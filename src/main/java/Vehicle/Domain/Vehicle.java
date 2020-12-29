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

    public String showFormattedDetails(){
        StringBuilder details = new StringBuilder();
        details.append("Precio: ").append(price.showFormattedPrice());
        details.append("|");
        details.append(model.showFormattedDetails());
        return details.toString();
    }

    public String showPriceDetails(){
        StringBuilder priceDetails = new StringBuilder();
        priceDetails.append(price.showPrice());
        priceDetails.append("|");
        priceDetails.append(model.showDetails());
        priceDetails.append("|");
        priceDetails.append(price.showFormattedPrice());
        return priceDetails.toString();
    }
}
