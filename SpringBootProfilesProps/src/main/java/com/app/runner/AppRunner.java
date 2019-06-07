package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class AppRunner implements CommandLineRunner {
@Value("${my.code}")
private String code;
@Value("${my.mode}")
private String mode;
@Value("${my.message}")
private String msg;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(this);
	}
	@Override
	public String toString() {
		return "AppRunner [code=" + code + ", mode=" + mode + ", msg=" + msg + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public AppRunner() {
		super();
	}

}
