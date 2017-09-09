package com.myfirstssh.resume.model;

public class UserInfo {
	String Guid;
	String username;
	String email;
	String telephone;
	String intention;
	String address;
	String imgurl;
	public String getGuid() {
		return Guid;
	}
	public void setGuid(String guid) {
		Guid = guid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getIntention() {
		return intention;
	}
	public void setIntention(String intention) {
		this.intention = intention;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	@Override
	public String toString() {
		return "UserInfo [Guid=" + Guid + ", username=" + username + ", email="
				+ email + ", telephone=" + telephone + ", intention="
				+ intention + ", address=" + address + ", imgurl=" + imgurl
				+ "]";
	}
	
}
