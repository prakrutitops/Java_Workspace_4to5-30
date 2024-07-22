<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		
		String email=request.getParameter("val");  
		
		if(email==null || email.trim().equals(""))
		{
			out.print("<p>Please enter Email!</p>"); 
		}
		else
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webwing","root","");
				PreparedStatement ps = con.prepareStatement("select * from users where email=?");
				ps.setString(1, email);
	    		ResultSet rs=ps.executeQuery();  
	    		if(rs.next())
	    		{
	    			out.println("<p>Email Id Already Used</p>"); 
	    		}
	    		else
	    		{
	    			out.println("<p>This Email Id Is Available</p>"); 
	    		}
	    		
	    		con.close();
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
		}
	
	%>

</body>
</html>