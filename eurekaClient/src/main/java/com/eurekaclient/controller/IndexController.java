package com.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import src.com.entity.CommonResult;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: IndexController
 * @Author: chenbiao
 * @Description:
 * @Date: 2020/12/27 19:09
 * @Version: 1.0
 */
@Controller
@RequestMapping("/index")
public class IndexController {

	@Value("${server.port}")
	private String port;
	@Resource
	private org.springframework.cloud.client.discovery.DiscoveryClient discoveryClient;

	@RequestMapping("/test")
	@ResponseBody
	public CommonResult test(){
		CommonResult<Object> objectCommonResult = new CommonResult<>();
		objectCommonResult.setCode(200);
		objectCommonResult.setData(port);
		objectCommonResult.setMessage("messageTest");
		return  objectCommonResult;
	}

	@RequestMapping("/okMethod")
	@ResponseBody
	public String okMethod(String id){
		return "正常请求:id:" + id;
	}

	@RequestMapping("/timeOutMethod")
	@ResponseBody
	public String timeOutMethod(String id) throws Exception{
		Thread.sleep(5000);
		return "timeOutMethod" + id;
	}

	@RequestMapping("/getDiscoveryClient")
	@ResponseBody
	public DiscoveryClient getDiscoveryClient(){
		List<String> services = discoveryClient.getServices();
		services.forEach(item -> {
			System.out.println("服务列表====" + item);
		});
		List<ServiceInstance> instances = discoveryClient.getInstances("PRODUCT");
		instances.forEach(item -> {
			System.out.println("服务id:" + item.getServiceId() + "主机:" + item.getHost() + "端口号：" +
				item.getPort() + "uri:" + item.getUri());
		});
		return discoveryClient;
	}
}
