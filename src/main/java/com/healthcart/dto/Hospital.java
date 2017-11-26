package com.healthcart.dto;

import java.util.Date;

public class Hospital {
	private Integer id;
	
	private String hospName;
	private String hospAdd;
	
	public String getHospName() {
		return hospName;
	}
	public void setHospName(String hospName) {
		this.hospName = hospName;
	}
	public String getHospAdd() {
		return hospAdd;
	}
	public void setHospAdd(String hospAdd) {
		this.hospAdd = hospAdd;
	}
	private UserDto user;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	
	

}
