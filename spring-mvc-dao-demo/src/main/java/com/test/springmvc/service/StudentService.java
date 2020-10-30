package com.test.springmvc.service;

import java.util.List;

import com.test.springmvc.beans.Student;

public interface StudentService {

	public Integer addStudent(Student student) throws Exception;

	public Boolean updateStudent(Student student) throws Exception;

	public Boolean deleteStudent(Student student) throws Exception;

	public Student getStudentById(Integer id) throws Exception;

	public List<Student> getAllStudents() throws Exception;

}
