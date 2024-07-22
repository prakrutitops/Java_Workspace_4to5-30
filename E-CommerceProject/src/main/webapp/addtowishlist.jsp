<%@page import="com.Imadata.ImageModel"%>
<%@page import="com.Imadata.ImageDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"/>
	<%
		if(session.getAttribute("webwing")!=null)
		{
			String id = request.getParameter("id");
			int id2 = Integer.parseInt(id);
			ImageModel m = ImageDao.getimageindexwise(id2);
			
			
			
	%>
		
			<br>
			<br>
			<center>
			<h2><%=m.getP_name() %></h2>
			<h3><%=m.getP_price() %></h3>
			<h3><%=m.getP_des() %></h3>
			<img src="data:image/jpeg;base64,<%=m.getP_image()%>" width="350px" height="300px" />
	
	
	<form action="imageSave2" method="post" enctype="multipart/form-data" class="requires-validation" novalidate>


							 <div class="col-md-12">
                               <input class="form-control" type="hidden" name="id" placeholder="Product Name" value="<%=m.getId() %>" required>
                            </div>
                            
                            <div class="col-md-12">
                               <input class="form-control" type="hidden" name="p_name" placeholder="Product Name" value="<%=m.getP_name() %>" required>
                            </div>
                            
                            <div class="col-md-12">
                               <input class="form-control" type="hidden" name="p_price" placeholder="Product Price" value="<%=m.getP_price() %>" required>
                            </div>
                            
                            <div class="col-md-12">
                               <input class="form-control" type="hidden" name="p_des" placeholder="Product Description" value="<%=m.getP_des() %>" readonly="readonly">
                            </div>
                            
                        
                            
                             <div class="col-md-12">
                               <input class="form-control" type="hidden" name="email" placeholder="Product Price" value="<%=session.getAttribute("email") %>" required>
                            </div>
                            
                            
                            <br>
                            <div class="col-md-12">
                            	<input type="hidden" name="p_image" value="data:image/jpeg;base64,<%=m.getP_image() %>" /> 
                             </div>
                             
                             
                               
                  			<br>
                  

                            <div class="form-button mt-3">
                                <button id="submit" type="submit" class="btn btn-primary">Add to Wishlist </button>
                            </div>
                        </form>
	
	<% 		
		}
		else
		{

	%>
			<br>
			<center>
					
					<b><p style="color:red;font-family: sans-serif; font-size: 25px;">Please Login First!!</p></b>
				</center>

				<br>
				<br>
			<%@ include file="signin.jsp"%>

		<% 
		}
		%>

<jsp:include page="footer.jsp"/>
</body>
</html>