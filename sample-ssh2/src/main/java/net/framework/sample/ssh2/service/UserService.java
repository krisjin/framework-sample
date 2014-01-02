package net.framework.sample.ssh2.service;

import net.framework.sample.ssh2.dao.IUserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private IUserDao userDao;

	public IUserDao getUserDdao() {
		return userDao;
	}

	public void setUserDdao(IUserDao userDdao) {
		this.userDao = userDdao;
	}

}
