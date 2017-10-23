<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<form:form action="sugar.htm" modelAttribute="bloodSugar" id="bloodsugarform">
	<center>
	<h1>HealthMeasures</h1>
	<h1>Blood Sugar Measures</h1>
			<form:input path="level" name="level"
				placeholder="Enter Sugar Level" id="level"></form:input><br><br>
			<table>
			<tr>
			 <form:radiobuttons path="mode" items="${modelist}" />
        
			<%-- <td>
			<form:select path="mode" items="${modelist}">
			<form:option value="NONE" label="select"/>
			<form:options items="${modelist}" itemValue="bloodSugar" itemLabel="bloodsugar"/>
					 </form:select>
			</td>
			 --%></tr>
			 <tr><td>${bloodSugar.description}</td></tr>
			</table>
			<input type="submit">

		
		</center>
		
	</form:form>
	<form:form action="cbc.htm">
	<center>
	<h1>Blood Components Measures</h1>

	<table>
	<tr>
	<td>
	<input type="submit" value="Blood Test">
	</td>
	</tr>
	</table>
	</center>
	</form:form>

</body>
</html>