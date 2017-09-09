package com.myfirstssh.resume.model;

import java.util.Date;

public class ProjectExp {
	String Guid;
	String projectName;
	String role;
	String startTime;
	String lastTime;
	String projectType;
	String tutor;
	String content;
	String projectContent;
	String userGuid;
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
	@Override
	public String toString() {
		return "ProjectExp [Guid=" + Guid + ", projectName=" + projectName
				+ ", role=" + role + ", startTime=" + startTime
				+ ", lastTime=" + lastTime + ", projectType=" + projectType
				+ ", tutor=" + tutor + ", content=" + content
				+ ", projectContent=" + projectContent + ", userGuid="
				+ userGuid + "]";
	}

	
}
