package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1, 1.5));
        } catch (Exception e) {
            System.out.println("Błąd: niewłaściwe dane: " + e);
        } finally {
            System.out.println("Jestem po bloku \"try - catch\"");
        }
        System.out.println("Koniec programu!");
    }
}
