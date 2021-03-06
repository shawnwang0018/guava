/**
 * 测试用的Demo类
 */
package org.shawn;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

/**
* @Title: Person
* @Description: Person 模型
* @author xiao.wang
* @date 2018/3/20
* @version V1.0
*/
public class Person {
	private int id;
	private String name;
	private Integer age;
	private String city;
	private Date birthDay;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(int id, String name, int age, String city) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Person(int id, String name, Integer age, String city, Date birthDay) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.birthDay = birthDay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDetails() {
		return "ID= " + id + "; Name= " + name + "; Age= " + age + "; City= " + city;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	@Override
    public String toString() {
	    return ToStringBuilder.reflectionToString(this);
    }

    public Person buildNullPerson(){
		return null;
	}
}
