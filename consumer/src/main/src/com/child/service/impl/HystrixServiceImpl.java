package com.child.service.impl;

import cn.hutool.core.util.IdUtil;
import com.child.service.HystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

/**
 * @ClassName: IndexServiceImpl 断路器
 * @Author: chenbiao
 * @Description:
 * @Date: 2021/1/11 21:28
 * @Version: 1.0
 */
@Service
public class HystrixServiceImpl implements HystrixService {
	@Override
	@HystrixCommand(fallbackMethod = "testErrorMethod",commandProperties = {
		//是否开启断路器
		@HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
		//请求数达到后才计算 10次
		@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
		//休眠时间窗 10s
		@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
		//错误率达到多少跳闸
		@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
	})
	public String hystrixMethod(Integer id) {
		if (id<0) {
			throw new RuntimeException("服务出现异常，调用fallback方法");
		}
		return "正常服务" +id+"服务号=" + IdUtil.fastSimpleUUID();
	}
	public String testErrorMethod(Integer id) {
		return "异常服务" +id+"服务=::>_<::";
	}
}
