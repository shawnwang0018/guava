/**
 * 测试用的Demo类的转换类
 */
package org.shawn;

/**
* @Title: PersonDto
* @Description: PersonDto 模型
* @author xiao.wang
* @date 2018/3/20
* @version V1.0
*/
public class PersonDto {
	private String name;
	private int age;

	public PersonDto() {
	}

	public PersonDto(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDetails() {
		return "Name= " + name + "; Age= " + age;
	}

}
