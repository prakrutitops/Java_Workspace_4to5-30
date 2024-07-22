<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<script type="text/javascript">
	 
			var request=new XMLHttpRequest();  
			function searchInfo()
			{
				var name=document.vinform.name.value;  
				var url="AjaxSearch2.jsp?val="+name;  
				
				try
				{
					request.onreadystatechange=function()
					{
						if(request.readyState==4)
						{  
							var val=request.responseText;  
							document.getElementById('tops').innerHTML=val;  
						}  
					}
					request.open("GET",url,true);  
					request.send();  
				}
				catch(e)
				{
					alert("Unable to connect to server");
				}
				
			}
	
	</script>

</head>
<body>

<form name="vinform">
	Enter Email For Registration <input type="email" name="name" onblur="searchInfo()">  
</form>  
<span id="tops"></span>  

</body>
</html>