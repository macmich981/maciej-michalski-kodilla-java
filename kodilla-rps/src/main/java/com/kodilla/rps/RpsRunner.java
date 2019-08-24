package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    private int actualNumberOfRound;
    private int maxNumberOfRounds;

    public RpsRunner(int maxNumberOfRounds) {
        this.actualNumberOfRound = 1;
        this.maxNumberOfRounds = maxNumberOfRounds;
    }

    private int getMaxNumberOfRounds() {
        return maxNumberOfRounds;
    }

    private void summaryOfGame(Player player, ComputerPlayer computerPlayer) {
        System.out.println("Podsumowanie gry:");
        System.out.println("Łączna ilość rund: " + (player.getPoints() + computerPlayer.getPoints()));
        System.out.println("Liczba rund wygranych przez " + player.getName() + ": " + player.getPoints());
        System.out.println("Liczba rund wygranych przez komputer " + computerPlayer.getPoints());

        System.out.print("Zwycięzcą gry zostaje: ");
        if (player.getPoints() > computerPlayer.getPoints()) {
            System.out.println(player.getName());
        } else {
            System.out.println("komputer");
        }
    }

    private boolean nextGame() {
        Scanner in = new Scanner(System.in);

        System.out.println("Czy chcesz rozpocząć nową grę (t/n)?");
        String input = in.next();
        return input.charAt(0) == 't';
    }

    private boolean endGame() {
        Scanner in = new Scanner(System.in);

        System.out.println("Czy chcesz zakończyć grę (t/n)?");
        String input = in.next();
        return input.charAt(0) == 't';
    }

    private static String initName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        return in.nextLine();
    }

    private static int initMaxRounds() {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ilość rund koniecznych do zwycięstwa: ");
        while (!in.hasNextInt()) {
            System.out.println("Zła wartość. Spróbuj jeszcze raz!");
            in.next();
        }
        return in.nextInt();
    }

    private void startRound() {
        System.out.println("[1] - zagraj \"kamień\"");
        System.out.println("[2] - zagraj \"papier\"");
        System.out.println("[3] - zagraj \"nożyce\"");
        System.out.println("[x] - zakończenie gry");
        System.out.println("[n] - nowa gra");
    }

    public static void main(String args[]) {
        boolean end = false;

        while (!end) {
            Player player1 = new Player(RpsRunner.initName());
            ComputerPlayer computerPlayer = new ComputerPlayer();
            RpsRunner rpsRunner = new RpsRunner(RpsRunner.initMaxRounds());

            do {
                rpsRunner.startRound();
                int playerInput = player1.getInput();
                Tool.display(player1.getName(), playerInput);
                if (playerInput == Tool.END_OF_GAME) {
                    if (rpsRunner.endGame()) {
                        end = true;
                        break;
                    } else {
                        continue;
                    }
                } else if (playerInput == Tool.NEW_GAME) {
                    if (rpsRunner.nextGame()) {
                        break;
                    } else {
                        continue;
                    }
                } else {
                    int computerPlayerInput = computerPlayer.getInput();
                    Tool.display("Komputer", computerPlayerInput);
                    int compareResult = Tool.compareSelections(playerInput, computerPlayerInput);
                    switch (compareResult) {
                        case 0: // Remis
                            System.out.println("Remis!");
                            break;
                        case 1: // Gracz wygrywa
                            System.out.println(player1.getName() + " pokonuje komputer. " + "Wygrałeś rundę!");
                            player1.addPoint();
                            break;
                        case -1: // Komputer wygrywa
                            System.out.println("Komputer pokonuje " + player1.getName() + ". Przegrałeś rundę!");
                            computerPlayer.addPoint();
                            break;
                    }
                    System.out.println(player1.getName() + ": " + player1.getPoints());
                    System.out.println("Komputer: " + computerPlayer.getPoints());
                }
            } while (player1.getPoints() < rpsRunner.maxNumberOfRounds && computerPlayer.getPoints() < rpsRunner.maxNumberOfRounds);
            rpsRunner.summaryOfGame(player1, computerPlayer);
            if (!end) {
                if (!rpsRunner.nextGame()) {
                    end = true;
                }
            }
        }
    }

}