<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	
		<form action="update" name="update" method="post">
		
		<p>
			<input type="hidden" name="id" value="${tops.id}">
		</p>	
		
		<p>
			<input type="text" name="name" value="${tops.name}">
		</p>	
		
		<p>
			<input type="text" name="address"value="${tops.address}">
		</p>	
		
		<p>
			<input type="submit" value="Update">
		</p>
	</form>
	

</body>
</html>