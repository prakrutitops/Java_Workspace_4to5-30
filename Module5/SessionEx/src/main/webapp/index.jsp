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
		if(session.getAttribute("myname")!=null)
		{
			out.print("Welcome "+session.getAttribute("myname").toString());
			out.print("<a href='logout.jsp'>Logout</a>");
		}
		else
		{
			
		
	%>
	
	<form action="logincheck.jsp">
		
		<p>
			Enter Your Name: <input type="text" name="name">
		</p>
		
		
		<p>
			Enter Your Pass: <input type="text" name="pass">
		</p>
		
		<p>
			<input type="submit" value="Go">
		</p>
	
	</form>
	<%
		}
	%>

</body>
</html>