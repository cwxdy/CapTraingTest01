package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Address;
import com.example.demo.bean.Grade;
import com.example.demo.bean.Student;
import com.example.demo.dao.AddressMapper;
import com.example.demo.dao.GradeMapper;
import com.example.demo.dao.StudentMapper;
import com.example.demo.service.StudentService;

//@RestController
@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private AddressMapper addressMapper;
	
	@Autowired
	private GradeMapper gradeMapper;
	
	/*@RequestMapping(value = "/getStudentList", method = RequestMethod.GET)
	public List<Student> getStudentList() {
		return studentService.getStudentService();
	}
	
	@RequestMapping(value = "/getStudent", method = RequestMethod.GET)
	public Student getStudent(String studentId) {
		return studentMapper.getStudentById(studentId);
	}
	
	@RequestMapping(value = "/addStudent")
	public void addStudent(Student student) {
		studentMapper.addStudent(student);
	}*/
	
	/**
	 *  获取学生列表， 条件可选
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@GetMapping("/studentList")
	public String getStudentList(HttpServletRequest request, HttpServletResponse response, Model model) {
		String studentName = request.getParameter("name");
		int studentAge;
		if (request.getParameter("age") == null || "".equals(request.getParameter("age"))){
			studentAge = 0;
		} else {
			studentAge = Integer.parseInt(request.getParameter("age"));
		}
		Student student = new Student();
		student.setStudentName(studentName);
		student.setStudentAge(studentAge);
		List<Student> studentList = studentMapper.getStudent(student);
		model.addAttribute("studentList", studentList);
		return "student";
	}
	
	/**
	 * 删除学生
	 * @param studentId
	 * @return
	 */
	@DeleteMapping("/student/{studentId}")
	@Transactional
	public String deleteStudentById(@PathVariable("studentId")String studentId) {
		Student student = studentMapper.getStudentById(studentId);
		String addressId = student.getAddress().getAddressId();
		addressMapper.deleteAddressById(addressId);
		studentMapper.deleteStudentById(studentId);
		return "redirect:/studentList";
	}
	
	/**
	 * 跳转到修改页面
	 * @param studentId
	 * @param model
	 * @return
	 */
	@GetMapping(value="/student/{studentId}")
	public String update(@PathVariable("studentId")String studentId, Model model) {
		Student student = studentMapper.getStudentById(studentId);
		List<Grade> gradeList = gradeMapper.getGradeList();
		for (Grade grade : gradeList) {
			grade.getStudents().clear();
		}
		model.addAttribute("student", student);
		model.addAttribute("gradeList", gradeList);
		return "inputStudent";
	}
	
	/**
	 * 修改学生
	 * @param student
	 * @return
	 */
	@PutMapping("/student")
	public String update(Student student) {
		String addressName = student.getAddress().getAddressName();
		Address address = addressMapper.getAddressByName(addressName);
		// 若新的地址在地址表中不存在，则自动添加到地址表中
		if(address == null) {
			UUID uuid = UUID.randomUUID();
			String addressId = uuid.toString();
			address = new Address();
			address.setAddressId(addressId);
			address.setAddressName(addressName);
			addressMapper.addAddress(address);	
		}
		student.setAddress(address);
		studentMapper.updateStudent(student);
		return "redirect:/studentList";
	}
	
	/**
	 * 跳转到添加页面
	 * @param model
	 * @return
	 */
	@GetMapping(value="/student")
	public String save(Model model) {
		Student student = new Student();
		List<Grade> gradeList = gradeMapper.getGradeList();
		for (Grade grade : gradeList) {
			grade.getStudents().clear();
		}
		model.addAttribute("student", student);
		model.addAttribute("gradeList", gradeList);
		return "inputStudent";
	}
	
	/**
	 * 添加学生
	 */
	@PostMapping("/student")
	public String save(Student student) {
		String addressName = student.getAddress().getAddressName();
		Address address = addressMapper.getAddressByName(addressName);
		// 若新的地址在地址表中不存在，则自动添加到地址表中
		if(address == null) {
			UUID uuAddressId = UUID.randomUUID();
			String addressId = uuAddressId.toString();
			address = new Address();
			address.setAddressId(addressId);
			address.setAddressName(addressName);
			addressMapper.addAddress(address);	
		}
		UUID uuStudentId = UUID.randomUUID();
		student.setStudentId(uuStudentId.toString());
		student.setAddress(address);
		studentMapper.addStudent(student);
		return "redirect:/studentList";
	}
	
}
