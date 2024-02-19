package com.mandacarubroker.domain.stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class StockTest {
    @Test
    void changePriceIncrease() {
        Stock stock = new Stock();
        stock.setPrice(100);

        double newPrice = stock.changePrice(20, true);

        Assertions.assertEquals(120, newPrice);
    }
    @Test
    void changePriceDecrease() {
        Stock stock = new Stock();
        stock.setPrice(100);

        double newPrice = stock.changePrice(30, false);

        Assertions.assertEquals(70, newPrice);
    }
}