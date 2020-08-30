<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Wishing you... <c:out value="${wish.message }"></c:out>
<c:out value="${wish.bd.wish }"></c:out></h1>
<h1>Thank you...</h1>

</body>
</html>