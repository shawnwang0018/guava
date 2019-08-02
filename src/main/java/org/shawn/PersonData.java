package org.shawn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * PersonData 模型
 *
 * @author xiao.wang
 * @version V1.0
 * @Title: PersonData
 * @date 2018/3/20
 */
public class PersonData {

    /**
     * 测试集合
     *
     * @return list
     */
    public static List<Person> getTestData() {
        List<Person> persons = null;
        try {
            persons = Arrays.asList(
                    new Person(13, "Steve", 22, "London, UK",
                            new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").parse("1988-09-27 12:19:10")),
                    new Person(15, "Greg", 28, "New York, USA",
                            new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").parse("1995-09-27 12:19:10")),
                    new Person(5, "Emily", 22, "Bali, Indonesia",
                            new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").parse("1965-09-27 12:19:10")),
                    new Person(9, "Malih", 14, "Jakarta, Indonesia",
                            new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").parse("1991-09-27 12:19:10")),
                    new Person(1, "Steven", 14, "Jakarta, Indonesia",
                            new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").parse("1998-09-27 12:19:10"))
            );
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return persons;
    }

}
