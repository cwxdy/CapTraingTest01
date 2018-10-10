package com.example.demo.bean;

public class Student {
	private String studentId;
	private String studentName;
	private Integer studentAge;
	private String gradeId;
	private String addressId;
	public Student() {
		super();
	}
	public Student(String studentId, String studentName, Integer studentAge, String gradeId, String addressId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.gradeId = gradeId;
		this.addressId = addressId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", gradeId=" + gradeId + ", addressId=" + addressId + "]";
	}
	
	
}
