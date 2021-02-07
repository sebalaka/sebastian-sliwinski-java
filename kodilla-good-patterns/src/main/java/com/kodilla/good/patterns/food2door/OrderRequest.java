package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderRequest {
    private final Producer producer;
    private final Map<Product, Integer> productsOrdered;

    public OrderRequest(Producer producer, Map<Product, Integer> productsOrdered) {
        this.producer = producer;
        this.productsOrdered = productsOrdered;
    }

    public Producer getProducer() {
        return producer;
    }

    public Map<Product, Integer> getProductsOrdered() {
        return productsOrdered;
    }

}
