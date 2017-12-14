<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${session.invalidate()}



	<form:form action="login.htm" modelAttribute="user" id="user">


		<center>

			<h1>User Login Page</h1>


			<form:input path="userName" name="userName"
				placeholder="Enter User Name" id="userName"></form:input>
			<br> <br>

			<form:input path="userPwd" name="userPwd"
				placeholder="Enter Password" id="userPwd"></form:input>
			<br> <br>
			<div style="color: red">${error}</div>

			<input type="submit">


		</center>

	</form:form>
</body>
</html>