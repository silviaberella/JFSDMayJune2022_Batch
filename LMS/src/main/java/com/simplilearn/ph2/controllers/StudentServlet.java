package com.simplilearn.ph2.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.ph2.dto.Student;
import com.simplilearn.ph2.service.StudentService;
import com.simplilearn.ph2.service.StudentServiceImpl;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("student");

		if (action.equals("AddStudent")) {
		
			String studentId = request.getParameter("studentId");
			String studentFirstName = request.getParameter("studentFirstName");
			String studentLastName = request.getParameter("studentLastName");
			Student student = new Student(studentId, studentFirstName, studentLastName);

			StudentService studentService = new StudentServiceImpl();
			boolean isStudentAdded = studentService.addStudent(student);
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		
		}else if(action.equals("Back")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
