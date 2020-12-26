package com.child;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import src.com.entity.EntityTest;

import java.util.logging.Logger;

@SpringBootApplication
public class ChildApplication {
	public static void main(String[] args) {
		try {
			EntityTest entityTest = new EntityTest();
			entityTest.setName("test");
			entityTest.setAge("13");
			System.out.println(entityTest.getName());
			SpringApplication.run(ChildApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
