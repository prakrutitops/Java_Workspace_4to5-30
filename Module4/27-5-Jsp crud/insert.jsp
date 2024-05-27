<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="m" class="com.model.Model"/>    
<jsp:setProperty property="*" name="m"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	
	int status = Dao.signupdata(m);

	if(status>0)
	{
		//out.print("success");
		response.sendRedirect("index.jsp");
	}
	else
	{
		out.print("fail");
	}

%>


</body>
</html>