package org.shawn.collection.jdk8stream;

import org.shawn.Person;
import org.shawn.PersonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
* SortedCase
 * 根据某一个属性进行排序
* @author xiao.wang
* @date 2019-08-01
* @version V1.0
*/
public class SortedCase {
    private static Logger logger = LoggerFactory.getLogger(SortedCase.class);
    public static void main(String[] args) {
        List<Person> testData = PersonData.getTestData();
        testData.forEach((person) -> logger.debug("原始person : {}",person));
        // 按年龄升序排序
        List<Person> collect = testData.stream().
                sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        collect.forEach((person) -> logger.debug("升序person : {}",person));


        // 按年龄降序排序
        List<Person> collect2 = testData.stream().
                sorted((o1, o2) -> o2.getAge() - o1.getAge()).collect(Collectors.toList());
        collect2.forEach((person) -> logger.debug("降序person : {}",person));
    }
}
