<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.ph2.dto.TrainingClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report classes</title>
</head>
<body>
	<%
	Set<TrainingClass> reportClasses = (Set<TrainingClass>)session.getAttribute("allReportClasses");
	%>
	<center>
	<table border="1" style="background-color:rgb(104, 227, 225);">
	<center>
	<tr>
		<th>Class ID</th>
		<th>Class Name</th>
		<th>Subject ID</th>
		<th>Subject Name</th>
		<th>Teacher ID</th>
		<th>Teacher First Name</th>
		<th>Teacher Last Name</th>
		<th>Student ID</th>
		<th>Student First Name</th>
		<th>Student Last Name</th>
	</tr>
	</center>
	<%
	for(TrainingClass trainingEvent: reportClasses){
	%>
		<center>
		<tr>
			<td><%= trainingEvent.getClassId()%></td>
			<td><%= trainingEvent.getClassName()%></td>
			<td><%= trainingEvent.getSubjectId()%></td>
			<td><%= trainingEvent.getSubjectName()%></td>	
			<td><%= trainingEvent.getTeacherId()%></td>
			<td><%= trainingEvent.getTeacherFirstName()%></td>
			<td><%= trainingEvent.getTeacherLastName()%></td>
			<td><%= trainingEvent.getStudentId()%></td>
			<td><%= trainingEvent.getStudentFirstName()%></td>
			<td><%= trainingEvent.getStudentLastName()%></td>
		</tr>
		</center>
	<%
	}
	%>
	</table>
<br>
<form action="AdminServlet" method="post">
	<input type="submit" value="Back" name="training"/>
</form>
</body>
</html>