package com.healthcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blood_sugar")
public class BloodSugarModel {
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="high_limit")
	private Integer high_limit;
	@Column(name="low_limit")
	private Integer low_limit;
	@Column(name="mode")
	private String mode;
	@Column(name="value")
	private Integer value;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getHigh_limit() {
		return high_limit;
	}
	public void setHigh_limit(Integer high_limit) {
		this.high_limit = high_limit;
	}
	public Integer getLow_limit() {
		return low_limit;
	}
	public void setLow_limit(Integer low_limit) {
		this.low_limit = low_limit;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	

}
