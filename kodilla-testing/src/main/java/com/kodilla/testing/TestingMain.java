package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int a = 10, b = 5;
        Calculator calculator = new Calculator();
        if (calculator.add(a, b) == a + b) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error");
        }

        if (calculator.substract(a, b) == a - b) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error");
        }
    }
}
