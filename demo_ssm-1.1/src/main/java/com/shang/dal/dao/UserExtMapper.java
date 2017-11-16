package com.shang.dal.dao;

import java.util.List;

import com.shang.dal.model.User;

public interface UserExtMapper {
	
    List<User> queryUserByOrConditions(User user);
}