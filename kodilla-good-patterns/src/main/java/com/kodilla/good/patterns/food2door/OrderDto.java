package com.kodilla.good.patterns.food2door;

public class OrderDto {
    public Product product;
    public boolean isOrdered;

    public OrderDto(Product product, boolean isOrdered) {
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}