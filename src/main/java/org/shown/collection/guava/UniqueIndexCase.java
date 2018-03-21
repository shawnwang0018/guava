package org.shown.collection.guava;

import java.util.List;

import org.shown.Person;
import org.shown.PersonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

/**
* @Title: UniqueIndexCase
* @Description:
* @author xiao.wang
* @date 2018/3/21
* @version V1.0
*/
public class UniqueIndexCase {
    private static Logger logger = LoggerFactory.getLogger(UniqueIndexCase.class.getClass());
    public static void main(String[] args) {
        List<Person> testData = PersonData.getTestData();
        logger.debug( "testData : {}",testData);
        ImmutableMap<Integer, Person> index = Maps.uniqueIndex(testData, new Function<Person, Integer>() {
            @Override
            public Integer apply(Person person) {
                return person.getId();
            }
        });
        logger.debug("index : {}" + index);

    }

}
