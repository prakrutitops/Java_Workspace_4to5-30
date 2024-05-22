<!DOCTYPE HTML>
<!--[if gt IE 8]> <html class="ie9" lang="en"> <![endif]-->
<%@page import="java.util.Locale.Category"%>
<%@page import="com.bin.Registrationbean"%>
<html xmlns="http://www.w3.org/1999/xhtml" class="ihome">
    

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    
    <title>Find Doctor</title>

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic' rel='stylesheet' type='text/css'>
    <link href="cssa/bootstrap.css" rel="stylesheet" />
    <link href="css/jquery-ui-1.10.3.custom.css" rel="stylesheet" />
    <link href="css/animate.css" rel="stylesheet" />
    <link href="css/font-awesome.min.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="css/blue.css" id="style-switch" />
    <!-- REVOLUTION BANNER CSS SETTINGS -->
    <link rel="stylesheet" type="text/css" href="rs-plugin/css/settings.min.css" media="screen" />
    <!--[if IE 9]>
    	<link rel="stylesheet" type="text/css" href="css/ie9.css" />
    <![endif]-->    
    <link rel="icon" type="image/png" href="images/fevicon.png">

    <link rel="stylesheet" type="text/css" href="css/slides.css" />
    <link rel="stylesheet" type="text/css" href="css/inline.min.css" />
	

</head>
    <body>
    		<div id="loader-overlay"><img src="images/loader.gif" alt="Loading" /></div>
			
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
                            <li class="active"><a href="home.jsp" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-home"></i>Home</a>
								
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
                            <li class="dropdown"><a href="Aboutus.jsp" ><i class="icon-cog"></i>About us<b class="icon-angle-down"></b></a>
                                
                            </li>
                            
                            
                            
                    </div>
                              </div><!-- /.container-fluid -->
                            </nav>
                    	</div>    
                    </div><!--Topbar End-->
                	</div>
                    
                    
                    
                    
                    
                    
                    
              </div>
            </header>
            
            <div class="complete-content">	
           
            <div class="container full-width-container ihome-banner">
            	<div class="banner col-sm-12 col-xs-12 col-md-12">
                	
                    <ul>
            <!-- THE BOXSLIDE EFFECT EXAMPLES  WITH LINK ON THE MAIN SLIDE EXAMPLE -->

              
             
              <li data-transition="papercut" data-slotamount="7">
               
                    <!-- MAIN IMAGE -->

               
                    <!-- MAIN IMAGE -->
                    <img src="images/new-slider/s2-bg.jpg"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat">
                    <!-- LAYERS -->
                    <!-- LAYER NR. 1 -->
                    <div class="tp-caption lfb stl imed-sl1"
                        data-x="left"
                        data-y="bottom"
                        data-hoffset="-50"
                        data-speed="1000"
                        data-start="1000"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s2-img1.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 2 -->
                    <div class="tp-caption skewfromright stl imed-sl1"
                        data-x="left"
                        data-y="65"
                        data-hoffset="-20"
                        data-speed="1500"
                        data-start="1300"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s2-img2.png" alt="" class="img-responsive">
                    </div>

                    
                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="173"
                        data-hoffset="583"
                        data-speed="1400"
                        data-start="1600"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic1.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="143"
                        data-hoffset="493"
                        data-speed="1400"
                        data-start="1900"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic2.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="115"
                        data-hoffset="408"
                        data-speed="1400"
                        data-start="2200"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic3.png" alt="" class="img-responsive">
                    </div>


                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="89"
                        data-hoffset="332"
                        data-speed="1400"
                        data-start="2500"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic4.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="68"
                        data-hoffset="268"
                        data-speed="1400"
                        data-start="2800"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic5.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="47"
                        data-hoffset="204"
                        data-speed="1400"
                        data-start="3100"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic6.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="222"
                        data-hoffset="478"
                        data-speed="1400"
                        data-start="3400"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic7.png" alt="" class="img-responsive">
                    </div>


                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="177"
                        data-hoffset="370"
                        data-speed="1400"
                        data-start="3700"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic8.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="140"
                        data-hoffset="278"
                        data-speed="1400"
                        data-start="4000"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic9.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="108"
                        data-hoffset="198"
                        data-speed="1400"
                        data-start="4300"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic10.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="76"
                        data-hoffset="120"
                        data-speed="1400"
                        data-start="4600"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic11.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="292"
                        data-hoffset="398"
                        data-speed="1400"
                        data-start="4900"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic12.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="240"
                        data-hoffset="294"
                        data-speed="1400"
                        data-start="5200"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic13.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="196"
                        data-hoffset="203"
                        data-speed="1400"
                        data-start="5500"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic14.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="158"
                        data-hoffset="123"
                        data-speed="1400"
                        data-start="5800"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic15.png" alt="" class="img-responsive">
                    </div>

                    <!-- LAYER NR. 3 -->
                    <div class="tp-caption lft stt imed-sl1"
                        data-x="left"
                        data-y="123"
                        data-hoffset="51"
                        data-speed="1400"
                        data-start="6100"
                        data-easing="Power4.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        ><img src="images/new-slider/s3-ic16.png" alt="" class="img-responsive">
                    </div>

                   
                    <!-- LAYER NR. 6 -->
                    <div class="tp-caption whitebg-t1 sfr skewtoright imed-sl1"
                        data-x="right"
                        data-y="115"
                        data-hoffset="-60"
                        data-speed="1500"
                        data-start="6500"
                        data-easing="Back.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        >Easily Find Doctor Through<br>Area or Speciality..
                    </div>
					

                    <!-- search box -->
                    <div class="tp-caption whitebg-t2 sfr skewtoright imed-sl1"
                        data-x="right"
                        data-y="222"
                        data-hoffset="-10"
                        data-speed="1500"
                        data-start="6800"
                        data-easing="Back.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        >
                        <form action="search" method="post"> 
                        <input type="text" name="drname" placeholder="Enter Doctor name">
                        <button type="submit" class="btn btn-primary">Search</button>
                        </form>
                    </div>


                    <!-- LAYER NR. 8 -->
                    <div class="tp-caption whitebg-t3 sfr skewtoright imed-sl1"
                        data-x="right"
                        data-y="280"
                        data-hoffset="-60"
                        data-speed="1500"
                        data-start="7100"
                        data-easing="Back.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        >We feel your pain,All Doctors are <br> here just cacth them..</div>


                    <!-- LAYER NR. 9 -->
					<form action="dropdowndoctors.jsp" method="post">
                     <div class="tp-caption s1-but customin skewtoright imed-sl1"
                        data-x="center"
                        data-y="365"
                        data-hoffset="205"
                        data-speed="1500"
                        data-customin="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0;scaleY:0;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
                        data-start="7400"
                        data-easing="Back.easeOut"
                        data-endspeed="400"
                        data-endeasing="Power1.easeIn"
                        >
                        
                        <a href="#">
                        
                        <select name="Areavise">
                        	<option value="0">Find your doctor Area wise</option>
                        	<option value="Ashram Road">Ashram Road</option>
                        	<option value="Ambawadi">Ambawadi</option>
                        	<option value="Asarwa">Asarwa</option>
                        	<option value="Astodia">Astodia</option>
                        	<option value="Bopal">Bopal</option>
                        	<option value="Bapu Nagar">Bapu Nagar</option>
                        	<option value="C.G. Road">C.G. Road</option>
                        	<option value="Dani Limbada">Dani Limbada</option>
                        	<option value="Dariapur">Dariapur</option>
                        	<option value="Ellis Bridge">Ellis Bridge</option>
                        	<option value="Ghatlodia">Ghatlodia</option>
                        	<option value="Gulbai Tekra">Gulbai Tekra</option>
                        	<option value="Gita Mandir Road">Gita Mandir Road</option>
                        	<option value="Jamalpur">Jamalpur</option>
                        	<option value="Khokra Mehmedabad">Khokra Mehmedabad</option>
                        	<option value="Kankaria">Kankaria</option>
                        	<option value="Kalupur">Kalupur</option>
                        	<option value="Kadia">Kadia</option>
                        	<option value="Lal Darwaza">Lal Darwaza</option>
                        	<option value="Maninagar">Maninagar</option>
                        	<option value="Meghani Nagar">Meghani Nagar</option>
                        	<option value="Mithakhali Six Roads">Mithakhali Six Roads</option>
                        	<option value="Mem Nagar">Mem Nagar</option>
                        	<option value="Navrangpura">Navrangpura</option>
                        	<option value="Naranpura">Naranpura</option>
                        	<option value="Naroda">Naroda</option>
                        	<option value="Narol">Narol</option>
                        	<option value="Odhav">Odhav</option>
                        	<option value="Prahlad Nagar">Prahlad Nagar</option>
                        	<option value="Raipur">Raipur</option>
                        	<option value="Ranip">Ranip</option>
                        	<option value="S.G. Road">S.G. Road</option>
                        	<option value="Saraspur">Saraspur</option>
                        	<option value="Satellite Area">Satellite Area</option>
                        	<option value="Sarangpur Darwaza">Sarangpur Darwaza</option>
                        	<option value="Sabarmati">Sabarmati</option>
                        	<option value="Shahibaug">Shahibaug</option>
                        	<option value="Shahpur">Shahpur</option>
                        	<option value="Sanand">Sanand</option>
                        	<option value="University Area">University Area</option>
                        	<option value="Vasana">Vasana</option>
                        	<option value="Vadaj">Vadaj</option>
                        	<option value="Vastrapur">Vastrapur</option>
                        </select>
                        
                        </a>
                        <a href="#">
                        <select  name="Speciality">
                        	<option value="0">Find your doctor through Speciality</option>
                        	<option value="Audiologist">Audiologist</option>
                        	<option value="Allergist">Allergist</option>
                        	<option value="Anesthesiologist">Anesthesiologist</option>
                        	<option value="Cardiologist">Cardiologist</option>
                        	<option value="Dentist">Dentist</option>
                        	<option value="Dermatologist">Dermatologist</option>
                        	<option value="Endocrinologis">Endocrinologis</option>
                        	<option value="Epidemiologist">Epidemiologist</option>
                        	<option value="Gynecologist">Gynecologist</option>
                        	<option value="Immunologist">Immunologist</option>
                        	<option value="Infectious Disease Specialist">Infectious Disease Specialist</option>
                        	<option value="Internal Medicine Specialist">Internal Medicine Specialist</option>
                        	<option value="Medical Geneticist">Medical Geneticist</option>
                        	<option value="Microbiologist">Microbiologist</option>
                        	<option value="Neonatologist"> Neonatologist</option>
                        	<option value="Neurologist">Neurologist</option>
                        	<option value="Neurosurgeon">Neurosurgeon</option>
                        	<option value="Obstetrician">Obstetrician</option>
                        	<option value="Oncologist">Oncologist</option>
                        	<option value="Orthopedic Surgeon">Orthopedic Surgeon</option>
                        	<option value="ENT Specialist"> ENT Specialist</option>
                        	<option value="Pediatrician">Pediatrician</option>
                        	<option value="Physiologist">Physiologist</option>
                        	<option value="Plastic Surgeon">Plastic Surgeon</option>
                        	<option value="Podiatrist">Podiatrist</option>
                        	<option value="Psychiatrist">Psychiatrist</option>
                        	<option value="Radiologist">Radiologist</option>
                        	<option value="Rheumatologist">Rheumatologist</option>
                        	<option value="Surgeon">Surgeon</option>
                        </select>
                      	</a>
                        <a href="#">
                        <input type="submit" name="submit" value="Find Doctor">
                       	</a>
                         
                          </div>
                    </form>
                     
                        
                        
                    
                    
              
             </li>
              
            </ul>
                    
                </div>
            </div>
            
            
            
            
            
        	<div class="parallax-out wpb_row vc_row-fluid ihome-parallax">    
              
                
                    <div id="second" class="upb_row_bg vcpb-hz-jquery" data-upb_br_animation="" data-parallax_sense="30" data-bg-override="ex-full">
                    
                          <div class="container">
                          	<div class="row">
                          
                          <div class="bg col-lg-4 col-sm-4 col-md-5 col-xs-12 notViewed wow fadeInUp" data-wow-delay="1.5s" data-wow-offset="200"></div>
                          
                            <div class="float-right col-lg-7 col-sm-7 col-md-7 col-xs-12">
                                
                                <div class="iconlist-wrap">
                                <div class="subtitle notViewed wow fadeInRight" data-wow-delay="0.5s" data-wow-offset="20">Why <span class="iconlist-mid-title">Choose</span> Us</div>
                                <ul>
                                	<li class="notViewed wow fadeInDown" data-wow-delay="0.5s" data-wow-offset="60">
                                	<i class="icon-hospital2 icon-list-icons"></i>
                                	<div class="iconlist-content">
                                    	
                                    	<div class="iconlist-title">Great Infrastructure</div>
                                        <p class="iconlist-text">A lot of Doctors with specific Speciality are connected with us.you can find easily your Doctor through Speciality or Areavice.  </p>
                                    </div>
                                   
                                	</li>
                                    
                                    <li class="notViewed wow fadeInDown" data-wow-delay="0.5s" data-wow-offset="60">
                                	<i class="fa fa-user-md icon-list-icons"></i>
                                	<div class="iconlist-content">
                                    	
                                    	<div class="iconlist-title">Qualified Doctors</div>
                                        <p class="iconlist-text">A doctor examines a patient. Then he prescribes medicines for cure. Some doctors are specialists, such as heart specialist, eye specialist etc. a doctor who does operations is called a surgeon. </p>
                                    </div>
                                   
                                	</li>
                                    
                                    <li class="notViewed wow fadeInDown" data-wow-delay="0.5s" data-wow-offset="70">
                                	<i class="fa fa-ambulance icon-list-icons"></i>
                                	<div class="iconlist-content">
                                    	
                                    	<div class="iconlist-title">Rating of Users</div>
                                        <p class="iconlist-text">User can see and give all doctors review for his services.User can describe how Doctors treat to thier patients </p>
                                    </div>
                                	</li>
                                </ul>
                                </div>
                                
                                
                            </div>
                        </div> <!--.story-->
                        </div>
                    </div> <!--#second-->
                    
                </div>
           
            
            
            
            
            
             <div class="container">
             <div class="row">
             
             
             <!--Latest Post Start-->
             
                 <div class="col-xs-12 col-sm-12 col-md-6 pull-left">
                 
                    <div class="latest-post-wrap pull-left wow fadeInLeft" data-wow-delay="0.5s" data-wow-offset="100">
                        <div class="subtitle col-xs-12 no-pad col-sm-11 col-md-12 pull-left news-sub">latest news</div>
                        
                        <!--Post item-->
                        <div class="post-item-wrap pull-left col-sm-6 col-md-12 col-xs-12">
                            <img src="images/news-1.jpg" class="img-responsive post-author-img" alt="" />
                            	<div class="post-content1 pull-left col-md-9 col-sm-9 col-xs-8">
        	                        <div class="post-title pull-left"><a href="#">Newly Discovered Way for Cells to Die</a></div>
        	                        <div class="post-meta-top pull-left">
        	                            <ul>
        	                            <li><i class="icon-calendar"></i>16 Apr 2016</li>
        	                            <li><a href="#"><i class="icon-comments"></i>3</a></li>
        	                            </ul>
        	                        </div>
                                </div>
                                <div class="post-content2 pull-left">                   
                                	<p>In studying how worms develop from larvae into adults, scientists have discovered a previously unknown process in which cells are programmed to die. <br />
                                	<span class="post-meta-bottom"><a href="#">Continue Reading...</a></span></p>
                         		</div>
                         </div>
                         
                         <!--Post item-->
                        <div class="post-item-wrap pull-left col-sm-6 col-md-12 col-xs-12">
                            <img src="images/news-2.jpg" class="img-responsive post-author-img" alt="" />
                            <div class="post-content1 pull-left col-md-9 col-sm-9 col-xs-8">
        	                        <div class="post-title pull-left"><a href="#">Cyclodextrin Dissolves Away Cholesterol Crystals</a></div>
        	                        <div class="post-meta-top pull-left">
        	                            <ul>
        	                            <li><i class="icon-calendar"></i>16 Apr 2016</li>
        	                            <li><a href="#"><i class="icon-comments"></i>3</a></li>
        	                            </ul>
        	                        </div>
                                </div>
                                <div class="post-content2 pull-left">                   
                                	<p>Cyclodextrin has been shown in mice to dissolve cholesterol crystals and prevent plaque formation. The drug is already approved for use in humans and could be tested in patients to treat.<br />
                                	<span class="post-meta-bottom"><a href="#">Continue Reading...</a></span></p>
                         		</div>
                         </div>
                         
                         <a href="#" class="dept-details-butt posts-showall">Show All</a>
                            
                        </div>
                    </div>
                   
                 
                 
                 
                 <!--Latest Post End-->
             
                 <!--Departments Start-->
                 
                    <div class="col-xs-12 col-sm-12 col-md-6 pull-right department-wrap wow fadeInRight" data-wow-delay="0.5s" data-wow-offset="100">
                    
                    <div class="subtitle pull-left">Departments</div>
                        
                        <div id="imedica-dep-accordion">
                            <!-- Accordion Item -->
                            <h3><i class="icon-ambulance dept-icon"></i><span class="dep-txt">Primary Health Care</span></h3>
                            <div>
                                
                                <img src="images/dep-dummy.jpg" class="img-responsive dept-author-img-desk col-md-4" alt="" />
                                <div class="dept-content pull-left col-md-7 col-lg-8">
                                <div class="dept-title pull-left">Primary Health Care services</div> 
                                <p>Primary healthcare services are provided by professionals usually general practitioners and nurses  in the community.</p>
                                
                                
                                <a href="#" class="dept-details-butt">Details</a>
                                <div class="purchase-strip-blue dept-apponit-butt"><div class="color-4">
                                    <p class="ipurchase-paragraph">
                                        <button class="icon-calendar btn btn-4 btn-4a notViewed">Appointment</button>
                                    </p>
                                </div></div>
                                
                                <div class="vspacer"></div>
                                </div>
                            </div>
                            
                            <!-- Accordion Item -->
                            <h3><i class="icon-stethoscope dept-icon"></i><span class="dep-txt">Outpatient Rehab</span></h3>
                            <div>
                                <img src="images/dept-01.jpg" class="img-responsive dept-author-img-desk col-md-4" alt="" />
                                <div class="dept-content pull-left col-md-7 col-lg-8">
                                <div class="dept-title pull-left">C.R.O.F.S.</div> 
                                <p>CORF is a medical facility that provides outpatient diagnostic, therapeutic, and restorative services for the rehabilitation of your injury, disability, or sickness. This care is commonly known as outpatient rehabilitation care.</p>
                                
                                <a href="#" class="dept-details-butt">Details</a>
                                <div class="purchase-strip-blue dept-apponit-butt"><div class="color-4">
                                    <p class="ipurchase-paragraph">
                                        <button class="icon-calendar btn btn-4 btn-4a notViewed">Appointment</button>
                                    </p>
                                </div></div>
                                <div class="vspacer"></div>
                                </div>
                            </div>
                            
                            <!-- Accordion Item -->
                            <h3><i class="icon-heart dept-icon"></i><span class="dep-txt">Ophthalmology Clinic</span></h3>
                            <div>
                               <img src="images/dept-02.jpg" class="img-responsive dept-author-img-desk col-md-4" alt="" />
                                <div class="dept-content pull-left col-md-7 col-lg-8">
                                <div class="dept-title pull-left">For medical students</div> 
                                <p>This is a collection of case studies to help you get an insight on the typical history and initial examination of various ophthalmic disorders. The discussion, although brief, is intended to give you a simple overview of each disease.</p>
                                
                                <a href="#" class="dept-details-butt">Details</a>
                                <div class="purchase-strip-blue dept-apponit-butt"><div class="color-4">
                                    <p class="ipurchase-paragraph">
                                        <button class="icon-calendar btn btn-4 btn-4a notViewed">Appointment</button>
                                    </p>
                                </div></div>
                                <div class="vspacer"></div>
                                </div>                
                            </div>
                            
                            <!-- Accordion Item -->
                            <h3><i class="icon-stethoscope dept-icon"></i><span class="dep-txt">Outpatient Surgery</span></h3>
                            <div>
                                <img src="images/dept-03.jpg" class="img-responsive dept-author-img-desk col-md-4" alt="" />
                                <div class="dept-content pull-left col-md-7 col-lg-8">
                                <div class="dept-title pull-left">About Outpatient Surgery</div> 
                                <p>The HMSA Outpatient Surgical Procedure-Related Groups (PRG) List is a list of outpatient surgical procedures organized by designated CPT-4 codes with a description of the service and associated PRG grouper number.</p>
                                
                                <a href="#" class="dept-details-butt">Details</a>
                                <div class="purchase-strip-blue dept-apponit-butt"><div class="color-4">
                                    <p class="ipurchase-paragraph">
                                        <button class="icon-calendar btn btn-4 btn-4a notViewed">Appointment</button>
                                    </p>
                                </div></div>
                                <div class="vspacer"></div>
                                </div>                
                            </div>
                            
                            <!-- Accordion Item -->
                            <h3><i class="icon-medkit dept-icon"></i><span class="dep-txt">Cardiac Clinic</span></h3>
                            <div>
                                <img src="images/dept-04.jpg" class="img-responsive dept-author-img-desk col-md-4" alt="" /> 
                                <div class="dept-content pull-left col-md-7 col-lg-8">
                                <div class="dept-title pull-left">Cardiac sciences</div> 
                                <p>If you work in cardiac sciences, you’ll carry out crucial diagnostic, monitoring and analytical procedures for patients with known or suspected heart disease. You’ll also assist in interventional procedures.</p>
                                
                                <a href="#" class="dept-details-butt">Details</a>
                                <div class="purchase-strip-blue dept-apponit-butt"><div class="color-4">
                                    <p class="ipurchase-paragraph">
                                        <button class="icon-calendar btn btn-4 btn-4a notViewed">Appointment</button>
                                    </p>
                                </div></div>
                                <div class="vspacer"></div>
                                </div>                
                            </div>
                            
                            <!-- Accordion Item -->
                            <h3 class="last-child-ac ilast-child-acc"><i class="icon-heart dept-icon"></i><span class="dep-txt">Primary Health Care</span></h3>
                            <div>
                               <img src="images/dept-05.jpg" class="img-responsive dept-author-img-desk col-md-4" alt="" />
                                <div class="dept-content pull-left col-md-7 col-lg-8">
                                <div class="dept-title pull-left">Donec scelerisque, leo non eleifend</div> 
                                <p>Lorem ipsum dolor sit amet, consecte tur adipiscing elitut eu nisl quis augue suscipit dignissim. Duis vulputate nisl sit amet feugiat tincidunt. amet, consecte tur adipiscing elitut eu ni.</p>
                                
                                <a href="#" class="dept-details-butt">Details</a>
                                <div class="purchase-strip-blue dept-apponit-butt"><div class="color-4">
                                    <p class="ipurchase-paragraph">
                                        <button class="icon-calendar btn btn-4 btn-4a notViewed">Appointment</button>
                                    </p>
                                </div></div>
                                <div class="vspacer"></div>
                                </div>                
                            </div>
                            
                        </div>
                        
                        
                    </div>
             
                 <!--Departments End-->
                 </div>
                 </div>
                 
        <!--Counter Start-->
            
            <div class="Counter-wrap" id="counters">
            
            <div id="third" class="back-color-holder">
            	<div class="container">
                <div class="row">
                
                
                <div class="banner-bottom-text2 no-pad col-xs-12 wow fadeInDown" data-wow-delay="0.5s" data-wow-offset="100">
                
                <div class="subtitle">About Doctor Finder</div>
        	    
        	    </div>
                
                
                	<!--Counter Box-->
                    <div class="col-md-3 col-lg-3 col-sm-6 col-xs-12">
                    	<div class="counter-box">
                        	
                            <div class="counter-style" id="myTargetElement"></div>
                            <div class="counter-lable">Doctors</div>
                            
                        </div>
                    </div>
                    
                    <!--Counter Box-->
                    <div class="col-md-3 col-lg-3 col-sm-6 col-xs-12">
                    	<div class="counter-box">
                        	
                            <div class="counter-style" id="myTargetElement2"></div>
                            <div class="counter-lable">Clinic Rooms</div>
                            
                        </div>
                    </div>
                    
                    <!--Counter Box-->
                    <div class="col-md-3 col-lg-3 col-sm-6 col-xs-12">
                    	<div class="counter-box">
                        	
                            <div class="counter-style" id="myTargetElement3"></div>
                            <div class="counter-lable">Hospitals</div>
                            
                        </div>
                    </div>
                    
                    <!--Counter Box-->
                    <div class="col-md-3 col-lg-3 col-sm-6 col-xs-12">
                    	<div class="counter-box">
                        	
                            <div class="counter-style" id="myTargetElement4"></div>
                            <div class="counter-lable">Happy Patients</div>
                            
                        </div>
                    </div>
                    
                    
                </div>
                </div>
                </div>
            
            </div>
            
        <!--Counter End-->
        
        <!--Testimonail Wrap-->
                 
                 
                 <div class="cl-wrap icl-wrap">
                 <div class="container">
                 
                 <div class="row">		
                     <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 pull-left client-logo-flex wow fadeInUp" data-wow-delay="0.5s" data-wow-offset="100">
                     
        	             <ul id="clients-carousel" class="icl-carousel">
        	                <li><a href="#"><img src="images/nlogo1.png" alt="" class="img-responsive client-logo-img"/></a></li>
        	                <li><a href="#"><img src="images/nlogo2.png" alt="" class="img-responsive client-logo-img"/></a></li>
        	                <li><a href="#"><img src="images/nlogo3.png" alt="" class="img-responsive client-logo-img"/></a></li>
        	                <li><a href="#"><img src="images/nlogo4.png" alt="" class="img-responsive client-logo-img"/></a></li>
        	                <li><a href="#"><img src="images/nlogo5.png" alt="" class="img-responsive client-logo-img"/></a></li>
        	                <li><a href="#"><img src="images/nlogo6.png" alt="" class="img-responsive client-logo-img"/></a></li>
        	            </ul>   
                     
                     </div>
                 </div>    
                     
                 </div></div>
            
               <!--Footer Start-->
            
            </div>
            
            
            <div class="complete-footer">
           <!--  <footer id="footer">
            
            	<div class="container">
                	<div class="row">
                    	Foot widget
                    	
                        <div class="col-xs-12 col-sm-6 col-md-3 recent-post-foot foot-widget">
                        <br>
                        <address class="foot-address">
                        	<div class="col-xs-12 no-pad"><i class="icon-globe address-icons"></i>Doctor Finder <br />Devloped by <br />Palak and Shreya</div>
                            <div class="col-xs-12 no-pad"><i class="icon-phone2 address-icons"></i>+911234567890<br/>+911234567890</div>
                            
                            <div class="col-xs-12 no-pad"><i class="icon-mail address-icons"></i>palak@gmail.com<br/>shreya@gmail.com</div>
                        </address>
                        </div>
                       
                        Foot widget
                        <div class="col-xs-12 col-sm-6 col-md-3 recent-post-foot foot-widget">
                        	<div class="foot-widget-title">Recent Posts</div>
                        	<ul>
                            	<li><a href="#">Dr. Shubramaniam Shukla Dentist specialist joined with us.<br /><span class="event-date">1 days ago</span></a></li>
                                <li><a href="#">Dr. Piyush Ruparel Nurologiest specialist joined with us.<br /><span class="event-date">3 days ago</span></a></li>
                                <li><a href="#">Dr. Rajesh Nalkanthiya ENT specialist joined with us.<br /><span class="event-date">3 days ago</span></a></li>
                            </ul>
                        </div>
                        
                         Foot widget
                        <div class="col-xs-12 col-sm-6 col-md-3 recent-tweet-foot foot-widget">
                        	<div class="foot-widget-title">Recent News</div>
                        	<ul>
                            	<li>Our specialized Doctors saved 8 people life in <b>Swine flu case</b><br /><span class="event-date">7 days ago</span></li>
                                <li>Effective medicins provide by our doctors for <b>Feaver</b><br /><span class="event-date">always</span></li>
                            </ul>
                        </div>
                        
                        Foot widget
                        
                        
                    </div>
               	 </div>       
                 </div>
            </footer>
            -->        
            
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
	<script type='text/javascript'>
		$(window).load(function(){
			$('#loader-overlay').fadeOut(900);
			$("html").css("overflow","visible");
		});
	</script>

<%
 }
 catch(Exception e)
 {
	 e.printStackTrace();
 }
 %>
    </body>

<!-- Mirrored from imedica.sharkslab.com/HTML/ by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 23 Feb 2016 20:01:23 GMT -->
</html>
