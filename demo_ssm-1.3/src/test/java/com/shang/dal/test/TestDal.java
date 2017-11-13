package com.shang.dal.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shang.biz.IStudentBiz;
import com.shang.dal.model.Student;
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext_dao.xml"})
public class TestDal {
	@Autowired
	IStudentBiz studentBiz;
	@Test
	public void test_add(){
		Student stu = new Student();
		stu.setAge(20);
		stu.setName("123");
		studentBiz.insertSelective(stu);
	}
	
}
