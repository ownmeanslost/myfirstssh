package com.myfirstssh.resume.vo;

import java.io.Serializable;

public class TraditionTemplateVO implements Serializable{

	/**
	 * 接受前端传来的报表字段
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String email;
	String telephone;
	String address;
	String schoolName;
	String major;
	String graducateTime;
	String educateType;
	String startTime;
	String lastTime;
	String projectName;
	String role;
	String projectType;
	String tutor;
	String content;
	String projectContent;
	String killcontent;
	public TraditionTemplateVO(String name, String email, String telephone,
			String address, String schoolName, String major,
			String graducateTime, String educateType, String startTime,
			String lastTime, String projectName, String role,
			String projectType, String tutor, String content,
			String projectContent, String killcontent) {
		super();
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.address = address;
		this.schoolName = schoolName;
		this.major = major;
		this.graducateTime = graducateTime;
		this.educateType = educateType;
		this.startTime = startTime;
		this.lastTime = lastTime;
		this.projectName = projectName;
		this.role = role;
		this.projectType = projectType;
		this.tutor = tutor;
		this.content = content;
		this.projectContent = projectContent;
		this.killcontent = killcontent;
	}
	public TraditionTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
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
	public String getEducateType() {
		return educateType;
	}
	public void setEducateType(String educateType) {
		this.educateType = educateType;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getLastTime() {
		return lastTime;
	}
	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getProjectContent() {
		return projectContent;
	}
	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}
	public String getKillcontent() {
		return killcontent;
	}
	public void setKillcontent(String killcontent) {
		this.killcontent = killcontent;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "TraditionTemplate [name=" + name + ", email=" + email
				+ ", telephone=" + telephone + ", address=" + address
				+ ", schoolName=" + schoolName + ", major=" + major
				+ ", graducateTime=" + graducateTime + ", educateType="
				+ educateType + ", startTime=" + startTime + ", lastTime="
				+ lastTime + ", projectName=" + projectName + ", role=" + role
				+ ", projectType=" + projectType + ", tutor=" + tutor
				+ ", content=" + content + ", projectContent=" + projectContent
				+ ", killcontent=" + killcontent + "]";
	}
	
}
