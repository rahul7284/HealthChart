package com.healthcart.daoImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthcart.cmodel.CBCModel;
import com.healthcart.cmodel.UserModel;
import com.healthcart.dao.LoginDaoInterface;
import com.healthcart.dao.UserDaoInterface;
import com.healthcart.dto.CbcTest;
import com.healthcart.dto.UserDto;

@Repository
public class LoginDaoImpl implements LoginDaoInterface {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.healthcart.dao.UserDaoInterface#saveUser(com.healthcart.dto.UserDto)
	 */

	SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	Session session = null;
	Transaction txn = null;

	@Override
	public UserModel validateUser(UserModel user) {
	UserModel userModel = new UserModel();
	session = sessionFactory.openSession();
	userModel=(UserModel) session.createCriteria(UserModel.class).add(Restrictions.eq("userName", user.getUserName()))
	.add(Restrictions.eq("userPwd", user.getUserPwd())).uniqueResult();
	if(userModel!=null)	
	{
		return userModel;
	}	
		
		
		return null;
	}
	
	
}
