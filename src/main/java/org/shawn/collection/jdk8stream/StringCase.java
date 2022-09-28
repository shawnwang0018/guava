package org.shawn.collection.jdk8stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCase {
    public static void main(String[] args) {
        String a = "1234";
        List<String> collect = Arrays.stream(a.split("[,]")).collect(Collectors.toList());
        System.out.println(collect);
        boolean contains = collect.contains(String.valueOf(123));
        System.out.println(contains);
    }
}
