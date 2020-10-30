package com.test.springmvc.dao;

import java.util.List;

import com.test.springmvc.beans.Student;

public interface StudentDao {

	public Integer save(Student student) throws Exception;

	public Boolean update(Student student) throws Exception;

	public Boolean delete(Student student) throws Exception;

	public Student findById(Integer id) throws Exception;

	public List<Student> findAll() throws Exception;
}
