package com.myfirstssh.common.dao.impl;



import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myfirstssh.common.dao.BaseDao;

public abstract class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

		Class<T> clazy;

		public BaseDaoImpl() {
			Class<?> thisClass=this.getClass();
			ParameterizedType type = (ParameterizedType) thisClass.getGenericSuperclass();
			this.clazy=(Class) type.getActualTypeArguments()[0];
		}

		@Override
		public T get(Serializable id) {
			T result = this.getHibernateTemplate().get(clazy, id);
			return result;
		}
		@Autowired
		public void setSessionFactoryOverride(SessionFactory sessionFactory) {

			super.setSessionFactory(sessionFactory);
		}

}
