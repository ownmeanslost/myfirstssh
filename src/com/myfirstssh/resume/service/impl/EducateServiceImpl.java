package com.myfirstssh.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.myfirstssh.common.dao.BaseDao;
import com.myfirstssh.common.service.impl.BaseDaoServiceImpl;
import com.myfirstssh.resume.dao.EducateDao;
import com.myfirstssh.resume.model.Educate;
import com.myfirstssh.resume.service.EducateService;

public class EducateServiceImpl extends BaseDaoServiceImpl<Educate> implements EducateService{
	@Autowired
	private EducateDao educateDao;
	@Override
	public BaseDao getDao() {		
		return educateDao;
	}

}
