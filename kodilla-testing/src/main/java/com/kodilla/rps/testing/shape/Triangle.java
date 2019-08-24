package com.kodilla.rps.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private static final String NAME = "Triangle";
    private double side, height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    private double field() {
        return 0.5 * side * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side, side) == 0 &&
                Double.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, height);
    }

    @Override
    public String toString() {
        return String.format("%s(%f%f)", NAME, side, height);
    }

    public String getShapeName() {
        return NAME;
    }

    public double getField() {
        return field();
    }
}
