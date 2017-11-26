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
@Table(name="hospital")
public class HospitalModel {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="hospname")
	private String hospname;
	@Column(name="hospadd")
	private String hospadd;
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="fk_user")
	private UserModel user;
	
	public Integer getId() {
		return id;
	}
	public String getHospname() {
		return hospname;
	}
	public void setHospname(String hospname) {
		this.hospname = hospname;
	}
	public String getHospadd() {
		return hospadd;
	}
	public void setHospadd(String hospadd) {
		this.hospadd = hospadd;
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
