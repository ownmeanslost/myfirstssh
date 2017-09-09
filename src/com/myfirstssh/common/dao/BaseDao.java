package com.myfirstssh.common.dao;

import java.io.Serializable;

public abstract interface BaseDao<T> {
	public T get(Serializable id);
	
	/**
	 * 获取数据库的表名
	 * @return
	 */
	public String getTableName();
	
	public Serializable save(T entity);

	public void update(T entity) ;
}
