package com.test.springmvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.test.springmvc.beans.Student;
import com.test.springmvc.dao.StudentDao;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private DataSource ds;

	@Autowired
	private JdbcTemplate jt;

	public Integer save(Student student) throws Exception {
		/*
		 * Connection con = ds.getConnection(); PreparedStatement ps =
		 * con.prepareStatement("insert into student values(?,?,?,?)"); ps.setInt(1,
		 * student.getId()); ps.setNString(2, student.getName()); ps.setNString(3,
		 * student.getRollno()); ps.setNString(4, student.getCity()); Integer result =
		 * ps.executeUpdate(); con.close(); return result;
		 */
		String sql = "insert into student values(?,?,?,?)";
		Object[] params = { student.getId(), student.getName(), student.getRollno(), student.getCity() };
		Integer result = jt.update(sql, params);
		System.out.println("Result " + result);
		return result;
	}

	public Boolean update(Student student) throws Exception {
		jt.update("update student set sname= ? where id = ?", student.getName(), student.getId());
		return true;
	}

	public Boolean delete(Student student) throws Exception {
		String sql = "delete from student where id= ?";
		int result = jt.update(sql, student.getId());
		return result > 0;
	}

	public Student findById(Integer id) throws Exception {
		/*
		 * String sql = "select * from student where id= ?"; Student s =
		 * jt.queryForObject(sql, new Object[] { id }, new
		 * BeanPropertyRowMapper<Student>(Student.class)); return s;
		 */

		String sql = "select * from student where id= ?";
		Student s = jt.queryForObject(sql, this::mapRowToStudent, id);
		return s;
	}

	private Student mapRowToStudent(ResultSet rs, int rowNum) throws SQLException {

		return new Student(rs.getInt("id"), rs.getString("sname"), rs.getString("rollno"), rs.getNString("city"));
	}

	public List<Student> findAll() throws Exception {
		return jt.query("select * from student", new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setRollno(rs.getString(3));
				s.setCity(rs.getString(4));
				return s;
			}
		});
	}

}
