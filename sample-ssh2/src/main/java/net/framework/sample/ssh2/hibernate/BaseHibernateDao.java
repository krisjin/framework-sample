package net.framework.sample.ssh2.hibernate;

import java.io.Serializable;

import net.framework.sample.ssh2.utils.ReflectionUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseHibernateDao<T, PK extends Serializable> {

	protected SessionFactory sessionFactory;
	protected Class<T> entityClass;

	
	
	public void saveOrUpdate(final T enttity){
		getSession().saveOrUpdate(enttity);
	}
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Autowired
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	

	public BaseHibernateDao() {
		this.entityClass = ReflectionUtils.getSuperClassGenricType(getClass());
	}

}
