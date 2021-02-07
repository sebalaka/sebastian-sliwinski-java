package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class GlutenFreeShop implements Producer {
    private final String name;
    private final String email;
    private final String adress;

    public GlutenFreeShop(String name, String email, String adress) {
        this.name = name;
        this.email = email;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "GlutenFreeShop";
    }

    @Override
    public boolean process(Map<Product, Integer> productsOrdered)  {
        if (productsOrdered.keySet().stream().map(Product::getName).anyMatch("Turkey"::equals)) {
            System.out.println("No turkey in store, we are unable to deliver it at the moment");
            return false;
        }
        return true;
    }
}
