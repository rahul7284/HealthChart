<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<form:form action="userdetails.htm" modelAttribute="user" id="user">

		
	<center>
		<h1>HealthMeasures</h1>
		<h1>User Details</h1>


		<form:input path="firstName" name="firstName"
			placeholder="Enter First Name" id="firstName"></form:input>
		<br>
		<br>

		<form:input path="lastName" name="lastName"
			placeholder="Enter last Name" id="lastName"></form:input>
		<br>
		<br>

		<form:input path="email" name="email"
			placeholder="Enter Email Address" id="email"></form:input>
		<br>
		<br>

		<form:input path="mobileNumber" name="mobileNumber"
			placeholder="Enter Mobile Number" id="mobileNumber"></form:input>
		<br>
		<br>

		<form:input path="userName" name="userName"
			placeholder="Enter User Name" id="userName"></form:input>
		<br>
		<br>

		<form:input path="userPwd" name="userPwd" placeholder="Enter Password"
			id="userPwd"></form:input>
		<br>
		<br>
		<!-- Blood Test -->
		 <form:input path="cbcList[0].rbcValue" name="cbcList.rbcValue"
			placeholder="Enter RBC Value" id="rbcValue" ></form:input>
		<br>
		<br>

		<form:input path="cbcList[0].wbcValue" name="cbcList.wbcValue"
			placeholder="Enter WBC Value" id="wbcValue"></form:input>
		<br>
		<br>
 
		<form:input path="cbcList[0].plateletsValue" name="cbcList.plateletsValue"
			placeholder="Enter Platelets Value" id="plateletsValue"></form:input>
		<br>
		<br>

		<form:input path="cbcList[0].hemaglobinValue" name="cbcList.hemaglobinValue"
			placeholder="Enter Haemaglobin Value" id="hemaglobinValue"></form:input>
		
		
		
		<br>
		<br>

		<!--Sugar Test  -->
		<form:input path="sugarList[0].fastingValue" name="sugarList.fastingValue"
			placeholder="Enter fasting value" id="fastingValue"></form:input>
		<br>
		<br>

		<form:input path="sugarList[0].nonfastingValue" name="sugarList.nonFastingValue"
			placeholder="Enter Platelets Value" id="nonFastingValue"></form:input>
		<br>
		<br>
		<!--Thyroid Test  -->

		<form:input path="thyroidList[0].value" name="thyroidList.value"
			placeholder="Enter Thyroid Value" id="value"></form:input>
		<br>
		<br>

		<!-- Hospital -->

		<form:input path="hospitalList[0].hospname" name="hospitalList.hospName"
			placeholder="Enter Hospital Name" id="hospName"></form:input>
		<br>
		<br> 

		<form:input path="hospitalList[0].hospadd" name="hospitalList.hospAdd"
			placeholder="Enter Hospital Address" id="hospAdd"></form:input>
		<br>
		<br> 
 
 
 	<input type="submit">


	</center>

</form:form>
</body>
</html>