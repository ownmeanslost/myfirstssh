package com.myfirstssh.common.dao.impl;



import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.SessionFactory;
import org.hibernate.persister.entity.AbstractEntityPersister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myfirstssh.common.dao.BaseDao;


/**
 *	
 *ͨ
 * @author b
 *
 * @param <T>
 */
public abstract class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

		Class<T> clazy;

		/**
		 * 
		 * 反射机制
		 */
		public BaseDaoImpl() {
			Class<?> thisClass=this.getClass();
			ParameterizedType type = (ParameterizedType) thisClass.getGenericSuperclass();
			this.clazy=(Class) type.getActualTypeArguments()[0];
		}
		
		/**
		 * 
		* @Title: get 
		* @Description: TODO(������һ�仰�����������������) 
		* @param @param id
		* @param @return    �趨�ļ� 
		* @return    �������� 
		* @throws
		 */
		@Override
		public T get(Serializable id) {
			T result = this.getHibernateTemplate().get(clazy, id);
			return result;
		}
		
		
		
		public String getTableName() {
			SessionFactory sessionFactory = this.getHibernateTemplate().getSessionFactory();
			AbstractEntityPersister classMetadata = (AbstractEntityPersister) sessionFactory.getClassMetadata(clazy);
			String tableName = classMetadata.getTableName();
			return tableName;
		}
		/**
		 * ÿ��dao������̳�HibernateDaoSupport��ע��˷���
		 * 
		 * @param sessionFactory
		 */
		@Autowired
		public void setSessionFactoryOverride(SessionFactory sessionFactory) {

			super.setSessionFactory(sessionFactory);
		}
		
		@Override
		public Serializable save(T entity) {
			Serializable result = this.getHibernateTemplate().save(entity);
			return result;
		}
		@Override
		public void update(T entity) throws DataAccessException {
			this.getHibernateTemplate().update(entity);
		}
}
