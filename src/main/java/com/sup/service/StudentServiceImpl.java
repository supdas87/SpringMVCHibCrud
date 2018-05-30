package com.sup.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sup.dao.StudentDao;
import com.sup.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao studentDao;
	
	@Override
	public void saveStudent(Student student) {
		System.out.println("Saving stduent in service class...");
		studentDao.saveStudent(student);
	}

	@Transactional
	public void getStudentById(int id) {
		System.out.println("In Service Impl");
		studentDao.getStudentById(id);
	}

}
