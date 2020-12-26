package com.project.dx.util;

import com.project.dx.entity.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @ClassName: Test
 * @Author: chenbiao
 * @Description:
 * @Date: 2020/12/25 16:52
 * @Version: 1.0
 */
public class Test {

	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();

		userList.add(new User("1","李大锤","23","南京"));
		userList.add(new User("2","张无忌","18","西安"));
		userList.add(new User("3","刘德华","26","苏州"));
		userList.add(new User("4","郭靖","33","上海"));

		userList.add(new User("1","李大锤","23","南京"));    //id相同，其他数据也相同
		userList.add(new User("3","带头大哥","36","杭州"));  //id相同，其他数据不同

		System.out.println(userList);
		//根据userid去重
		userList = userList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User :: getUserid))), ArrayList::new));
		System.out.println(userList);
	}
}
