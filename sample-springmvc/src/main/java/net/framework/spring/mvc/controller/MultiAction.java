package net.framework.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiAction {
	
	@RequestMapping("/cust/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response){
		ModelAndView model =new ModelAndView("multiaction");
		model.addObject("add", "add action");
		return model;
	}
	
	@RequestMapping("/cust/delete")
	public ModelAndView delete(HttpServletRequest request,HttpServletResponse response){
		ModelAndView model =new ModelAndView("multiaction");
		model.addObject("add", "delete action");
		return model;
	}
	
	@RequestMapping("/cust/update")
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response){
		ModelAndView model =new ModelAndView("multiaction");
		model.addObject("add", "update action");
		return model;
	}
}
