package com.project.dx.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashMap;

/**
 * @ClassName: IndexController
 * @Author: chenbiao
 * @Description: index
 * @Date: 2020/12/18 15:52
 * @Version: 1.0
 */
@Api(value = "测试controller", tags = {"测试controller相关接口"})
@Controller
@RequestMapping("/indexController")
public class IndexController {

	@ApiOperation(value="单独一个入参测试接口", notes="接口描述，例如：只能输入‘demo’")
	@GetMapping("/index")
	public String index(String value){
		return "index";
	}


	@ApiOperation(value="版本信息", notes="测试版本信息")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType = "query", name = "version", value = "版本", required = true, dataType = "String")
	})
	@PostMapping("/getVersion")
	@ResponseBody
	public HashMap<String,String> getVersion(String version) {
		HashMap<String, String> map = new HashMap<>();
		map.put("version",version);
		return map;
	}
}
