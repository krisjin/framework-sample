package net.framework.sample.ssh2.dao;

import net.framework.sample.ssh2.entity.User;

public interface IUserDao {

	void addUser(User user);

	void deleteUser(Long id);

	void updateUser(User user);

	User getUserById(Long id);
	
	User getUserByUserName(String username);

}
