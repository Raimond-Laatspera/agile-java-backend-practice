package io.github.raimondlaatspera.shoppingcart;

import java.util.List;

public class ShoppingCart {
    public double calculateTotal(List<Double> prices) {
        if (prices == null) {
            throw new IllegalArgumentException("cart cannot be null");
        }

        //Will use BigDecimal in the future for real money-based transactions
        double total = 0;

        for (Double price : prices) {
            if (price == null) {
                throw new IllegalArgumentException("price cannot be null");
            }
            if (price < 0) {
                throw new IllegalArgumentException("item cannot have negative value");
            }
            total += price;
        }

        return Math.round(total * 100.0) / 100.0;
    }
}
