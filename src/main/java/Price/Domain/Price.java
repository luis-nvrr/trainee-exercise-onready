package Price.Domain;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Price {
    private double price;

    public Price(double price){
        this.price = price;
    }

    public String obtainFormattedPrice(){
        DecimalFormat formatter = new DecimalFormat("#,###,###.00");
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        formatter.setDecimalFormatSymbols(symbols);

        return formatter.format(price);
    }

    public String showFormattedPrice(){
        return "$" + obtainFormattedPrice();
    }

    public String showPrice(){
        return this.price + "";
    }
}