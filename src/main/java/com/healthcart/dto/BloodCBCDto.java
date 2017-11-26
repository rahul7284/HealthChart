package com.healthcart.dto;

import java.util.List;
import java.util.Map;

public class BloodCBCDto {
	private Integer id;
	private Integer rbc_limit;
	private Integer rbclower_limit;
	private Integer wbc_limit;
	private Integer wbclower_limit;
	private Integer platelets_limit;
	private Integer plateletslower_limit;
	private Integer hb_limit;
	private Integer hblower_limit;
	private Integer limit;
	private List<String> gender;
	private String description;
	private String rbc_description;
	private String wbc_description;
	private String platelets_description;
	private String hb_description;
	private List<String> descriptionlist;
	private Map<String, String> description_map;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRbc_limit() {
		return rbc_limit;
	}

	public void setRbc_limit(Integer rbc_limit) {
		this.rbc_limit = rbc_limit;
	}

	public Integer getRbclower_limit() {
		return rbclower_limit;
	}

	public void setRbclower_limit(Integer rbclower_limit) {
		this.rbclower_limit = rbclower_limit;
	}

	public Integer getWbc_limit() {
		return wbc_limit;
	}

	public void setWbc_limit(Integer wbc_limit) {
		this.wbc_limit = wbc_limit;
	}

	public Integer getWbclower_limit() {
		return wbclower_limit;
	}

	public void setWbclower_limit(Integer wbclower_limit) {
		this.wbclower_limit = wbclower_limit;
	}

	public Integer getPlatelets_limit() {
		return platelets_limit;
	}

	public void setPlatelets_limit(Integer platelets_limit) {
		this.platelets_limit = platelets_limit;
	}

	public Integer getPlateletslower_limit() {
		return plateletslower_limit;
	}

	public void setPlateletslower_limit(Integer plateletslower_limit) {
		this.plateletslower_limit = plateletslower_limit;
	}

	public Integer getHb_limit() {
		return hb_limit;
	}

	public void setHb_limit(Integer hb_limit) {
		this.hb_limit = hb_limit;
	}

	public Integer getHblower_limit() {
		return hblower_limit;
	}

	public void setHblower_limit(Integer hblower_limit) {
		this.hblower_limit = hblower_limit;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public List<String> getGender() {
		return gender;
	}

	public void setGender(List<String> gender) {
		this.gender = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRbc_description() {
		return rbc_description;
	}

	public void setRbc_description(String rbc_description) {
		this.rbc_description = rbc_description;
	}

	public String getWbc_description() {
		return wbc_description;
	}

	public void setWbc_description(String wbc_description) {
		this.wbc_description = wbc_description;
	}

	public String getPlatelets_description() {
		return platelets_description;
	}

	public void setPlatelets_description(String platelets_description) {
		this.platelets_description = platelets_description;
	}

	public String getHb_description() {
		return hb_description;
	}

	public void setHb_description(String hb_description) {
		this.hb_description = hb_description;
	}

	public List<String> getDescriptionlist() {
		return descriptionlist;
	}

	public void setDescriptionlist(List<String> descriptionlist) {
		this.descriptionlist = descriptionlist;
	}

	public Map<String, String> getDescription_map() {
		return description_map;
	}

	public void setDescription_map(Map<String, String> description_map) {
		this.description_map = description_map;
	}

}
