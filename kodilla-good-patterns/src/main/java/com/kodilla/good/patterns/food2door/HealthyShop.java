package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class HealthyShop implements Producer {
    @Override
    public boolean process(Map<Product, Integer> productsOrdered) {
        if (productsOrdered.keySet().stream().map(Product::getName).anyMatch("Duck"::equals)) {
            System.out.println("No duck in store, we are unable to deliver it at the moment");
            return false;
        }
        return true;
    }
}
