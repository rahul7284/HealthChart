package com.healthcart.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcart.cmodel.UserModel;
import com.healthcart.dao.LoginDaoInterface;
import com.healthcart.dto.UserDto;
import com.healthcart.service.LoginService;
@Service
public class LoginServiceimpl implements LoginService {

	private LoginDaoInterface loginDao;

	@Autowired
	public void setLoginDao(LoginDaoInterface loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public UserDto vaildateUser(UserDto user) {
		// TODO Auto-generated method stub
		UserModel userModel = new UserModel();

		BeanUtils.copyProperties(user, userModel);

		userModel = loginDao.validateUser(userModel);

		if (userModel != null) {
			BeanUtils.copyProperties(userModel, user);
			return user;
		}
		return null;
	}

}
