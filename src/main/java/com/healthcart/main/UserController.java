package com.healthcart.main;

import java.util.ArrayList;
import java.util.List;

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
public class UserController {
	
	private UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping(value ="/user.htm" )
	public ModelAndView getHome(@ModelAttribute (value="user") UserDto user)
	{
		System.out.println("usercontroller  changed");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user");
		return modelAndView;
	}
	
	
	@RequestMapping(value ="/userdetails.htm" , method=RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute (value="user") UserDto user)
	{
		userService.saveUser(user);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("user");
		return modelAndView;
		
	}

}
