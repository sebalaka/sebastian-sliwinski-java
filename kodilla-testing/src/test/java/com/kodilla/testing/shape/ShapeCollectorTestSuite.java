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
    @Nested
    @DisplayName("Test for list operations")
    class TestList {
        @Test
        void addFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(2, 5);
            //When
            shapeCollector.addFigure(shape);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeCollection().size());
        }

        @Test
        void removeFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(2, 5);
            shapeCollector.addFigure(shape);
            //When
            shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertEquals(0, shapeCollector.getShapeCollection().size());
        }
    }
    @Nested
    @DisplayName("Test for getting figure")
    class TestGetFigure {
    @Test
    void getFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(2,5);
        Shape shape2 = new Square(2);
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape2);
        //When
        Shape result = shapeCollector.getFigure(1);

        //Then
        Assertions.assertEquals(shape2, result);
    }

    @Test
    void getFigureWithNegativeIndex() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(2,5);
        Shape shape2 = new Square(2);
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape2);
        //When
        Shape result = shapeCollector.getFigure(-1);

        //Then
        Assertions.assertEquals(null, result);
    }

    @Test
    void getFigureOutOfRange() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(2,5);
        Shape shape2 = new Square(2);
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape2);
        //When
        Shape result = shapeCollector.getFigure(7);

        //Then
        Assertions.assertEquals(null, result);

    }}
}
