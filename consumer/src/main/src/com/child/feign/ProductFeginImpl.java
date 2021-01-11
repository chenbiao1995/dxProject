package com.child.feign;

import com.child.feign.ProductFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName: ProductFeginImpl
 * @Author: chenbiao
 * @Description:
 * @Date: 2021/1/6 20:22
 * @Version: 1.0
 */
@Component
public class ProductFeginImpl{
	@Autowired
	private ProductFeign feign;
	public String timeOutMethod(String id) {
		return feign.timeOutMethod("456");
	}

	public String okMethod(String id) {
		return feign.okMethod("123");
	}
}
