package com.myfirstssh.resume.vo;

import java.util.List;



/**
 * 报表使用javabean填充时， 使用的构造器反射类
 * 
 * 
 */

public class ResumeClazzVO {
	public List<BeanArgsVO> getArgs() {
		return args;
	}

	public void setArgs(List<BeanArgsVO> args) {
		this.args = args;
	}

	private String clazz;
	private List<BeanArgsVO> args;
	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}



}
