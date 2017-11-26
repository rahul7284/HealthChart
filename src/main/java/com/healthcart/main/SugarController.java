package com.healthcart.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.healthcart.daoImpl.BloodSugarDao;
import com.healthcart.dto.BloodSugarDto;


@Controller
public class SugarController {
	
	@Autowired
	BloodSugarDao blodsugardao;

	@RequestMapping(value ="/sugar.htm" )
	public ModelAndView getHome(@ModelAttribute (value="bloodSugar") BloodSugarDto bloodsugar)
	{
		ModelAndView modelAndView = new ModelAndView();
		BloodSugarDto sugardto = new BloodSugarDto();
		if(bloodsugar!=null){
			System.out.println(bloodsugar.getLevel());
			System.out.println(bloodsugar.getMode());
			System.out.println(bloodsugar.getMode().get(0));
			String mode = bloodsugar.getMode().get(0);
			List<String> modelist = new ArrayList<String>();
			modelist.add("fasting");
			modelist.add("non-fasting");
			bloodsugar.setMode(modelist);
			modelAndView.addObject("modelist", modelist);
			sugardto=blodsugardao.getBloodSugerLevel(bloodsugar.getLevel(), mode);
			System.out.println(sugardto.getDescription());
			modelAndView.addObject("bloodSugar", sugardto);
			modelAndView.setViewName("home");
			
		}
		return modelAndView;
	}

}
