package org.shown.collection.guava;

import com.google.common.collect.HashMultiset;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* @Title: MultisetCase
* @Description: TODO
* @author xiao.wang
* @date 2018/2/28
* @version V1.0
*/
public class MultisetCase {
    private static Logger logger = LoggerFactory.getLogger(MultisetCase.class.getClass());
    public static void main(String[] args) {
        HashMultiset<String> set = HashMultiset.create();
        set.add("guava");
        set.add("guava");
        set.add("guava");
        for (String s : set){
            logger.debug("s {}" , s);
        }
        System.out.println(set.count("guava"));
    }
}
