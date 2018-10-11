package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AddressMapper;
import com.example.demo.dao.GradeMapper;
import com.example.demo.dao.StudentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional
public class VoTests {
	
	/*@Autowired
	StudentMapper studentVOMapper;
	
	@Autowired
	GradeMapper gradeVOMapper;
	
	@Autowired
	AddressMapper addressMapper;
	
	@Test
	public void studentVOTest() {
		System.out.println(getStudentById("12"));
		System.out.println(getStudentList());
	}
	
	@Test
	public void gradeVOTest() {
		System.err.println(getGradeById("12345"));
		System.out.println(getGradeList());
	}
	
	@Test
	public void test01() {
		StudentVO studentVO = new StudentVO();
		studentVO.setStudentName("小明");
		studentVO.setStudentAge(12);
		List<StudentVO> searcheResultList = studentVOMapper.getStudent(studentVO);
		if(searcheResultList.isEmpty()) {
			System.out.println("查无结果！！！！！！！！！！！");
		}
		for (StudentVO studentVO2 : searcheResultList) {
			System.out.println(studentVO2.getAddress().getAddressName());
			
		}
		
		List<String> deleteIdList = new ArrayList<>();
		deleteIdList.add("555");
		deleteIdList.add("66600");
		deleteIdList.add("aa455");
		addressMapper.deleteAddressListById(deleteIdList);
	}
	
	public StudentVO getStudentById(String studentId) {
		return studentVOMapper.getStudentById(studentId);
	}
	
	public List<StudentVO> getStudentList() {
		return studentVOMapper.getStudentList();
	}
	
	public GradeVO getGradeById(String gradeId) {
		return gradeVOMapper.getGradeById(gradeId);
	}
	
	public List<GradeVO> getGradeList() {
		return gradeVOMapper.getGradeList();
	}*/
}
