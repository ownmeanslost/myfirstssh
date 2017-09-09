package com.myfirstssh.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.myfirstssh.common.dao.BaseDao;
import com.myfirstssh.common.dao.impl.BaseDaoImpl;
import com.myfirstssh.resume.dao.UserInfoDao;
import com.myfirstssh.resume.model.UserInfo;
import com.myfirstssh.resume.service.UserInfoService;

public class UserInfoServiceImpl extends BaseDaoImpl<UserInfo> implements UserInfoService{

	@Autowired
	UserInfoDao userInfoDao;

	@Override
	public BaseDao getDao() {
		// TODO Auto-generated method stub
		return userInfoDao;
	}


}
