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


<form action="loginvalidation" method="post">


<label>Enter your email</label>
<input type="email" name="email"  >
<br><br>
<label>Enter your password</label>
<input type="password" name="password"  >
<br><br>
<input type="submit" value="login">










</form>
</body>
</html>