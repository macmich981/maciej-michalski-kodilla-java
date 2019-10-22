package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "Driving";
    public static final String PAINTING = "Painting";
    public static final String SHOPPING = "Shopping";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving", "Home", "Bicycle");
            case PAINTING:
                return new PaintingTask("Painting the wall", "Red", "Wall");
            case SHOPPING:
                return new ShoppingTask("Shopping", "Some food", 10);
            default:
                return null;
        }
    }
}
