package Model.Infrastructure;

import Brand.Domain.BrandRepository;
import Model.Domain.Model;
import Model.Domain.ModelRepository;

import java.util.Hashtable;

public class InMemoryModelRepository implements ModelRepository {

    private Hashtable<String, Model> models;

    public InMemoryModelRepository(BrandRepository brandRepository){

        models = new Hashtable<>();

        Model _206 = new Model("206", brandRepository.getBrandByName("Peugeot"));
        Model _208 = new Model("208", brandRepository.getBrandByName("Peugeot"));
        Model titan = new Model("Titan", brandRepository.getBrandByName("Honda"));
        Model ybr = new Model("YBR", brandRepository.getBrandByName("Yamaha"));

        insertModel("206", _206);
        insertModel("208", _208);
        insertModel("Titan", titan);
        insertModel("YBR", ybr);
    }

    @Override
    public void insertModel(String name, Model model) {
        models.put(name, model);
    }

    @Override
    public Hashtable<String, Model> getAllModels() {
        return models;
    }

    @Override
    public Model getModelByName(String name) {
        return models.get(name);
    }
}
