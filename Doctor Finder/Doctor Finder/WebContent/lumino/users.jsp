<!DOCTYPE html>
<%@page import="com.bin.Registrationbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.Registrationmodel"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Doctor Finder</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>Doctor</span>&nbsp;Finder</a>
				<%
    
    response.setHeader("cache-control", "no-cache");
    response.setHeader("cache-control", "no-store");
    response.setHeader("pragma", "no-cache");
    response.setDateHeader("Expires", 0);
    
%>
<%
	if(session!=null)
	{
		if(session.getAttribute("piyu")!=null)
		{
			String adminname = session.getAttribute("piyu").toString();
%>
			
			
				<ul class="user-menu">
					<li class="dropdown pull-right">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> <%=adminname %> <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="adminlogout.jsp"><svg class="glyph stroked cancel"><use xlink:href="#stroked-cancel"></use></svg>Logout</a></li>
						</ul>
					</li>
				</ul>
<%
		}
		else
		{
			response.sendRedirect("adminlogin.jsp");
		}
	}
	else
	{
		response.sendRedirect("adminlogni.jsp");
	}
%>			
			</div>
							
		</div><!-- /.container-fluid -->
	</nav>
		
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li><a href="adminindex.jsp"><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg> Dashboard</a></li>
			<li><a href="add_dr.jsp"><svg class="glyph stroked plus sign"><use xlink:href="#stroked-plus-sign"/></svg>Add Doctor</a></li>
			<li><a href="all_dr.jsp"><svg class="glyph stroked eye"><use xlink:href="#stroked-eye"/></svg>All Doctors</a></li>
			<li class="active"><a href="users.jsp"><svg class="glyph stroked male user "><use xlink:href="#stroked-male-user"/></svg>All Users</a></li>
			<li><a href="admin_feedback.jsp"><svg class="glyph stroked email"><use xlink:href="#stroked-email"/></svg>All Feedbacks</a></li>
			<li><a href="admin_appointment.jsp"><svg class="glyph stroked calendar"><use xlink:href="#stroked-calendar"/></svg>All Appointments</a></li>
			<li><a href="tables.html"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg> Tables</a></li>
			<li><a href="forms.html"><svg class="glyph stroked pencil"><use xlink:href="#stroked-pencil"></use></svg> Forms</a></li>
			<li><a href="panels.html"><svg class="glyph stroked app-window"><use xlink:href="#stroked-app-window"></use></svg> Alerts &amp; Panels</a></li>
			<li><a href="icons.html"><svg class="glyph stroked star"><use xlink:href="#stroked-star"></use></svg> Icons</a></li>
			<li class="parent ">
				<a href="#">
					<span data-toggle="collapse" href="#sub-item-1"><svg class="glyph stroked chevron-down"><use xlink:href="#stroked-chevron-down"></use></svg></span> Dropdown 
				</a>
				<ul class="children collapse" id="sub-item-1">
					<li>
						<a class="" href="#">
							<svg class="glyph stroked chevron-right"><use xlink:href="#stroked-chevron-right"></use></svg> Sub Item 1
						</a>
					</li>
					<li>
						<a class="" href="#">
							<svg class="glyph stroked chevron-right"><use xlink:href="#stroked-chevron-right"></use></svg> Sub Item 2
						</a>
					</li>
					<li>
						<a class="" href="#">
							<svg class="glyph stroked chevron-right"><use xlink:href="#stroked-chevron-right"></use></svg> Sub Item 3
						</a>
					</li>
				</ul>
			</li>
			<li role="presentation" class="divider"></li>
			<li><a href="login.jsp"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Login Page</a></li>
		</ul>
		
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked male user "><use xlink:href="#stroked-male-user"/></svg></a></li>
				<li class="active">Icons</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">All Users</h1>
				
			</div>
		</div><!--/.row-->
							
					<%
                      
                      	Registrationmodel rg = new Registrationmodel();
                      	
                      	ArrayList<Registrationbean> records = rg.allusers();
                      	for(Registrationbean rg1:records)
                      	{
                    %>
						
						<div class="col-md-4">
							<div class="panel panel-primary">
								<div class="panel-heading">
									User name : <%=rg1.getFname() %>&nbsp;<%=rg1.getLname() %>
								</div>
								<div class="panel-body">
									<p>
										<label><img src="img/IMG_1843.JPG" width="300px;" height="200px;"></label>
										<br>
										<label>Email : <%=rg1.getEmail() %></label>
										<br>
										<label>Phone No : <%=rg1.getPh_no() %></label>
										<br>
										<label>Password : <%=rg1.getPass() %></label>
										<br>
										<label>Gender : <%=rg1.getGen() %></label>
										<br>
										<label>Date Of Birth : <%=rg1.getDob() %></label>
										
										<div class="form-group">
											<div class="col-md-12 widget-right">
<!-- 												<button style="float: left;" type="submit" class="btn btn-primary">Edit Profile</button>&nbsp; -->
											<a href="../deluser?id=<%=rg1.getId()%>">
												<button style="float: right;" type="submit" class="btn btn-primary">Delete Profile</button>
											</a>	
											</div>
										</div>
									</p>
								</div>
							</div>
						</div>
								
						<% } %>
												
<!-- 						<div style="background-color: #30a5ff"> -->
<!-- 							<img alt="Doctor Profile" src="img/IMG_9172.JPG" style="width: 247px; height: 200px;"> -->
<!-- 						</div> -->
					</div>
				</div>
			</div>
			
			
		</div><!--/.row-->
											
	</div>	<!--/.main-->
	  

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script>
		!function ($) {
		    $(document).on("click","ul.nav li.parent > a > span.icon", function(){          
		        $(this).find('em:first').toggleClass("glyphicon-minus");      
		    }); 
		    $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script>	
</body>

</html>
