package net.framework.sample.ssh2.hibernate;

import java.io.Serializable;

import org.hibernate.SessionFactory;

public class HibernateDao<T,PK extends Serializable> extends BaseHibernateDao<T, PK> {
	
	public HibernateDao(){
		super();
	}
	public HibernateDao(final SessionFactory sessionFactory, final Class<T> entityClass) {
		super(sessionFactory, entityClass);
	}
}
