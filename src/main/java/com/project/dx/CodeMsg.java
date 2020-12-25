package com.project.dx;

/**
 * @ClassName: CodeMsg
 * @Author: chenbiao
 * @Description: code
 * @Date: 2020/12/18 17:01
 * @Version: 1.0
 */
public enum CodeMsg {
	SUCCESS(1, "成功"),
	PARAM_IS_INVALID(1001, "参数无效"),
	PARAM_IS_BLANK(1002, "参数为空"),
	PARAM_TYPE_BIND_ERROR(1003, "参数类型错误"),
	PARAM_NOT_COMPLETE(1004, "参数缺失"),
	USER_NOT_LOGGED_IN(2001, "用户未登录"),
	USER_LOGIN_ERROR(2002, "账号不存在或密码错误"),
	USER_ACCOUNT_FORBIDDEN(2003, "账号已被禁用"),
	USER_NOT_EXIST(2004, "用户不存在"),
	USER_HAS_EXISTED(2005, "用户已存在"),
	SPECIFIED_QUESTIONED_USER_NOT_EXIST(3001, "某业务出现问题"),
	SYSTEM_INNER_ERROR(4001, "系统繁忙，请稍后重试"),
	RESULE_DATA_NONE(5001, "数据未找到"),
	DATA_IS_WRONG(5002, "数据有误"),
	DATA_ALREADY_EXISTED(5003, "数据已存在"),
	DATA_CONVERT_ERROR(5003, "数据转换错误"),
	INTERFACE_INNER_INVOKE_ERROR(6001, "内部系统接口调用异常"),
	INTERFACE_OUTTER_INVOKE_ERROR(6002, "外部系统接口调用异常"),
	INTERFACE_RETURN_FAIL(6003, "接口调用失败"),
	INTERFACE_FORBID_VISIT(6004, "该接口禁止访问"),
	INTERFACE_ADDRESS_INVALID(6005, "接口地址无效"),
	INTERFACE_REQUEST_TIMEOUT(6006, "接口请求超时"),
	INTERFACE_EXCEED_LOAD(6007, "接口负载过高"),
	INTERFACE_RETURN_BLANK(6008, "接口返回值为空"),
	INTERFACE_RETURN_SUCCESS_FALSE(6009, "接口返回值状态FALSE"),
	PERMISSION_NO_ACCESS(7001, "无访问权限"),
	DB_OPT_ERROR(9001, "数据库操作异常");

	private final int code;
	private final String msg;

	private CodeMsg(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return this.code;
	}

	public String getMsg() {
		return this.msg;
	}
}
