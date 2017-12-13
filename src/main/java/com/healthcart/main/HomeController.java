package com.healthcart.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.healthcart.dto.BloodSugarDto;
import com.healthcart.dto.UserDto;


@Controller
public class HomeController {
	
	static Logger log = Logger.getLogger(HomeController.class.getName());

	@RequestMapping(value ="/home.htm" )
	public ModelAndView getHome(@ModelAttribute (value="bloodSugar") BloodSugarDto bloodsugar)
	{
		System.out.println("hit new changed");
		List<String> modelist = new ArrayList<String>();
		modelist.add("fasting");
		modelist.add("non-fasting");
		ModelAndView modelAndView = new ModelAndView();
		bloodsugar.setMode(modelist);
		modelAndView.addObject("modelist", modelist);
		modelAndView.addObject("bloodSugar", bloodsugar);
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	@RequestMapping(value ="/landing.htm" )
	public ModelAndView getLoginLanding(@ModelAttribute (value="user") UserDto user)
	{
	
		log.debug("login debug enabled");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("login");
		return modelAndView;
		
	}

}
