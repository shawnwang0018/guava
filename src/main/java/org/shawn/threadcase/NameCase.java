package org.shawn.threadcase;

import org.shawn.collection.jdk8stream.IndexMapCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NameCase {

    private static Logger logger = LoggerFactory.getLogger(IndexMapCase.class);

    public static void main(String[] args) {
        String s = new NameCase().printThreadName();
        logger.debug("name is{}",s);
        Thread t = Thread.currentThread();
        t.setName("Main thread is");
        String name = t.getName();
        logger.debug("name is{}",name);

    }

    public String printThreadName(){
        return this.getClass().getName();
    }
}
