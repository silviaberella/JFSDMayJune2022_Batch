package com.simplilearn.ph2.controllers;

import java.io.IOException;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.ph2.dto.TrainingClass;
import com.simplilearn.ph2.dto.Student;
import com.simplilearn.ph2.dto.Subject;
import com.simplilearn.ph2.dto.Teacher;
import com.simplilearn.ph2.service.ClassService;
import com.simplilearn.ph2.service.ClassServiceImpl;
import com.simplilearn.ph2.service.StudentService;
import com.simplilearn.ph2.service.StudentServiceImpl;
import com.simplilearn.ph2.service.SubjectService;
import com.simplilearn.ph2.service.SubjectServiceImpl;
import com.simplilearn.ph2.service.TeacherService;
import com.simplilearn.ph2.service.TeacherServiceImpl;

public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("training");

		if (action.equals("Setup a master list of teachers")) {
			TeacherService teacherService = new TeacherServiceImpl();
			Set<Teacher> allTeacher = teacherService.getAllTeacher();
		
			HttpSession session = request.getSession();
			session.setAttribute("allTeacher", allTeacher);
			response.sendRedirect("addTeachers.jsp");
			
		} else if (action.equals("Setup a master list of subjects")) {
			SubjectService subjectService = new SubjectServiceImpl();
			Set<Subject> allSubjects = subjectService.getAllSubjects();
		
			HttpSession session = request.getSession();
			session.setAttribute("allSubjects", allSubjects);
			response.sendRedirect("addSubjects.jsp");
			
		} else if (action.equals("Get a master list of students")) {
			StudentService studentService = new StudentServiceImpl();
			Set<Student> allStudents = studentService.getAllStudents();
			HttpSession session = request.getSession();
			session.setAttribute("allStudents", allStudents);
			response.sendRedirect("allStudents.jsp");
			
		} else if (action.equals("Setup a master list of students")) {
			StudentService studentService = new StudentServiceImpl();
			Set<Student> allStudents = studentService.getAllStudents();
		
			HttpSession session = request.getSession();
			session.setAttribute("allStudents", allStudents);
			response.sendRedirect("addStudents.jsp");
			
		} else if (action.equals("Setup a master list of classes")) {
			
			ClassService classService = new ClassServiceImpl();
			Set<TrainingClass> allLiveClasses = classService.getAllClasses();
			
			HttpSession session = request.getSession();
			session.setAttribute("allLiveClasses", allLiveClasses);
			response.sendRedirect("addLiveClasses.jsp");
			
		} else if (action.equals("Assign classes to subjects")) {
			
			ClassService classService = new ClassServiceImpl();
			Set<TrainingClass> allLiveClasses = classService.getAllClasses();
			SubjectService subjectService = new SubjectServiceImpl();
			Set<Subject> allSubjects = subjectService.getAllSubjects();
			
			HttpSession session = request.getSession();
			session.setAttribute("allClassesForSubjects", allLiveClasses);
			session.setAttribute("allSubjectsForLiveClasses", allSubjects);
			response.sendRedirect("allClassesForSubjects.jsp");
	
		} else if (action.equals("Assign teachers to class")) {

			ClassService classService = new ClassServiceImpl();
			Set<TrainingClass> allLiveClasses = classService.getAllClasses();

			TeacherService teacherService = new TeacherServiceImpl();
			Set<Teacher> allTeachers = teacherService.getAllTeacher();

			HttpSession session = request.getSession();
			session.setAttribute("allClassesForTeachers", allLiveClasses);
			session.setAttribute("allTeachersForLiveClasses", allTeachers);
			response.sendRedirect("allTeachersForClasses.jsp");
		
		
		} else if (action.equals("Assign student to a class")) {
			
			ClassService classService = new ClassServiceImpl();
			Set<TrainingClass> allLiveClasses = classService.getAllClasses();

			StudentService studentService = new StudentServiceImpl();
			Set<Student> allStudents = studentService.getAllStudents();

			HttpSession session = request.getSession();
			session.setAttribute("allClassesForStudents", allLiveClasses);
			session.setAttribute("allStudentsForLiveClasses", allStudents);

			response.sendRedirect("allStudentsForClasses.jsp");
			
			
		} else if (action.equals("View TrainingClass Report")) { 
			ClassService classService = new ClassServiceImpl();
			Set<TrainingClass> allReportClasses = classService.getClassReport();
			HttpSession session = request.getSession();
			session.setAttribute("allReportClasses", allReportClasses);
			response.sendRedirect("allClasses.jsp");
		} else if (action.equals("Back")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		}else {
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
