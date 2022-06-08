<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.ph2.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Set<Employee> emps = (Set<Employee>)session.getAttribute("allEmployees");
	%>
	<table border="3">
	<tr>
		<th>Emp ID</th>
		<th>Emp Name</th>
		<th>Designation</th>
	</tr>
	<%
	for(Employee employee: emps){
	%>
		<tr>
			<td><%= employee.getEmpId()%></td>
			<td><%= employee.getEmpName()%></td>
			<td><%= employee.getDesignation() %></td>
		</tr>
	<%
	}
	%>
	</table>
</body>
</html>