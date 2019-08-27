package src.main.com.kodilla.rps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Move {
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final int END_OF_GAME = 4;
    public static final int NEW_GAME = 5;
    private static final List ALLOWED_INPUTS = Arrays.asList('1', '2', '3', 'x', 'n');

    private static char returnAllowedInput(String input) {
        Scanner in = new Scanner(System.in);
        char ch = input.charAt(0);
        while (!ALLOWED_INPUTS.contains(ch)) {
            System.out.println("Nie znam takiej opcji. Spróbuj jeszcze raz!");
            input = in.next();
            ch = input.charAt(0);
        }
        return ch;
    }


    public static int getInput() {
        Scanner in = new Scanner(System.in);
        char ch = Move.returnAllowedInput(in.next());

        if (ch == '1') {
            return Move.ROCK;
        } else if (ch == '2') {
            return Move.PAPER;
        } else if (ch == '3') {
            return Move.SCISSORS;
        } else if (ch == 'x') {
            return Move.END_OF_GAME;
        } else {
            return Move.NEW_GAME;
        }
    }
}
