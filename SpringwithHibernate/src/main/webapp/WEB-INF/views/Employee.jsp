<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="menu.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Register Employee Details</h2>
<form:form action="insertemployee" method="post" modelAttribute="employee">
<pre>
Enter Employee Name : <form:input type="text" path="name" />
<form:errors path="name" cssStyle="color:black"/>
Enter Employee Salary : <form:input type="text" path="salary" />
<input type="submit" value="Register">
</pre>

</form:form>
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
<td><a href="<c:url value="deleteemp/${l.id}" />">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>