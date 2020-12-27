package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaApplication
 * @Author: chenbiao
 * @Description:
 * @Date: 2020/12/26 23:27
 * @Version: 1.0
 */
@EnableEurekaServer
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServer1Application {
	public static void main(String[] args) {
		try {
			SpringApplication.run(EurekaServer1Application.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
