package com.myfirstssh.common.service;

import java.io.Serializable;

import com.myfirstssh.common.dao.BaseDao;


public interface BaseDaoService<T> {
	public T get(Serializable id);
	
	public BaseDao getDao();

}
