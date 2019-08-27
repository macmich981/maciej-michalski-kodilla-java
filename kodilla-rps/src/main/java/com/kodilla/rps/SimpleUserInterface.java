package com.kodilla.rps;

import java.util.Scanner;

public class SimpleUserInterface implements UserInterface{
    public String initName() {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj swoje imię: ");
        return in.nextLine();
    }

    public int initMaxRounds() {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ilość rund koniecznych do zwycięstwa: ");
        while (!in.hasNextInt()) {
            System.out.println("Zła wartość. Spróbuj jeszcze raz!");
            in.next();
        }
        return in.nextInt();
    }

    public void printMenu() {
        System.out.println("[1] - zagraj \"kamień\"");
        System.out.println("[2] - zagraj \"papier\"");
        System.out.println("[3] - zagraj \"nożyce\"");
        System.out.println("[x] - zakończenie gry");
        System.out.println("[n] - nowa gra");
    }

    public void displayMove(String player, int n) {
        switch (n) {
            case Move.ROCK:
                System.out.println(player + " wybrał kamień ");
                break;
            case Move.PAPER:
                System.out.println(player + " wybrał papier ");
                break;
            case Move.SCISSORS:
                System.out.println(player + " wybrał nożyce ");
                break;
            case Move.END_OF_GAME:
                System.out.println(player + " wybrał zakończenie gry ");
                break;
            case Move.NEW_GAME:
                System.out.println(player + " wybrał nową grę ");
            default:
                break;
        }
    }

    public void informRound(int roundResult, Player player, ComputerPlayer computerPlayer) {
        switch (roundResult) {
            case 0:
                System.out.println("Remis");
                break;

            case 1:
                System.out.println(player.getName() + " pokonuje komputer. Wygrałeś rundę!");
                break;

            case -1:
                System.out.println("Komputer pokonuje " + player.getName());
                break;
        }
        System.out.println(player.getName() + ": " + player.getPoints());
        System.out.println("Komputer: " + computerPlayer.getPoints());
    }

    public void summaryOfGame(Player player, ComputerPlayer computerPlayer) {
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

    public boolean confirmNext() {
        Scanner in = new Scanner(System.in);

        System.out.println("Czy chcesz rozpocząć nową grę (t/n)?");
        String input = in.next();
        return input.charAt(0) == 't';
    }

    public boolean confirmEnd() {
        Scanner in = new Scanner(System.in);

        System.out.println("Czy chcesz wyjść z gry (t/n)?");
        String input = in.next();
        return input.charAt(0) == 't';
    }
}
