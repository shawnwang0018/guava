package org.shawn.threadcase;

import com.google.common.collect.Lists;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.shawn.collection.jdk8stream.IndexMapCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.LinkedList;

public class NameCase {

    private static Logger logger = LoggerFactory.getLogger(IndexMapCase.class);

    public static void main(String[] args) {
        String s = new NameCase().printThreadName();
        logger.debug("name is{}",s);
        Thread t = Thread.currentThread();
        t.setName("Main thread is");
        String name = t.getName();
        logger.debug("name is{}",name);
        String random = RandomStringUtils.randomNumeric(4);
        int i = RandomUtils.nextInt();
        System.out.println(random);
        BigDecimal bigDecimal = new BigDecimal("1300.83").multiply(new BigDecimal("100"));
        LinkedList<String> objects = Lists.newLinkedList();
        objects.add("adb");
        objects.get(0);
        logger.debug("result{}  ",bigDecimal.longValue());
    }

    public String printThreadName(){
        return this.getClass().getName();
    }
}
