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
<h1>Register Page</h1>
<form action="Register" method="post">
<pre>
Enter Student First Name : <input type="text" name="fn" />
Enter Student Last Name : <input type="text" name="ln" />
Enter Street : <input type="text" name="street" />
Enter Lane : <input type="text" name="lane" />
Enter City : <input type="text" name="city" />
Enter Zip Code : <input type="text" name="zip" />
Enter Student email : <input type="email" name="email" />
Enter phone : <input type="text" name="phone" />
Enter Date of birth : <input type="text" name="dob" />
Enter username : <input type="text" name="user" />
Enter Password : <input type="password" name="password" />
Enter the Gender : <input type="text" name="gender" />

<input type="submit" value="Register">

</pre>

</form>
</body>
</html>