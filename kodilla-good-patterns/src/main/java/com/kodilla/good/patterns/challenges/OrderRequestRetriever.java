package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Marek", "Bralczyk", true);
        String productName = "Dysk SSD";
        LocalDateTime orderDate = LocalDateTime.now();
        LocalDateTime deliveryDate = LocalDateTime.of(2020, 12, 15, 12, 0);

        return new OrderRequest(user, productName, orderDate, deliveryDate);
    }
}
