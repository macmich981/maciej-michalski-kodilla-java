package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private String shapeName;
    private double field;

    public Square(String shapeName, double a) {
        this.shapeName = shapeName;
        this.field = Math.pow(a, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.field, field) == 0 &&
                Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }
}
