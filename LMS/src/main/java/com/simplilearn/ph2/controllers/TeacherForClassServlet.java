package com.simplilearn.ph2.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.simplilearn.ph2.dto.TeacherToClass;
import com.simplilearn.ph2.service.TeacherForClassService;
import com.simplilearn.ph2.service.TeacherForClassServiceImpl;


public class TeacherForClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TeacherForClassServlet() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("teacherToClass");
		if (action.equals("AssignTeacherToClass")) {

			String teacherId = request.getParameter("teacherId");
			String liveClassId = request.getParameter("liveClassId");

			TeacherToClass teacherToClass = new TeacherToClass(liveClassId, teacherId);
			TeacherForClassService teacherForClassService = new TeacherForClassServiceImpl();
			boolean isTeacherToClassAdded = teacherForClassService.addTeacherToClass(teacherToClass);

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
