package com.spring.demomvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.demomvc.model.Student;
import com.spring.demomvc.service.StudentServiceImpl;

@Controller
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@RequestMapping("/contact")
	public String showform() {
		return "contact";
		
	}
	@PostMapping("processform")
	public String handalfomr(@ModelAttribute Student student) {
		studentServiceImpl.studentRegister(student);
		return "success";
		
	}

}
