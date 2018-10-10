package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Student;
import com.example.demo.bean.vo.StudentVO;

public interface StudentVOMapper {
	public List<StudentVO> getStudentList();
	
	void addStudent(Student student);
	
	void deleteStudentById(String studentId);
	
	void updateStudent(Student student);
	
	StudentVO getStudentById(String studentId);
	
	/**
	 * 获取学生列表
	 * @param gradeId 年级id
	 * @return
	 */
	List<StudentVO> getStudentListByGradeId(String gradeId);
	
	List<StudentVO> getStudent(StudentVO studentVO);
}
