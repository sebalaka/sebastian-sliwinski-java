package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .flatMap(i -> IntStream.of(numbers[i]))
                .forEach(System.out::println);

        return IntStream.range(0,numbers.length)
                .flatMap(i -> IntStream.of(numbers[i]))
                .average()
                .getAsDouble();
    }
}
