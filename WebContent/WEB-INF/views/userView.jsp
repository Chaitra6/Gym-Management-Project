<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gym_management</title>
<link type="text/css" rel="stylesheet" href="./css/style.css">
<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
</head>
<body>
<nav>
		 <img id="logo" src="./assets/logo.jpg" alt="logo"/>
		  <div class="heading">GYM-MANAGEMENT</div>
		 <ul>
		 <li><a href="${pageContext.request.contextPath}/userlogin">User Login </a></li>
		  <li><a href="${pageContext.request.contextPath}/adminlogin">Admin Login </a></li>
		 <li><a href="${pageContext.request.contextPath}/UserSubsController">Subscribe</a></li>		
		 </ul>
   </nav>
<div class="body1">
	
	<div class="image">
		<img src="./assests/" alt="logo" width="900px" height="700px"/>
	</div>	
	<div class="user">
			
	<div class="login-form">
		<form action="${pageContext.request.contextPath}/SelectUserController" method="post">
			<label>Enter Your ID</label>
			<input type="text" name="userId" placeholder="User ID" id="userId"><br>
			<button class="button" type=submit>Show Details</button>
			
			</form>
		</div>
	</div>
</div>
</body>
</html>