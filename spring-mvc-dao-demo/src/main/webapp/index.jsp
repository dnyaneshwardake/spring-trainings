<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success page</title>
</head>
<body>
	<h2>Spring JDBC</h2>
	<form:errors path="std.*" />
	<form action="addstudent">
		ID: <input type="text" name="id">
		<p>
			Name: <input type="text" name="name" />
		<p>
			Roll No: <input type="text" name="rollno" />
		<p>
			City: <input type="text" name="city">
		<p>
			<input type="submit" value="addStudent">
	</form>

	<a href="./updatestudent.jsp">Update Student Name</a>
	<p>
		<a href="./findstudent.jsp">Find Student</a>
	<p>
		<a href="./findallstudents">Get all Students</a>
</body>
</html>
</html>