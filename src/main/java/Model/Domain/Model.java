package Model.Domain;

import Brand.Domain.Brand;

public class Model {
    private String name;
    private Brand brand;

    public Model(String name, Brand brand){
        this.name = name;
        this. brand = brand;
    }

    public String showFormattedDetails(){
        StringBuilder details = new StringBuilder();
        details.append("Modelo: ").append(this.name);
        details.append("|");
        details.append(brand.showFormattedBrand());
        return details.toString();
    }

    public String showDetails(){
        StringBuilder details = new StringBuilder();
        details.append(name);
        details.append("|");
        details.append(brand.showBrand());
        return details.toString();
    }

}
