package org.shawn.collection.jdk8stream;

import org.shawn.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Objects;
import java.util.Optional;

/**
* OptionalCase
* 测试null值
* @author xiao.wang
* @date 2019-07-16
* @version V1.0
*/
public class OptionalCase {
    private static Logger logger = LoggerFactory.getLogger(OptionalCase.class);

    /**
     * 本次使用的jdk1.8的Optional
     */
    public static void main(String[] args) {
        Person person = new Person().buildNullPerson();

        Optional<Person> personOptional = Optional.ofNullable(person);
        logger.debug("personOptional.isPresent(): {}",personOptional.isPresent());
    }

    void println(){
        System.out.println(this.getClass().getName());
    }

}
