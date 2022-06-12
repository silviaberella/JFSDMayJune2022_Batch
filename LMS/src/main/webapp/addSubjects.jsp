<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.ph2.dto.Subject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add subject</title>
</head>
<body>
<p>
	 <h1><center>Administration of masterlist of subjects</h1></center>
	 <br>
	 <center> The masterlist in below table shows the subjects which are currently already available in the Learning Management System.</center>
 </p>
  	<!-- Get data from session object -->
  <%
	Set<Subject> allSubjects = (Set<Subject>)session.getAttribute("allSubjects");
	%>
	<!-- Display above data in table below with headers -->
	<center>
	<table border="1" style="background-color:rgb(104, 227, 225);">
	<tr>
		<th>Subject ID</th>
		<th>Subject Name</th>
	</tr>
	</center>
	<%
	for(Subject subject: allSubjects){
	%>
		<center>
		<tr>
			<td><%= subject.getSubjectId()%></td>
			<td><%= subject.getSubjectName()%></td>
		</tr>
		</center>
	<%
	}
	%>
	</table>
	</br>
	<center> <h3 style="background-color:rgb(210, 68, 119);"> For adding a subject please enter the Id and the name of this subject.</h3> </center>
		<!-- Definition of form for adding student -->
	<form action="SubjectServlet" method="post">
		Id: <input type="text" name="subjectId"/>
		Subject: <input type="text" name="subjectName"/><br/><br/>
		<input type="submit" value="AddSubject" name="subject"/>
		<input type="submit" value="Back" name="subject"/>
	</form>
</body>
</html>