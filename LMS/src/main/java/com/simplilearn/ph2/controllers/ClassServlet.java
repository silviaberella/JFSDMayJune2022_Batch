package com.simplilearn.ph2.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.ph2.dto.TrainingClass;
import com.simplilearn.ph2.service.ClassService;
import com.simplilearn.ph2.service.ClassServiceImpl;

public class ClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClassServlet() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("liveClass");
		if (action.equals("AssignTeacherForSelectedClass")) {
					
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		
		}else if (action.equals("AddLiveClass")) {
			
			String liveClassId = request.getParameter("liveClassId");
			String liveClassName = request.getParameter("liveClassName");
			TrainingClass event = new TrainingClass(liveClassId, liveClassName);
			ClassService liveClassService = new ClassServiceImpl();
			boolean isLiveClassAdded = liveClassService.addClass(event);
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);

		} else if (action.equals("Back")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
