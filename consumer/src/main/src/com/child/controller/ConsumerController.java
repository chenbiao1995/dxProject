package com.child.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import src.com.entity.CommonResult;

import javax.xml.transform.Result;

/**
 * @ClassName: ConsumerController
 * @Author: chenbiao
 * @Description:
 * @Date: 2020/12/27 18:58
 * @Version: 1.0
 */
@Controller
@RequestMapping("/consumer")
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;

//	private final static String apiUrl = "http://localhost:9091/eurekaClient1/index/test";
	private final static String apiUrl = "http://product/eurekaClient/index/test";


	@GetMapping("/requestTest")
	@ResponseBody
	public ResponseEntity<CommonResult> requestTest(){
		ResponseEntity<CommonResult> commonResultResponseEntity = restTemplate.postForEntity(apiUrl, null, CommonResult.class);
		return commonResultResponseEntity;
	}

}
