package org.shown;

import java.util.Arrays;
import java.util.List;
/**
 * @Title: PersonData
 * @Description: PersonData 模型
 * @author xiao.wang
 * @date 2018/3/20
 * @version V1.0
 */
public class PersonData {

	/**
	 * 测试集合
	 * 
	 * @return
	 */
	public static List<Person> getTestData() {
		List<Person> persons = Arrays.asList(
		        new Person(13, "Steve", 22, "London, UK"),
                new Person(15, "Greg", 28, "New York, USA"),
                new Person(5, "Emily", 22, "Bali, Indonesia"),
                new Person(9, "Malih", 14, "Jakarta, Indonesia"),
                new Person(1, "Steven", 14, "Jakarta, Indonesia"));
		return persons;
	}

}
