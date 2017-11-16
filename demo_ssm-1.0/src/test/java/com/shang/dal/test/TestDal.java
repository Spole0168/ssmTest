package com.shang.dal.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.shang.dal.dao.StudentMapper;
import com.shang.dal.model.Student;

public class TestDal {
	@Autowired
	private StudentMapper studentMapper;
	
	@Before
	public void before() {
		// 使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] {"testConfig/test_spring_mybatis.xml" });
		// 从Spring容器中根据bean的id取出我们要使用的userService对象
		studentMapper = (StudentMapper) ac.getBean("studentMapper");
	}
	@Test
	public void test_add(){
		Student stu = new Student();
		stu.setAge(205);
		stu.setName("AAA");
		studentMapper.insertSelective(stu);
	}
	@Test
	public void test_list(){
		List<Student> listStudents = studentMapper.selectByExample(null);
		System.out.println(JSON.toJSON(listStudents));
	}
	
}
