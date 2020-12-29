package Price.Infrastructure;

import Price.Domain.Price;
import Price.Domain.PriceRepository;
import java.util.Hashtable;

public class InMemoryPriceRepository implements PriceRepository{

    private Hashtable<Double, Price> prices;

    public InMemoryPriceRepository(){
        this.prices = new Hashtable<>();

        Price _206Price = new Price(200000);
        Price titanPrice = new Price(60000);
        Price _208Price = new Price(250000);
        Price ybrPrice = new Price(80500.50);

        insertPrice(200000.00, _206Price);
        insertPrice(60000.00, titanPrice);
        insertPrice(250000.00, _208Price);
        insertPrice(80500.50, ybrPrice);

    }

    @Override
    public void insertPrice(double amount, Price price) {
        prices.put(amount, price);
    }

    @Override
    public Hashtable<Double, Price> getAllPrices() {
        return prices;
    }

    @Override
    public Price getPriceByAmount(double amount) {
        return prices.get(amount);
    }
}
