package com.audaque.sunt.utils;

public class ResultMsg<T> {
	private boolean status;
	private int code;
	private String msg;
	private T data;
	
	public ResultMsg(int code, String msg, T data)
	{
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public ResultMsg(boolean status, int code, String msg, T data) {
		super();
		this.status = status;
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
