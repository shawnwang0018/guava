package org.shawn.binary;

import java.util.Arrays;
import java.util.TreeSet;

public class TestBinary {
    public static void main(String[] args) {
        int a = 11;
        int b = 1;
        System.out.println(a & b);
        int c = 0b11;
        String s = "1001111";
        String replace = s.replace("1", "");
        System.out.println(s.length() - replace.length());
        int i = Integer.parseInt("10001111", 2);
        //System.out.println(i);
    }
}