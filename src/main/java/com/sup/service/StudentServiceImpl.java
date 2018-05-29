package com.sup.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sup.dao.StudentDao;
import com.sup.model.Student;

public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao studentDao;
	@Override
	public void saveStudent(Student student) {
		System.out.println("Saving stduent in service class...");
		studentDao.saveStudent(student);
	}

}
