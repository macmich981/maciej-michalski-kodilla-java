package com.kodilla.rps.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                evens.add(numbers.get(i));
            }
        }

        return evens;
    }
}
