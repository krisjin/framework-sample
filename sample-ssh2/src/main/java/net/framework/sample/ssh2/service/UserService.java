package net.framework.sample.ssh2.service;

import net.framework.sample.ssh2.dao.IUserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private IUserDao userDdao;

	public IUserDao getUserDdao() {
		return userDdao;
	}

	public void setUserDdao(IUserDao userDdao) {
		this.userDdao = userDdao;
	}

}
