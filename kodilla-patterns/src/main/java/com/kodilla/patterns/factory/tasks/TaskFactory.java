package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String whichTask) {
        switch (whichTask) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "sausage", 4);
            case PAINTING:
                return new PaintingTask("Painting", "Navy Blue", "All walls in the bedroom");
            case DRIVING:
                return new DrivingTask("Driving", "to the cinema", "taxi");
            default:
                return null;
        }
    }
}
