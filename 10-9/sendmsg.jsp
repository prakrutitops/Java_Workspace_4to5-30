<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="m" class="com.model.SmsModel"/>    
<jsp:setProperty property="*" name="m"/> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<%
		
		m.setSender_id(session.getAttribute("email").toString());
		int a = Dao.smsinsert(m);
		
	
	
	
	%>


	

</body>
</html>