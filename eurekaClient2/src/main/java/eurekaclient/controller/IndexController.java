package eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import src.com.entity.CommonResult;

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

	@RequestMapping("/test")
	@ResponseBody
	public CommonResult test(){
		CommonResult<Object> objectCommonResult = new CommonResult<>();
		objectCommonResult.setCode(200);
		objectCommonResult.setData(port);
		objectCommonResult.setMessage("messageTest");
		return  objectCommonResult;
	}
}
