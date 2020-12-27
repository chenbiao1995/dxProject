package com.child;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import src.com.entity.EntityTest;

@SpringBootApplication
public class ConsumerApplication {
	public static void main(String[] args) {
		try {
			SpringApplication.run(ConsumerApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
