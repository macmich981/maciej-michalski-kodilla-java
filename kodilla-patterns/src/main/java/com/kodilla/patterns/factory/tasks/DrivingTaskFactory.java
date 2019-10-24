package com.kodilla.patterns.factory.tasks;

public final class DrivingTaskFactory implements TaskFactory {
    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTaskFactory(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public Task createTask() {
        return new DrivingTask(taskName, where, using);
    }
}
