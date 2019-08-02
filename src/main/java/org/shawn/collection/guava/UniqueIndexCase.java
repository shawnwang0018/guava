package org.shawn.collection.guava;

import java.util.List;

import org.shawn.Person;
import org.shawn.PersonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

/**
 * @author xiao.wang
 * @version V1.0
 * @Title: UniqueIndexCase
 * @date 2018/3/21
 */
public class UniqueIndexCase {
    private static Logger logger = LoggerFactory.getLogger(UniqueIndexCase.class);

    public static void main(String[] args) {
        List<Person> testData = PersonData.getTestData();
        logger.debug("testData : {}", testData);
        ImmutableMap<Integer, Person> index = Maps.uniqueIndex(testData, Person::getId);
        logger.debug("index : {}", index);

    }

}
