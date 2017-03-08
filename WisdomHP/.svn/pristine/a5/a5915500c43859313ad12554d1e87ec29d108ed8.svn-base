package com.audaque.sunt.utils;

public enum ResultStatusCode {
	OK(0, "OK"),
	PARAM_NOT_NULL(1, "必填项不能为null,请检查上传json"),
	SYSTEM_ERR(30001, "System Error"),
	PERMISSION_DENIED(30002, "权限被拒绝 "),
	INVALID_CLIENTID(30003, "无效的ClientID"),
	INVALID_PASSWORD(30004, "用户名或密码不正确"),
	INVALID_CAPTCHA(30005, "验证码无效"),
	INVALID_TOKEN(30006, "无效的标记");
	
	
	private int code;
	private String msg;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	private ResultStatusCode(int code, String msg)
	{
		this.code = code;
		this.msg = msg;
	}
}
