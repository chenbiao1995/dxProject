package com.project.dx.entity;

import com.project.dx.util.Test;

/**
 * @ClassName: User
 * @Author: chenbiao
 * @Description:
 * @Date: 2020/12/25 16:53
 * @Version: 1.0
 */

public class User {
	private String userid;
	private String username;
	private String age;
	private String address;

	public User(String userid, String username, String age, String address) {
		super();
		this.userid = userid;
		this.username = username;
		this.age = age;
		this.address = address;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", age=" + age + ", address=" + address + "]";
	}
}