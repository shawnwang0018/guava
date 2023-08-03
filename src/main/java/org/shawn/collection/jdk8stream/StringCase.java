package org.shawn.collection.jdk8stream;

import com.google.common.base.Joiner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCase {
    public static void main(String[] args) {
        String a = "12,34";
        List<String> collect = Arrays.stream(a.split("[,]")).collect(Collectors.toList());
        System.out.println(collect);
        boolean contains = collect.contains(String.valueOf(123));
        System.out.println(contains);
        String join = Joiner.on(":").join(collect);
        System.out.println(join);
    }
}
