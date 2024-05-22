<!DOCTYPE HTML>
<!--[if gt IE 8]> <html class="ie9" lang="en"> <![endif]-->
<%@page import="com.bin.Doctorsbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.Doctorsmodel"%>
<%@page import="com.bin.Registrationbean"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    
<!-- Mirrored from imedica.sharkslab.com/HTML/contact-3.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 23 Feb 2016 20:03:44 GMT -->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    

    <title>Find Doctor</title>

    <link href='http://fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic' rel='stylesheet' type='text/css'>
    <link href="css/jquery-ui-1.10.3.custom.css" rel="stylesheet" />
    <link href="css/animate.css" rel="stylesheet" />
    <link href="css/font-awesome.min.css" rel="stylesheet" />
    <link href="css/signup.css" rel="stylesheet" type='text/css'/>
    
    <link href="css/btn.css" rel="stylesheet" type='text/css'/>
     <link rel="stylesheet" type="text/css" href="css/blue.css" id="style-switch" />

    <!-- REVOLUTION BANNER CSS SETTINGS -->
    <link rel="stylesheet" type="text/css" href="rs-plugin/css/settings.css" media="screen" />

    <!--[if IE 9]>
        <link rel="stylesheet" type="text/css" href="css/ie9.css" />
    <![endif]-->    
    <link rel="icon" type="image/png" href="images/fevicon.png">
    <link rel="stylesheet" type="text/css" href="css/inline.min.css" />
	
	<script type="text/javascript">
		var request;
		function get_speciality()
		{
			var v=document.registration.dr.selectIndex;
			alert(v);
			var url="getSpeciality?val="+v;
			
			if(window.XMLHttpRequest)
				{
				request=new XMLHttpRequest();
				}
			else if(window.ActiveXObject)
				{
					request=new ActiveXObject("Microsoft.XMLHTTP");
				}
			
			try
			{
				request.onreadystatechange=getinfo;
				request.open("post",url,true);
				request.send();
			}
			catch (e) {
				// TODO: handle exception
				alert("unable to connect");
			}
			
			function getinfo()
			{
				if(request.readyState==4)
					{
					var val=request.responseText;
					document.getElementById('input-29').innerHTML=val;
					}
			}
		}
	</script>
	
	</head>

<body>

    <header>
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
<%try
 {
 %> 
 
 <%!Registrationbean s; %>
 <%
 
 s=(Registrationbean)session.getAttribute("raj");
 
 %>
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
                            <li class="dropdown active"><a href="bookappoinment.jsp" ><i class="icon-cog"></i>Appoinment<b class="icon-angle-down"></b></a>
                                
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
            

      
    </header>
    
    <section class="complete-content content-footer-space">
    <div id="contact-version-two">
    <!--Mid Content Start-->
    
    
     <div class="about-intro-wrap pull-left">
     
     <div class="bread-crumb-wrap ibc-wrap-4">
    	<div class="container">
    <!--Title / Beadcrumb-->
         	<div class="inner-page-title-wrap col-xs-12 col-md-12 col-sm-12">
            	<div class="bread-heading"><h1>See rivew for better treatment..</h1></div>
                <div class="bread-crumb pull-right">
                
                </div>
            </div>
         </div>
     </div>

     <!--map-->
	 <form action="appoinment"  method="post">
	 <input type="hidden" name="to" value="<%=s.getEmail()%>">
	 
	<input type="hidden" name="subject" value="Appointment Booking">
	<input type="hidden" name="message" value="Your Appointment Has Been Booked Successfully">
	<input type="hidden" name="user" value="rajbha811991@gmail.com">
	<input type="hidden" name="pass" value="rajbhadonm">
	 
		<div class="container" align="center">
			<section class="content bgcolor-6">
				<h2>Book appoinment</h2>
				
				<span class="input input--juro">
					<script type="text/javascript">
		var request;
		function get_speciality()
		{
			var v=document.getElementById("input-30").value;
			
			var url="getSpeciality?val="+v;
			
			if(window.XMLHttpRequest)
				{
				request=new XMLHttpRequest();
				}
			else if(window.ActiveXObject)
				{
					request=new ActiveXObject("Microsoft.XMLHTTP");
				}
			
			try
			{
				request.onreadystatechange=getinfo;
				request.open("post",url,true);
				request.send();
			}
			catch (e) {
				
				alert("unable to connect");
			}
			
			function getinfo()
			{
				if(request.readyState==4)
					{
					var val=request.responseText;
					document.getElementById('sp').innerHTML=val;
					}
			}
		}
	</script>
					
					
					<select name="drname" class="input__field input__field--juro" id="input-30" onblur="get_speciality();">
					<option></option>
					<%
						Doctorsmodel s = new Doctorsmodel();
                      ArrayList<Doctorsbean> records = s.alldoctors();
                   	%>
                   	<% 
                      	for(Doctorsbean d:records)
                      	{
                      %>
						
                        	<option value="<%=d.getName()%>"><%=d.getName() %></option>
                        <%} %>	
					</select>
					<label class="input__label input__label--juro" for="input-30">
						<span class="input__label-content input__label-content--juro">Dr. Name</span>
					</label>
				</span>
				
				<br>
				<span class="input input--juro">
					<input name="Speciality" class="input__field input__field--juro" type="text" readonly="readonly"/>
					<label class="input__label input__label--juro" for="input-29">
					
						<span class="input__label-content input__label-content--juro" id="sp">Speciality</span>
						
					</label>
				</span>
				<br>
				
				<span class="input input--juro"> 
					<input name="date" type="date" class="input__field input__field--juro" id="input-30" /> 
					<label class="input__label input__label--juro" for="input-30">
						<span class="input__label-content input__label-content--juro">Appoinment date</span> 
					</label> 
				</span><br>
				
				<span class="input input--juro"> 
					<select name="time" class="input__field input__field--juro" id="input-30" >
						<option></option>
						<option>9 AM TO 11 AM</option> 
						<option>11 AM TO 1 PM</option> 
						<option>1 PM TO 3 PM</option>
						<option>3 PM TO 5 PM</option>
						<option>5 PM TO 7 PM</option>
					</select>
					<label class="input__label input__label--juro" for="input-30">
						<span class="input__label-content input__label-content--juro">Choose Time</span>
					</label>
 				</span><br>
				<span class="input input--juro">
				
					<input type="submit" class="btn btn-1 btn-1a">
					
				</span>	
				
			</section>
         </div><!--container-->  
	</form>	
<!-- 12 col end-->


    <!--Mid Content End-->
    
    
               <!--Footer Start-->
    </div><!--contact-version-two-->
    </section>
<section class="complete-footer">
   <!--  <footer id="footer">
            
            	<div class="container">
                	<div class="row">
                    	Foot widget
                    	
                        <div class="col-xs-12 col-sm-6 col-md-3 recent-post-foot foot-widget">
                        <br>
                        <address class="foot-address">
                        	<div class="col-xs-12 no-pad"><i class="icon-globe address-icons"></i>Doctor Finder <br />Devloped by <br />Rajesh and Piyush</div>
                            <div class="col-xs-12 no-pad"><i class="icon-phone2 address-icons"></i>+919428433793<br/>+919879519203</div>
                            
                            <div class="col-xs-12 no-pad"><i class="icon-mail address-icons"></i>rajbha811991@gmail.com<br/>pyhruparel95@gmail.com</div>
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
    </section>

    
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
    <script src="http://maps.googleapis.com/maps/api/js?v=3.exp&amp;sensor=false"></script>
	<script type='text/javascript'>
		$(window).load(function(){
			$('#loader-overlay').fadeOut(900);
			$("html").css("overflow","visible");
		});
		
		$( "#imedica-dep-accordion" ).accordion({ collapsible: true, active: false });
	</script>
	<script src="js/classie.js"></script>
		<script>
			(function() {
				// trim polyfill : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/Trim
				if (!String.prototype.trim) {
					(function() {
						// Make sure we trim BOM and NBSP
						var rtrim = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
						String.prototype.trim = function() {
							return this.replace(rtrim, '');
						};
					})();
				}

				[].slice.call( document.querySelectorAll( 'input.input__field' ) ).forEach( function( inputEl ) {
					// in case the input is already filled..
					if( inputEl.value.trim() !== '' ) {
						classie.add( inputEl.parentNode, 'input--filled' );
					}

					// events:
					inputEl.addEventListener( 'focus', onInputFocus );
					inputEl.addEventListener( 'blur', onInputBlur );
				} );

				function onInputFocus( ev ) {
					classie.add( ev.target.parentNode, 'input--filled' );
				}

				function onInputBlur( ev ) {
					if( ev.target.value.trim() === '' ) {
						classie.remove( ev.target.parentNode, 'input--filled' );
					}
				}
			})();
		</script>
		<script>
			(function() {
				// trim polyfill : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/Trim
				if (!String.prototype.trim) {
					(function() {
						// Make sure we trim BOM and NBSP
						var rtrim = /^[\s\uFEFF\xA0]+|[\s\uFEFF\xA0]+$/g;
						String.prototype.trim = function() {
							return this.replace(rtrim, '');
						};
					})();
				}

				[].slice.call( document.querySelectorAll( 'input.input__field' ) ).forEach( function( inputEl ) {
					// in case the input is already filled..
					if( inputEl.value.trim() !== '' ) {
						classie.add( inputEl.parentNode, 'input--filled' );
					}

					// events:
					inputEl.addEventListener( 'focus', onInputFocus );
					inputEl.addEventListener( 'blur', onInputBlur );
				} );

				function onInputFocus( ev ) {
					classie.add( ev.target.parentNode, 'input--filled' );
				}

				function onInputBlur( ev ) {
					if( ev.target.value.trim() === '' ) {
						classie.remove( ev.target.parentNode, 'input--filled' );
					}
				}
			})();
		</script>
 <%
 }
 catch(Exception e)
 {
	 e.printStackTrace();
 }
 %>
    
</body>

<!-- Mirrored from imedica.sharkslab.com/HTML/contact-3.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 23 Feb 2016 20:03:44 GMT -->
</html>