package com.myfirstssh.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.myfirstssh.common.dao.BaseDao;
import com.myfirstssh.common.dao.impl.BaseDaoImpl;
import com.myfirstssh.resume.dao.ProjectExpDao;
import com.myfirstssh.resume.model.ProjectExp;
import com.myfirstssh.resume.service.ProjectExpService;

public class ProjectExpServiceImpl extends BaseDaoImpl<ProjectExp> implements ProjectExpService{

	@Autowired
	private ProjectExpDao projectExpDao;
	@Override
	public BaseDao getDao() {
		return projectExpDao;
	}

}
