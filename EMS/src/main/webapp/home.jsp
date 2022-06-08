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
	String userName = (String)session.getAttribute("uname");
	%>
	Hello <%=userName%>, Please select from below options:
	<!-- <a href="addEmployee.jsp">Add Employee</a>
	<a href="deleteEmployee.jsp">Delete Employee</a>
	<a href="allEmployees.jsp">Get All Employees</a> -->
	
	<form action="EmployeeServlet">
		<input type="submit" value="Add Employee" name="emp"/> <br/>
		<input type="submit" value="Delete Employee" name="emp"/> <br/>
		<input type="submit" value="Get All Employees" name="emp"/> <br/>
	</form>
</body>
</html>