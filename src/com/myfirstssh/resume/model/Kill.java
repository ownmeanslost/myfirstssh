package com.myfirstssh.resume.model;

public class Kill {
	String Guid;
	String killContent;
	String userGuid;
	public String getGuid() {
		return Guid;
	}
	public void setGuid(String guid) {
		Guid = guid;
	}
	public String getKillContent() {
		return killContent;
	}
	public void setKillContent(String killContent) {
		this.killContent = killContent;
	}
	public String getUserGuid() {
		return userGuid;
	}
	public void setUserGuid(String userGuid) {
		this.userGuid = userGuid;
	}
	@Override
	public String toString() {
		return "Kill [Guid=" + Guid + ", killContent=" + killContent
				+ ", userGuid=" + userGuid + "]";
	}
	
}
