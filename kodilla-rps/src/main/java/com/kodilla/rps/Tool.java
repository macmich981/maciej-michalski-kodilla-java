package com.kodilla.rps;

public class Tool {
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final int END_OF_GAME = 4;
    public static final int NEW_GAME = 5;

    public static void display(String player, int n) {
        switch (n) {
            case Tool.ROCK:
                System.out.println(player + " wybrał kamień ");
                break;
            case Tool.PAPER:
                System.out.println(player + " wybrał papier ");
                break;
            case Tool.SCISSORS:
                System.out.println(player + " wybrał nożyce ");
                break;
            case Tool.END_OF_GAME:
                System.out.println(player + " wybrał zakończenie gry ");
                break;
            case Tool.NEW_GAME:
                System.out.println(player + " wybrał nową grę ");
            default:
                break;
        }
    }

    public static int compareSelections(int playerSelection, int computerPlayerSelection) {
        if (playerSelection == computerPlayerSelection) {
            return 0;
        }

        switch (playerSelection) {
            case ROCK:
                return (computerPlayerSelection == SCISSORS ? 1 : -1);

            case PAPER:
                return (computerPlayerSelection == ROCK ? 1 : -1);

            case SCISSORS:
                return (computerPlayerSelection == PAPER ? 1 : -1);
        }
        return 0;
    }
}
