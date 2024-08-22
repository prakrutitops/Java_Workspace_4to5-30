<%@page import="com.bo.Bo"%>
<%@page import="com.model.Person"%>
<%@page import="java.util.List"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		Bo bo = (Bo) acm.getBean("bo");
		List<Person>list = bo.viewdetails();
		
	%>
	
	
	<table border="1" >
	
	<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Address</th>
			
	</tr>
	
	<tr>
			<%
				for(Person p :list)
				{
					
				
			%>

	
					<td><%=p.getId()%></td>
					<td><%=p.getName()%></td>
					<td><%=p.getAddress()%></td>
					
			
	
	</tr>			
	<%
				}
	
	%>				
					
					
					
			
	
	
	</table>
	
	
	
	


</body>
</html>