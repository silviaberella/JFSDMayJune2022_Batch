<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administration of trainings</title>
</head>
<body>
<p>
	 <center><h1 style="background-color:rgb(104, 227, 225);">Administration Menu</h1></center>
 </p>
	<%
	String userName = (String)session.getAttribute("uname");
	%>
	<center>Hello <%=userName%>, please select from below options:</center>
	
	<!-- <a href="addTeacher.jsp">Add Teacher</a>
	<a href="addSubject.jsp">Add Subject</a>
	<a href="addStudent.jsp">Add Student</a>
	<a href="addClass.jsp">Add Class</a>
	<a href="allClassDetails.jsp">Class Report</a> -->

	<center>
	<form action="AdminServlet">
		<br>
		<input type="submit" value="Setup a master list of teachers" name="training"/> <br/>
		<input type="submit" value="Setup a master list of subjects" name="training"/> <br/>
		<input type="submit" value="Get a master list of students" name="training"/> <br/>
		<input type="submit" value="Setup a master list of students" name="training"/> <br/>
		<input type="submit" value="Setup a master list of classes" name="training"/> <br/>
		<input type="submit" value="Assign classes to subjects" name="training"/> <br/>
		<input type="submit" value="Assign teachers to class" name="training"/> <br/>	
		<input type="submit" value="Assign student to a class" name="training"/> <br/>
		<input type="submit" value="View TrainingClass Report" name="training"/> <br/>
	</form>
	</center>
</body>
</html>