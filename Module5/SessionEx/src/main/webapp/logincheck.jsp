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
	String name = "aayush";
	String pass="1234";
	
	String a = request.getParameter("name");
	String b = request.getParameter("pass");

	if(a.equals("aayush") && b.equals("1234"))
	{
		session.setAttribute("myname",a);
	}
	else
	{
		out.print("details are not correct");
	}
	
%>

</body>
</html>