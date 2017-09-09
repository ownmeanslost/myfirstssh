package com.myfirstssh.resume.vo;

public class BeanArgsVO {
	private String index;
	private String key;
	
	private String clazzType;
	private String defVal;
	
	
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getClazzType() {
		return clazzType;
	}
	public void setClazzType(String clazzType) {
		this.clazzType = clazzType;
	}
	public String getDefVal() {
		return defVal;
	}
	public void setDefVal(String defVal) {
		this.defVal = defVal;
	}
	public BeanArgsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BeanArgsVO(String index, String key, String clazzType, String defVal) {
		super();
		this.index = index;
		this.key = key;
		this.clazzType = clazzType;
		this.defVal = defVal;
	}
	
}
