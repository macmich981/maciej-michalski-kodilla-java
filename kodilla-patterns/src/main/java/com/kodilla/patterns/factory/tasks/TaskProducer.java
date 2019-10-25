package com.kodilla.patterns.factory.tasks;

public final class TaskProducer {

    public final Task makeTask(final TaskFactory factory) {
        return factory.createTask();
    }
}
