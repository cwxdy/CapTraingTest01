package com.example.demo.bean;

import java.util.List;

public class Grade {
	private String gradeId;
	private String gradeName;
	private List<Student> students;
	public Grade() {
		super();
	}
	public Grade(String gradeId, String gradeName, List<Student> students) {
		super();
		this.gradeId = gradeId;
		this.gradeName = gradeName;
		this.students = students;
	}
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "GradeVO [gradeId=" + gradeId + ", gradeName=" + gradeName + ", students=" + students + "]";
	}
	
}
