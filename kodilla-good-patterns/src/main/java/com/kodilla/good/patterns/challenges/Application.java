package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        User user = new User("Marek", "Bralczyk", true);
        String productName = "Dysk SSD";
        LocalDateTime orderDate = LocalDateTime.now();
        LocalDateTime deliveryDate = LocalDateTime.of(2020, 12, 15, 12, 0);

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
    }
}
