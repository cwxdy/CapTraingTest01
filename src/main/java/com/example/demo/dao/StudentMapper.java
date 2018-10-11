package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Student;

public interface StudentMapper {
	public List<Student> getStudentList();
	
	void addStudent(Student student);
	
	void deleteStudentById(String studentId);
	
	void updateStudent(Student student);
	
	Student getStudentById(String studentId);
	
	/**
	 * 获取学生列表
	 * @param gradeId 年级id
	 * @return
	 */
	List<Student> getStudentListByGradeId(String gradeId);
	
	List<Student> getStudent(Student student);
}
