package com.project.dx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class DxApplication {
	public static void main(String[] args) {
		try {
			SpringApplication.run(DxApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
