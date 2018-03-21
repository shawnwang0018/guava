package org.shown.collection.guava;

import com.google.common.base.Function;
import com.google.common.collect.*;
import org.shown.Person;
import org.shown.PersonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;

/**
* @Title: IndexCase
* @Description:
* @author xiao.wang
* @date 2018/3/21
* @version V1.0
*/
public class IndexCase {
    private static Logger logger = LoggerFactory.getLogger(MultisetCase.class.getClass());
    public static void main(String[] args) {
        List<Person> testData = PersonData.getTestData();
        logger.debug( "testData : {}",testData);
        final ImmutableListMultimap<Integer, Person> index = Multimaps.index(testData, new Function<Person, Integer>() {
            @Override
            public Integer apply(Person person) {
                return person.getAge();
            }
        });
        ImmutableMap<Integer, Collection<Person>> integerCollectionImmutableMap = index.asMap();
        logger.debug("integerCollectionImmutableMap : {}" +integerCollectionImmutableMap);

    }

}
