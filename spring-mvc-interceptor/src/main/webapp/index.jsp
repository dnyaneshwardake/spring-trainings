<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
	<h2>Spring MVC Validations</h2>
	<form:errors path="std.*" />
	<form action="addstudent">
		ID: <input type="text" name="id">
		<p>
			Name: <input type="text" name="name"/>
		<p>
			Roll No: <input type="text" name="rollno" />
		<p>
			Email: <input type="text" name="email">
		<p>
		Hobby: <input type="text" name="hobby"><p>
			<input type="submit" value="addStudent">
	</form>

</body>
</html>
</html>