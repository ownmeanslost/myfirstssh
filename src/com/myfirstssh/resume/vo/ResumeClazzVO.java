package com.myfirstssh.resume.vo;

import java.util.List;



/**
 * 报表使用javabean填充时， 使用的构造器反射类
 * 
 * 
 */

public class ResumeClazzVO {
	private String clazz;
	private List<BeanArgsVO> args;
	public List<BeanArgsVO> getArgs() {
		return args;
	}

	public void setArgs(List<BeanArgsVO> args) {
		this.args = args;
	}

	
	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public ResumeClazzVO(String clazz, List<BeanArgsVO> args) {
		super();
		this.clazz = clazz;
		this.args = args;
	}

	public ResumeClazzVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
