package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Student;

public interface StudentMapper {
	public List<Student> getStudentList();
	
	void addStudent(Student student);
	
	void deleteStudentById(String studentId);
	
	void updateStudent(Student student);
	
	Student getStudentById(String studentId);
	
	Student getStudentByGradeId(String gradeId);
}
