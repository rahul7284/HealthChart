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
@Table(name="thyroidtest")
public class ThyroidModel {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="value")
	private Integer value;
	
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="fk_user")
	private UserModel user;
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
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	
}
