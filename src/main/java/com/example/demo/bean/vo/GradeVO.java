package com.example.demo.bean.vo;

import java.util.List;

public class GradeVO {
	private String gradeId;
	private String gradeName;
	private List<StudentVO> students;
	public GradeVO() {
		super();
	}
	public GradeVO(String gradeId, String gradeName, List<StudentVO> students) {
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
	public List<StudentVO> getStudents() {
		return students;
	}
	public void setStudents(List<StudentVO> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "GradeVO [gradeId=" + gradeId + ", gradeName=" + gradeName + ", students=" + students + "]";
	}
	
}
