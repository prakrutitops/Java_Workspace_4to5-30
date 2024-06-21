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
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String subject = request.getParameter("subject");
	String message = request.getParameter("message");
	
	//System.out.print(name+email+subject+message);
	
%>

<form action="https://api.web3forms.com/submit" method="POST" >

<input type="hidden" name="access_key" value="27441ef8-6a91-4e8f-85d1-0af1cb9c944a">

<div class="row">

<div class="col-md-12">
<div class="form-group">
<input type="hidden" class="form-control" name="name" id="name" placeholder="Name" value="<%=name%>">
</div>
</div>
<div class="col-md-12">
<div class="form-group">
<input type="hidden" class="form-control" name="email" id="email" placeholder="Email" value="<%=email%>">
</div>
</div>
<div class="col-md-12">
<div class="form-group">
<input type="hidden" class="form-control" name="subject" id="subject" placeholder="Subject" value="<%=subject%>">
</div>
</div>
<div class="col-md-12">
<div class="form-group">
<input type="hidden" name="message" class="form-control" id="message" cols="30" rows="4" placeholder="Create a message here" value="<%=message%>">
</div>
</div>

<div class="col-md-12">
<div class="form-group">
<input type="submit" value="Send Message" class="swd-button">
<div class="submitting"></div>
</div>
</div>


</div>
</form>


</body>
</html>