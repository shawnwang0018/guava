package org.shawn.collection.jdk8stream;

import org.shawn.Person;
import org.shawn.PersonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

/**
* LimitCase
 * 类似于mysql的limit
* @author xiao.wang
* @date 2019-08-02
* @version V1.0
*/
public class LimitCase {
    private static Logger logger = LoggerFactory.getLogger(LimitCase.class);

    public static void main(String[] args) {
        List<Person> testData = PersonData.getTestData();
        List<Person> collect = testData.stream().limit(3).collect(Collectors.toList());
        testData.forEach(person -> logger.debug("person : {}",person));
        logger.debug("");
        collect.forEach(person -> logger.debug("person : {}",person));
    }


}
