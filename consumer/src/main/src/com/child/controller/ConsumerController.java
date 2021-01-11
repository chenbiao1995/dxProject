package com.child.controller;

import com.child.feign.ProductFeginImpl;
import com.child.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import src.com.entity.CommonResult;

/**
 * @ClassName: ConsumerController
 * @Author: chenbiao
 * @Description:
 * @Date: 2020/12/27 18:58
 * @Version: 1.0
 */
@Controller
@RequestMapping("/index")
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ProductFeginImpl productFegin;

	@Autowired
	private HystrixService hystrixService;

//	private final static String apiUrl = "http://localhost:9091/eurekaClient1/index/test";
	private final static String apiUrl = "http://product/eurekaClient/index/test";


	@GetMapping("/requestTest")
	@ResponseBody
	public ResponseEntity<CommonResult> requestTest(){
		ResponseEntity<CommonResult> commonResultResponseEntity = restTemplate.postForEntity(apiUrl, null, CommonResult.class);
		return commonResultResponseEntity;
	}

	@RequestMapping("/consumer/okMethod/{id}")
	@ResponseBody
	public String okMethod(@PathVariable("id") String id){
		String s = productFegin.okMethod(id);
		return s;
	}

	@RequestMapping("/consumer/timeOutMethod/{id}")
	@ResponseBody
	public String timeOutMethod(@PathVariable("id") String id) throws Exception{
		String s = productFegin.timeOutMethod(id);
		return s;
	}

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("1").append(",").append("2").append(",");
		System.out.println(sb.deleteCharAt(sb.length()-1));
	}
	public static void test() throws Exception{
		throw new Exception("ceshiexceptio");
	}


	/**
	 * 熔断
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/consumer/hystrix/{id}")
	@ResponseBody
	public String hystrixMethod(@PathVariable("id") Integer id) throws Exception{
		return hystrixService.hystrixMethod(id);
	}

}
