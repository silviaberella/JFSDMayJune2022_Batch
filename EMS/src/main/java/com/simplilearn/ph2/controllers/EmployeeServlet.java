package com.simplilearn.ph2.controllers;

import java.io.IOException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.ph2.dto.Employee;
import com.simplilearn.ph2.service.EmployeeService;
import com.simplilearn.ph2.service.EmployeeServiceImpl;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("emp");
		//System.out.println(action);
		EmployeeService employeeService = new EmployeeServiceImpl();
		if (action.equals("Add Employee")) {
			
		} else if (action.equals("Delete Employee")) {
			
		} else {
			Set<Employee> allEmps = employeeService.getAllEmployees();
//			request.setAttribute("allEmployees", allEmps);
//			RequestDispatcher dispatcher = request.getRequestDispatcher("allEmps.jsp");
//			dispatcher.forward(request, response);
			
			HttpSession session = request.getSession();
			session.setAttribute("allEmployees", allEmps);
			response.sendRedirect("allEmps.jsp");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
