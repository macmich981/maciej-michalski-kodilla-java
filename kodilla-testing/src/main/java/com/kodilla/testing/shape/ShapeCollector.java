package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getShape(int shapeNumber) {
        Shape theShape = null;
        if (shapeNumber >= 0 && shapeNumber < shapes.size()) {
            theShape = shapes.get(shapeNumber);
        }
        return theShape;
    }

    public void showFigures() {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
