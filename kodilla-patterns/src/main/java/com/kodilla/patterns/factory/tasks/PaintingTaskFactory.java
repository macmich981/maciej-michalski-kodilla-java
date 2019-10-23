package com.kodilla.patterns.factory.tasks;

public final class PaintingTaskFactory implements AbstractTaskFactory {
    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTaskFactory(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public Task createTask() {
        return new PaintingTask(taskName, color, whatToPaint);
    }
}
