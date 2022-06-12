<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.ph2.dto.Teacher"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add teacher</title>
</head>
<body>
<p>
	 <h1><center>Administration of masterlist of teachers</h1></center>
	 <br>
	 <center> The masterlist in below table shows the teachers who are currently already available in the Learning Management System.</center>
 </p>
  <%
	Set<Teacher> allTeacher = (Set<Teacher>)session.getAttribute("allTeacher");
	%>
	<center>
	<table border="1" style="background-color:rgb(104, 227, 225);">
	<tr>
		<th>Teacher ID</th>
		<th>Teacher First Name</th>
		<th>Teacher Last Name</th>
	</tr>
	</center>
	<%
	for(Teacher teacher: allTeacher){
	%>
		<center>
		<tr>
			<td><%= teacher.getTeacherId()%></td>
			<td><%= teacher.getTeacherFirstName()%></td>
			<td><%= teacher.getTeacherLastName()%></td>
		</tr>
		</center>
	<%
	}
	%>
	<br>
	</table>
 	<center> <h3 style="background-color:rgb(210, 68, 119);"> For adding a teacher please enter the Id, the first name and the last name of this teacher.</h3> </center>
	<form action="TeacherServlet" method="post">
		Id: <input type="text" name="teacherId"/>
		First name: <input type="text" name="teacherFirstName"/>
		Last name: <input type="text" name="teacherLastName"/><br/><br/>
		<input type="submit" value="AddTeacher" name="teacher"/>
		<input type="submit" value="Back" name="teacher"/>
	</form>
</body>
</html>