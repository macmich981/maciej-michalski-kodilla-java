package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        boolean result = shapeCollector.addFigure(new Square("Square1", 5));
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        boolean result = shapeCollector.removeFigure(new Square("Square1", 5));
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square1 = new Square("Square1", 5);
        shapeCollector.addFigure(square1);
        //When
        Shape result = shapeCollector.getShape(0);
        //Then
        Assert.assertEquals(square1, result);
    }
}
