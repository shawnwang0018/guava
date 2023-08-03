package org.shawn;


import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class TestString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String fileName = "组合商品列表";

        fileName = new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);

        System.out.println(fileName);

    }
}
