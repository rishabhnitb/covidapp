package app.covid.dao;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import app.covid.controller.StudentController;
import app.covid.entities.StudentEntity;
import app.covid.entities.SubjectEntity;
import app.covid.util.HibernateUtil;

@Component
public class StudentDAOImpl implements StudentDAO {

	
	
	public String isWorking() {
		return "it is working!!..";
	}
	
	@Override
	public StudentEntity getStudent(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentEntity> getAllStudent() {
		HibernateUtil util = StudentController.context.getBean(HibernateUtil.class, "hybernateutil");
		
		return null;
	}

	@Override
	public List<SubjectEntity> getAllSubject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentEntity> addStudent() {
		HibernateUtil util = StudentController.context.getBean(HibernateUtil.class, "hibernateutil");
		System.out.println("///////////////////////"+util+"\\\\\\\\\\\\\\\\\\\\\\");
		Session session = util.getSessionFactory().getCurrentSession();
		StudentEntity stud = new StudentEntity();
		List<StudentEntity> studs = new ArrayList<StudentEntity>();
		try {
			
			session.beginTransaction();
			
			List<SubjectEntity> subs = new ArrayList<SubjectEntity>();
			SubjectEntity sub = new SubjectEntity();
			sub.setSubject("Maths");
			sub.setSubject_code(101);
			subs.add(sub);
			stud.setMail("test.test@mail.com");
			stud.setRegistration_no(10101);
			stud.setSubjects(subs);
			session.persist(stud);
			studs.add(stud);
			session.save(stud);
			session.save(sub);
			session.getTransaction().commit();
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		return studs;
	}

	
}
