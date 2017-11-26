package com.healthcart.dto;

import java.util.Date;

public class ThyroidTest {
	private Integer id;
	
	private Integer value;
	private UserDto user;
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
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
