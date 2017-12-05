package com.healthcart.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcart.cmodel.CBCModel;
import com.healthcart.cmodel.HospitalModel;
import com.healthcart.cmodel.SugarModel;
import com.healthcart.cmodel.ThyroidModel;
import com.healthcart.cmodel.UserModel;
import com.healthcart.dao.UserDaoInterface;
import com.healthcart.dto.CbcTest;
import com.healthcart.dto.UserDto;
import com.healthcart.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	private UserDaoInterface userDao;
	@Autowired
	public void setUserDao(UserDaoInterface userDao) {
		this.userDao = userDao;
	}
	@Override
	public int saveUser(UserDto user) {
		UserModel usermodel = new UserModel();
		Date today = new Date();
		user.setEnrollDate(today);
		BeanUtils.copyProperties(user, usermodel);
		/*List<CBCModel> cbclist = new ArrayList<CBCModel>();
		List<SugarModel> sugarlist = new ArrayList<SugarModel>();
		List<ThyroidModel> thyroidlist = new ArrayList<ThyroidModel>();
		List<HospitalModel> hosplist = new ArrayList<HospitalModel>();*/
		
		Set<CBCModel> cbclist = new HashSet<CBCModel>(user.getCbcList());
		Set<SugarModel> sugarlist = new HashSet<SugarModel>(user.getSugarList());
		Set<ThyroidModel> thyroidlist = new HashSet<ThyroidModel>(user.getThyroidList());
		Set<HospitalModel> hosplist = new HashSet<HospitalModel>(user.getHospitalList());
		
		usermodel.setCbcList(cbclist);
		usermodel.setSugarList(sugarlist);
		usermodel.setThyroidList(thyroidlist);
		usermodel.setHospitalList(hosplist);
		/*cbclist =user.getCbcList();
		sugarlist =user.getSugarList();
		thyroidlist =user.getThyroidList();
		hosplist =user.getHospitalList();*/
		for (Iterator iterator = cbclist.iterator(); iterator.hasNext();) {
			CBCModel cbcModel = (CBCModel) iterator.next();
			cbcModel.setUser(usermodel);
		}
		for (Iterator iterator = sugarlist.iterator(); iterator.hasNext();) {
			SugarModel sugarModel = (SugarModel) iterator.next();
			sugarModel.setUser(usermodel);
		}for (Iterator iterator = thyroidlist.iterator(); iterator.hasNext();) {
			ThyroidModel thyroidModel = (ThyroidModel) iterator.next();
			thyroidModel.setUser(usermodel);
		}for (Iterator iterator = hosplist.iterator(); iterator.hasNext();) {
			HospitalModel hospModel = (HospitalModel) iterator.next();
			hospModel.setUser(usermodel);
		}
		userDao.saveUser(usermodel);
		return 0;
	}

}
