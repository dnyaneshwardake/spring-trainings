package com.test.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springmvc.beans.Student;
import com.test.springmvc.dao.StudentDao;
import com.test.springmvc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	public Integer addStudent(Student student) throws Exception {
		// 
		return studentDao.save(student);
		
		// send mail to student 
		// 
		
	}

	public Boolean updateStudent(Student student) throws Exception {
		
		return studentDao.update(student);
	}

	public Boolean deleteStudent(Student student) throws Exception {
		return studentDao.delete(student);
	}

	public Student getStudentById(Integer id) throws Exception {
		
		return studentDao.findById(id);
	}

	public List<Student> getAllStudents() throws Exception {
		
		return studentDao.findAll();
	}

}
