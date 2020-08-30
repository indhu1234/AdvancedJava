package indhu.com.Controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import indhu.com.DAO.RegisterDao;
import indhu.com.DAO.RegisterDaoImpl;
import indhu.com.Model.Address;
import indhu.com.Model.Student;

// @WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("Entering Servlet");
		String firstname;
		String lastname;
		String gender;
		String dob;
		String streetNo,lane,city,state,username;
		String phone;
		String email;
		String password;
		String zip;
		try {
			
			firstname = request.getParameter("fn");
			lastname = request.getParameter("ln");
			gender = request.getParameter("gender");
			dob = request.getParameter("dob");
			Date dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
			streetNo = request.getParameter("street");
			lane=request.getParameter("lane");
			city=request.getParameter("city");
			username=request.getParameter("user");
			zip=request.getParameter("zip");
			phone = request.getParameter("phone");
			email = request.getParameter("email");
			password = request.getParameter("password");
			RegisterDao rdao = new RegisterDaoImpl();
			Student s = new Student();
			Address addr=new Address();
			addr.setCity(city);
			addr.setLane(lane);
			
			addr.setStreet(streetNo);
			addr.setZip(zip);
			
			s.setFirstName(firstname);
			s.setLastName(lastname);
			s.setGender(gender);
			s.setDob(dateOfBirth);
			s.setStudAddr(addr);
			s.setPhone(phone);
			s.setEmail(email);
			s.setUserName(username);
			s.setPassword(password);
			System.out.println("Collected Datas");
			if (rdao.register(s)) {
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
				rd.forward(request, response);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

	}
	}
 }


