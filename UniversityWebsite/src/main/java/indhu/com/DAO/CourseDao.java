package indhu.com.DAO;

import java.util.List;

import indhu.com.Model.Course;

public interface CourseDao 
{

	Course getCourseByName(String courseName);
	List<Course> getAllCourses();
	boolean addCourse(Course c);
}
