<!DOCTYPE html>
<%@page import="com.model.Doctorsmodel"%>
<%@page import="com.bin.Doctorsbean"%>
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
				<ul class="user-menu">
					<li class="dropdown pull-right">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> User <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Profile</a></li>
							<li><a href="#"><svg class="glyph stroked gear"><use xlink:href="#stroked-gear"></use></svg> Settings</a></li>
							<li><a href="#"><svg class="glyph stroked cancel"><use xlink:href="#stroked-cancel"></use></svg> Logout</a></li>
						</ul>
					</li>
				</ul>
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
			<li class="active"><a href="add_dr.jsp"><svg class="glyph stroked plus sign"><use xlink:href="#stroked-plus-sign"/></svg>Add Doctor</a></li>
			<li><a href="all_dr.jsp"><svg class="glyph stroked eye"><use xlink:href="#stroked-eye"/></svg>All Doctors</a></li>
			<li><a href="users.jsp"><svg class="glyph stroked male user "><use xlink:href="#stroked-male-user"/></svg>All Users</a></li>
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
			<li><a href="login.html"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Login Page</a></li>
		</ul>
		
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">		
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked plus sign"><use xlink:href="#stroked-plus-sign"/></svg></a></li>
				<li class="active">Icons</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Edit Doctor Profile</h1>
			</div>
		</div><!--/.row-->
									
		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-3">
				<div class="panel panel-blue panel-widget ">
					<div class="row no-padding">
						<div class="col-sm-3 col-lg-5 widget-left">
							<svg class="glyph stroked bag"><use xlink:href="#stroked-bag"></use></svg>
						</div>
						<div class="col-sm-9 col-lg-7 widget-right">
							<div class="large">120</div>
							<div class="text-muted">New Orders</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-md-6 col-lg-3">
				<div class="panel panel-orange panel-widget">
					<div class="row no-padding">
						<div class="col-sm-3 col-lg-5 widget-left">
							<svg class="glyph stroked empty-message"><use xlink:href="#stroked-empty-message"></use></svg>
						</div>
						<div class="col-sm-9 col-lg-7 widget-right">
							<div class="large">52</div>
							<div class="text-muted">Comments</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-md-6 col-lg-3">
				<div class="panel panel-teal panel-widget">
					<div class="row no-padding">
						<div class="col-sm-3 col-lg-5 widget-left">
							<svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg>
						</div>
						<div class="col-sm-9 col-lg-7 widget-right">
							<div class="large">24</div>
							<div class="text-muted">New Users</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-md-6 col-lg-3">
				<div class="panel panel-red panel-widget">
					<div class="row no-padding">
						<div class="col-sm-3 col-lg-5 widget-left">
							<svg class="glyph stroked app-window-with-content"><use xlink:href="#stroked-app-window-with-content"></use></svg>
						</div>
						<div class="col-sm-9 col-lg-7 widget-right">
							<div class="large">25.2k</div>
							<div class="text-muted">Page Views</div>
						</div>
					</div>
				</div>
			</div>
		</div><!--/.row-->
		
		<%-- <%!Doctorsbean b; %> --%>
		<%
		int id = Integer.parseInt(request.getParameter("id"));
		
		Doctorsmodel dm = new Doctorsmodel();
		Doctorsbean b = dm.admindr(id);
		/* request.setAttribute("mydr", drb);
		request.getRequestDispatcher("lumino/editdoctor.jsp").forward(request, response); */
		%>
		
		<div class="row">
			<div class="col-md-8">
				<div class="panel panel-default">
					<div class="panel-heading"><svg class="glyph stroked email"><use xlink:href="#stroked-email"></use></svg> Contact Form</div>
					<div class="panel-body">
						<form class="form-horizontal" action="../UpdateAdminDr" method="post" >
							<fieldset>
							
							<input type="text" name="id" value="<%=b.getId()%>">
							
								<!-- Name input-->
								<div class="form-group">
									<label class="col-md-3 control-label">Doctor's Name</label>
									<div class="col-md-9">
									<input id="name" name="drname" type="text" value="<%=b.getName() %>" placeholder="Name" class="form-control">
									</div>
								</div>
							
								<!-- Email input-->
								<div class="form-group">
									<label class="col-md-3 control-label">Doctor's E-mail</label>
									<div class="col-md-9">
										<input id="email" name="dremail" type="text" value="<%=b.getEmail() %>" placeholder="Email" class="form-control">
									</div>
								</div>
								
								<!-- Speciality body -->
								<div class="form-group">
									<label class="col-md-3 control-label">Doctor's Speciality</label>
									<div class="col-md-9">
										<input id="drsp" name="drspeciality" type="text" value="<%=b.getSpeciality() %>" placeholder="Speciality" class="form-control">
									</div>
								</div>
								
								<!-- Phno input-->
								<div class="form-group">
									<label class="col-md-3 control-label">Doctor's Phone No.</label>
									<div class="col-md-9">
										<input id="drpno" name="drphno" type="text" value="<%=b.getContact_no() %>" placeholder="Phone No." class="form-control">
									</div>
								</div>
					
								<!-- Location input-->
								<div class="form-group">
									<label class="col-md-3 control-label">Doctor's Location</label>
									<div class="col-md-9">
										<input id="drltn" name="drloc" type="text" value=<%=b.getLocation() %> placeholder="Location" class="form-control">
									</div>
								</div>
								
								<!-- Address body -->
								<div class="form-group">
									<label class="col-md-3 control-label" for="message">Doctor's Address</label>
									<div class="col-md-9">
										<textarea class="form-control" id="addr" name="draddr"  placeholder="Address" rows="5"><%=b.getAddress() %></textarea>
									</div>
								</div>
								
<!-- 								Image input -->
<!-- 								<div class="form-group"> -->
<!-- 									<label class="col-md-3 control-label">Doctor's Image</label> -->
<!-- 									<div class="col-md-9"> -->
<%-- 										<input name="drimg" type="file" value="<%=b.getImage()%>"> --%>
<!-- 									</div> -->
<!-- 								</div> -->
								
								<!-- Form actions -->
								<div class="form-group">
									<div class="col-md-12 widget-right">
										<input style="float: right;" type="submit" class="btn btn-primary"><!-- Update</button> -->
									</div>
								</div>
							</fieldset>
						</form>
					</div>
				</div>
				
												
			</div><!--/.col-->
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
		$('#calendar').datepicker({
		});

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
