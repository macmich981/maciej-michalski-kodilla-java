package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public final class Calculator {
    private final Display display;

    public Calculator(final Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        display.displayValue(a + b);
        return a + b;
    }

    public double sub(double a, double b) {
        display.displayValue(a - b);
        return a - b;
    }

    public double mul(double a, double b) {
        display.displayValue(a * b);
        return a * b;
    }

    public double div(double a, double b) {
        try {
            double result = a / b;
            if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("UWAGA: Dzielenie przez 0!");
        }
        display.displayValue(a / b);
        return a / b;
    }
}
