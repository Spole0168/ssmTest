package com.shang.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shang.base.BaseBiz;
import com.shang.dal.dao.UserMapper;
import com.shang.dal.model.Student;
import com.shang.dal.model.User;
import com.shang.dal.model.UserExample;

@Service("userBiz")  
public class UserBizImpl extends BaseBiz implements IUserBiz{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void addUser(User user) {
		userMapper.insertSelective(user);
	}

	@Override
	public void updUser(User user) {
		userMapper.updateByPrimaryKeySelective(user);
		
	}

	@Override
	public List<User> listUsers(User user) {
		UserExample exam = new UserExample();
//		exam.createCriteria().
		List<User> list = this.userMapper.selectByExample(exam);
		return list;
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
