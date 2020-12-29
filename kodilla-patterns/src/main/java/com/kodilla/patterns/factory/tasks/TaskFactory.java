package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskType) {
        switch (taskType){
            case SHOPPING:
                return new ShoppingTask("Buy 10 potato", "potato", 10);
            case PAINTING:
                return new PaintingTask("Paint room", "yellow", "Mine room");
            case DRIVING:
                return new DrivingTask("Drive to cinema", "Cinema City", "Car");
            default:
                return null;
        }
    }
}