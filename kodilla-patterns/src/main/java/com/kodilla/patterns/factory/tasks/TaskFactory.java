package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public final Task makeTask(final AbstractTaskFactory taskClass) {
        return taskClass.createTask();
    }
}
