package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    public boolean order(final User user, final String productName, final LocalDateTime orderDate, final LocalDateTime deliveryDate) {
        System.out.println("Buying product " + productName + " by: " + user.getName() + user.getSurname()
                + " order date: " + orderDate.toString() + " expected delivery date: " + deliveryDate.toString());

        return true;
    }
}
