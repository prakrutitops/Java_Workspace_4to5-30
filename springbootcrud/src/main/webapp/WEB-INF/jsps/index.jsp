<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>WELCOME</h1>
	
	
	<span>${msg}</span>
	<form:form action="reg" modelAttribute="user" method="post">
	<form:hidden path="id"/>
	
	<form:label path="uname">Username</form:label>
	<form:input path="uname"/><br><br>
	<form:label path="email">Email</form:label>
	<form:input path="email"/><br><br>
	<form:label path="password">Password</form:label>
	<form:input path="password"/><br><br>
	<input type="submit">
	</form:form>
	
	<h1>User Details</h1>
	<table border="1">
	<tr>
		<th>Id</th>
		<th>Username</th>
		<th>Email</th>
		<th>Password</th>
		<th colspan="2">Action</th>
	</tr>
	
	<c:forEach var="dt" items="${users}">
	<tr>
	<td>${dt.getId()}</td>
	<td>${dt.getUname()}</td>
	<td>${dt.getEmail()}</td>
	<td>${dt.getPassword()}</td>
	<td><a href="delete?did=${dt.getId()}">Delete</a></td>
	<td><a href="edit?eid=${dt.getId()}">Edit</a></td>
	</tr>
	</c:forEach>
	
	</table>
	
</body>










</html>