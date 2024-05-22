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
    
    response.setHeader("cache-control", "no-cache");
    response.setHeader("cache-control", "no-store");
    response.setHeader("pragma", "no-cache");
    response.setDateHeader("Expires", 0);
    
    %>
<%
	Cookie[] cks=request.getCookies();
	for(Cookie ck:cks)
	{
		if(ck.getName().equals("raj"))
		{
				ck.setMaxAge(0);
				break;
		}
	}
	session.removeAttribute("raj");
	session.invalidate();
	response.sendRedirect("index.jsp");
	
%>
</body>
</html>