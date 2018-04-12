package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
            public static void main(String[] args) {
                String titles = MovieStore.getMovies().values().stream()
                        .flatMap(Collection::stream)
                        .collect(Collectors.joining("!"));
                System.out.println(titles);


            }
        }

