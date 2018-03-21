package org.shown.collection.guava;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.shown.Person;
import org.shown.PersonData;

import java.util.List;

/**
* @Title: TransformCase
* @Description: TODO
* @author xiao.wang
* @date 2018/3/21
* @version V1.0
*/
public class TransformCase {
    public static void main(String[] args) {
        List<Person> testData = PersonData.getTestData();
        List<Integer> transform = Lists.transform(testData, new Function<Person, Integer>() {
            @Override
            public Integer apply(Person input) {
                return input.getId();
            }
        });

        List<Person> transform2 = Lists.transform(testData, new Function<Person, Person>() {
            @Override
            public Person apply(Person input) {
                input.setAge(10);
                return input;
            }
        });

        System.out.println(transform);
        System.out.println(transform2);
    }
}
