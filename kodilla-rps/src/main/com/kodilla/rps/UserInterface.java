package com.kodilla.rps;

public interface UserInterface {
    String initName();
    int initMaxRounds();
    void printMenu();
    void displayMove(String player, int n);
    void informRound(int roundResult, Player player, ComputerPlayer computerPlayer);
    void summaryOfGame(Player player, ComputerPlayer computerPlayer);
    boolean confirmNext();
    boolean confirmEnd();
}
