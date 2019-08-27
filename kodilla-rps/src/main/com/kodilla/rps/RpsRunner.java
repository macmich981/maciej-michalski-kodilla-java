package com.kodilla.rps;

public class RpsRunner {
    public static void main(String args[]) {
        boolean end = false;

        while (!end) {
            UserInterface userInterface = new SimpleUserInterface();
            end = new GameRunner(userInterface).run();
        }
    }
}
