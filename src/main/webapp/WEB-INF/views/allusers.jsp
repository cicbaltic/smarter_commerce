<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	    <title>University Enrollments</title>
	 
	    <style>
	        tr:first-child{
	            font-weight: bold;
	            background-color: #C6C9C4;
	        }
	    </style>
	<title>List of Users</title>
</head>
<body>
	<h2>List of Users</h2>  
    <table>
        <tr>
            <td>NAME</td><td>Joining Date</td><td>Salary</td><td>SSN</td><td></td>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
            <td>${user.name}</td>
            <td>${user.joiningDate}</td>
            <td>${user.salary}</td>
            <td><a href="<c:url value='/edit-${user.ssn}-user' />">${user.ssn}</a></td>
            <td><a href="<c:url value='/delete-${user.ssn}-user' />">delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="<c:url value='/new' />">Add New User</a>

</body>
</html>