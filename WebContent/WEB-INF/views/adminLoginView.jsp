<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gym-Management</title>
<link type="text/css" rel="stylesheet" href="./css/style.css">
</head>
<body>
	<nav>
		 <img id="logo" src="./assets/logo.jpg" alt="logo"/>
		 <ul>
		 <li><a href="${pageContext.request.contextPath}/userlogin">User Login </a></li>
		  <li><a href="${pageContext.request.contextPath}/adminlogin">Admin Login </a></li>
		 <li><a href="${pageContext.request.contextPath}/UserSubsController">Subscribe </a></li>		
		 </ul>
   </nav>
		 
		 <div class="welcome-back">WELCOME BACK :)</div>
		 <div class="sub-text">Share something new that you have learnt today with the <br> CODE WALL community.</div>
		 
		 <div class="login-form"> 
		 	<div class="title">ADMIN LOGIN</div>
		 	<form action="${pageContext.request.contextPath}/adminLogin" method="post">
		 		<label class="label" for="email">Email</label>
		 		<input type ="text" name="email" id="email"> 
		 		<label class="label" for="password">Password</label>
		 		<input type ="password" name="password" id="password">
		 		${message}
		 		<button class="button" type="submit">Login</button>
		 		<!-- <a class="forgot-password" href="">Forgot Password </a>*/ -->
		 	</form>
		 </div>	
</body>
</html>