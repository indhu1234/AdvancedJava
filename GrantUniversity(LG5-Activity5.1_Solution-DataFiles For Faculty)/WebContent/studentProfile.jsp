<%@page import="com.grantuniversity.model.Student"%>
<%@ include file="header.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%-- <jsp:useBean id="student" class="com.grantuniversity.model.Student" scope="request"/> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>

<center><u><h1>Login Successfull!!! Welcome :: ${student.userid }</h1></u></center>
<a href="index.jsp">Logout</a>
<br>
<a href="view">Course Details</a>
<center><u><h2>Student Profile Form</h2></u>
<table style="border:1px red solid;">
<tbody>
<tr><td>First Name :</td><td> ${student.firstname }</td></tr>
<tr><td>Last Name : </td><td>${student.lastname }</td></tr>
<tr><td>Gender : </td><td> ${student.gender }</td></tr>
<tr><td>Date of Birth : </td><td>${student.dob }</td></tr>
<tr><td>Address : </td><td> ${student.studentAddress.streetNo },${student.studentAddress.lane },${student.studentAddress.city }</td></tr>
<tr><td>Email ID : </td><td> ${student.email }</td></tr>
<tr><td>Phone No : </td><td> ${student.phone }</td></tr>
</tbody>
</table>
</center>
</body>
</html>