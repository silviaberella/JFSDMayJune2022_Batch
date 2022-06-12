package com.simplilearn.ph2.controllers;

//import required packages
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.ph2.dto.User;
import com.simplilearn.ph2.service.UserServiceImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("uname");
		String password = request.getParameter("pword");
		User user = new User(userName, password);
		boolean isUserValid = new UserServiceImpl().validateUser(user);
		
		
		if (isUserValid==true) {
			
			//if user is valid (this means it is the admin user) then its user informationn will be stored in session object
			HttpSession session = request.getSession();
			session.setAttribute("uname", userName);
			
			//Go to next screen, the main menu for the administrator
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		}else {
			
			// if user is not valid, so no admin, user stays on same login screen
			response.sendRedirect("index.jsp");			
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
