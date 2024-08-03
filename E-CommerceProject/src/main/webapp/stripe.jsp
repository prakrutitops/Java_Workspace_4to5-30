<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.bttnStyle
	{
		background-color: lightblue;
		border-radius: 0.50rem;
		border:1px solid transperent;
	}
</style>
<script type="text/javascript">
	var xhttp=new XMLHttpRequest();
	var RazorpayOrderId;
	function CreateOrderID()
	{
		alert("1");
		xhttp.open("GET","http://localhost:8080/E-CommerceProject/OrderCreation",false);
		alert("2");
		xhttp.send();
		RazorpayOrderId=xhttp.responseText;
		OpenCheckOut();
	}
</script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
	function OpenCheckOut()
	{
		alert("3");
		var options={
				"key":"rzp_test_pJ8ElvmChXIyZC",
				"amount":"100",
				"currency":"INR",
				"name":"Tops",
				"description":"Test",
				"order_id":RazorpayOrderId,
				"callback_url":"http://localhost:8080/E-CommerceProject/OrderCreation",
				"prefill":
					{
						"name":"Jigar Thakkar",
						"email":"jchirag2000@gmail.com",
						"contact":"9377614772"
					},
					"notes":
					{
					"address":"Gandhinagar"
					},
					"theme":
						{
							"color":"#3399cc"
						}
				
				
		};
		var rzp1=new Razorpay(options);
		rzp1.on('payment.failed',function (response){
			alert(response.error.code);
	        alert(response.error.description);
	        alert(response.error.source);
	        alert(response.error.step);
	        alert(response.error.reason);
	        alert(response.error.metadata.order_id);
	        alert(response.error.metadata.payment_id);
		});
		rzp1.open();
	    e.preventDefault();
	}
</script>
</head>
<body>
<div id="order_id">
	
</div>
<center>
	<button id="payButton" onclick="CreateOrderID()" class="bttnStyle">Pay Now</button>
</center>
</body>
</html>