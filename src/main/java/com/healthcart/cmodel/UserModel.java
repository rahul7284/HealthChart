package com.healthcart.cmodel;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;

import com.healthcart.dto.CbcTest;
import com.healthcart.dto.Hospital;
import com.healthcart.dto.SugarTest;
import com.healthcart.dto.ThyroidTest;
@Entity
@Table(name="user")
public class UserModel {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")

	private String lastName;
	@Column(name="email")
	
	private String email ;
	@Column(name="mobileNumber")
	
	private Integer mobileNumber;
	@Column(name="userName")
	
	private String userName;
	@Column(name="userPwd")
	
	private String userPwd;
	 @Column(name="enrollDate")
	 @Temporal(TemporalType.TIMESTAMP)
	private Date enrollDate;
	@OneToMany(mappedBy = "user",orphanRemoval=true,cascade=CascadeType.ALL)
	@Fetch(value = org.hibernate.annotations.FetchMode.SUBSELECT)
	
	private Set<CBCModel> cbcList;
	@OneToMany(mappedBy = "user",orphanRemoval=true,cascade=CascadeType.ALL)
	@Fetch(value = org.hibernate.annotations.FetchMode.SUBSELECT)
	
	private Set<SugarModel> sugarList;
	@OneToMany(mappedBy = "user",orphanRemoval=true,cascade=CascadeType.ALL)
	@Fetch(value = org.hibernate.annotations.FetchMode.SUBSELECT)
	
	private Set<ThyroidModel> thyroidList;
	@OneToMany(mappedBy = "user",orphanRemoval=true,cascade=CascadeType.ALL)
	@Fetch(value = org.hibernate.annotations.FetchMode.SUBSELECT)
	
	private Set<HospitalModel> hospitalList;
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
	/*public List<CBCModel> getCbcList() {
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
	}*/
	public Set<CBCModel> getCbcList() {
		return cbcList;
	}
	public void setCbcList(Set<CBCModel> cbcList) {
		this.cbcList = cbcList;
	}
	public Set<SugarModel> getSugarList() {
		return sugarList;
	}
	public void setSugarList(Set<SugarModel> sugarList) {
		this.sugarList = sugarList;
	}
	public Set<ThyroidModel> getThyroidList() {
		return thyroidList;
	}
	public void setThyroidList(Set<ThyroidModel> thyroidList) {
		this.thyroidList = thyroidList;
	}
	public Set<HospitalModel> getHospitalList() {
		return hospitalList;
	}
	public void setHospitalList(Set<HospitalModel> hospitalList) {
		this.hospitalList = hospitalList;
	}
	
	

}
