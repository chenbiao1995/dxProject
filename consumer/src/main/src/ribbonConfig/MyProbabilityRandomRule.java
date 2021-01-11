package ribbonConfig;

import com.netflix.client.config.IClientConfig;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Random;

/**
 * @ClassName: MyProbabilityRandomRule
 * @Author: chenbiao
 * @Description: 自定义负载均衡实现类
 * @Date: 2021/1/4 19:20
 * @Version: 1.0
 */
@Configuration
public class MyProbabilityRandomRule extends AbstractLoadBalancerRule {
	ILoadBalancer balancer = new BaseLoadBalancer();
	private Integer total = 0;

	@Override
	public Server choose(Object o) {
		total = total ++ ;
		System.out.println("total:----------------------------------" + total);
		List<Server> allServers = balancer.getAllServers();
		Random random = new Random();
		final int number = random.nextInt(10);
		if (number < 7) {
			System.out.println("==================自定义负载均衡实现类======" + 9091);
			return findServer(allServers,9091);
		}
		System.out.println("==================自定义负载均衡实现类======" + 9092);
		return findServer(allServers,9092);
	}

	@Override
	public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
		this.balancer = iLoadBalancer;
	}

	@Override
	public ILoadBalancer getLoadBalancer() {
		return this.balancer;
	}

	private Server findServer(List<Server> allServers, int port) {
		for (Server server : allServers) {
			if (server.getPort() == port) {
				return server;
			}
		}
		System.out.println("NULL port="+port);
		return null;
	}

	@Override
	public void initWithNiwsConfig(IClientConfig iClientConfig) {

	}
}
