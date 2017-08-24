package com.myfirstssh.resume.model;

import java.io.Serializable;

public class ModelPic implements Serializable{
	/**
	 * 模板的图片
	 */
	
	private static final long serialVersionUID = 1L;
	String Guid;
	String url;
	String resuumeGuid;
	public String getGuid() {
		return Guid;
	}
	public void setGuid(String guid) {
		Guid = guid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getResuumeGuid() {
		return resuumeGuid;
	}
	public void setResuumeGuid(String resuumeGuid) {
		this.resuumeGuid = resuumeGuid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
