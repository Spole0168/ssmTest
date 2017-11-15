package com.shang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shang.biz.IStudentBiz;
import com.shang.dal.model.Student;

@Controller
@RequestMapping("/stu")
public class StudentController {
	@Autowired
	private IStudentBiz studentBiz;
	
	List<Student> listStudents = null;
	@RequestMapping(value = "/listStudent")
	public ModelAndView listStudent(){
		listStudents = studentBiz.listStudents(null);
		return new ModelAndView("listStudent","list",listStudents);
	}
	@RequestMapping(value = "/addStudent")
	public ModelAndView addStudent(){
		listStudents = studentBiz.listStudents(null);
		return new ModelAndView("listStudent","list",listStudents);
	}
	@RequestMapping(value = "/showStu")
	@ResponseBody
	public String showStu(){
		listStudents = studentBiz.listStudents(null);
		return "";
	}
	
	@RequestMapping(value = "/jsonTest", method = RequestMethod.POST)
	@ResponseBody
	public void jsonTest(@RequestBody String jsonStr){
		System.out.println(jsonStr);
	}
	
}
