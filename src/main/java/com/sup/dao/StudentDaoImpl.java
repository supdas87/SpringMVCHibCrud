package com.sup.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sup.model.Student;

public class StudentDaoImpl implements StudentDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void saveStudent(Student student) {
		System.out.println("saveStudentDaoImpl");
		sessionFactory.getCurrentSession().save(student).;
	}

}
