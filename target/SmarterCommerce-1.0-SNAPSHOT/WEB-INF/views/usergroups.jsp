<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usergroups page</title>
<style type="text/css">
	.error {
		color: #ff0000;
	}
	.errorblock {
		color: #000;
		background-color: #ffEEEE;
		border: 3px solid #ff0000;
		padding: 8px;
		margin: 16px;
	}


</style>
</head>
<body>

	<a href="?language=en">
		English
	</a>
	<a href="?language=lt">
		Lithuanian
	</a>
	<form:form commandName="usergroups">
		<form:errors path="*" cssClass="errorblock" element="div"/>
		<label for="textinput1"><spring:message code="usergroups.name" /></label>
		<form:input path="name" cssErrorClass="error"/>
		<form:errors path="name" cssClass="error"/>
		<br>	
		<label for="textinput2"><spring:message code="usergroups.DL" /></label>
		<form:input path="DL" cssErrorClass="error"/>
		<form:errors path="DL" cssClass="error"/>
		<br>
		<label for="textinput3"><spring:message code="usergroups.phone" /></label>
		<form:input path="phone" cssErrorClass="error"/>
		<form:errors path="phone" cssClass="error"/>
		<br>
		<input type="submit" class="btn" value="Enter User">	
	</form:form> 

</body>
</html>