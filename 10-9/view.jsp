<%@page import="com.model.SmsModel"%>
<%@page import="java.util.List"%>
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
		 List<SmsModel>list = Dao.smsview(session.getAttribute("email").toString());
		
		for(SmsModel m: list)
		{
			
		
	%>
	
		<table>
		
			<tr>
				<th>Sender Id</th>
				<td><%=m.getSender_id() %></td>
			</tr>
			
			<tr>
				<th>Message</th>
				<td><%=m.getMessage() %></td>
			</tr>
		</table>
	
		<% 
		}
		%>
	
	

</body>
</html>