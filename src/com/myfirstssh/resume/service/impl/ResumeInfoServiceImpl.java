package com.myfirstssh.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.myfirstssh.common.dao.BaseDao;
import com.myfirstssh.common.service.impl.BaseDaoServiceImpl;
import com.myfirstssh.resume.dao.ResumeInfoDao;
import com.myfirstssh.resume.model.ResumeInfo;
import com.myfirstssh.resume.service.ResumeInfoService;

public class ResumeInfoServiceImpl extends BaseDaoServiceImpl<ResumeInfo> implements ResumeInfoService{
	
	@Autowired
	ResumeInfoDao resumeInfoDao;
	@Override
	public BaseDao getDao() {
		return resumeInfoDao;
	}

}
