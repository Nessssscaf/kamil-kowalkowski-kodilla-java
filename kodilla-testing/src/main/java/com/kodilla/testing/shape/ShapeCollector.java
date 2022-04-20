package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> figures = new ArrayList<>();

    Circle circle = new Circle(3.8);
    Square square = new Square(4.2);
    Triangle triangle = new Triangle(4.0, 7.2);

    public void addFigure(Shape shape) {
        figures.add(circle);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(circle)) {
            figures.remove(circle);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int figureNumber) {
        if (figureNumber >= 0 && figureNumber < figures.size()) {
            return figures.get(figureNumber);
        }
        return null;
    }

    public String showFigures() {
        return circle.getShapeName() +
                " " + square.getShapeName() +
                " " + triangle.getShapeName();
    }

    public int getFigureQuantity() {
        return figures.size();
    }
}
