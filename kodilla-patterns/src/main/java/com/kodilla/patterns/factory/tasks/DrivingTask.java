package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskCompleted = true;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Wykonuję zadanie " + taskName);
    }

    @Override
    public boolean isTaskExecuted() {
        return taskCompleted;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
