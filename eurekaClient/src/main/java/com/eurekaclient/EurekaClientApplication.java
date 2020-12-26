package com.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: EurekaApplication
 * @Author: chenbiao
 * @Description:
 * @Date: 2020/12/26 23:27
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {
	public static void main(String[] args) {
		try {
			SpringApplication.run(EurekaClientApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
