package com.shang.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shang.dal.dao.StudentDAO;
import com.shang.dal.model.Student;

@Service("studentBiz")  
public class StudentBizImpl implements IStudentBiz{
	
	@Autowired
	private StudentDAO studentDAO;
	
	public Student getStudentById(String id) {
		
		return null;
	}

	public List<Student> listStudents(Student stu) {
		
		return studentDAO.selectByExample(null);
	}

	public void insertSelective(Student stu) {
		studentDAO.insertSelective(stu);
	}

}
