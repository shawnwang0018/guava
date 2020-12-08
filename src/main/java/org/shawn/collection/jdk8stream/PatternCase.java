package org.shawn.collection.jdk8stream;

import org.shawn.Person;
import org.shawn.PersonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * FilterCase
 * 根据某个属性值作为条件过滤list元素,找出符合条件的元素
 *
 * @author xiao.wang
 * @version V1.0
 * @date 2019-08-02
 */
public class PatternCase {

    private static final Pattern PATTERN = Pattern.compile("^[A-Za-z0-9\\\\-]+$");

    public static void main(String[] args) {
        Matcher m = PATTERN.matcher("DISTRIBUTOR_526075-75)349693290296");
        boolean b = m.find();
        System.out.println(b);
        Matcher m1 = PATTERN.matcher("DISTRIBUTOR-526075-test3293004846");
        boolean b1 = m1.find();
        System.out.println(b1);

    }


}
