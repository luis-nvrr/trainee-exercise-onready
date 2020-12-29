package Brand.Domain;

import java.util.Hashtable;

public interface BrandRepository {

    void insertBrand(String name, Brand brand);

    Hashtable<String, Brand> getAllBrands();

    Brand getBrandByName(String name);
}
