package com.child;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ChildApplication {
	public static void main(String[] args) {
		try {
			SpringApplication.run(ChildApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
