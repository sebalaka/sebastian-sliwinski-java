package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @DisplayName("when create new, empty List and new object from OddNumbersExaminator class, " +
            "then method .exterminate should return list without any object"
    )

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator object = new OddNumbersExterminator();
        //When
        List<Integer> result = object.exterminate(emptyList);
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("when create List with odd and even numbers, and new object from OddNumbersExaminator class, " +
            "then method .exterminate should return list without even numbers"
    )

    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> oddAndEvenList = new ArrayList<>();
        oddAndEvenList.add(2);
        oddAndEvenList.add(3);
        oddAndEvenList.add(10);
        oddAndEvenList.add(9);
        oddAndEvenList.add(112);

        ArrayList<Integer> oddList = new ArrayList<>();
        oddList.add(2);
        oddList.add(10);
        oddList.add(112);

        OddNumbersExterminator object = new OddNumbersExterminator();
        //When
        List<Integer> result = object.exterminate(oddAndEvenList);
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(oddList, result);
    }

    @Test
    void testOddNumbersExterminatorNormalList2(){
        //Given

        Integer a[] = new Integer[] { 2, 3, 10, 9, 112 };
        List<Integer> list = Arrays.asList(a);
        Integer b[] = new Integer[] { 2, 10, 112 };
        List<Integer> listOdd = Arrays.asList(b);

        OddNumbersExterminator object = new OddNumbersExterminator();
        //When
        List<Integer> result = object.exterminate(list);
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(listOdd, result);
    }
}
