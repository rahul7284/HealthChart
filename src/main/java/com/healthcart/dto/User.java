package com.healthcart.dto;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.healthcart.cmodel.CBCModel;
import com.healthcart.cmodel.HospitalModel;
import com.healthcart.cmodel.SugarModel;
import com.healthcart.cmodel.ThyroidModel;

public class User {
	private Integer id;
	private String firstName;
	private String lastName;
	private String email ;
	private Long mobileNumber;
	private String userName;
	private String userPwd;
	private Date enrollDate;
	/*private List<CbcTest> cbcList;
	private List<SugarTest> sugarList;
	private List<ThyroidTest> thyroidList;
	private List<Hospital> hospitalList;*/
	
	
	/*private Set<CBCModel> cbcList;
	private Set<SugarModel> sugarList;
	private Set<ThyroidModel> thyroidList;
	private Set<HospitalModel> hospitalList;*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
}
