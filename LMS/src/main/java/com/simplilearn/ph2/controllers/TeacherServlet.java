package com.simplilearn.ph2.controllers;

//import required packages
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.simplilearn.ph2.dto.Teacher;
import com.simplilearn.ph2.service.TeacherService;
import com.simplilearn.ph2.service.TeacherServiceImpl;


public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TeacherServlet() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("teacher");

		if (action.equals("AddTeacher")) {
				
			String teacherId = request.getParameter("teacherId");
			String teacherFirstName = request.getParameter("teacherFirstName");
			String teacherLastName = request.getParameter("teacherLastName");
			Teacher teacher = new Teacher(teacherId, teacherFirstName, teacherLastName);

			TeacherService teacherService = new TeacherServiceImpl();
			boolean isTeacherAdded = teacherService.addTeacher(teacher);

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
