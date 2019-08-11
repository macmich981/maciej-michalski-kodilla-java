package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private String shapeName;
    private double field;

    public Triangle(String shapeName, double a, double h) {
        this.shapeName = shapeName;
        this.field = 0.5 * a * h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.field, field) == 0 &&
                Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }

    @Override
    public String toString() {
        return "Triangle{" +
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
