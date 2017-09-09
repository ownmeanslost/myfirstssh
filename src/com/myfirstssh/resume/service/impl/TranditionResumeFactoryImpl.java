package com.myfirstssh.resume.service.impl;

import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;

import com.myfirstssh.common.service.BaseDataSourceFactory;

public class TranditionResumeFactoryImpl implements BaseDataSourceFactory{

	private String userGuid;
	
	public String getUserGuid() {
		return userGuid;
	}

	public TranditionResumeFactoryImpl(String userGuid) {
		super();
		this.userGuid = userGuid;
	}

	public TranditionResumeFactoryImpl() {
		super();
		
	}

	public void setUserGuid(String userGuid) {
		this.userGuid = userGuid;
	}

	@Override
	public Map<String, Object> getDefineAllDateSource() {
		Map<String, Object> souMap=new HashMap<String, Object>();
		System.out.println(userGuid);
		souMap.put("name", "李少凡");
		return souMap;
	}

	@Override
	public JRDataSource getMainJRDatasource() {
		// TODO Auto-generated method stub
		return null;
	}

}
