package com.example.demo.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.Address;
import com.example.demo.bean.Grade;
import com.example.demo.bean.Student;
import com.example.demo.dao.AddressMapper;
import com.example.demo.dao.GradeMapper;
import com.example.demo.dao.StudentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CapTraingTest01ApplicationTests {

	/*@Autowired
	StudentMapper studentMapper;
	
	@Autowired
	GradeMapper gradeMapper;
	
	@Autowired
	AddressMapper addressMapper;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testStudent() {
		Student student = new Student();
		student.setStudentId("s1230");
		student.setStudentName("哈哈");
		student.setStudentAge(15);
		student.setGradeId("115");
		student.setAddressId("125s3");

//		addStudent();
		
//		deleteStudentById("1111111");
		
//		updateStudent(student);
		
//		System.out.println(getStudentById("12"));
		
//		System.out.println(getStudentList());
		
	}
	
	@Test
	public void testGrade() {
		Grade grade = new Grade();
		grade.setGradeId("12345");
		grade.setGradeName("三年级");
		
//		addGrade();
		
//		deleteGradeById("11");
		
//		gradeMapper.updateGrade(grade);
		
//		System.out.println(getGradeById("12345"));
		
//		System.out.println(getGradeList());
	}
	
	@Test
	public void testAddress() {
		Address address = new Address();
		address.setAddressId("1adfa3");
		address.setAddressName("江苏222");
		
//		addAddress();
		
//		deleteAddressById("123");
		
//		updateAddress(address);
		
//		System.out.println(getAddressById("1adfa3"));
		
//		System.out.println(getAddressList());
	}
	
	学生CRUD
	public void addStudent(Student student) {
		studentMapper.addStudent(student);
	}
	
	public void deleteStudentById(String studentId) {
		studentMapper.deleteStudentById(studentId);
	}
	
	public void updateStudent(Student student) {
		studentMapper.updateStudent(student);
	}
	
	public Student getStudentById(String studentId) {
		return studentMapper.getStudentById(studentId);
	}
	
	public List<Student> getStudentList() {
		return studentMapper.getStudentList();
	}
	
	
	年级CRUD
	public void addGrade(Grade grade) {
		gradeMapper.addGrade(grade);
	}
	
	public void deleteGradeById(String gradeId) {
		gradeMapper.deleteGradeById(gradeId);
	}
	
	public void updateGrade(Grade grade) {
		gradeMapper.updateGrade(grade);
	}
	
	public Grade getGradeById(String gradeId) {
		return gradeMapper.getGradeById(gradeId);
	}
	
	public List<Grade> getGradeList() {
		return gradeMapper.getGradeList();
	}
	
	
	地址CRUD
	public void addAddress(Address address) {
		addressMapper.addAddress(address);
	}
 	
	public void deleteAddressById(String addressId) {
		addressMapper.deleteAddressById(addressId);
	}
	
	public void updateAddress(Address address) {
		addressMapper.updateAddress(address);
	}
	
	public Address getAddressById(String addressId) {
		return addressMapper.getAddressById(addressId);
	}
	
	public List<Address> getAddressList() {
		return addressMapper.getAddressList();
	}*/

}
