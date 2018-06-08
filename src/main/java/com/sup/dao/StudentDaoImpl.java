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
	public void getStudentById(int id) {
		System.out.println("In DAO layer");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em  = emf.createEntityManager();
		//Student s = em.find(Student.class, id);
		em.createNativeQuery("select 1 from dual").getSingleResult();
		//System.out.println(s);
	}

}
