package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;
import java.util.Map;

public class OrderService {
    public boolean order(final Producer producer, Map<Product, Integer> productsOrdered) {
        productsOrdered.forEach((k, v) -> {
            System.out.println("Order from " + producer.toString() + " Bought: " + k + " with an amount: " + v);}
        );

        return producer.process(productsOrdered);
    }
}
