package com.healthcart.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
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
	private JavaMailSender mailSender;
	
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
		UserDto userreturn = new UserDto();
		
		userreturn=userService.saveUser(user);
		/*String username = userreturn.getUserName();
		String userpwd = userreturn.getUserPwd();
		String recipientAddress = "rahulpyasi42@gmail.com";
        String subject = "Test Mail";
        String message = "Your user name is"+username+ " & password is "+userpwd;
         
        // prints debug info
        System.out.println("To: " + recipientAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
         
        // creates a simple e-mail object
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(message);
         
        // sends the e-mail
        mailSender.send(email);*/
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.addObject("user", user);
		modelAndView.setViewName("login");
		return modelAndView;
		
	}

}
