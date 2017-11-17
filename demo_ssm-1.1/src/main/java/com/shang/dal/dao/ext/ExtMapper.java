package com.shang.dal.dao.ext;

import java.util.List;

import com.shang.dal.dto.MenuDto;
import com.shang.dal.model.Menu;
import com.shang.dal.model.User;

public interface ExtMapper {
	
    List<User> queryUserByOrConditions(User user);
    
    List<MenuDto> queryMenusByConditions(Menu menu);
    
}