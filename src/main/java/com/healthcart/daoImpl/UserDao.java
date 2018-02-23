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
import com.healthcart.dao.UserDaoInterface;
import com.healthcart.dto.CbcTest;
import com.healthcart.dto.UserDto;

@Repository
public class UserDao implements UserDaoInterface {

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
	
	/*@Override
	public Integer saveUser(UserDto user) {
		Date today = new Date();

		UserModel usermodel = new UserModel();
		usermodel.setFirstName(user.getFirstName());
		usermodel.setLastName(user.getLastName());
		usermodel.setEmail(user.getEmail());
		usermodel.setMobileNumber(user.getMobileNumber());
		usermodel.setEnrollDate(today);
		usermodel.setCbcList(user.getCbcList().);
		usermodel.setSugarList(user.getSugarList());
		usermodel.setThyroidList(user.getThyroidList());
		usermodel.setHospitalList(user.getHospitalList());
		usermodel.setUserName(user.getUserName());
		usermodel.setUserPwd(user.getUserPwd());
		session = sessionFactory.openSession();
		txn = session.beginTransaction();
		session.saveOrUpdate(usermodel);
		session.flush();
		txn.commit();
		return 0;

	}
*/

	public UserModel saveUser(UserModel user) {
		session = sessionFactory.openSession();
		txn = session.beginTransaction();
		int saveid = (int) session.save(user);
		
		user=(UserModel) session.createCriteria(UserModel.class).add(Restrictions.eq("id", saveid)).uniqueResult();
		txn.commit();
		session.close();
		return user;
	}

}
