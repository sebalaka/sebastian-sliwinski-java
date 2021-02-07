package com.kodilla.good.patterns.food2door;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Producer producer = new GlutenFreeShop("GlutenFreeShop", "GlutenFreeShop@gmail.com", "43-200 Pszczyna, Cieszyńska 15");

        HashMap<Product, Integer> productsOrdered = new HashMap<>();
        productsOrdered.put(new Product("Chicken", new BigDecimal("9.40")), 2);
        productsOrdered.put(new Product("Turkey", new BigDecimal("13.50")), 4);
        productsOrdered.put(new Product("Duck", new BigDecimal("12.40")), 5);

        return new OrderRequest(producer, productsOrdered);
    }
}
