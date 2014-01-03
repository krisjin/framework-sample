package net.framework.sample.ssh2.action;

import net.framework.sample.ssh2.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Scope("prototype")
@Controller("login")
public class LoginAction extends ActionSupport{
	
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Autowired
	private UserService userService;


	public String execute() throws Exception {
		
		return "login";
	}
	
	public String login(){
		System.out.println(name+":"+password);
		return "info";
	}
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}


}
