package Model.Domain;

import Brand.Domain.Brand;

public class Model {
    private String description;
    private Brand brand;

    public Model(String description, Brand brand){
        this.description = description;
        this. brand = brand;
    }

    public String showDetails(){
        StringBuilder details = new StringBuilder();
        details.append("Modelo: ").append(this.description);
        details.append("|");
        details.append(brand.showBrand());
        return details.toString();
    }

    public Brand getBrand(){
        return this.brand;
    }
}
