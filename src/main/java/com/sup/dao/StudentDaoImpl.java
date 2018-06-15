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
		// Complete the code to save the data into database.
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("");
		//EntityManager em  = emf.createEntityManager();
		//Student s = em.find(Student.class, 1);
		//sessionFactory.getCurrentSession().save(student);
	}

	@Override
	public String getStudentById(int id) {
		System.out.println("In DAO layer");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
		//System.out.println(emf);
		EntityManager em  = emf.createEntityManager();
		Student s = em.find(Student.class, id);
		System.out.println(s);
		if (null == s) {
			System.err.println("Record not found.......");
		}
		//em.
		System.out.println("ROll:"+s.getStudentRoll());	
		return s.getStudentRoll();
		//em.refresh(s);
		//em.clear();
		//emf.close();
	}
}
