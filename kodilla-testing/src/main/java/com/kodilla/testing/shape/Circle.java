package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String shapeName = "circle";
    private double radius;
    private double field;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        field = Math.PI*(radius*radius);
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return shapeName != null ? shapeName.equals(circle.shapeName) : circle.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

