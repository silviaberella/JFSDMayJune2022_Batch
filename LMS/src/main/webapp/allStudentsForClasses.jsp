<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.ph2.dto.Student"%>
<%@page import="com.simplilearn.ph2.dto.TrainingClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment of Classes for Students</title>
</head>
<body>
<p>
	 <h1><center>All available live classes with its students</h1></center>
	 <br>
	 <center> The first below table shows all the live classes which are currently already available in the Learning Management System.</center>
 </p>
  <%
	Set<TrainingClass> allTrainingClasses = (Set<TrainingClass>)session.getAttribute("allClassesForStudents");
	%>
	<center>
	<table border="1">
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
<center> The second below table shows all the students who are currently already available in the Learning Management System.</center>
</p>
  <%
	Set<Student> allStudents = (Set<Student>)session.getAttribute("allStudentsForLiveClasses");
	%>
	<center>
	<table border="1">
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
	</br>
	<center> <h3 style="background-color:rgb(210, 68, 119);"> Please select the class and the student which you would like to assign to each other:</h3> </center>
	<form action="StudentForClassServlet">
		Live Class Id: <input type="text" name="liveClassId"/>
		Live Class Name: <input type="text" name="liveClassName"/>
		Student Id: <input type="text" name="studentId"/>
	    Student First Name: <input type="text" name="studentFirstName"/><br/><br/>
	    Student Last Name: <input type="text" name="studentLastName"/><br/><br/>
		<input type="submit" value="AssignStudentToClass" name="studentToClass"/>
		<input type="submit" value="Back" name="studentToClass"/>
	</form>
</body>
</html>