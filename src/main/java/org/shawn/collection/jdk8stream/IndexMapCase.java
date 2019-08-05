package org.shawn.collection.jdk8stream;

import org.shawn.Person;
import org.shawn.PersonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

/**
* ListToMapCase
 * 提取每个Person的age作为一个新的list
* @author xiao.wang
* @date 2019-07-25
* @version V1.0
*/
public class IndexMapCase {
    private static Logger logger = LoggerFactory.getLogger(IndexMapCase.class);
    public static void main(String[] args) {
        List<Person> testData = PersonData.getTestData();
        List<Integer> collect = testData.stream().
                map(Person::getAge).collect(Collectors.toList());
        logger.debug("collect : {}",collect);
        List<Integer> collect1 = testData.stream().
                map(Person::getAge).distinct().collect(Collectors.toList());
        logger.debug("collect1 : {}",collect1);
    }
}
