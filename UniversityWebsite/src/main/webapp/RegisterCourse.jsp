<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="courses" method="post">
<table>
<tr>
<td>Enter Course Name 
</td>
<td><input type="text" name="cName" /></td>

</tr>
<tr>
<td>Enter Duration </td>
<td><input type="text" name="duration" /></td>

</tr>

<tr>
<td>Enter Eligibility </td>
<td><input type="text" name="eligible" /></td>
</tr>
<tr>
<td>Enter Fees </td>
<td><input type="text" name="fees" /></td>

</tr>
<tr>
<td><input type="submit" value="Save" /> </td>
</tr>


</table>
</form>
</body>
</html>