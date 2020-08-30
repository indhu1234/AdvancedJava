package com.grantuniversity.dao;

import java.util.List;

import com.grantuniversity.model.Course;

public interface CourseDao {

	Course getCourseByName(String courseName);
	List<Course> getAllCourses();
}
