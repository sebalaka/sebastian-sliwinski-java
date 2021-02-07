package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class ExtraFoodShop implements Producer {
    private final String name;
    private final String email;
    private final String telephone;

    public ExtraFoodShop(final String name, final String email, final String telephone) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }

    @Override
    public boolean process(Map<Product, Integer> productsOrdered) {
        if (productsOrdered.keySet().stream().map(Product::getName).anyMatch("Chicken"::equals)) {
            System.out.println("No chicken in store, we are unable to deliver it at the moment");
            return false;
        }
        return true;
    }
}
