package com.simplilearn.ph2.controllers;

//import required packages
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.ph2.dto.ClassForSubject;
import com.simplilearn.ph2.service.ClassForSubjectService;
import com.simplilearn.ph2.service.ClassForSubjectServiceImpl;


public class ClassForSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ClassForSubjectServlet() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("classForSubject");
		
		if (action.equals("AssignClassForSubject")) {
		
			String subjectId = request.getParameter("subjectId");
			String liveClassId = request.getParameter("liveClassId");
			
			//generate new entity for live classs with its subject
			ClassForSubject classForSubject = new ClassForSubject(liveClassId, subjectId);
			ClassForSubjectService classForSubjectService = new ClassForSubjectServiceImpl();
			
			//add live class with its assigned subject
			boolean isClassForSubjectAdded = classForSubjectService.addClassForSubject(classForSubject);
			
			//after adding above information user goes back to main admin menu
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
