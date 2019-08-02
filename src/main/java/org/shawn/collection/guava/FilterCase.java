package org.shawn.collection.guava;

import com.google.common.collect.Collections2;
import org.apache.log4j.Logger;
import org.shawn.Person;
import org.shawn.PersonData;

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
    private static Logger logger = Logger.getLogger(FilterCase.class);
    public static void main(String[] args) {
        List<Person> personList = PersonData.getTestData();
        Collection<Person> filter = Collections2.filter(personList, FilterCase::apply);
        logger.debug(filter);
    }

    private static boolean apply(Person input) {
        return 14 == input.getAge();
    }
}
