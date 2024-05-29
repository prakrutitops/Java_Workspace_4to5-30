<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="m" class="com.model.SignupModel"/>
<jsp:setProperty property="*" name="m"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		int signupstatus = Dao.signup(m);
		
		if(signupstatus>0)
		{
			response.sendRedirect("signin.jsp");
		}
		else
		{
				
		%>
		<br>
		<center>
				
				<b><p style="color:red;font-family: sans-serif; font-size: 25px;">Signup Failed!! Please Try Again</p></b>
			</center>

			<br>
			<br>
		<%@ include file="signup.jsp"%>
	
		<%
		}
		%>


</body>
</html>