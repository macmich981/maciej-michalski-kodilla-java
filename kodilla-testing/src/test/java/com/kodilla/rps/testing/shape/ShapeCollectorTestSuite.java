package com.kodilla.rps.testing.shape;

import org.junit.*;
import java.io.*;

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
        shapeCollector.addFigure(new Square(5));
        //Then
        Assert.assertEquals(1, shapeCollector.shapes.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(5));
        //When
        boolean result = shapeCollector.removeFigure(new Square(5));
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square1 = new Square(5);
        shapeCollector.addFigure(square1);
        //When
        Shape result = shapeCollector.getShape(0);
        //Then
        Assert.assertEquals(square1, result);
    }

    @Test
    public void testShowFigure() {
        //Given
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(stream);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(5));
        PrintStream originalPrintStream = System.out;
        System.setOut(ps);
        //When
        shapeCollector.showFigures();
        //Then
        Assert.assertEquals("Square(5,000000)" + System.getProperty("line.separator"), stream.toString());

        System.setOut(originalPrintStream);
    }
}
