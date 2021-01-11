package com.child.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import ribbonConfig.MyProbabilityRandomRule;

import java.nio.charset.Charset;

/**
 * @ClassName: RestTemplateConfig
 * @Author: chenbiao
 * @Description:
 * @Date: 2020/12/27 19:02
 * @Version: 1.0
 */
@Configuration
public class RestTemplateConfig {
	@Bean
	public IRule myRule()
	{
		return new MyProbabilityRandomRule(); //自定义负载均衡规则
	}
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return  new RestTemplate();
	}
}
