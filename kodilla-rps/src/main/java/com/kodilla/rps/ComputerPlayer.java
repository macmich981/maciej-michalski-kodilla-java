package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer {
    private static final Random RANDOM = new Random();
    private static final String computerName = "Komputer";
    private static final int MAX_MOVE_NUMBER = 3;
    private int points = 0;

    public int getMove() {
        return RANDOM.nextInt(MAX_MOVE_NUMBER) + 1;
    }

    public void addPoint() {
        points++;
    }

    public int getPoints() {
        return points;
    }

    public String getComputerName() {
        return computerName;
    }
}
