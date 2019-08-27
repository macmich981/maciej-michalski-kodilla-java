package com.kodilla.rps;

public class Player {
    private String name;
    private int points;

    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void addPoint() {
        points++;
    }

    public int getMove() {
        return Move.getInput();
    }
}
