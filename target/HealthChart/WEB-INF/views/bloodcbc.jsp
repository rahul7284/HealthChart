<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<form:form action="cbc.htm" modelAttribute="bloodCbc" id="bloodcbcform">
	<center>
	<h1>HealthMeasures</h1>
	<h1>Blood Components Measures</h1>
			<form:input path="rbc_limit" name="rbc_limit"
				placeholder="Enter RBC Count" id="rbc_limit"></form:input><br>
			<%-- 	${bloodCbc.rbc_description}
			 --%>	
				<br>
				<form:input path="wbc_limit" name="wbc_limit"
				placeholder="Enter WBC Count" id="wbc_limit"></form:input><br>
				<%-- ${bloodCbc.wbc_description}
				 --%><br>
				<form:input path="platelets_limit" name="platelets_limit"
				placeholder="Enter Platelets Count" id="platelets_limit"></form:input><br>
				<%-- ${bloodCbc.platelets_description}
			 --%>	<br>
				<form:input path="hb_limit" name="hb_limit"
				placeholder="Enter Hb Count" id="hb_limit"></form:input><br>
				<%-- ${bloodCbc.hb_description}
				 --%><br>
			<table>
			<tr>
			 <form:radiobuttons path="gender" items="${genderlist}" />
        </tr>
			 <%-- <tr><td>${bloodSugar.description}</td></tr> --%>
			</table>
			<input type="submit">
			<table>
			<tr><th>RBC</th><th>WbC</th><th>Platelets</th><th>HB</th></tr>
			<tr>
			<td>${bloodCbc.rbc_description}</td>
			
			<td>${bloodCbc.wbc_description}</td>
			
			<td>${bloodCbc.platelets_description}</td>
			
			<td>${bloodCbc.hb_description}</td>
			</tr>
			</table>
		
		</center>
		
	</form:form>
	

</body>
</html>