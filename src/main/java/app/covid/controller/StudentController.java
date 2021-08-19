package app.covid.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.covid.dao.StudentDAOImpl;
import app.covid.entities.StudentEntity;
import app.covid.pojos.Student;

@Path("/student")
public class StudentController {

	public static ApplicationContext context;

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String isWorking() {
		context = new ClassPathXmlApplicationContext("config.xml");
		StudentDAOImpl dao = context.getBean(StudentDAOImpl.class, "studentdaoimpl");
		return dao.isWorking();
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentEntity> getAllStudent() {
		context = new ClassPathXmlApplicationContext("config.xml");
		StudentDAOImpl dao = context.getBean(StudentDAOImpl.class, "studentdaoimpl");
		
		return dao.getAllStudent(); 
	}
	
	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public StudentEntity getStudent(@PathParam("name") String name) {
		
		context = new ClassPathXmlApplicationContext("config.xml");
		StudentDAOImpl dao = context.getBean(StudentDAOImpl.class, "studentdaoimpl");
		
		return dao.getStudent(name); 
	}
	
	@GET
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StudentEntity> addStudent(Student stud){
		
		context = new ClassPathXmlApplicationContext("config.xml");
		StudentDAOImpl dao = context.getBean(StudentDAOImpl.class, "studentdaoimpl");
		
		return dao.addStudent();
	}
	
}
