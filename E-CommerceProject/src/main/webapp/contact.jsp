<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<title>Contact Us</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="https://fonts.googleapis.com/css?family=Roboto:400,100,300,700" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/contactstyle.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<section class="ftco-section">
<div class="container">
<div class="row justify-content-center">
<div class="col-md-6 text-center mb-5">
<h2 class="heading-section">Contact Us</h2>
</div>
</div>
<div class="row justify-content-center">
<div class="col-md-12">
<div class="wrapper">
<div class="row no-gutters">
<div class="col-lg-6">
<div class="contact-wrap w-100 p-md-5 p-4">
<h3>Contact us</h3>
<p class="mb-4">We're open for any suggestion or just to have a chat</p>
<div id="form-message-warning" class="mb-4"></div>
<div id="form-message-success" class="mb-4">
Your message was sent, thank you!
</div>
<fieldset>
	
<form action="contactinsert.jsp"method="POST" >


<div class="row">

<div class="col-md-12">
<div class="form-group">
<input type="text" class="form-control" name="name" id="name" placeholder="Name">
</div>
</div>
<div class="col-md-12">
<div class="form-group">
<input type="email" class="form-control" name="email" id="email" placeholder="Email">
</div>
</div>
<div class="col-md-12">
<div class="form-group">
<input type="text" class="form-control" name="subject" id="subject" placeholder="Subject">
</div>
</div>
<div class="col-md-12">
<div class="form-group">
<textarea name="message" class="form-control" id="message" cols="30" rows="4" placeholder="Create a message here"></textarea>
</div>
</div>

<div class="col-md-12">
<div class="form-group">
<input type="submit" value="Send Message" class="swd-button">
<div class="submitting"></div>
</div>
</div>


</div>
</form>








</div>
</div>
<div class="col-lg-6 d-flex align-items-stretch">
<div class="info-wrap w-100 p-5 img" style="background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTDXgT5kAQWTctTGPDanGIxIYauSaPsJzGLIQ&s');">
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</section>
<script data-cfasync="false" src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script><script src="js/jquery.min.js"></script>
<script src="js/popper.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/main.js"></script>
<script defer src="https://static.cloudflareinsights.com/beacon.min.js/vcd15cbe7772f49c399c6a5babf22c1241717689176015" integrity="sha512-ZpsOmlRQV6y907TI0dKBHq9Md29nnaEIPlkf84rnaERnq6zvWvPUqr2ft8M1aS28oN72PdrCzSjY4U6VaAw1EQ==" data-cf-beacon='{"rayId":"896b02c5fba33b43","version":"2024.4.1","token":"cd0b4b3a733644fc843ef0b185f98241"}' crossorigin="anonymous"></script>
<jsp:include page="footer.jsp"/>
</body>
</html>