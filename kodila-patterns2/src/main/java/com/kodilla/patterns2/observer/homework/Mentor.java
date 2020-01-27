package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksList tasksList) {
        System.out.println(name + ": New task in " + tasksList.getName() + "\n" +
                " (total: " + tasksList.getTasks().size() + " tasks)");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
