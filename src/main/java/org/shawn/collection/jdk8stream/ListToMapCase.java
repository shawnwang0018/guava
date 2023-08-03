package org.shawn.collection.jdk8stream;

import org.shawn.Person;
import org.shawn.PersonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ListToMapCase
 * 以id作为key,person(或者某个其他属性值)为value,转换成map
 *
 * @author xiao.wang
 * @version V1.0
 * @date 2019-07-25
 */
public class ListToMapCase {
    private static Logger logger = LoggerFactory.getLogger(ListToMapCase.class);

    public static void main(String[] args) {
        System.setProperty("sun.rmi.transport.tcp.responseTimeout","5000");
        List<Person> testData = PersonData.getTestData();
        // key:id  value:person
        Map<Integer, Person> map = testData.stream().
                collect(Collectors.toMap(Person::getId, person -> person));
        map.forEach((k, v) -> logger.debug("key : {} , value: {}", k, v));

        // key:id value:birthday
        Map<Integer, Date> bMap = testData.stream().
                collect(Collectors.toMap(Person::getId, Person::getBirthDay));
        bMap.forEach((k, v) -> logger.debug("key : {} , value: {}", k, v));

        // key:age value:List<person>
        Map<Integer, List<Person>> collect = testData.stream().
                collect(Collectors.groupingBy(Person::getAge, Collectors.toList()));
        collect.forEach((k, v) -> logger.debug("key: {}, value: {}", k, v));

        testData.forEach(person -> {});
        // key:age value:person
/*        Map<Integer, Person> cMap = testData.stream().collect(Collectors.toMap(Person::getAge, person -> person));
        cMap.forEach((k, v) -> logger.debug("key : {} , value: {}", k, v));*/
    }
}
