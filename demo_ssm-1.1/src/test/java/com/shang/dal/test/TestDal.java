package com.shang.dal.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.shang.dal.dao.MenuMapper;
import com.shang.dal.dao.StudentMapper;
import com.shang.dal.dao.ext.ExtMapper;
import com.shang.dal.dto.MenuDto;
import com.shang.dal.dto.Node;
import com.shang.dal.model.Menu;
import com.shang.dal.model.Student;
import com.utils.TreeUtils;

public class TestDal {
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private ExtMapper extMapper;
	@Autowired
	private MenuMapper menuMapper;
	
	@Before
	public void before() {
		// 使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] {"testConfig/test_spring_mybatis.xml" });
		// 从Spring容器中根据bean的id取出我们要使用的userService对象
		studentMapper = (StudentMapper) ac.getBean("studentMapper");
		extMapper = (ExtMapper) ac.getBean("extMapper");
		menuMapper = (MenuMapper) ac.getBean("menuMapper");
	}
	@Test
	public void test_add(){
		Menu m = new Menu();
		m.setMenuCode("A2");
		m.setMenuLevel(0);
		m.setMenuUrl("url_A2");
		m.setMenuName("2222");
		menuMapper.insertSelective(m);
	}
	@Test
	public void test_list(){
		List<Student> listStudents = studentMapper.selectByExample(null);
		System.out.println(listStudents.size());
		System.out.println(JSON.toJSON(listStudents));
	}
	@Test
	public void test_ulist(){
		List<MenuDto> listStudents = extMapper.queryMenusByConditions(null);
		System.out.println(listStudents.size());
		MenuDto tree = new MenuDto();
		tree.setMenuName("test_ROOT");
		List<MenuDto> child = MenuDto.getChild(null, listStudents);
		tree.setChildren(child);
		System.out.println(JSON.toJSON(tree));
	}
	@Test
	public void test_treeNodeslist(){
		List<Menu> listStudents = menuMapper.selectByExample(null);
		System.out.println(listStudents.size());
		Node<Menu> tree = new Node<Menu>();
		Menu m = new Menu();
		m.setMenuName("test_ROOT");
		List<Node<Menu>> child = TreeUtils.getChild(null, listStudents);
		tree.setChildren(child);
		tree.setT(m);
		System.out.println(JSON.toJSON(tree));
	}
	
	
}
