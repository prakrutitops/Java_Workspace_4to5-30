<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.a.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Panel</title>
  <!-- Bootstrap CSS -->

  

  
</head>
<body>
	
		<%
			
		
			/* String data = session.getAttribute("id"); */
			//int a = Integer.parseInt(data);
			//SignupModel m =	Dao.getdata(a);
		%>
	


            <form action="imageSave2" method="post" enctype="multipart/form-data" class="requires-validation" novalidate>


						 <div class="col-md-12">
			                           <input class="form-control" type="text" name="id" value="<%= m.getId() %>" required>
			               </div>

			              <div class="col-md-12">
			                           <input class="form-control" type="text" name="fname" value="<%= m.getFname() %>" placeholder="Enter Firstname" required>
			               </div>
                            
                            <div class="col-md-12">
                               <input class="form-control" type="text" name="lname" placeholder="Enter Lastname" value="<%= m.getLname() %>" required>
                            </div>
                            
                            <div class="col-md-12">
                               <input class="form-control" type="text" name="email" placeholder="Enter Email" value="<%= m.getEmail() %>" required>
                            </div>
                            <br>
                             <div class="col-md-12">
                               <input class="form-control" type="password" name="password" placeholder="Enter Password" value="<%= m.getPassword() %>" required>
                            </div>
                            <br>
                            <div class="col-md-12">
                               <input class="form-control" type="file" name="image" placeholder="Upload Image" value="<%= m.getImage() %>" required>
                            </div>

                           <br>
                  

                            <div class="form-button mt-3">
                                <button id="submit" type="submit" class="btn btn-primary">Update</button>
                            </div>
                        </form>
                      
                        </center>
                    </div>
                </div>
            </div>
        </div>
    </div>
  

</body>
</html>
    