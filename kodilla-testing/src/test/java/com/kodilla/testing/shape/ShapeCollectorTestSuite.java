package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void addFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(2,5);
        //When
        shapeCollector.addFigure(shape);

        //Then
        Assertions.assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    void removeFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(2,5);
        //When
        shapeCollector.removeFigure(shape);

        //Then
        Assertions.assertEquals(0, shapeCollector.getShapeCollection().size());
    }

    @Test
    void getFigure() {
        //Given


        //When


        //Then

    }

    @Test
    void showFigures() {
        //Given


        //When



        //Then

    }
}
