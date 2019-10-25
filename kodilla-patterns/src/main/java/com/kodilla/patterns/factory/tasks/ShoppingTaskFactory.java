package com.kodilla.patterns.factory.tasks;

public final class ShoppingTaskFactory implements TaskFactory {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTaskFactory(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public Task createTask() {
        return new ShoppingTask(taskName, whatToBuy, quantity);
    }
}
