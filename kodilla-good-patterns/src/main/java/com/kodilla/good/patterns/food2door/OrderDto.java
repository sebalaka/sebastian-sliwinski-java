package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderDto {
    private final Producer producer;
    private final Map<Product, Integer> productsOrdered;
    private final boolean isOrdered;


    public OrderDto(Producer producer, Map<Product, Integer> productsOrdered, boolean isOrdered) {
        this.producer = producer;
        this.productsOrdered = productsOrdered;
        this.isOrdered = isOrdered;
    }

    public Producer getProducer() {
        return producer;
    }

    public Map<Product, Integer> getProductsOrdered() {
        return productsOrdered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}