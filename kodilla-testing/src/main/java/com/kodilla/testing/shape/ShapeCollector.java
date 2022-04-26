package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {

    List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
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
    String word;
    public String  showFigures() {


        List<String> shapeNames = new ArrayList<>();
        for (Shape shape : figures) {
           word = shape.getShapeName();
           shapeNames.add(word);
        }
        return word;
    }


    public int getFigureQuantity() {
        return figures.size();
    }
}
