package com.sup.dao;

import com.sup.model.Student;

public interface StudentDao {
	
	public void saveStudent(Student student);
	public void getStudentById(int id);

}
