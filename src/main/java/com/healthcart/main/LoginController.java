package com.healthcart.main;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.healthcart.cmodel.CBCModel;
import com.healthcart.dto.BloodSugarDto;
import com.healthcart.dto.UserDto;
import com.healthcart.service.LoginService;
import com.healthcart.service.UserService;

@Controller
@EnableWebMvc
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
	@RequestMapping(value = "/loginjson.htm", method=RequestMethod.GET,produces = "application/json")
	public @ResponseBody UserDto loginUserJson(@RequestParam String username , @RequestParam String userpwd) {
		log.debug("login debug enabled");
		UserDto userDto = new UserDto();
		System.out.println(username+ " "+userpwd);
		userDto.setUserName(username);
		userDto.setUserPwd(userpwd);
		userDto = loginService.vaildateUser(userDto);

		ModelAndView modelAndView = new ModelAndView();
		if (userDto != null) {
			modelAndView.addObject("user", userDto);
			modelAndView.setViewName("sucess");
		} else {
			modelAndView.addObject("error", "Invalid Login Credentials");
			modelAndView.setViewName("login");
		}
		return userDto;
	}

	
	@RequestMapping(value = "/hello.htm", method=RequestMethod.GET,produces = "application/json")
	public @ResponseBody String helloJson(@RequestParam String username , @RequestParam String userpwd) {
		log.debug("login debug enabled");
		System.out.println("HIIIIIIIIIIII");
		return "hi";
	}

	
	
	
	@RequestMapping(value = "/logout.htm")
	public ModelAndView logoutUser(HttpSession session) {
		log.debug("login debug enabled");
		UserDto userDto = new UserDto();
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("session", session);
		 modelAndView.addObject("user", userDto);
		modelAndView.setViewName("login");

		return modelAndView;
	}

}
