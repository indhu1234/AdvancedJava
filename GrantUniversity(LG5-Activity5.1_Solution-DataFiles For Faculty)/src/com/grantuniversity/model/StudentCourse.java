package com.grantuniversity.model;

import java.io.Serializable;

public class StudentCourse implements Serializable{
	
	private int registrationNo;
	private int courseId;
	
	public StudentCourse() {
		
	}

	public int getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(int registrationNo) {
		this.registrationNo = registrationNo;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	

}
