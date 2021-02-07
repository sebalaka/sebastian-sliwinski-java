package com.kodilla.good.patterns.food2door;

import java.util.Map;

public interface Producer {
    boolean process(Map<Product, Integer> productsOrdered);
}