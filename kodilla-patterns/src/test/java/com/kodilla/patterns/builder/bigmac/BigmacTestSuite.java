package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(3)
                .sauce("1000islands")
                .ingredient("onion")
                .ingredient("cheese")
                .ingredient("bacon")
                .ingredient("salami")
                .ingredient("chili")
                .ingredient("chicken")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(6, howManyIngredients);
    }
}