<%@page import="com.model.ContactModel"%>
<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String id = request.getParameter("id");
	int id2 = Integer.parseInt(id); 
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String subject = request.getParameter("subject");
	String message = request.getParameter("message");
	String status = request.getParameter("status");

	ContactModel m = new ContactModel();
	m.setId(id2);
	m.setName(name);
	m.setEmail(email);
	m.setSubject(subject);
	m.setMessage(message);
	m.setStatus(status);
	
	
	int data = Dao.updatequery(m);
	
	if(data>0)
	{
		response.sendRedirect("admincontacted.jsp");
	}
	else
	{
		out.print("error");
	}
	
%>

</body>
</html>