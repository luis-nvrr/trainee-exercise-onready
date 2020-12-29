package Price.Domain;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Price {
    private double price;

    public Price(double price){
        this.price = price;
    }

    private String showFormmatedPrice(){
        DecimalFormat formatter = new DecimalFormat("#,###,###.00");
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        formatter.setDecimalFormatSymbols(symbols);

        return formatter.format(price);
    }

    public String showPrice(){
        return "$ " + showFormmatedPrice();
    }
}