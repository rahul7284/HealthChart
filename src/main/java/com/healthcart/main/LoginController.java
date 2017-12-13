package com.healthcart.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.healthcart.cmodel.CBCModel;
import com.healthcart.dto.BloodSugarDto;
import com.healthcart.dto.UserDto;
import com.healthcart.service.UserService;


@Controller
public class LoginController {
	
	private UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	static Logger log = Logger.getLogger(LoginController.class.getName());


	@RequestMapping(value ="/login.htm" )
	public ModelAndView loginUser(@ModelAttribute (value="user") UserDto user)
	{
		log.debug("login debug enabled");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	
	

}
