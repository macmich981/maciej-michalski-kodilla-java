package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private static final String NAME = "Square";
    private double side;

    public Square(double side) {
        this.side = side;
    }

    private double field() {
        return Math.pow(side, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return String.format("%s(%f)", NAME, side);
    }

    public String getShapeName() {
        return NAME;
    }

    public double getField() {
        return field();
    }
}
