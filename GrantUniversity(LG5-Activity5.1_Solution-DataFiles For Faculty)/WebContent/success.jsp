<%@ include file="header.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body><br><br><br><br><br><br>
<h1>Welcome ${student.firstname} ${student.lastname } </h1><br><br><br>
<h2>You have successfully registered with our website</h2>
<h2>Your User ID is: ${student.userid }</h2>
<a href="index.jsp">Home</a>

</body>
</html>