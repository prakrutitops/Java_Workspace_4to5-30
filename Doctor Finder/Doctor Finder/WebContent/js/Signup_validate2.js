$(function() 
{
	$("#reg").validate(
	{
		rules : 
		{
			fname : 
			{
				required : true,
//				minlength : 4,
//				maxlength : 20,
				customvalidation : true
			},
					
			lname : 
			{
				required : true,
//				minlength : 4,
//				maxlength : 20,
				customvalidation : true
			},
					
			email : 
			{
				required : true,
				customvalidation1 :true,
			},
			
			phno : 
			{
				required : true,
				minlength : 10,
				maxlength : 10,
				customvalidation2 : true,
			},
			
			pwd : 
			{
				required : true,
				minlength : 6,
				maxlength : 20,
				pwdvalidation : true
			},
			
			cpwd : 
			{
				required : true,
			},
			
			gen : 
			{
				required : true
			},

			date : 
			{
				required : true
			},
		},
		
		messages : 
		{
			fname : 
			{
				required : "Please enter a firstname",
				minlength : $.format("Minimum {0} characters required!"),
				maxlength : $.format("Maximum {0} characters allowed!")
			},
			
			lname : 
			{
				required : "Please enter a lastname",
				minlength : $.format("Minimum {0} characters required!"),
				maxlength : $.format("Maximum {0} characters allowed!")
			},
			
			email : 
			{
				required : "Please enter valid email",
			},
			
			phno : 
			{
				required : "Please enter mobile no",
				minlength : $.format("Minimum {0} digits required"),
				maxlength : $.format("Maximum {0} digits allowed")
			},
			
			pwd : 
			{
				required : "Please enter your password",
				minlength : $.format("Minimum {0} characters required!"),
				maxlength : $.format("Maximum {0} characters allowed!")
			},
			
			cpwd :
			{
				required : "Please enter your password "
			},
			
			gen : 
			{
				required : "Please select your gender"
			},
			
			date : 
			{
				required : "Please select date of birth"
			},
		}
	}
);
	$.validator.addMethod("customvalidation", function(value, element) 
	{
		return /^[A-Za-z\_ -]+$/.test(value);
	}, "Alpha Characters Only.");
	
	$.validator.addMethod("customvalidation1", function(value, element) 
	{
		return /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/.test(value);
	}, "Enter proper email Only.");
	
	$.validator.addMethod("customvalidation2", function(value, element) 
	{
		return /^\d{10}$/.test(value);
	},"Enter Digits only.");
	
	$.validator.addMethod("pwdvalidation", function(value, element) 
	{
		return /^(?=.*\d)(?=.*[a-z]).{6,20}$/.test(value);
	}, "Enter password with atleast 1 digit 1 small and 1 upeercase letter");	
}
);
