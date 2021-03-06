package com.kodilla.stream.forumuser.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);
        OptionalDouble average = IntStream.of(numbers)
                .average();
             return average.orElse(0);
    }
        }


