package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    private String shapeName;
    private double field;
    private List<Shape> figures = new ArrayList<>();


    public ShapeCollector(String shapeName, double field) {
    this.shapeName = shapeName;
    this.field = field;
    }

    Circle theShape = new Circle("circle", 3.8);
    Square theShape2 = new Square("square", 4.2);
    Triangle theShape3 = new Triangle("triangle", 4.9);

    public void addFigure(String shapeName, double field) {
        figures.add(theShape);
    }

    public boolean removeFigure(String shapeName, double field) {
        boolean result = false;
        if (figures.contains(theShape)) {
            figures.remove(theShape);
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
        return theShape.getShapeName() +
                " " + theShape2.getShapeName() +
                " " + theShape3.getShapeName();
    }

    public int getFigureQuantity() {
        return figures.size();
    }
}
