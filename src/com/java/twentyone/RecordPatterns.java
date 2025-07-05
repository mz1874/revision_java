package com.java.twentyone;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class RecordPatterns {

    record Point(int x, int y) {}

    static void print(Object o) {
        if (o instanceof Point(int x, int y)) {
            System.out.println("x = " + x + ", y = " + y);
        }

        if (o instanceof Point(_, int y)) {
            System.out.println("y = " + y);
        }
    }

    static String formatter(Object o) {
        return switch (o) {
            case Integer i -> "int: " + i;
            case Long l -> "long: " + l;
            case String s -> "string: " + s;
            default -> "unknown";
        };
    }


    public static void main(String[] args) {
        try (var executor = Executors.newCachedThreadPool()) {
            IntStream.range(0, 10_000).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    System.out.println("1");
                    return i;
                });
            });
        }  // executor.close() is called implicitly, and waits
    }
}
