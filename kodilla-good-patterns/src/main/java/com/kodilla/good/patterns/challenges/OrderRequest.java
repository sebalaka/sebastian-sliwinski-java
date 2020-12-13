package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private String productName;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;

    public OrderRequest(User user, String productName, LocalDateTime orderDate, LocalDateTime deliveryDate) {
        this.user = user;
        this.productName = productName;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }
}
