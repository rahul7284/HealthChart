package com.healthcart.cmodel;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;

import com.healthcart.dto.CbcTest;
import com.healthcart.dto.Hospital;
import com.healthcart.dto.SugarTest;
import com.healthcart.dto.ThyroidTest;
import com.healthcart.dto.UserDto;
@Entity
@Table(name="cbctest")
public class CBCModel {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="rbcvalue")
	private Integer rbcValue;
	@Column(name="wbcvalue")
	private Integer wbcValue;
	@Column(name="plateletsvalue")
	private Integer plateletsValue ;
	@Column(name="hemaglobinvalue")
	private Integer hemaglobinValue;
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="fk_user")
	private UserModel user;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRbcValue() {
		return rbcValue;
	}
	public void setRbcValue(Integer rbcValue) {
		this.rbcValue = rbcValue;
	}
	public Integer getWbcValue() {
		return wbcValue;
	}
	public void setWbcValue(Integer wbcValue) {
		this.wbcValue = wbcValue;
	}
	public Integer getPlateletsValue() {
		return plateletsValue;
	}
	public void setPlateletsValue(Integer plateletsValue) {
		this.plateletsValue = plateletsValue;
	}
	public Integer getHemaglobinValue() {
		return hemaglobinValue;
	}
	public void setHemaglobinValue(Integer hemaglobinValue) {
		this.hemaglobinValue = hemaglobinValue;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	
}
