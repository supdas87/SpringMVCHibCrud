package com.sup.service;

import com.sup.model.Student;

public interface StudentService {
	
	public void saveStudent(Student student);
	public String getStudentById(int id);

}
