package com.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.shang.dal.dto.Node;
import com.shang.dal.model.Menu;

public class TreeUtils {

    /**
     * 获取指定ID 的子菜单
     * @param id
     * @param rootMenu
     * @return
     */
	public static  List<Node<Menu>> getChild(String id, List<Menu> menusList) {
	    // 子菜单
		List<Node<Menu>> childList = new ArrayList<Node<Menu>>();
	    for (Menu mu : menusList) {
	    	//id == null md.getMenuPid() ==null  Root
	    	Node<Menu> node = new Node<>();
	    	if(StringUtils.isBlank(mu.getMenuPid()) && StringUtils.isBlank(id)){
	    		node.setT(mu);
	    		childList.add(node);
	    	}
	    	if(StringUtils.isNotBlank(id) && id.equals(mu.getMenuPid())) {
	    		node.setT(mu);
	    		childList.add(node);
	    	}
	    }
	    if(childList.size() > 0){
	    	// 把子菜单的子菜单再循环一遍
	    	for (Node<Menu> node : childList) {
	    		// 递归
	    		node.setChildren(getChild(node.getT().getId(), menusList));
	    	}
	    }
	    return childList;
	}
}
