package com.shang.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shang.base.BaseBiz;
import com.shang.dal.dao.MenuMapper;
import com.shang.dal.dto.MenuDto;
import com.shang.dal.model.Menu;

@Service("menuBiz")  
public class MenuBizImpl extends BaseBiz implements IMenuBiz{
	
	@Autowired
	private MenuMapper menuMapper;

	@Override
	public MenuDto listMenus(Menu menu) {
		List<Menu> list = menuMapper.selectByExample(null);
		
		return null;
	}


}
