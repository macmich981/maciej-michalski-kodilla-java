package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer {
    private static final Random RANDOM = new Random();
    private static final int maxMoveToChooseByComputer = 3;
    private int points = 0;

    public int getMove() {
        return RANDOM.nextInt(maxMoveToChooseByComputer) + 1;
    }

    public void addPoint() {
        points++;
    }

    public int getPoints() {
        return points;
    }
}
