package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDao;
import dao.impl.RegisterDaoImpl;
import model.AddressTable;
import model.StudentTable;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
			
			RegisterDao rdao = new RegisterDaoImpl();
			
			StudentTable s = new StudentTable();
			AddressTable addr=new AddressTable();
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
			if (rdao.register(s)) {
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
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
