<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
   
    <%
	
    //get
    String fname=request.getParameter("name");  
    String email=request.getParameter("email");  
    String phone=request.getParameter("phone");  
	String pass=request.getParameter("password");
	String repass = request.getParameter("repassword");
	
	//set
	session.setAttribute("fname", fname);
	session.setAttribute("email", fname);
	session.setAttribute("phone", fname);
	session.setAttribute("pass", fname);
	session.setAttribute("repass", fname);
	
	
	

	

	
	
	/* if(fname==null||fname.trim().equals(""))
	{
		out.print("<p>Please enter Firstname!</p>");  
	}
	
	if(email==null||email.trim().equals(""))
    {  
    	out.print("<p>Please enter Email!</p>");  
    }
	if(phone==null||phone.trim().equals(""))
	{
		out.print("<p>Please enter Phone!</p>");  
	}
	
	if(pass==null||pass.trim().equals(""))
	{
		out.print("<p>Please enter Password!</p>");  
	}
	if(repass==null||fname.trim().equals(""))
	{
		out.print("<p>Please enter Repassword!</p>");  
	} */
	
		try
    	{  
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webwing","root","");  
    		PreparedStatement ps=con.prepareStatement("select * from users where email=?");  
    		ps.setString(1, email);
    		ResultSet rs=ps.executeQuery();  
      		if(rs.next()) 
      		{      	
      			out.println("<h1>Email Id Already exits, try entering new Email Address.</h1>");   	
    			//session.setAttribute("wrongvalue",101);
      			//response.sendRedirect("signup.jsp");
    	
    			
    			
      		}
      		
      		else
      		{
      			
      	%>

      
     <% 
	   
		
		int number11 = 1 + (int)(9* Math.random());
		int number22 = 1 + (int)(9* Math.random());
		int number33 = 1 + (int)(9* Math.random());
		int number44 = 1 + (int)(9* Math.random());
		
		
		session.setAttribute("fname",fname);
		session.setAttribute("email",email);
		session.setAttribute("phone",phone);
		session.setAttribute("pass",pass);
		
		
		session.setAttribute("n1",number11);
		session.setAttribute("n2",number22);
		session.setAttribute("n3",number33);
		session.setAttribute("n4",number44);
		
		System.out.print(number11+" "+number22+" "+number33+" "+number44);
     	
		RequestDispatcher rd = request.getRequestDispatcher("EmailSendingServlet2");
		 request.setAttribute("e1", email);
		session.setAttribute("n1",number11);
		session.setAttribute("n2",number22);
		session.setAttribute("n3",number33);
		session.setAttribute("n4",number44);
	    rd.forward(request, response);
     
     %> 
      



      			
      	<% 		
      			
      		}
      
      		
    	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	%>		
      		
      		
      		
			
			
      			
      