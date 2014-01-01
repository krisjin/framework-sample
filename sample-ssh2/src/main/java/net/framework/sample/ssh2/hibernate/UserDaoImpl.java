package net.framework.sample.ssh2.hibernate;

import net.framework.sample.ssh2.dao.UserDao;
import net.framework.sample.ssh2.entity.User;

public class UserDaoImpl extends HibernateDao<User,Long> implements UserDao {

	@Override
	public void addUser(User user) {
		
	}

}
