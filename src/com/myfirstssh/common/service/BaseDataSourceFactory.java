package com.myfirstssh.common.service;

import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;

public interface BaseDataSourceFactory {
	//获得全部数据
	public Map<String, Object> getDefineAllDateSource();
	
	//获得连接
	public JRDataSource getMainJRDatasource();
}
