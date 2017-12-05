package com.healthcart.dao;

import com.healthcart.cmodel.UserModel;
import com.healthcart.dto.UserDto;

public interface UserDaoInterface {

	Integer saveUser(UserModel user);

}