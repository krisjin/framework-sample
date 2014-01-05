package net.framework.sample.ssh2.hibernate;

import java.io.Serializable;

import net.framework.sample.ssh2.utils.ReflectionUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseHibernateDao<T, PK extends Serializable> {
	
	protected SessionFactory sessionFactory;

	protected Class<T> entityClass;

	public BaseHibernateDao() {
		this.entityClass = ReflectionUtils.getSuperClassGenricType(getClass());
	}
	
	public BaseHibernateDao(final SessionFactory sessionFactory, final Class<T> entityClass) {
		this.sessionFactory = sessionFactory;
		this.entityClass = entityClass;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Autowired
	public void setSessionFactory(final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveOrUpdate(final T enttity) {
		getSession().saveOrUpdate(enttity);
	}

	public void save(final T entity) {
		getSession().save(entity);
	}

	public void deleteByEntity(final T entity) {
		getSession().delete(entity);
	}

	public void deleteById(final PK id) {
		deleteByEntity(get(id));
	}

	public T get(final PK id) {
		return (T) getSession().get(entityClass, id);
	}

}
