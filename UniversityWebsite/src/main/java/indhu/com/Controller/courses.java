package indhu.com.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import indhu.com.DAO.CourseDao;
import indhu.com.DAO.CourseDaoImpl;
import indhu.com.Model.Course;

/**
 * Servlet implementation class courses
 */
public class courses extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public courses() {
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
	CourseDao coursedao; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try{
			System.out.println("Getting all courses");
			coursedao=new CourseDaoImpl();
			List<Course> allCourses=new ArrayList<>();
			allCourses=coursedao.getAllCourses();
			System.out.println("listing all courses");
			request.setAttribute("allcourses", allCourses);
			RequestDispatcher rd=request.getRequestDispatcher("courses.jsp");
			
		
			ListIterator li=allCourses.listIterator();
			while(li.hasNext())
			System.out.println(li.next().toString());
			rd.forward(request, response);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Course servlet");
		String cname=request.getParameter("cName");
		String duration=request.getParameter("duration");
		String eligible=request.getParameter("eligible");
		String fees=request.getParameter("fees");
		double fee=Double.parseDouble(fees);
		System.out.println("Before course class");
		try {
		Course cr=new Course();
		cr.setCourseName(cname);
        cr.setCourseDuration(duration);		
        cr.setCourseEligiblity(eligible);
        cr.setCourseFee(fee);
        System.out.println("after setted course class");
        CourseDao coursedao=new CourseDaoImpl();
        System.out.println("calling add course()");
        if(coursedao.addCourse(cr))
        {
        	System.out.println("Course Added Successfully");	
        }
       
        
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
