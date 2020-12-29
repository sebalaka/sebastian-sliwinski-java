package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.CorporateCustomer;
import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.IndividualYoungCustomer;
import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultInvestingStrategies() {
        //Given
        User user1 = new Millenials("Marek Milenials");
        User user2 = new YGeneration("Jadzia Ygen");
        User user3 = new ZGeneration("Fabian Xgen");

        //When
        String user1Social = user1.sharePost();
        System.out.println("Marek use: " + user1Social);
        String user2Social = user2.sharePost();
        System.out.println("Jadzia use: " + user2Social);
        String user3Social = user3.sharePost();
        System.out.println("Fabian use: " + user3Social);

        //Then
        assertEquals("Facebook", user1Social);
        assertEquals("Twitter", user2Social);
        assertEquals("Snapchat", user3Social);
    }

    @Test
    void testIndividualInvestingStrategy() {
        //Given
        User user4 = new Millenials("Dariusz Nowak");

        //When
        String user4Uses = user4.sharePost();
        System.out.println("Dariusz uses: " + user4Uses);
        user4.setSocialPublisher(new SnapchatPublisher());
        user4Uses = user4.sharePost();
        System.out.println("Dariusz now should use: " + user4Uses);

        //Then
        assertEquals("Snapchat", user4Uses);
}}
