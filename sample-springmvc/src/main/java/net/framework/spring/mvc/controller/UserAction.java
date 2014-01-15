package net.framework.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserAction {
	
	@RequestMapping("/login")
	public String login(ModelMap model){
		model.addAttribute("user", "user");
		return "login";
	}
	
	@RequestMapping(value="/login/prelogin",method=RequestMethod.POST)
	public String prelogin(ModelMap model){
		
		return "loginresult";
	}
}
