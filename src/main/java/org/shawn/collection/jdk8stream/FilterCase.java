package org.shawn.collection.jdk8stream;

import org.shawn.Person;
import org.shawn.PersonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * FilterCase
 * 根据某个属性值作为条件过滤list元素,找出符合条件的元素
 *
 * @author xiao.wang
 * @version V1.0
 * @date 2019-08-02
 */
public class FilterCase {
    private static final int AGE_LIMIT = 18;
    private static Logger logger = LoggerFactory.getLogger(ListToMapCase.class);
    private static Person person;

    public static void main(String[] args) {
        List<Person> testData = PersonData.getTestData();
        // 提取年龄大于18岁的person
        List<Person> collect = testData.stream().
                filter(FilterCase::test).collect(Collectors.toList());
        List<Person> collect1 = testData.stream().
                filter(person -> person.getAge() > AGE_LIMIT).collect(Collectors.toList());
        collect.forEach(FilterCase::accept);
    }


    private static void accept(Person person) {
        logger.debug("age:{} person:{}", person.getAge(), person);
    }

    private static boolean test(Person person) {
        FilterCase.person = person;
        return person.getAge() >= AGE_LIMIT;
    }
}
