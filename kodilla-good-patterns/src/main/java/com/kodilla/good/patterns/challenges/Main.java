package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.getMovies().entrySet().stream()
                .flatMap(movie -> movie.getValue().stream())
                .collect(Collectors.joining(",")));
    }
}
