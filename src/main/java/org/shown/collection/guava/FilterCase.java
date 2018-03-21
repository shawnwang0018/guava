package org.shown.collection.guava;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import org.apache.log4j.Logger;
import org.shown.Person;
import org.shown.PersonData;

import java.util.Collection;
import java.util.List;

/**
* @Title: FilterCase
* @Description: TODO
* @author xiao.wang
* @date 2018/2/27
* @version V1.0
*/
public class FilterCase {
    private static Logger logger = Logger.getLogger(FilterCase.class.getClass());
    public static void main(String[] args) {
        List<Person> personList = PersonData.getTestData();
        Collection<Person> filter = Collections2.filter(personList, new Predicate<Person>() {
            @Override
            public boolean apply(Person input) {
                if (14 == input.getAge() ) {
                    return true;
                }
                return false;
            }
        });
        logger.debug(filter);
    }
}
