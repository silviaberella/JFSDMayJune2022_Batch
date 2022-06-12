<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.ph2.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List all recorded students</title>
</head>
<body>
<p>
	 <h1><center>Get all students</h1></center>
	 <br>
	 <center> The below table shows all the students who are currently already available in the Learning Management System.</center>
 </p>
  <%
	Set<Student> allStudents = (Set<Student>)session.getAttribute("allStudents");
	%>
	<center>
	<table border="1" style="background-color:rgb(104, 227, 225);">
	<tr>
		<th>Student ID</th>
		<th>Student First Name</th>
		<th>Student Last Name</th>
	</tr>
	</center>
	<%
	for(Student student: allStudents){
	%>
		<center>
		<tr>
			<td><%= student.getStudentId()%></td>
			<td><%= student.getStudentFirstName()%></td>
			<td><%= student.getStudentLastName()%></td>
		</tr>
		</center>
	<%
	}
	%>
	</table>
	<center> <h3 style="background-color:rgb(210, 68, 119);"> For adding a student please enter the Id, the first name and the last name of this student.</h3> </center>
		<form action="AdminServlet" method="post">
		<input type="submit" value="Back" name="training"/>
	</form>
</body>
</html>