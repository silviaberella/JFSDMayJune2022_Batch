package com.simplilearn.ph2.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.ph2.dto.Subject;
import com.simplilearn.ph2.service.SubjectService;
import com.simplilearn.ph2.service.SubjectServiceImpl;

public class SubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SubjectServlet() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("subject");

		if (action.equals("AddSubject")) {
			String subjectId = request.getParameter("subjectId");
			String subjectName = request.getParameter("subjectName");
			Subject subject = new Subject(subjectId, subjectName);

			SubjectService subjectService = new SubjectServiceImpl();
			boolean isSubjectAdded = subjectService.addSubject(subject);
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);

		}else if (action.equals("Back")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
