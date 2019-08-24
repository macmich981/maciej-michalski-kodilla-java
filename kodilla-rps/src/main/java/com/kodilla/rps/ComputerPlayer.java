package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer {
    private static final Random RANDOM = new Random();
    private int points = 0;

    public int getInput() {
        return RANDOM.nextInt(3) + 1;
    }

    public void addPoint() {
        points++;
    }

    public int getPoints() {
        return points;
    }
}
