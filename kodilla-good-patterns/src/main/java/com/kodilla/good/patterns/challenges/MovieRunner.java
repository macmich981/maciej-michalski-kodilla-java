package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieRunner {
    public static void main(String args[]) {
        MovieStore movieStore = new MovieStore();

        String moviesTitles = movieStore.getMovies().values().stream()
                .flatMap(val -> val.stream())
                .collect(Collectors.joining("!"));
        System.out.print(moviesTitles);
    }
}
