package com.shang.biz;

import com.shang.dal.dto.MenuDto;
import com.shang.dal.model.Menu;

public interface IMenuBiz {
	/**
	 * 根据条件返回 树形菜单
	 * @param menu
	 * @return
	 */
	public MenuDto listMenus(Menu menu);
	
}
