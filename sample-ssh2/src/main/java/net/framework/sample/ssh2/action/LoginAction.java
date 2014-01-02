package net.framework.sample.ssh2.action;

import net.framework.sample.ssh2.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Scope("prototype")
@Controller("login")
public class LoginAction extends ActionSupport{
	
	
	@Autowired
	private UserService userService;


	public String execute() throws Exception {
		
		return "login";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}


}
