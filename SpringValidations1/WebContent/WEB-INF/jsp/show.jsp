<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


Id:${customer.id}<br>
Name:${customer.name}<br>
Password:${customer.password}<br>
Address:${customer.address}<br>
Gender:${customer.gender}<br>
Technologies:
	<c:forEach var="lang" items="${customer.language}">
		<c:out value="${lang}"></c:out>		
	</c:forEach><br>
Education:${customer.degree}<br>

</body>
</html>