package com.child;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import ribbonConfig.MyProbabilityRandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
//@RibbonClient(name = "PRODUCT",configuration = MyProbabilityRandomRule.class)
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class ConsumerApplication {
	public static void main(String[] args) {
		try {
			//默认轮询
/*			BaseLoadBalancer baseLoadBalancer = new BaseLoadBalancer();
			List<Server> servers = new ArrayList<Server>();
			servers.add(new Server("127.0.0.1",9091));
			servers.add(new Server("127.0.0.1",9092));
			baseLoadBalancer.addServers(servers);
			for(int i=0;i<10;i++) {
				Server choosedServer = baseLoadBalancer.chooseServer(null);
				System.out.println(choosedServer);
			}*/
			SpringApplication.run(ConsumerApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
