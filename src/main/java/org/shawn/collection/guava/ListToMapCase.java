package org.shawn.collection.guava;

import com.google.common.collect.*;
import org.shawn.Person;
import org.shawn.PersonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;

/**
 * @author xiao.wang
 * @version V1.0
 * @Title: ListToMapCase
 * 提取属性作为key转换为Map
 * @date 2018/3/21
 */
public class ListToMapCase {
    private static Logger logger = LoggerFactory.getLogger(MultisetCase.class);

    public static void main(String[] args) {
        List<Person> testData = PersonData.getTestData();
        logger.debug("testData : {}", testData);
        final ImmutableListMultimap<Integer, Person> index = Multimaps.index(testData, Person::getAge);
        ImmutableMap<Integer, Collection<Person>> integerCollectionImmutableMap = index.asMap();
        logger.debug("integerCollectionImmutableMap : {}", integerCollectionImmutableMap);
    }

}
