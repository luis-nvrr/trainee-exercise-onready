package Model.Domain;

import java.util.Hashtable;

public interface ModelRepository {

    void insertModel(String name, Model model);

    Hashtable<String, Model> getAllModels();

    Model getModelByName(String name);
}
