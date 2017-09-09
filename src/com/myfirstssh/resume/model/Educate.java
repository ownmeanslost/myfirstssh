package com.myfirstssh.resume.model;

public class Educate {
	String Guid;
	String school;
	String major;
	String graducateTime;
	String educateType;
	String userGuid;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGraducateTime() {
		return graducateTime;
	}
	public void setGraducateTime(String graducateTime) {
		this.graducateTime = graducateTime;
	}
	public String getType() {
		return educateType;
	}
	public void setType(String educateType) {
		this.educateType = educateType;
	}
	public String getUserGuid() {
		return userGuid;
	}
	public void setUserGuid(String userGuid) {
		this.userGuid = userGuid;
	}
	public String getGuid() {
		return Guid;
	}
	public void setGuid(String guid) {
		Guid = guid;
	}
	public String getEducateType() {
		return educateType;
	}
	public void setEducateType(String educateType) {
		this.educateType = educateType;
	}
	@Override
	public String toString() {
		return "Educate [Guid=" + Guid + ", school=" + school + ", major="
				+ major + ", graducateTime=" + graducateTime + ", educateType="
				+ educateType + ", userGuid=" + userGuid + "]";
	}
	
	
}
