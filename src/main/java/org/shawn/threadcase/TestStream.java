package org.shawn.threadcase;

import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        int limit = 10;
        int sum = Stream.iterate(0, i -> i + 1).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
