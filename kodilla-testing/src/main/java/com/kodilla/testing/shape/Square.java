package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName = "square";
    private double side;
    private double field;

    public Square(double side) {
        this.side = side;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        field = side * side;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.field, field) != 0) return false;
        return shapeName != null ? shapeName.equals(square.shapeName) : square.shapeName == null;
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
