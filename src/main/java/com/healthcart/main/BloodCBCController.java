package com.healthcart.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.healthcart.dao.BloodCBCDao;
import com.healthcart.dto.BloodCBCDto;


@Controller
public class BloodCBCController {
	
	@Autowired
	BloodCBCDao bloodcbcdao;

	@SuppressWarnings("null")
	@RequestMapping(value ="/cbc.htm" )
	public ModelAndView getHome(@ModelAttribute (value="bloodcbc") BloodCBCDto bloodcbc)
	{
		ModelAndView modelAndView = new ModelAndView();
		BloodCBCDto cbcdto = new BloodCBCDto();
		if(bloodcbc.getGender()!=null){
			 Map<String,String> description_map = new HashMap<String,String>();
				
			int rbc_limit = bloodcbc.getRbc_limit();
			int wbc_limit = bloodcbc.getWbc_limit();
			int platelets_limit = bloodcbc.getPlatelets_limit();
			int hb_limit = bloodcbc.getHb_limit();
			String gender = bloodcbc.getGender().get(0);
			cbcdto=bloodcbcdao.getCBCValues(rbc_limit , wbc_limit,platelets_limit, hb_limit, gender);
			description_map=cbcdto.getDescription_map();
			
			String wbc_desc=description_map.get("WBCDESC");
			String rbc_desc=description_map.get("RBCDESC");
			String hb_desc=description_map.get("HBDESC");
			String platelet_desc=description_map.get("PLATLEDESC");;
			cbcdto.setWbc_description(wbc_desc);
			cbcdto.setRbc_description(rbc_desc);
			cbcdto.setHb_description(hb_desc);
			cbcdto.setPlatelets_description(platelet_desc);
			List<String> genderlist = new ArrayList<String>();
			genderlist.add("male");
			genderlist.add("female");
			bloodcbc.setGender(genderlist);
			modelAndView.addObject("genderlist", genderlist);
			
			
			modelAndView.addObject("bloodCbc", cbcdto);
			modelAndView.setViewName("bloodcbc");
			
		}
		else{
			
			System.out.println("cbc new");
			List<String> genderlist = new ArrayList<String>();
			genderlist.add("male");
			genderlist.add("female");
			bloodcbc.setGender(genderlist);
			modelAndView.addObject("genderlist", genderlist);
			
			modelAndView.addObject("bloodCbc", bloodcbc);
			modelAndView.setViewName("bloodcbc");
			return modelAndView;
		}
		return modelAndView;
	}

}
