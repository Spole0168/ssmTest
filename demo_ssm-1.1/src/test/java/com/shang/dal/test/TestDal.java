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
import com.shang.dal.dao.UserExtMapper;
import com.shang.dal.model.Menu;
import com.shang.dal.model.Student;
import com.shang.dal.model.User;

public class TestDal {
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private UserExtMapper userExtMapper;
	@Autowired
	private MenuMapper menuMapper;
	
	@Before
	public void before() {
		// 使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] {"testConfig/test_spring_mybatis.xml" });
		// 从Spring容器中根据bean的id取出我们要使用的userService对象
		studentMapper = (StudentMapper) ac.getBean("studentMapper");
		userExtMapper = (UserExtMapper) ac.getBean("userExtMapper");
		menuMapper = (MenuMapper) ac.getBean("menuMapper");
	}
	@Test
	public void test_add(){
		Menu m = new Menu();
		m.setMenuCode("A2");
		m.setMenuPcode("A");
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
		List<User> listStudents = userExtMapper.queryUserByOrConditions(null);
		System.out.println(listStudents.size());
		System.out.println(JSON.toJSON(listStudents));
	}
	
}
