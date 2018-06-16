package com.sup.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.sup.model.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{

	/*@Autowired
	SessionFactory sessionFactory;*/
	
	@Override
	public void saveStudent(Student student) {
		System.out.println("saveStudentDaoImpl");
	}

	@Override
	public String getStudentById(int id) {
		System.out.println("In DAO layer");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em  = emf.createEntityManager();
		Student s = em.find(Student.class, id);
		System.out.println("ROll:"+s.getStudentRoll());	
		return s.getStudentRoll();
	}
}
