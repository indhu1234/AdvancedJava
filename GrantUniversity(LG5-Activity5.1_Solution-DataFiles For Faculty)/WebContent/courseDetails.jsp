<%@ include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course Details</title>
</head>
<body>

	<div allign="center">
		
			<br />
			<br />
			<br />
			<br />
			<br />
			<br /><a href="index.jsp">Logout</a><center>
			<form action="view" method="post">
				Select a Course:&nbsp; <select name="coursename">
					<c:forEach items="${allCourses}" var="course">
						<option value="${course.courseName}">
							${course.courseName}</option>
					</c:forEach>
				</select> <input type="submit" value="View" />
			</form>
			<br />
			<br />
			<table style="border: 3px red solid;">
				<tr>
					<td>Course Name</td>
					<td>:</td>
					<td>${course.courseName }</td>
				</tr>
				<tr>
					<td>Course Duration</td>
					<td>:</td>
					<td>${course.courseDuration } Months</td>
				</tr>
				<tr>
					<td>Course Eligiblity</td>
					<td>:</td>
					<td>${course.courseEligiblity }</td>
				</tr>
				<tr>
					<td>Course Fees</td>
					<td>:</td>
					<td>Rs. ${course.courseFee } /-</td>
				</tr>
			</table>
		</center>
	</div>
</body>
</html>