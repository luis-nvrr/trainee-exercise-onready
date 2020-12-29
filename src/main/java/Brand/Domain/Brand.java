package Brand.Domain;

public class Brand {
    private String name;

    public Brand(String name){
        this.name = name;
    }

    public String showFormattedBrand(){
        return "Marca: " + this.name;
    }

    public String showBrand(){
        return this.name;
    }

}
