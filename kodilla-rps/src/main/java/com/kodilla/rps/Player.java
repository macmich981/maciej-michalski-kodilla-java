package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    private String name;
    private int points;
    Scanner in = new Scanner(System.in);

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

    public int getInput() {
        char ch;
        String input;

        while (true) {
            input = in.next();
            ch = input.charAt(0);
            if (ch != '1' && ch != '2' && ch != '3' && ch != 'x' && ch != 'n') {
                System.out.println("Nie znam takiej opcji. Spróbuj jeszcze raz!");
                continue;
            }
            break;
        }

        if (ch == '1') {
            return Tool.ROCK;
        } else if (ch == '2') {
            return Tool.PAPER;
        } else if (ch == '3') {
            return Tool.SCISSORS;
        } else if (ch == 'x') {
            return Tool.END_OF_GAME;
        } else {
            return Tool.NEW_GAME;
        }
    }
}
