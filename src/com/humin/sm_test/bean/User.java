/**
 * Dec 5, 2017
 */
package com.humin.sm_test.bean;

import java.util.Date;

/** 
 * @ClassName: User 
 * @Description: 
 * @author humin 
 * @date Dec 5, 2017 4:16:56 PM 
 *  
 *  CREATE TABLE `s_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) DEFAULT NULL,
  `user_birthday` date DEFAULT NULL,
  `user_salary` double DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf-8;
 */
public class User {
	private int id;
	private String name;
	private Date birthday;
	private double salary;
	
	/**
	 * 
	 */
	public User() {
		super();
	}
	
	/**
	 * @param id
	 * @param name
	 * @param birthday
	 * @param salary
	 */
	public User(int id, String name, Date birthday, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday + ", salary=" + salary + "]";
	}
	
	
	
}
