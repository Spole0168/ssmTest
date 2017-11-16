package com.shang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shang.biz.IStudentBiz;
import com.shang.dal.model.Student;

@Controller
@RequestMapping("/stu")
public class StudentController {
	@Autowired
	private IStudentBiz studentBiz;
	
	@RequestMapping(value = "/listStudent")
	public ModelAndView listStudent(){
		List<Student> listStudents = null;
		listStudents = studentBiz.listStudents(null);
		return new ModelAndView("listStudent","list",listStudents);
	}
	@RequestMapping(value = "/addStudent")
	public ModelAndView addStudent(){
		List<Student> listStudents = null;
		listStudents = studentBiz.listStudents(null);
		return new ModelAndView("listStudent","list",listStudents);
	}
	@RequestMapping(value = "/updateStudent")
	public ModelAndView updateStudent(){
		List<Student> listStudents = null;
		listStudents = studentBiz.listStudents(null);
		return new ModelAndView("listStudent","list",listStudents);
	}
}
