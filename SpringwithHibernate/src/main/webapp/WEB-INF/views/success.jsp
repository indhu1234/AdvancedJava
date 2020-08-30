<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <jsp:include page="menu.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Successfully deleted</h1>
<table border="3">
<tr>
<th>Employee ID</th>
<th>Employee Name </th>
<th>Employee Salary</th>
</tr>
<c:forEach items="${lists }" var="l">
<tr>
<td><c:out value="${l.id }" /></td>
<td><c:out value="${l.name }" /></td>
<td><c:out value="${l.salary }" /></td>
<td><a href="<c:url value="deleteemp/${l.id}"></c:url>" >Delete</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>