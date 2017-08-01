package com.myfirstssh.book.vo;

public class BookVO {
	String id;
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookVO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "BookVO [id=" + id + ", name=" + name + "]";
	}

	
}
