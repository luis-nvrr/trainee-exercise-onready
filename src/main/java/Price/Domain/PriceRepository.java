package Price.Domain;

import Model.Domain.Model;
import java.util.Hashtable;

public interface PriceRepository {

    void insertPrice(double amount, Price price);

    Hashtable<Double, Price> getAllPrices();

    Price getPriceByAmount(double amount);
}
