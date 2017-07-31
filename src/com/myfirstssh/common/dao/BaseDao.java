package com.myfirstssh.common.dao;

import java.io.Serializable;

public abstract interface BaseDao<T> {
	public T get(Serializable id);
	
	
}
