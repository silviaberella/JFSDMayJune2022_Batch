<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.ph2.dto.TrainingClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
	 <h1><center>Administration of masterlist of live training classes.</h1></center>
	 <br>
	 <center> The masterlist in below table shows the live classes which are currently already available in the Learning Management System.</center>
 </p>
 	<!-- Get data from session object -->
  <%
	Set<TrainingClass> allTrainingClasses = (Set<TrainingClass>)session.getAttribute("allLiveClasses");
	%>
	<!-- Display above data in table below with headers -->
	<center>
	<table border="1" style="background-color:rgb(104, 227, 225);">
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
 	<center> <h3 style="background-color:rgb(210, 68, 119);"> For adding a teacher please enter the Id and the name of this live class.</h3> </center>	
 	<!-- Definition of form for adding live class -->
	<form action="ClassServlet" method="post">
		Id: <input type="text" name="liveClassId"/>
		Live Class Name: <input type="text" name="liveClassName"/><br/><br/>
		<input type="submit" value="AddLiveClass" name="liveClass"/>
		<input type="submit" value="Back" name="liveClass"/>
	</form>

	
</body>
</html>