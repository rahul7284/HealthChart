package com.healthcart.dto;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.healthcart.cmodel.CBCModel;
import com.healthcart.cmodel.HospitalModel;
import com.healthcart.cmodel.SugarModel;
import com.healthcart.cmodel.ThyroidModel;

public class UserDto {
	private Integer id;
	private String firstName;
	private String lastName;
	private String email ;
	private Integer mobileNumber;
	private String userName;
	private String userPwd;
	private Date enrollDate;
	/*private List<CbcTest> cbcList;
	private List<SugarTest> sugarList;
	private List<ThyroidTest> thyroidList;
	private List<Hospital> hospitalList;*/
	private List<CBCModel> cbcList;
	private List<SugarModel> sugarList;
	private List<ThyroidModel> thyroidList;
	private List<HospitalModel> hospitalList;
	
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
	public Integer getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
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
	public List<CBCModel> getCbcList() {
		return cbcList;
	}
	public void setCbcList(List<CBCModel> cbcList) {
		this.cbcList = cbcList;
	}
	public List<SugarModel> getSugarList() {
		return sugarList;
	}
	public void setSugarList(List<SugarModel> sugarList) {
		this.sugarList = sugarList;
	}
	public List<ThyroidModel> getThyroidList() {
		return thyroidList;
	}
	public void setThyroidList(List<ThyroidModel> thyroidList) {
		this.thyroidList = thyroidList;
	}
	public List<HospitalModel> getHospitalList() {
		return hospitalList;
	}
	public void setHospitalList(List<HospitalModel> hospitalList) {
		this.hospitalList = hospitalList;
	}
	
	

	

}
