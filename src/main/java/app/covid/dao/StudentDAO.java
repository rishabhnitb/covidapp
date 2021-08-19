package app.covid.dao;

import java.util.List;


import app.covid.entities.StudentEntity;
import app.covid.entities.SubjectEntity;


public interface StudentDAO {

	public String isWorking();
	
	public List<StudentEntity> addStudent();
	
	public StudentEntity getStudent(String name);
	
	public List<StudentEntity> getAllStudent();
	
	public List<SubjectEntity> getAllSubject();
}
