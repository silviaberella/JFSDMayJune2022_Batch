<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.ph2.dto.Subject"%>
<%@page import="com.simplilearn.ph2.dto.TrainingClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment of Classes for Subjects</title>
</head>
<body>
<p>
	 <h1><center>All available live classes with its subjects</h1></center>
	 <br>
	 <center> The first below table shows all the live classes which are currently already available in the Learning Management System.</center>
 </p>
  <%
	Set<TrainingClass> allTrainingClasses = (Set<TrainingClass>)session.getAttribute("allClassesForSubjects");
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
<center> The second below table shows all the subjects which are currently already available in the Learning Management System.</center>
</p>
	
  <%
	Set<Subject> allSubjects = (Set<Subject>)session.getAttribute("allSubjectsForLiveClasses");
	%>
	<table border="1">
	<tr>
		<th>Subject ID</th>
		<th>Subject Name</th>
	</tr>
	<%
	for(Subject subject: allSubjects){
	%>
		<tr>
			<td><%= subject.getSubjectId()%></td>
			<td><%= subject.getSubjectName()%></td>
		</tr>
	<%
	}
	%>
	</table>
	</br>
	<center> <h3 style="background-color:rgb(210, 68, 119);"> 	Please select the class and the subject which you would like to assign to each other:</h3> </center>
	
	<form action="ClassForSubjectServlet">
		Live Class Id: <input type="text" name="liveClassId"/>
		Live Class Name: <input type="text" name="liveClassName"/>
		Subject Id: <input type="text" name="subjectId"/>
		Subject Name: <input type="text" name="subjectName"/><br/><br/>
		<input type="submit" value="AssignClassForSubject" name="classForSubject"/>
		<input type="submit" value="Back" name="classForSubject"/>
	</form>
</body>
</html>