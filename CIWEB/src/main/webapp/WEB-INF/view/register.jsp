<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body

{
	background-color:lavender;

}
input[type=text],input[type=email],input[type=password],input[type=submit]
{

	padding:5px;
}
label
{
	font-size:20px;
}
form
{

text-align:center;
margin-top:150px;
border:1px solid;
margin-left:450px;
margin-right:450px;
padding:20px;
box-shadow: 7px 8px 5px black;
}
input[type=submit]:hover
{		
	color:green;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registers" method="post">

<label>Enter your name</label>
<input type="text" name="name" id="name" >
<br><br>
<label>Enter your email</label>
<input type="email" name="email" id="email" >
<br><br>
<label>Enter your city</label>
<input type="text" name="city"  >
<br><br>
<label>Enter your password</label>
<input type="password" name="pass" id="pass" >
<br><br>
<input type="submit" value="Register">
<input type="submit" id="valid" value="valid">




</form>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script>

$(document).ready(function()
		{
	
		$("#pass").change(function(){
			var email = $("#email").val();
			var pass = $("#pass").val();
			
			$.ajax({
				type: "POST",
		   		url: 'loginvalidation',
				async: false,
				data : {email:email,password:pass},
				success:function(result) {
					if(result=="success") { 
						alert("already exist");
						
					} 
				}
		 	}); 
			
			
		});
		
	
	
		});


</script>
</body>
</html>