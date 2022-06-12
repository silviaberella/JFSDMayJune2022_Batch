package com.simplilearn.ph2.controllers;

//import required packages
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.ph2.dto.StudentToClass;
import com.simplilearn.ph2.service.StudentForClassService;
import com.simplilearn.ph2.service.StudentForClassServiceImpl;


public class StudentForClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public StudentForClassServlet() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("studentToClass");

		if (action.equals("AssignStudentToClass")) {

			String studentId = request.getParameter("studentId");
			String liveClassId = request.getParameter("liveClassId");
			
			//generate new entity for live classs with its student
			StudentToClass studentToClass = new StudentToClass(liveClassId, studentId);
			StudentForClassService studentForClassService = new StudentForClassServiceImpl();
			
			//add live class with its assigned student
			boolean isStudentToClassAdded = studentForClassService.addStudentToClass(studentToClass);

			//Go to next screen, the main menu for the administrator
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
			
		}else if (action.equals("Back")) {
			
			// if user would like to go one screen back
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
