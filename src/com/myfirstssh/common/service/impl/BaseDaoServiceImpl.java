package com.myfirstssh.common.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.myfirstssh.common.dao.BaseDao;
import com.myfirstssh.common.service.BaseDaoService;

public abstract class BaseDaoServiceImpl<T> implements BaseDaoService<T> {
	
	
	@Override
	public T get(Serializable id) {
		if(id==null)
		return null;
		return (T) getDao().get(id);
	}




}
