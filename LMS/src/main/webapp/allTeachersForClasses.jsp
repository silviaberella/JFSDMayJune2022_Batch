<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.ph2.dto.Teacher"%>
<%@page import="com.simplilearn.ph2.dto.TrainingClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment of Classes for Teachers</title>
</head>
<body>
<p>
	 <h1><center>All available live classes with its teachers</h1></center>
	 <br>
	 <center> The first below table shows all the live classes which are currently already available in the Learning Management System.</center>
 </p>
  <%
	Set<TrainingClass> allTrainingClasses = (Set<TrainingClass>)session.getAttribute("allClassesForTeachers");
	%>
	<center>
	<table border="3">
	<tr>
		<th>Live Class ID</th>
		<th>Live Class Name</th>
	</tr>
	</center>
	<%
	for(TrainingClass trainingClass: allTrainingClasses){
	%>
		<center>
		<tr>
			<td><%= trainingClass.getLive_class_id()%></td>
			<td><%= trainingClass.getLive_class_name()%></td>
		</tr>
		</center>
	<%
	}
	%>
	</table>
	</br>
<p>
<center> The second below table shows all the teachers who are currently already available in the Learning Management System.</center>
</p>
  <%
	Set<Teacher> allTeachers = (Set<Teacher>)session.getAttribute("allTeachersForLiveClasses");
	%>
	<center>
	<table border="1">
	<tr>
		<th>Teacher ID</th>
		<th>Teacher First Name</th>
		<th>Teacher Last Name</th>
	</tr>
	</center>
	<%
	for(Teacher teacher: allTeachers){
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
	</table>
	</br>
<center> <h3 style="background-color:rgb(210, 68, 119);">Please select the class and the teacher which you would like to assign to each other::</h3> </center>	
	<form action="TeacherForClassServlet">
		Live Class Id: <input type="text" name="liveClassId"/>
		Live Class Name: <input type="text" name="liveClassName"/>
		Teacher Id: <input type="text" name="teacherId"/>
	    Teacher First Name: <input type="text" name="teacherFirstName"/><br/><br/>
	    Teacher Last Name: <input type="text" name="teacherLastName"/><br/><br/>
		<input type="submit" value="AssignTeacherToClass" name="teacherToClass"/>
		<input type="submit" value="Back" name="teacherToClass"/>
	</form>
</body>
</html>