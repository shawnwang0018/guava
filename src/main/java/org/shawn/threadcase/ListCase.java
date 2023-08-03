package org.shawn.threadcase;

import com.google.common.collect.Lists;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.shawn.collection.jdk8stream.IndexMapCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class ListCase {

    private static Logger logger = LoggerFactory.getLogger(IndexMapCase.class);

    static ThreadLocal<AtomicInteger> localVar = new ThreadLocal<>();

    static void print(String str) {
        //打印当前线程中本地内存中本地变量的值
        System.out.println(str + " :" + localVar.get());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                increace();
                increace();
                print("thread1");


            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //调用打印方法
                increace();
                print("thread2");
                //打印本地变量
            }
        });

        t1.start();
        t2.start();
    }

    public String printThreadName() {
        return this.getClass().getName();
    }

    public static void increace() {
        AtomicInteger atomicInteger = localVar.get();
        if (atomicInteger == null) {
            localVar.set(new AtomicInteger(1));
        } else {
            atomicInteger.incrementAndGet();
        }
    }
}
