package com.myfirstssh.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.myfirstssh.common.dao.BaseDao;
import com.myfirstssh.common.service.impl.BaseDaoServiceImpl;
import com.myfirstssh.resume.dao.KillDao;
import com.myfirstssh.resume.model.Kill;
import com.myfirstssh.resume.service.KillService;

public class KillServiceImpl extends BaseDaoServiceImpl<Kill> implements KillService{

	@Autowired
	private KillDao killDao;
	@Override
	public BaseDao getDao() {
		// TODO Auto-generated method stub
		return killDao;
	}

}
