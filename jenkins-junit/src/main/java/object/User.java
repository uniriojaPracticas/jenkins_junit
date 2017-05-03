package object;

import java.util.Date;

public class User {
	private String name;
	private Integer age;
	private Date birth;
	
	public User(String name, Integer age, Date birth) {
		this.name = name;
		this.age = age;
		this.birth = birth;
	}
	public User() {
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
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
}

