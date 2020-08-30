package com.grantuniversity.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grantuniversity.dao.CourseDao;
import com.grantuniversity.dao.impl.CourseDaoImpl;
import com.grantuniversity.model.Course;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("/view")
public class CourseServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CourseServlet() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	CourseDao courseDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
			courseDao=new CourseDaoImpl();
			List<Course> allCourses=courseDao.getAllCourses();
			RequestDispatcher rd=request.getRequestDispatcher("courseDetails.jsp");
			request.setAttribute("allCourses", allCourses);
			rd.forward(request, response);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
			
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 String courseName = request.getParameter("coursename");
		 
		 try{
				courseDao=new CourseDaoImpl();
				Course course=courseDao.getCourseByName(courseName);
				RequestDispatcher rd=request.getRequestDispatcher("courseDetails.jsp");
				request.setAttribute("course", course);
				List<Course> allCourses=courseDao.getAllCourses();
				request.setAttribute("allCourses", allCourses);
				rd.include(request, response);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
	}

	
}
