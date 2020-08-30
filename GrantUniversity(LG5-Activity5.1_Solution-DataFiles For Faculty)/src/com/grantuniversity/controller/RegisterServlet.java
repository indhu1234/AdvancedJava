package com.grantuniversity.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grantuniversity.dao.CourseDao;
import com.grantuniversity.dao.RegisterDao;
import com.grantuniversity.dao.impl.CourseDaoImpl;
import com.grantuniversity.dao.impl.RegisterDaoImpl;
import com.grantuniversity.model.Address;
import com.grantuniversity.model.Course;
import com.grantuniversity.model.Student;
import com.grantuniversity.model.StudentCourse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
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
			RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
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
		String userid;
		String firstname;
		String lastname;
		String gender;
		String dob;
		String streetNo,lane,city,state;
		String phone;
		String email;
		String password;
		int courseId;
		int zip;
		try {
			userid = request.getParameter("userid");
			firstname = request.getParameter("fname");
			lastname = request.getParameter("lname");
			gender = request.getParameter("gender");
			dob = request.getParameter("dob");
			Date dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
			streetNo = request.getParameter("streetno");
			lane=request.getParameter("lane");
			city=request.getParameter("city");
			state=request.getParameter("state");
			zip=Integer.parseInt(request.getParameter("zip"));
			phone = request.getParameter("phone");
			email = request.getParameter("email");
			password = request.getParameter("password");
			courseId=Integer.parseInt(request.getParameter("courseid"));
			RegisterDao rdao = new RegisterDaoImpl();
			Student s = new Student();
			Address addr=new Address();
			StudentCourse studentCourse=new StudentCourse();
			studentCourse.setCourseId(courseId);
			addr.setCity(city);
			addr.setLane(lane);
			addr.setState(state);
			addr.setStreetNo(streetNo);
			addr.setZipCode(zip);
			s.setUserid(userid);
			s.setFirstname(firstname);
			s.setLastname(lastname);
			s.setGender(gender);
			s.setDob(dateOfBirth);
			s.setStudentAddress(addr);
			s.setPhone(phone);
			s.setEmail(email);
			s.setPassword(password);
			s.setStudentCourse(studentCourse);
			if (rdao.register(s)) {
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
				request.setAttribute("student", s);
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
