package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    public void createOrder(User user, String productName, LocalDateTime orderDate, LocalDateTime deliveryDate) {
        System.out.println("New order is accepted and adding to database");
    }

}
