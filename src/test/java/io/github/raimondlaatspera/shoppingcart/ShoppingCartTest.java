package io.github.raimondlaatspera.shoppingcart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShoppingCartTest {

    @Test
    void shouldSumTotalValues() {
        ShoppingCart shoppingCart = new ShoppingCart();

        List<Double> prices = List.of(2.00, 3.00);

        assertEquals(5.00, shoppingCart.calculateTotal(prices));
    }


    @Test
    void shouldShowZeroWhenCartIsEmpty() {
        ShoppingCart shoppingCart = new ShoppingCart();

        List<Double> prices = List.of();

        assertEquals(0.00, shoppingCart.calculateTotal(prices));
    }

    @Test
    void shouldShowTotalForSingleItem() {
        ShoppingCart shoppingCart = new ShoppingCart();

        List<Double> prices = List.of(2.20);

        assertEquals(2.20, shoppingCart.calculateTotal(prices));

    }

    @Test
    void shouldCalculateDecimalValues() {
        ShoppingCart shoppingCart = new ShoppingCart();

        List<Double> prices = List.of(2.2221, 2.227453454);

        assertEquals(4.45, shoppingCart.calculateTotal(prices), 0.001);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenItemIsNegative() {
        ShoppingCart shoppingCart = new ShoppingCart();

        List<Double> prices = List.of(-2.5, 5.3);

        assertThrows(IllegalArgumentException.class, () -> shoppingCart.calculateTotal(prices));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenInputIsNull() {
        ShoppingCart shoppingCart = new ShoppingCart();

        assertThrows(IllegalArgumentException.class, () -> shoppingCart.calculateTotal(null));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenListContainsNull() {
        ShoppingCart shoppingCart = new ShoppingCart();

        List<Double> prices = Arrays.asList(2.0, null);

        assertThrows(IllegalArgumentException.class, () -> shoppingCart.calculateTotal(prices));
    }
}