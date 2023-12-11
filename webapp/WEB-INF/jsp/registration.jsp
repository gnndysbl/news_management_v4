<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration</h1>
	<form action="controller" method="post">
		<input type="hidden" name="command" value="add_user" /> 
		Enter login: (3-16 characters)<br />
		<input type="text" name="login" required="required" pattern="\w{3,16}" required /> <br />
		Enter password:<br /> 
		<input type="password" name="password" minlength="8" required /> <br />
		Enter name:<br /> 
		<input type="text"	name="name" required="required" /> <br />
		Enter lastName:<br /> 
		<input type="text" name="lastName" required="required" /> <br />
		Enter e-mail address:<br />
		<input type="email" name="email" required="required" /> <br /> 
		
		<input type="submit" value="Register" />
	</form>
	<%
	if (request.getAttribute("error") != null) {
	%>
	<p style="color: Red;"><%=request.getAttribute("error")%></p>
	<%
	} else {
	%>
	<p>
		<br />
	</p>
	<%
	}
	%>

	<br /> back to the
	<a href="index.jsp">main page</a>
</body>
</html>