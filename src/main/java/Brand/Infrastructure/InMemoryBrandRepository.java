package Brand.Infrastructure;

import Brand.Domain.Brand;
import Brand.Domain.BrandRepository;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class InMemoryBrandRepository implements BrandRepository {

    private Hashtable<String, Brand> brands;

    public InMemoryBrandRepository(){
        brands = new Hashtable<>();

        Brand peugeot = new Brand("Peugeot");
        Brand honda = new Brand("Honda");
        Brand yamaha = new Brand("Yamaha");

        brands.put("Peugeot", peugeot);
        brands.put("Honda", honda);
        brands.put("Yamaha", yamaha);
    }

    @Override
    public void insertBrand(String name, Brand brand) {
        brands.put(name, brand);
    }

    @Override
    public Hashtable<String, Brand> getAllBrands() {
        return brands;
    }

    @Override
    public Brand getBrandByName(String name) {
        return brands.get(name);
    }
}
