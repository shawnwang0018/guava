package org.shawn.collection.guava;

import com.google.common.collect.Lists;
import org.shawn.Person;
import org.shawn.PersonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;

/**
* @Title: TransformCase
* @author xiao.wang
* @date 2018/3/21
* @version V1.0
*/
public class TransformCase {
    private static Logger logger = LoggerFactory.getLogger(TransformCase.class.getClass());
    public static void main(String[] args) {
        List<Person> testData = PersonData.getTestData();
        List<Integer> transform = Lists.transform(testData, Person::getId);

        List<Person> transform2 = Lists.transform(testData, TransformCase::apply);

        logger.debug("transform 抓取所有id: {} ",transform);
        logger.debug("transform2 所有Person更新为10: {}",transform2);
    }

    private static Person apply(Person input) {
        Objects.requireNonNull(input).setAge(10);
        return input;
    }
}
