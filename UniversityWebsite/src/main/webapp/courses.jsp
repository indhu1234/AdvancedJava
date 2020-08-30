
<%@ include file="header.jsp" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Course Informations</h1>
<table border="3">
<tr>
<th>Course Name</th>
<th> Duration</th>
<th>Fees</th>
</tr>
<c:forEach items="${allcourses}" var="all">
<tr>
<td><c:out value="${all.courseName }"></c:out></td>
<td><c:out value="${all.courseDuration }"></c:out></td>
<td><c:out value="${all.courseFee }"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>