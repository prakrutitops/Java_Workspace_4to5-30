<!DOCTYPE HTML>
<!--[if gt IE 8]> <html class="ie9" lang="en"> <![endif]-->
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
	
	</head>

<body>

    <header>
    
    
    <div id="search-overlay">
    <div class="container">
                        <div id="close">X</div>

    
                        <input id="hidden-search" type="text" placeholder="Start Typing..." autofocus="autofocus" autocomplete="off"  /> <!--hidden input the user types into-->
                        <input id="display-search" type="text" placeholder="Start Typing..." autofocus="autofocus" autocomplete="off" /> <!--mirrored input that shows the actual input value-->
                    </div></div>
       
            
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
                            <li class="active"><a href="login.jsp" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-home"></i>Log In</a>
								
							</li>
							
							</ul> 
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
            	<div class="bread-heading"><h1>Log in in few seconds..</h1></div>
                <div class="bread-crumb pull-right">
                
                </div>
            </div>
         </div>
     </div>
     <%
    
    response.setHeader("cache-control", "no-cache");
    response.setHeader("cache-control", "no-store");
    response.setHeader("pragma", "no-cache");
    response.setDateHeader("Expires", 0);
    
    %>
    <%
    	if(session.getAttribute("raj")==null)
    	{
    %>

     <!--map-->
	 <form action="Logincontroller" name="register" id="reg" method="post">
		<div class="container" align="center">
			<section class="content bgcolor-6">
			<font color="red">${msg }</font>
				<h2>LOG IN HERE</h2>
				
				<span class="input input--juro">
					<input name="email" class="input__field input__field--juro" type="text" id="input-30" />
					<label class="input__label input__label--juro" for="input-30">
						<span class="input__label-content input__label-content--juro">Email</span>
					</label>
				</span>
				
				<span class="input input--juro">
					<input name="pwd" class="input__field input__field--juro" type="password" id="input-30" />
					<label class="input__label input__label--juro" for="input-30">
						<span class="input__label-content input__label-content--juro">Password</span>
					</label>
				</span>
				
				<span class="input input--juro">
					<button class="btn btn-1 btn-1a">Log in</button>
				</span>	
				<br>
				<span class="input input--juro">
					<a href="signup.jsp">Click here for Registration</a>
					
				</span>
			</section>
			
         </div><!--container-->  
	</form>	
	<%
    	}
    	else
    		response.sendRedirect("home.jsp");
	%>
<!-- 12 col end-->


    <!--Mid Content End-->
    
    
               <!--Footer Start-->
    </div><!--contact-version-two-->
    </section>


    <section>
    <div id="settings">
            <div class="colors">
            <div class="panel-title">Style Switcher</div> 
            <div class="panel-color-title">Color Schemes</div>    
                <ul>
                    <li><a title="maroon" class="color1 color-switch"><i class="fa fa-check"></i></a></li>
                            <li><a title="grey" class="color2 color-switch"><i class="fa fa-check"></i></a></li>
                            <li><a title="green" class="color3 color-switch"><i class="fa fa-check"></i></a></li>
                            <li><a title="orange" class="color4 color-switch"><i class="fa fa-check"></i></a></li>
                            <li><a title="red" class="color5 color-switch"><i class="fa fa-check"></i></a></li>
                            <li><a title="blue" class="color6 color-switch selected"><i class="fa fa-check"></i></a></li>
                    
                    

                </ul>
            </div>
            <a href="javascript:void(0);" class="settings_link showup"><i class="fa fa-cog"></i></a>
        </div>

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
	    
</body>

<!-- Mirrored from imedica.sharkslab.com/HTML/contact-3.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 23 Feb 2016 20:03:44 GMT -->
</html>