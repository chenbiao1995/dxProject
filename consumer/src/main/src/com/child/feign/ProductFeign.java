package com.child.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: ProductFeign
 * @Author: chenbiao
 * @Description: feign
 * @Date: 2021/1/5 22:44
 * @Version: 1.0
 */
@FeignClient(name = "PRODUCT", value = "PRODUCT",path = "/eurekaClient")
public interface ProductFeign {
	@PostMapping("/index/okMethod")
	public String okMethod(@RequestParam("id") String id);

	@PostMapping("/index/timeOutMethod")
	public String timeOutMethod(@RequestParam("id") String id);
}
