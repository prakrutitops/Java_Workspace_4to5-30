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



            <form action="imageSave" method="post" enctype="multipart/form-data" class="requires-validation" novalidate>

              <div class="col-md-12">
                           <input class="form-control" type="text" name="fname" placeholder="Enter Firstname" required>
               </div>
                            
                            <div class="col-md-12">
                               <input class="form-control" type="text" name="lname" placeholder="Enter Lastname" required>
                            </div>
                            
                            <div class="col-md-12">
                               <input class="form-control" type="text" name="email" placeholder="Enter Email" required>
                            </div>
                            <br>
                             <div class="col-md-12">
                               <input class="form-control" type="password" name="password" placeholder="Enter Password" required>
                            </div>
                            <br>
                            <div class="col-md-12">
                               <input class="form-control" type="file" name="image" placeholder="Upload Image" required>
                            </div>

                           <br>
                  

                            <div class="form-button mt-3">
                                <button id="submit" type="submit" class="btn btn-primary">Add</button>
                            </div>
                        </form>
                        <a href="login.jsp">Login</a>
                        </center>
                    </div>
                </div>
            </div>
        </div>
    </div>
  

</body>
</html>
    