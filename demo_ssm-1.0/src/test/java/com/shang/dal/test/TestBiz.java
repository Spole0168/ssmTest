package com.shang.dal.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.shang.biz.IStudentBiz;
import com.shang.dal.model.Student;

@RunWith(SpringJUnit4ClassRunner.class)
//配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
//@ContextConfiguration(locations = {"classpath:/testConfig/test_spring_mvc.xml", "classpath:/testConfig/test_spring_mybatis.xml" })
@ContextConfiguration(locations = {"classpath:/testConfig/test_spring_mybatis.xml" })
public class TestBiz {
	@Autowired
	IStudentBiz studentBiz;
	
	@Test
	public void test_add(){
		Student stu = new Student();
		stu.setAge(20);
		stu.setName("aaaaaaaaaaaa");
		studentBiz.insertSelective(stu);
	}
	@Test
	public void test_list(){
		List<Student> listStudents = studentBiz.listStudents(null);
		System.out.println(JSON.toJSON(listStudents));
	}
	
}
