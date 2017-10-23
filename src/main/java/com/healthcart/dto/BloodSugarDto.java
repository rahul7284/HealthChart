package com.healthcart.dto;

import java.util.List;

public class BloodSugarDto {
private Integer id;
private Integer level;
private Integer higher_limit;
private Integer lower_limit;
private List<String> mode;
private String description;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getHigher_limit() {
	return higher_limit;
}
public void setHigher_limit(Integer higher_limit) {
	this.higher_limit = higher_limit;
}
public Integer getLower_limit() {
	return lower_limit;
}
public void setLower_limit(Integer lower_limit) {
	this.lower_limit = lower_limit;
}
public Integer getLevel() {
	return level;
}
public void setLevel(Integer level) {
	this.level = level;
}
public List<String> getMode() {
	return mode;
}
public void setMode(List<String> mode) {
	this.mode = mode;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
