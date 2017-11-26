package com.healthcart.dto;

import java.util.Date;

public class SugarTest {
	private Integer id;
	private Integer fastingValue;
	private Integer nonFastingValue;
	
	private UserDto user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFastingValue() {
		return fastingValue;
	}

	public void setFastingValue(Integer fastingValue) {
		this.fastingValue = fastingValue;
	}

	public Integer getNonFastingValue() {
		return nonFastingValue;
	}

	public void setNonFastingValue(Integer nonFastingValue) {
		this.nonFastingValue = nonFastingValue;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}
	
	

}
