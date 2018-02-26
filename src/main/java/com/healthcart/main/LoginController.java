package com.healthcart.main;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.healthcart.cmodel.CBCModel;
import com.healthcart.dto.BloodSugarDto;
import com.healthcart.dto.User;
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
	@RequestMapping(value = "/loginjson", method=RequestMethod.GET,headers="Accept=application/json",produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody UserDto loginUserJson(@RequestParam String username , @RequestParam String userpwd) {
		log.debug("login debug enabled");
		UserDto userDto = new UserDto();
		User user = new User();
		System.out.println(username+ " "+userpwd);
		userDto.setUserName(username);
		userDto.setUserPwd(userpwd);
		userDto = loginService.vaildateUser(userDto);
		user.setEmail(userDto.getEmail());
		/*user.setEnrollDate(userDto.getEnrollDate());*/
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setId(userDto.getId());
		user.setMobileNumber(userDto.getMobileNumber());
		user.setUserName(userDto.getUserName());
		user.setUserPwd(userDto.getUserPwd());
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
	
	@RequestMapping(value = "/showPage",method=RequestMethod.GET,headers="Accept=application/json")
	public ModelAndView showPage() {
		log.debug("login debug enabled");
		System.out.println("show page hit");
		UserDto userDto = new UserDto();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", userDto);
		modelAndView.setViewName("sucess");
		if (userDto != null) {
			
		} else {
			modelAndView.addObject("error", "Invalid Login Credentials");
			modelAndView.setViewName("login");
		}
		return modelAndView;
	}
}
