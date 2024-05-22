<!DOCTYPE HTML>
<!--[if gt IE 8]> <html class="ie9" lang="en"> <![endif]-->
<%@page import="com.bin.Registrationbean"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    
<!-- Mirrored from imedica.sharkslab.com/HTML/blog-medium-full-width.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 23 Feb 2016 20:03:43 GMT -->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    

    <title>Find Doctor</title>

    <link href='http://fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic' rel='stylesheet' type='text/css'>
    <link href="css/jquery-ui-1.10.3.custom.css" rel="stylesheet" />
    <link href="css/animate.css" rel="stylesheet" />
    <link href="css/font-awesome.min.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="css/blue.css" id="style-switch" />

    <!-- REVOLUTION BANNER CSS SETTINGS -->
    <link rel="stylesheet" type="text/css" href="rs-plugin/css/settings.css" media="screen" />

    <!--[if IE 9]>
        <link rel="stylesheet" type="text/css" href="css/ie9.css" />
    <![endif]-->    

    <link rel="icon" type="image/png" href="images/fevicon.png">
    <link rel="stylesheet" type="text/css" href="css/inline.min.css" /></head>

<body>
<header>
		<div class="header-bg">
 <%try
 {
 %> 
 
 <%!Registrationbean s; %>
 <%
 
 s=(Registrationbean)session.getAttribute("raj");
 
 %> 
                	
                    <!--Topbar-->
                    <div class="topbar-info no-pad">                    
                        <div class="container">                     
                          <div class="social-wrap-head col-md-2 no-pad">
                                <ul>
                                <li><a href="#"><i class="icon-facebook head-social-icon" id="face-head" data-original-title="" title=""></i></a></li>
                                <li><a href="#"><i class="icon-social-twitter head-social-icon" id="tweet-head" data-original-title="" title=""></i></a></li>
                                <li><a href="#"><i class="icon-google-plus head-social-icon" id="gplus-head" data-original-title="" title=""></i></a></li>
                                <li><a href="#"><i class="icon-linkedin head-social-icon" id="link-head" data-original-title="" title=""></i></a></li>
                                <li><a href="#"><i class="icon-rss head-social-icon" id="rss-head" data-original-title="" title=""></i></a></li>
                                </ul>
                            </div>                            
                            <div class="top-info-contact pull-right col-md-6">
                             <%
    
    response.setHeader("cache-control", "no-cache");
    response.setHeader("cache-control", "no-store");
    response.setHeader("pragma", "no-cache");
    response.setDateHeader("Expires", 0);
    
    %>
    <%!String fname; %>      
<%
 
 if(session!=null)
 {
     if(session.getAttribute("raj")!=null)
	 {
		 fname = session.getAttribute("raj").toString();
	
 %>                    
                             <a href="profile.jsp">
                   			<label hover: style="color: #2fa8ec" class="btn">
                   				Welcome <%=s.getFname() %> <%=s.getLname() %>&nbsp;&nbsp;
                   			</label>
                       </a>
                            
                       <a href="logout.jsp">
                             <button type="submit" class="btn btn-primary" >Log out</button>
                       </a>
<%
	 }
	 else
	 {
		 response.sendRedirect("login.jsp");
	 }
 }
 else
 {
	 response.sendRedirect("login.jsp");
 }
%>
                            </div>                      
                        </div>
                    </div><!--Topbar-info-close-->
                    
                    
                    
                    
                    
                    <div id="headerstic">
                    
                    <div class=" top-bar container">
                    	<div class="row">
                            <nav class="navbar navbar-default" role="navigation">
                              <div class="container-fluid">
                                <!-- Brand and toggle get grouped for better mobile display -->
                                <div class="navbar-header">
                          
                          <button type="button" class="navbar-toggle icon-list-ul" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                          </button>
                          <button type="button" class="navbar-toggle icon-rocket" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
                            <span class="sr-only">Toggle navigation</span>
                          </button>

                          <a href="index-2.html"><div class="logo"></div></a>
                        </div>
                            
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav navbar-right">
                            <li><a href="home.jsp" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-home"></i>Home</a>
								
							</li>

                            <li class="dropdown"><a href="Finddoctors.jsp" ><i class="icon-cog"></i>Find Doctors<b class="icon-angle-down"></b></a>
                                
                            </li>
                            <li class="dropdown"><a href="Alldoctors.jsp" ><i class="icon-cog"></i>All Doctors<b class="icon-angle-down"></b></a>
                                
                            </li>
                            <li class="dropdown"><a href="Area.jsp" ><i class="icon-cog"></i>Area Vise<b class="icon-angle-down"></b></a>
                                
                            </li>
                            <li class="dropdown"><a href="bookappoinment.jsp" ><i class="icon-cog"></i>Appoinment<b class="icon-angle-down"></b></a>
                                
                            </li>
                            <li class="dropdown"><a href="Rating.jsp" ><i class="icon-cog"></i>Rating<b class="icon-angle-down"></b></a>
                                
                            </li>
                            <li class="dropdown active"><a href="Aboutus.jsp" ><i class="icon-cog"></i>About us<b class="icon-angle-down"></b></a>
                                
                            </li>
                            
                            
                            
                    </div>
                              </div><!-- /.container-fluid -->
                            </nav>
                    	</div>    
                    </div><!--Topbar End-->
                	</div>
                    
                    
                    
                    
                    
                    
                    
              </div>
            </header>
    <section class="complete-content content-footer-space">
    
    <!--Mid Content Start-->
    
    
     <div class="about-intro-wrap pull-left">
     
         <div class="bread-crumb-wrap ibc-wrap-3">
    	<div class="container">
    <!--Title / Beadcrumb-->
         	<div class="inner-page-title-wrap col-xs-12 col-md-12 col-sm-12">
            	<div class="bread-heading"><h1>Find Doctor</h1></div>
                
            </div>
         </div>
     </div> 
     
         <div class="container">
         	
           
            
            <!--About-us top-content-->

            
            
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 pull-left blgo-full-wrap no-pad">
				 <!-- Blog column -->
            	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div id="blog-medium"><!--blog-medium-->
				<div class="row  margin-top border-bottom">
				
				
				<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				  <!-- Blog box -->
                	<div class="blog-box wow fadeInDown" data-wow-delay="0.5s" data-wow-offset="0">
                        <img src="images/my.png" class="img-responsive" />
						
                    </div>
				</div> 
				<div class="col-lg-8 col-md-8 col-sm-12 col-xs-12 fadeInDown wow">
                        <div class="blog-box-title">Rajesh Nalkanthiya</div>
						<div class="post-meta">By 
                        <span class="post-author ipost-author">admin</span> | 
                        <span class="post-date">March 5 2016 </span>|
						<span class="post-author ipost-author">Doctor finder Web app</span>|
						<span class="post-author ipost-author">Comments</span>
                        </div>
						<div class="post-para">
                        <p>I am Rajsh Nalkanthiya 8th semester student of B.tech computer engineering.</p>
						</div><!--end-post-para-->
                        <div class="r-more">
						<a href="#">Read More ></a>
						</div>
						</div>
						
		
				</div><!--end-row-->
				</div> <!-- Blog column end-->
                </div>
                       
         </div>
         </div>
         </div>
         </section>
            
            <%@ include file="footer.jsp" %> 
  <!--JS Inclution-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery-ui-1.10.3.custom.min.js"></script>  
    <script type="text/javascript" src="bootstrap-new/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="rs-plugin/js/jquery.themepunch.tools.min.js"></script>
    <script type="text/javascript" src="rs-plugin/js/jquery.themepunch.revolution.min.js"></script>
    <script type="text/javascript" src="js/jquery.scrollUp.min.js"></script>
    <script type="text/javascript" src="js/jquery.sticky.min.js"></script>
    <script type="text/javascript" src="js/wow.min.js"></script>
    <script type="text/javascript" src="js/jquery.flexisel.min.js"></script>
    <script type="text/javascript" src="js/jquery.imedica.min.js"></script>
    <script type="text/javascript" src="js/custom-imedicajs.min.js"></script>
    <script>
    $(document).ready(function(){
        $('html').animate({scrollTop:0}, 1);
        $('body').animate({scrollTop:0}, 1);
    });
    $(window).on('load',function() {setTimeout(function () { $('html,body').scrollTop(0) },0); });
    
    </script>    
<%
 }
 catch(Exception e)
 {
	 e.printStackTrace();
 }
 %>
</body>

<!-- Mirrored from imedica.sharkslab.com/HTML/blog-medium-full-width.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 23 Feb 2016 20:03:43 GMT -->
</html>
    
