<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
			<li class="active"><a href="index.jsp"><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg> Dashboard</a></li>
			<li><a href="add_dr.jsp"><svg class="glyph stroked plus sign"><use xlink:href="#stroked-plus-sign"/></svg>Add Doctor</a></li>
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
			<li><a href="adminlogin.jsp"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Login Page</a></li>
		</ul>

	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked home"><use xlink:href="#stroked-home"></use></svg></a></li>
				<li class="active">Icons</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Dashboard</h1>
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
							<div class="large">
								<%!static long count=0; %>
								<%
									Class.forName("com.mysql.jdbc.Driver");
									Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor finder","root","");
									String sql="select * from appoinment";
									Statement stmt=conn.createStatement();
									ResultSet rs=stmt.executeQuery(sql);
									while(rs.next())
									{
										count=rs.getRow();	
									}
								%>
								<%=count%>
							</div>
							<div class="text-muted">Appointments</div>
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
							<div class="large">
								<%!static long count1=0; %>
								<%
									Class.forName("com.mysql.jdbc.Driver");
									Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor finder","root","");
									String sql1="select * from feedback";
									Statement stmt1=conn1.createStatement();
									ResultSet rs1=stmt1.executeQuery(sql1);
									while(rs1.next())
									{
										count1=rs1.getRow();	
									}
								%>
								<%=count1%>
							</div>
							<div class="text-muted">Feedbacks</div>
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
							<div class="large">
								<%!static long count2=0; %>
								<%
									Class.forName("com.mysql.jdbc.Driver");
									Connection conn2=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor finder","root","");
									String sql2="select * from user_regi";
									Statement stmt2=conn2.createStatement();
									ResultSet rs2=stmt2.executeQuery(sql2);
									while(rs2.next())
									{
										count2=rs2.getRow();	
									}
								%>
								<%=count2%>
							
							</div>
							<div class="text-muted">Total Users</div>
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
							<div class="large">
								<%!static long count3=0; %>
								<%
									Class.forName("com.mysql.jdbc.Driver");
									Connection conn3=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor finder","root","");
									String sql3="select * from doctors";
									Statement stmt3=conn3.createStatement();
									ResultSet rs3=stmt3.executeQuery(sql3);
									while(rs3.next())
									{
										count3=rs3.getRow();	
									}
								%>
								<%=count3%>
							</div>
							<div class="text-muted">Total Doctors</div>
						</div>
					</div>
				</div>
			</div>
		</div><!--/.row-->
		
		<!--/.row-->
		
		<div class="row">
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>Appointments</h4>
						<div class="easypiechart" id="easypiechart-blue" data-percent="<%=count%>" ><span class="percent"><%=count%>%</span>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>Feedbacks</h4>
						<div class="easypiechart" id="easypiechart-orange" data-percent="<%=count1%>" ><span class="percent"><%=count1%>%</span>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>Total Users</h4>
						<div class="easypiechart" id="easypiechart-teal" data-percent="<%=count2%>" ><span class="percent"><%=count2%>%</span>
						</div>
					</div>
				</div>
			</div>
			<div class="col-xs-6 col-md-3">
				<div class="panel panel-default">
					<div class="panel-body easypiechart-panel">
						<h4>Total Doctors</h4>
						<div class="easypiechart" id="easypiechart-red" data-percent="<%=count3%>" ><span class="percent"><%=count3%>%</span>
						</div>
					</div>
				</div>
			</div>
		</div><!--/.row-->
								
		<div class="row">
			<div class="col-md-8">
			
								
								
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
