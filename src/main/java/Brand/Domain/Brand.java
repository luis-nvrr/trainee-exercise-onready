package Brand.Domain;

public class Brand {
    private String name;

    public Brand(String name){
        this.name = name;
    }

    public String showBrand(){
        return "Marca: " + this.name;
    }

}
