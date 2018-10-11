package com.example.demo.bean;

import com.example.demo.bean.Address;

public class Student {
	private String studentId;
	private String studentName;
	private Integer studentAge;
	private Address address;
	private Grade grade;
	public Student() {
		super();
	}
	public Student(String studentId, String studentName, Integer studentAge, Address address, Grade grade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.address = address;
		this.grade = grade;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", address=" + address + ", grade=" + grade + "]";
	}
	
	
}
