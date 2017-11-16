package com.shang.biz;

import java.util.List;

import com.shang.dal.model.User;

public interface IUserBiz {
	
	public void addUser(User user);
	
	public void updUser(User user);
	
	/**
	 * 根据  用户名||手机号||邮箱 查找满足条件的用户
	 * @param user
	 * @return
	 */
	public List<User> listUsers(User user);
	
	public User getUser(String id);
	
}
