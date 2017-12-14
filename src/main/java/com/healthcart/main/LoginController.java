package com.healthcart.main;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

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
import com.healthcart.service.LoginService;
import com.healthcart.service.UserService;

@Controller
public class LoginController {

	private UserService userService;

	private LoginService loginService;

	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	static Logger log = Logger.getLogger(LoginController.class.getName());

	@RequestMapping(value = "/login.htm")
	public ModelAndView loginUser(@ModelAttribute(value = "user") UserDto user) {
		log.debug("login debug enabled");
		UserDto userDto = new UserDto();
		userDto = loginService.vaildateUser(user);

		ModelAndView modelAndView = new ModelAndView();
		if (userDto != null) {
			modelAndView.addObject("user", userDto);
			modelAndView.setViewName("sucess");
		} else {
			modelAndView.addObject("error", "Invalid Login Credentials");
			modelAndView.setViewName("login");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/logout.htm")
	public ModelAndView logoutUser(HttpSession session) {
		log.debug("login debug enabled");
		UserDto userDto = new UserDto();
		ModelAndView modelAndView = new ModelAndView();
		session.setMaxInactiveInterval(5);
		modelAndView.addObject("session", session);
		 modelAndView.addObject("user", userDto);
		modelAndView.setViewName("login");

		return modelAndView;
	}

}
