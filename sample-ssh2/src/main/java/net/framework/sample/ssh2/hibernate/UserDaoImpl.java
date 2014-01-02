package net.framework.sample.ssh2.hibernate;

import net.framework.sample.ssh2.dao.IUserDao;
import net.framework.sample.ssh2.entity.User;

public class UserDaoImpl extends HibernateDao<User,Long> implements IUserDao {

	
	public void addUser(User user) {
		this.save(user);
	}

	
	public void deleteUser(Long id) {
		this.deleteById(id);
	}

	
	public void updateUser(User user) {
		this.saveOrUpdate(user);
		
	}

	
	public User getUserById(Long id) {
		
		return this.get(id);
	}

	
	public User getUserByUserName(String username) {
		return null;
	}

}
