<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#submit").click(function(){
	 var username = $('#userName').val();  
	 var userpwd = $('#userPwd').val();
	
	 $.ajax({  
	     type : "GET",   
	     url : "loginjson",
	    headers:{
        "Accept":"application/json"
	    },
	     data : "username=" + username + "&userpwd=" + userpwd,  
	    
	     success : function(response) {  
	      console.log(JSON.stringify(response));   
	     },  
	     error : function(e) {  
	      console.log("Error :"+e);
	     }  
	    });  
	});
});

</script>
</head>
<body>

	<%-- <form:form action="loginjson.htm" modelAttribute="user" id="user">


		<center>

			<h1>User Login Page</h1>


			<form:input path="userName" name="userName"
				placeholder="Enter User Name" id="userName"></form:input>
			<br> <br>

			<form:input path="userPwd" name="userPwd"
				placeholder="Enter Password" id="userPwd"></form:input>
			<br> <br>
			<div style="color: red">${error}</div>

			<input type="submit" id="submit">


		</center>

	</form:form> --%>
	
	<center>

			<h1>User Login Page</h1>


			<input  name="userName" id="userName"></input>
			<br> <br>

			<input name="userPwd" id="userPwd"></input>
			<br> <br>
			<div style="color: red">${error}</div>

			<input type="submit" id="submit">


		</center>
	
	
</body>
</html>