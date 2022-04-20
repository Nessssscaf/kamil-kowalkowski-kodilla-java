package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String shapeName = "triangle";
    private double base;
    private double height;
    private double field;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        field = 0.5 * base * height;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.field, field) != 0) return false;
        return shapeName != null ? shapeName.equals(triangle.shapeName) : triangle.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(field);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
