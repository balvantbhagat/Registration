package com.spring.demomvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demomvc.dao.StudentDao;
import com.spring.demomvc.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student studentRegister(Student student) {
		
		return studentDao.save(student);
	}

}
