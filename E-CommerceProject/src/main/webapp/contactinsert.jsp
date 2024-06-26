<%@page import="java.net.URL"%>
<%@page import="com.model.ContactModel"%>
<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    /* CSS to hide the button */
    #myButton {
        display: none; /* This hides the button */
    }
</style>

<script type="text/javascript">

setTimeout(function() 
		{
		    // Select the button element
		    var button = document.getElementById('myButton');

		    // Check if the button is found
		    if (button) {
		        // Simulate a click on the button
		        button.click();
		         
		    } else 
		    {
		        console.error('Button not found.');
		    }
		}, 1000);

</script>
</head>

<body>

<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String subject = request.getParameter("subject");
	String message = request.getParameter("message");
	String status = "pending";
	
	ContactModel m = new ContactModel();
	m.setName(name);
	m.setEmail(email);
	m.setSubject(subject);
	m.setMessage(message);
	m.setStatus(status);
	
	 Dao.contactinsert(m);
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
	<input type="submit" id ="myButton" value="Send Message" class="swd-button">
	<div class="submitting"></div>
	</div>
	</div>
	

</div>
</form>


</body>
</html>